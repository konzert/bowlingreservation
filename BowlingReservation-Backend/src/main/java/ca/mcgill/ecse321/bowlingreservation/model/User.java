package ca.mcgill.ecse321.bowlingreservation.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Set;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;

@Entity
public class User{
private int userID;
   
   public void setUserID(int value) {
this.userID = value;
    }
@Id
public int getUserID() {
return this.userID;
    }
private Set<UserRole> userRole;

@OneToMany(mappedBy="user")
public Set<UserRole> getUserRole() {
   return this.userRole;
}

public void setUserRole(Set<UserRole> userRoles) {
   this.userRole = userRoles;
}

private BRMS bRMS;

@ManyToOne(optional=false)
public BRMS getBRMS() {
   return this.bRMS;
}

public void setBRMS(BRMS bRMS) {
   this.bRMS = bRMS;
}

}
