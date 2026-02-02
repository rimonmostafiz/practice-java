package generics.wildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rimon Mostafiz on 3/29/2016.
 */
public class WildCard {
    public static void main(String[] args) {
        List<Rectangle> rectangleList = new ArrayList<Rectangle>();
        rectangleList.add(new Rectangle());

        List<Circle> circleList = new ArrayList<Circle>();
        circleList.add(new Circle());
        circleList.add(new Circle());

        operation op = new operation();
        op.drawShape(rectangleList);
        op.drawShape(circleList);
    }
}
