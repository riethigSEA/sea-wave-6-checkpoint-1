package dev.wilders;

public class Support extends ITPerson {

    protected int level;

    public Support(String name,  int level) {
        super(name);
        this.level = level;
    }

    @Override
    public boolean hasReadAccess() {
        // Add logic to evaluate Read access for Support here.
        switch(level) {
            case 0:
                return false;

            case 1:
            case 2:
                return true;

            default:
                System.out.println("falsch konfigurierter Support Level");
                return false;

        }
    }

    @Override
    public boolean hasWriteAccess() {
        switch(level) {
            case 0:
            case 1:
                return false;
            case 2:
                return true;

            default:
                System.out.println("falsch konfigurierter Support Level");
                return false;

        }

    }
}
