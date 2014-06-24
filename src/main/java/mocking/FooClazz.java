package mocking;

/**
 * Created by ismael on 24/06/14.
 */
public class FooClazz {

    Singleton singleton = Singleton.getInstance();

    public int getMyTralala() {
        return singleton.getHolyGrail();
    }
}
