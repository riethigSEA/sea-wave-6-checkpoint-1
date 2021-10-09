package dev.wilders;

public abstract class ITPerson {

    protected boolean isCurrentlyWorkingAtCompany;

    public abstract boolean canAccessResourceReadOnly();
    public abstract boolean canAccessResourceReadAndWrite();

}
