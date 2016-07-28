package LeetCode;

/**
 * Created by iceman on 7/28/2016.
 */
public class CountAndSay {
    public static void main(String args[]){
        CountAndSay obj = new CountAndSay();
        System.out.println(obj.countAndSay(4));
    }

    public String countAndSay(int n) {
        StringBuilder current = new StringBuilder("1");
        StringBuilder prev = current;
        int count;
        char say;

        for(int  i = 1 ; i < n ; i++ ){
            prev = current;
            current = new StringBuilder();
            count = 1;
            say = prev.charAt(0);

                for(int j = 1 ; j < prev.length(); j++){
                    if(prev.charAt(j) != say){
                        current.append(count).append(say);
                        count = 1;
                        say = prev.charAt(j);
                    }
                    else {
                        count++;
                    }
                }
                current.append(count).append(say);
        }
        return current.toString();
    }
}
