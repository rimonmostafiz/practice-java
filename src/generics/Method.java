package generics;

import java.util.Collection;

/**
 * Created by Rimon Mostafiz on 3/29/2016.
 */
public class Method {
    public static <T> T addAndReturn(T element, Collection<T> collection) {
        collection.add(element);
        return element;
    }

    public static <T> T read(Class<T> tClass, String sql) throws IllegalAccessException, InstantiationException {
        //execute sql

        T o = tClass.newInstance();

        return o;
    }
}
