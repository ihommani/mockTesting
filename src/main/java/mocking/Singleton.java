package mocking;

/**
 * Created by ismael on 24/06/14.
 */
public final class Singleton {

    private static final Singleton instance = null;

    private final int holyGrail = 42;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            return new Singleton();
        }
        return instance;
    }

    public int getHolyGrail() {
        return holyGrail;
    }
}
