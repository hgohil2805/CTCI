package LeetCode;

/**
 * Created by iceman on 8/15/2016.
 */
public class CompareVersionNumber {

    public static void main(String args[]){
        CompareVersionNumber obj = new CompareVersionNumber();
        System.out.println(obj.compareVersion("1.2","1.1"));
    }

    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int length = Math.max(v1.length,v2.length);

        for(int  i = 0 ; i <= length - 1; i++){
            Integer first = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            Integer second = i < v2.length ? Integer.parseInt(v2[i]) : 0;
            int compare = first.compareTo(second);
            if(compare!=0){
                return compare;
            }
        }
        return 0;
    }
}

