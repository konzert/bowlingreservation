package ca.mcgill.ecse321.bowlingreservation.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Id;

@Entity
public class Player{
private boolean rentedShoes;
   
   public void setRentedShoes(boolean value) {
this.rentedShoes = value;
    }
public boolean isRentedShoes() {
return this.rentedShoes;
    }
private Reservation reservation;

@ManyToOne(optional=false)
public Reservation getReservation() {
   return this.reservation;
}

public void setReservation(Reservation reservation) {
   this.reservation = reservation;
}

private int playerID;

public void setPlayerID(int value) {
this.playerID = value;
    }
@Id
public int getPlayerID() {
return this.playerID;
    }
private String name;

public void setName(String value) {
this.name = value;
    }
public String getName() {
return this.name;
       }
   }
