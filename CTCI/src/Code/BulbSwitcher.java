package Code;

/**
 * Created by iceman on 8/23/2016.
 */
public class BulbSwitcher {
    public static void main(String args[]) {
        BulbSwitcher obj = new BulbSwitcher();
        System.out.println("Number of Bulbs available are : " + obj.bulbSwitch(3));
    }

    public int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }
}
