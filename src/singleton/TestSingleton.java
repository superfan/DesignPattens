package singleton;

class Singleton {
    private final static Singleton INSTANCE = new Singleton();
 
    // Private constructor suppresses   
    private Singleton() {}
 
    // default public constructor
    public static Singleton getInstance() {
        return INSTANCE;
    }
}

class Singleton2 {
    private static volatile Singleton2 INSTANCE = null;
 
    // Private constructor suppresses 
    // default public constructor
    private Singleton2() {}
 
    //thread safe and performance  promote 
    public static  Singleton2 getInstance() {
        if(INSTANCE == null){
             synchronized(Singleton2.class){
                 //when more than two threads run into the first null check same time, to avoid instanced more than one time, it needs to be checked again.
                 if(INSTANCE == null){ 
                     INSTANCE = new Singleton2();
                  }
              } 
        }
        return INSTANCE;
    }
}

public class TestSingleton {
	public void main(String [] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton2 s2 = Singleton2.getInstance();
	}
}
