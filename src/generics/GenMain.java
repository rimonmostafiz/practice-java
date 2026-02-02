package generics;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static generics.Method.addAndReturn;

/**
 * Created by Rimon Mostafiz on 3/29/2016.
 */
public class GenMain {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        GenFactory<GenMain> genFactory = new GenFactory<GenMain>(GenMain.class);

        GenMain myClassInstance = genFactory.createInstance();

        String stringElement = "stringElement";
        List<String> stringList = new ArrayList<String>();

        String theStringElement = addAndReturn(stringElement, stringList);

        Integer integerElement = new Integer(123);
        List<Integer> integerList = new ArrayList<Integer>();

        Integer theIntegerElement = addAndReturn(integerElement, integerList);

        Shape rec = Method.read(Rectangle.class, "select * from rectangle where id=1");
        String str = Method.read(String.class, "select * from string where id=1");
    }
}
