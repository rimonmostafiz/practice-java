package generics;

/**
 * Created by Rimon Mostafiz on 3/29/2016.
 */
public class GenMain {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        GenFactory<GenMain> genFactory = new GenFactory<GenMain>(GenMain.class);

        GenMain myClassInstance = genFactory.createInstance();
    }
}
