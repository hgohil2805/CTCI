package LeetCode;

/**
 * Created by iceman on 9/6/2016.
 */
public class VerifyPreOrderSerialization {

    public static void main(String args[]){
        VerifyPreOrderSerialization obj = new VerifyPreOrderSerialization();
        String example1 = "9,3,4,#,#,1,#,#,2,#,6,#,#";
        System.out.println("Example 1 : "+obj.isValidSerialization(example1));
        String example2 = "1,#";
        System.out.println("Example 2 : "+obj.isValidSerialization(example2));
    }

    public boolean isValidSerialization(String preorder) {
        String[] nodes = preorder.split(",");
        int diff = 1;
        for(String node : nodes){
            if(--diff < 0) return false;
            if(!node.equals("#"))
                diff+=2;
        }
        return diff == 0;
    }
}
