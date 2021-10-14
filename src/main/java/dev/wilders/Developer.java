package dev.wilders;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.*;
public class Developer extends ITPerson {

    protected LocalDate employmentDate;

    public Developer(String name,  LocalDate employmentDate) {
        super(name);
        this.employmentDate = employmentDate;
    }

    @Override
    public boolean hasReadAccess() {
        // Add logic to evaluate Read access for Developer here.
        return true;
    }

    @Override
    public boolean hasWriteAccess() {
        // Add logic to evaluate Write access for Developer here.
      if(DAYS.between(employmentDate,LocalDate.now()) > 182){

          return true;
      }
      else{
          return false;
      }
    }
}
