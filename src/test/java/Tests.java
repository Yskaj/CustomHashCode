import org.custom_hash_code.CustomObject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Tests {
    @DisplayName("CustomObject creater")
    @Test
    void customObjectCreater() {
        tester(10000);
        tester(100000);
        tester(1000000);
    }

    private void tester(int i) {
        System.out.println(i);
        System.out.print("Object.hashCode() ");
        objectCreater(1, i);
        System.out.print("SecureRandom() ");
        objectCreater(2, i);
        System.out.println();
    }

    private void objectCreater(int s, int size) {
        long t = System.currentTimeMillis();
        List<CustomObject> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            CustomObject object = new CustomObject(s);
            list.add(object);
        }
        System.out.println(System.currentTimeMillis() - t);
    }
}
