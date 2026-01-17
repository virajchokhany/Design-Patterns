package Singleton;

public class DoubleLocking {
    
    private static DoubleLocking instance = null;

    private DoubleLocking(){

    }
    
    public static DoubleLocking getInstance(){
        if(instance == null){
            synchronized(DoubleLocking.class){
                if(instance == null){
                    instance = new DoubleLocking();
                }
            }
        }
        return instance;
    }
}
