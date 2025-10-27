import java.util.ArrayList;

public class BusTester {
    public static void main(String[] args) {
        ArrayList<Bus> arr = new ArrayList<Bus>();
        arr.add(new Hybrid(45, 1.2, Electric.HIGH_VOLTAGE, 150, 1));
        arr.add(new CNGBus(50, 1.0, 200, 2));
        for (Bus magical : arr) {
            System.out.println("ID: " + magical.getID());
            if (magical instanceof LiquidFuel) {
                LiquidFuel magicalPollution = (LiquidFuel) magical;
                System.out.println("Emission Tier: " + magicalPollution.getEmissionTier());
            }
            System.out.println("Accel: " + magical.getAccel());
        }
    }
}
