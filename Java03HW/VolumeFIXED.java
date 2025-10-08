// Made by Georgio Tournas. This program calculates the total volume of soda.
public class VolumeFIXED {
    public static void main(String[] args) {
        int cansPerPack = 6; // # of cans in six-pack
        final double CAN_VOLUME = .355; // Volume in liters
        final int BOTTLE_VOLUME = 2; // Volume in liters
        final double PACK_VOLUME = cansPerPack * CAN_VOLUME;
        System.out.println("The amount of soda in a six-pack of cans is " + PACK_VOLUME + " liters!");
        System.out.println("If you added a bottle, that would make it " + (PACK_VOLUME + BOTTLE_VOLUME));

    }
}
