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
}
