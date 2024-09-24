package org.custom_hash_code;

import java.util.HashSet;
import java.util.Set;
import java.security.SecureRandom;

public class CustomObject {
    static Set<Integer> usedCodes = new HashSet<>();
    int identificator;

    public CustomObject(int rand) {
        if (rand == 1) {
            int i = hashCode();
            while (usedCodes.contains(i)) i = new Object().hashCode();
            usedCodes.add(i);
            identificator = i;
        } else if (rand == 2) {
            SecureRandom secureRandom = new SecureRandom();
            int i = secureRandom.nextInt();
            while (usedCodes.contains(i)) i = secureRandom.nextInt();
            usedCodes.add(i);
            identificator = i;
        }
    }

    public int getIdentificator() {
        return identificator;
    }
}