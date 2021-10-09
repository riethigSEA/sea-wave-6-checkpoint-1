package dev.wilders;

import java.time.LocalDate;

public abstract class ITPerson {

    protected boolean isCurrentlyWorkingAtCompany;
    protected String name;

    public ITPerson(String name, boolean isCurrentlyWorkingAtCompany) {
        this.name = name;
        this.isCurrentlyWorkingAtCompany = isCurrentlyWorkingAtCompany;
    }

    public void setIsCurrentlyWorkingAtCompany(boolean isCurrentlyWorkingAtCompany) {
        this.isCurrentlyWorkingAtCompany = isCurrentlyWorkingAtCompany;
    }

    public abstract boolean canAccessResourceReadOnly();
    public abstract boolean canAccessResourceReadAndWrite();

}
