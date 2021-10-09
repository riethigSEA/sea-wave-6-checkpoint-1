package dev.wilders;

public class Support extends ITPerson {

    protected int level;

    @Override
    public boolean canAccessResourceReadOnly() {
        return false;
    }

    @Override
    public boolean canAccessResourceReadAndWrite() {
        return false;
    }
}
