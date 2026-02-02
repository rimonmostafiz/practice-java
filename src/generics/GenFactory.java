package generics;

/**
 * Created by Rimon Mostafiz on 3/29/2016.
 */
public class GenFactory<T> {
    Class theClass = null;

    public GenFactory(Class theClass) {
        this.theClass = theClass;
    }

    public T createInstance() throws IllegalAccessException, InstantiationException {
        return (T) this.theClass.newInstance();
    }
}
