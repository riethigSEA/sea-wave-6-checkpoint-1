package dev.wilders;

public class Backoffice extends ITPerson {

    @Override
    public boolean canAccessResourceReadOnly() {
        return false;
    }

    @Override
    public boolean canAccessResourceReadAndWrite() {
        return false;
    }
}
