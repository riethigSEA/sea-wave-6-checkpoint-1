package dev.wilders;

import java.time.LocalDate;

public class Developer extends ITPerson {

    private LocalDate employmentDate;

    @Override
    public boolean canAccessResourceReadOnly() {
        return true;
    }

    @Override
    public boolean canAccessResourceReadAndWrite() {
        return false;
    }
}
