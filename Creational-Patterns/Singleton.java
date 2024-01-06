public class Singleton {
    // The volatile keyword in Java is used to indicate that a variable's value may be modified by multiple threads 
    // simultaneously. It ensures that the variable is always read from and written to the main memory, 
    // rather than from thread-specific caches, ensuring visibility across threads
    private static volatile Singleton singletonObject;
    private static Object mutex = new Object();

    private Singleton() {
    }

    /* Concept:-
     * There are different ways to provide thread safety to this design pattern.
     * Approach-1(lazy initialization): We can make static singleton varibale syncronized to safeguard 
     * from multi thread access.
     * Approach-2(lazy initialization): If we will make method as synchronized this will also work but 
     * this will come with performace overhead as this is apply synchronization on each method call.
     * Approach-3(eager initialization): In this case we will going to create object before event it is
     * getting called by doing so also we can make our class thread safe without using synchronization. 
     * Below implemnetd logic is Approach-1.
     * */ 
    public static Singleton getObject() {
        Singleton result = singletonObject;
        if(null == result) {
            synchronized(mutex) {
                result = singletonObject;
                if(null == result) {
                    result = new Singleton();
                }
            }
        }
        return result;
    }
}

class ApplicationSingleton {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("====== Singleton Design Pattern ======");
        System.out.println();
        Singleton singleton = Singleton.getObject();
        System.out.println(singleton.toString());
        System.out.println();
    }
}