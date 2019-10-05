package ca.mcgill.ecse321.bowlingreservation.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;
import javax.persistence.ManyToOne;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.sql.Date;

@Entity
public class Reservation{
private int orderNumber;
   
   public void setOrderNumber(int value) {
this.orderNumber = value;
    }
@Id
public int getOrderNumber() {
return this.orderNumber;
    }
private Time bookingTime;

public void setBookingTime(Time value) {
this.bookingTime = value;
    }
public Time getBookingTime() {
return this.bookingTime;
    }
private String email;

public void setEmail(String value) {
this.email = value;
    }
public String getEmail() {
return this.email;
    }
private int partySize;

public void setPartySize(int value) {
this.partySize = value;
    }
public int getPartySize() {
return this.partySize;
    }
private boolean isPricedByGame;

public void setIsPricedByGame(boolean value) {
this.isPricedByGame = value;
    }
public boolean isIsPricedByGame() {
return this.isPricedByGame;
    }
private Center center;

@ManyToOne(optional=false)
public Center getCenter() {
   return this.center;
}

public void setCenter(Center center) {
   this.center = center;
}

private Set<Lane> lane;

@OneToMany(mappedBy="reservation", cascade={CascadeType.ALL})
public Set<Lane> getLane() {
   return this.lane;
}

public void setLane(Set<Lane> lanes) {
   this.lane = lanes;
}

private Set<Player> player;

@OneToMany(mappedBy="reservation", cascade={CascadeType.ALL})
public Set<Player> getPlayer() {
   return this.player;
}

public void setPlayer(Set<Player> players) {
   this.player = players;
}

private Date bookingDate;

public void setBookingDate(Date value) {
this.bookingDate = value;
    }
public Date getBookingDate() {
return this.bookingDate;
    }
private String name;

public void setName(String value) {
this.name = value;
    }
public String getName() {
return this.name;
    }
private int phoneNumber;

public void setPhoneNumber(int value) {
this.phoneNumber = value;
    }
public int getPhoneNumber() {
return this.phoneNumber;
       }
   }
