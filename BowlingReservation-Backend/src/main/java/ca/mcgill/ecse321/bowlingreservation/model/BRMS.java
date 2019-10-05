package ca.mcgill.ecse321.bowlingreservation.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

@Entity
public class BRMS{
private int reservationSystem;
   
   public void setReservationSystem(int value) {
this.reservationSystem = value;
    }
@Id
public int getReservationSystem() {
return this.reservationSystem;
    }
private Set<User> user;

@OneToMany(mappedBy="bRMS", cascade={CascadeType.ALL})
public Set<User> getUser() {
   return this.user;
}

public void setUser(Set<User> users) {
   this.user = users;
}

}
