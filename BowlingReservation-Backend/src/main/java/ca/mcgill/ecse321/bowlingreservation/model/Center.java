package ca.mcgill.ecse321.bowlingreservation.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

@Entity
public class Center{
private String name;
   
   public void setName(String value) {
this.name = value;
    }
@Id
public String getName() {
return this.name;
    }
private String address;

public void setAddress(String value) {
this.address = value;
    }
public String getAddress() {
return this.address;
    }
private int numberOfLanes;

public void setNumberOfLanes(int value) {
this.numberOfLanes = value;
    }
public int getNumberOfLanes() {
return this.numberOfLanes;
    }
private Manager manager;

@ManyToOne(optional=false)
public Manager getManager() {
   return this.manager;
}

public void setManager(Manager manager) {
   this.manager = manager;
}

private Set<Reservation> reservation;

@OneToMany(mappedBy="center", cascade={CascadeType.ALL})
public Set<Reservation> getReservation() {
   return this.reservation;
}

public void setReservation(Set<Reservation> reservations) {
   this.reservation = reservations;
}

}
