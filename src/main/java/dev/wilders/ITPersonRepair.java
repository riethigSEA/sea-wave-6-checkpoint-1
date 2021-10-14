package dev.wilders;

public class ITPersonRepair {

    public static String repairName(ITPerson person) {
        String[] split = person.getName().split("_");
        return split[0] + " " + split[1];

    }
}
