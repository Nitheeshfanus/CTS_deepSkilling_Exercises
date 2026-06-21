
public class SingletonTest {
    public static void main(String[] args){

        Logger log1= Logger.getInstance();
        Logger log2= Logger.getInstance();

        System.out.println(log1 == log2);
        
        log1.log("Application Started");
        log2.log("User Logged In");

        System.out.println(log1.hashCode());
        System.out.println(log2.hashCode());

    }
}
