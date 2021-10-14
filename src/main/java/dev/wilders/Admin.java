package dev.wilders;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.*;


public class Admin extends ITPerson {

    protected LocalDate lastCertified;

    public Admin(String name,  LocalDate lastCertified) {
        super(name);
        this.lastCertified = lastCertified;
    }

    public void setLastCertified(LocalDate lastCertified) {
        this.lastCertified = lastCertified;
    }

    @Override
    public boolean hasReadAccess() {
        if(YEARS.between(lastCertified,LocalDate.now()) < 365) {

            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean hasWriteAccess() {
        if(DAYS.between(lastCertified,LocalDate.now()) < 365) {

            return true;
        }
        else{
            return false;
        }
    }
}
