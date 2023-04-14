package JavaPOO;

public class Singleton {
    
    private static Singleton instanceSingleton;

    private Singleton(){

    }
    public static Singleton getInstance() {
            if (instanceSingleton == null) {
                instanceSingleton = new Singleton();
            }
            return instanceSingleton;
        }

}
