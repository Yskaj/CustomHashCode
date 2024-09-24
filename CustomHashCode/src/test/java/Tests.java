import org.custom_hash_code.CustomObject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Tests {
    @DisplayName("CustomObject creater")
    @Test
    void customObjectCreater() {
        List<CustomObject> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            CustomObject object = new CustomObject();
            list.add(object);
        }
        list.forEach(s -> System.out.println(s.getIdentificator()));
    }
}
