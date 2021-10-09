package dev.wilders;

public class Admin extends ITPerson {

    @Override
    public boolean canAccessResourceReadOnly() {
        return false;
    }

    @Override
    public boolean canAccessResourceReadAndWrite() {
        return true;
    }
}
