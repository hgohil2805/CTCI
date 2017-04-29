package Test;

/**
 * Created by iceman on 12/17/2016.
 */
public class StaticBlock {
    int a;
    static int b;

    public StaticBlock(){
        System.out.println("Constructor");
    }
    public static void main(String args[]){
        StaticBlock obj = new StaticBlock();
    }


    public void testMethod(){
        System.out.println(b);
    }

    public static void testStaticMethod(){
    }
    static {
        System.out.println("Static block");
    }

}
