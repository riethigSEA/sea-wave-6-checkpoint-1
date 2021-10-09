package dev.wilders;

import java.time.LocalDate;

public class Developer extends ITPerson {

    protected LocalDate employmentDate;

    public Developer(String name, LocalDate employmentDate, boolean isCurrentlyWorkingAtCompany) {
        super(name, isCurrentlyWorkingAtCompany);
        this.employmentDate = employmentDate;
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
