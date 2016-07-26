package LeetCode;

/**
 * Created by iceman on 7/17/2016.
 */
public class RectangleArea {

    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {

        int AreaA = (Math.abs(A) + Math.abs(C)) * (Math.abs(B) + Math.abs(D));
        int AreaB = (Math.abs(E) + Math.abs(G)) * (Math.abs(F) + Math.abs(H));

        int overLapLength = 0;
        int overLapHeight = 0;

        if(A>=G || B >= H || E >=C || F>=D){
            return AreaA + AreaB;
        } else{
            overLapLength = Math.min(C, G) - Math.max(A, E);
            overLapHeight = Math.min(D, H) - Math.max(B, F);
        }

        return (AreaA+AreaB) - (overLapLength * overLapHeight);

    }
}
