package generics.wildcard;

import java.util.List;

/**
 * Created by Rimon Mostafiz on 3/29/2016.
 */
public class operation {
    public static void drawShape(List<? extends Shape> list) {
        for (Shape s : list) {
            s.draw();
        }
    }
}
