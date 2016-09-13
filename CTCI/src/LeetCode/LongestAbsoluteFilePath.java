package LeetCode;

/**
 * Created by iceman on 9/13/2016.
 */
public class LongestAbsoluteFilePath {

    public static void main(String args[]){
        LongestAbsoluteFilePath obj = new LongestAbsoluteFilePath();
        String filePath = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
        System.out.println("Longest Path : "+obj.lengthLongestPath(filePath));
    }



    public int lengthLongestPath(String input) {
        String[] paths = input.split("\n");
        int[] stack = new int[paths.length + 1];
        int maxLen = 0;
        for(String s : paths){
            int lev = s.lastIndexOf("\t") + 1;
            int curLen = stack[lev + 1] = stack[lev] + s.length() - lev + 1;
            if(s.contains("."))
                maxLen = Math.max(maxLen,curLen - 1);
        }
        return maxLen;
    }
}
