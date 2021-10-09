package dev.wilders;

import java.time.LocalDate;

public class Admin extends ITPerson {

    protected LocalDate lastCertified;

    public Admin(String name, LocalDate lastCertified, boolean isCurrentlyWorkingAtCompany) {
        super(name, isCurrentlyWorkingAtCompany);
        this.lastCertified = lastCertified;
    }

    public void setLastCertified(LocalDate lastCertified) {
        this.lastCertified = lastCertified;
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
