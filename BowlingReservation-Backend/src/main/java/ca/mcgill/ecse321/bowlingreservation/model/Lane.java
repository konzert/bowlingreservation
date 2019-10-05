package ca.mcgill.ecse321.bowlingreservation.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Lane{
private int laneID;
   
   public void setLaneID(int value) {
this.laneID = value;
    }
@Id
public int getLaneID() {
return this.laneID;
    }
private boolean isAvailable;

public void setIsAvailable(boolean value) {
this.isAvailable = value;
    }
public boolean isIsAvailable() {
return this.isAvailable;
    }
private Reservation reservation;

@ManyToOne(optional=false)
public Reservation getReservation() {
   return this.reservation;
}

public void setReservation(Reservation reservation) {
   this.reservation = reservation;
}

}
