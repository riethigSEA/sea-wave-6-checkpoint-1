package dev.wilders;

import java.time.LocalDate;

public class Admin extends ITPerson {

    protected LocalDate lastCertified;

    public Admin(String name, LocalDate lastCertified) {
        super(name);
        this.lastCertified = lastCertified;
    }

    public void setLastCertified(LocalDate lastCertified) {
        this.lastCertified = lastCertified;
    }

    @Override
    public boolean hasReadAccess() {
        return lastCertified.isAfter(LocalDate.now().minusYears(1));
    }

    @Override
    public boolean hasWriteAccess() {
        return lastCertified.isAfter(LocalDate.now().minusYears(1));
    }
}
