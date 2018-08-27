import java.util.ArrayList;
import java.util.List;

public class sharpie {

    List<sharpie> set = new ArrayList<>();

    public int usable() {

        int shCount = 0;
        for (sharpie : set) {
            if (sharpie.inkAmount > 0) {
                shCount++;
            }
        }
        return shCount;
    }

    public void usableNot() {
        for (sharpie : set) {

            if (sharpie.inkAmount == 0) {
                set.remove(sharpie);
            }
        }
    }
}
