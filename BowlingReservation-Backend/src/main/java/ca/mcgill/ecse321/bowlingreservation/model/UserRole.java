package ca.mcgill.ecse321.bowlingreservation.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class UserRole{
private int userID;
   
   public void setUserID(int value) {
this.userID = value;
    }
@Id
public int getUserID() {
return this.userID;
    }
private User user;

@ManyToOne(optional=false)
public User getUser() {
   return this.user;
}

public void setUser(User user) {
   this.user = user;
}

private String name;

public void setName(String value) {
this.name = value;
    }
public String getName() {
return this.name;
       }
   }
