package singletonPattern;

public class Singleton {

    // Lazy instantiate
//    private static Singleton uniqueInstance;

    // Static initializer eagerly instantiate
    // private static Singleton eagerlyInstance;

    // volatile keywords for multiple threads handling
    private volatile static Singleton uniqueInstance;

    private Singleton() {}

    // We have to be sure this is working, when we use multiple thread
    // Protect problems from threads by: synchronized
    // It has overhead so becarefull
//    public static synchronized Singleton getInstance(){
//        if(uniqueInstance == null){
//            uniqueInstance = new Singleton();
//        }
//
//        return uniqueInstance;
//    }

    // Thread safe without synchronized
//    public static Singleton getInstance(){
//        return eagerlyInstance;
//    }

    // Double-checked locking
    // Use synchronized only one time
    public static Singleton getInstance(){
        if(uniqueInstance == null){
            synchronized (Singleton.class){
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }

        return uniqueInstance;
    }
}
