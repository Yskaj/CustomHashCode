package org.custom_hash_code;

import java.util.HashSet;
import java.util.Set;

public class CustomObject {
    static Set<Integer> usedCodes = new HashSet<>();
    int identificator;
    public CustomObject() {
        int i = hashCode();
        while (usedCodes.contains(i)) i = hashCode();
        usedCodes.add(i);
        identificator = i;
    }
    public int getIdentificator() {
        return identificator;
    }
}
