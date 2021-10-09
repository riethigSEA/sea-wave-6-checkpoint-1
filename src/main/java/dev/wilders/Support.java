package dev.wilders;

public class Support extends ITPerson {

    protected int level;

    public Support(String name, int level, boolean isCurrentlyWorkingAtCompany) {
        super(name, isCurrentlyWorkingAtCompany);
        this.level = level;
    }

    @Override
    public boolean canAccessResourceReadOnly() {
        return false;
    }

    @Override
    public boolean canAccessResourceReadAndWrite() {
        return false;
    }
}
