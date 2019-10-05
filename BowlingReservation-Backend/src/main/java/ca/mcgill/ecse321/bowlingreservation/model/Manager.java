package ca.mcgill.ecse321.bowlingreservation.model;

import javax.persistence.Entity;
import java.util.Set;
import javax.persistence.OneToMany;
import javax.persistence.Id;

@Entity
public class Manager extends UserRole{
private Set<Center> center;

@OneToMany(mappedBy="manager")
public Set<Center> getCenter() {
   return this.center;
}

public void setCenter(Set<Center> centers) {
   this.center = centers;
}

private int managerID;

public void setManagerID(int value) {
this.managerID = value;
    }
@Id
public int getManagerID() {
return this.managerID;
       }
   }
