package drai.dev.gravelmon.util;

public class UnitConverter {
    public static int feetToMeters(int feet, int inches){
        inches += feet * 12;

        return (int)(inches * 0.254);
    }

    public static int lbsToKg(int lbs){
        return (int)(lbs*0.453592);
    }
}
