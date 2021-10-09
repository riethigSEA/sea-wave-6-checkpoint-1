package dev.wilders;

import java.time.LocalDate;

public class Developer extends ITPerson {

    protected LocalDate employmentDate;

    public Developer(String name, LocalDate employmentDate) {
        super(name);
        this.employmentDate = employmentDate;
    }

    @Override
    public boolean hasReadAccess() {
        return true;
    }

    @Override
    public boolean hasWriteAccess() {
        return employmentDate.isBefore(LocalDate.now().minusMonths(6));
    }
}
