package dev.wilders;

public class Support extends ITPerson {

    protected int level;

    public Support(String name, int level) {
        super(name);
        this.level = level;
    }

    @Override
    public boolean hasReadAccess() {
        return level > 0;
    }

    @Override
    public boolean hasWriteAccess() {
        return level > 1;
    }
}
