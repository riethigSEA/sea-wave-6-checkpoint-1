package dev.wilders;

public class ITPersonRepair {

    public static String repairName(ITPerson person) {
        String[] forenameAndLastname = person.getName().split("_");
        return forenameAndLastname[0] + " " + forenameAndLastname[1];
    }
}
