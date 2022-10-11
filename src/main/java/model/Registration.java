package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Registration")
public class Registration {

	     @Id
	     @GeneratedValue(strategy = GenerationType.IDENTITY)
	    long serialNo;
	    String Name;
	    long Mobno;
	    int Rollno;
	    String CurrentAdd;
	    String Emailid;
	    String Password;
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public long getMobno() {
			return Mobno;
		}
		public void setMobno(long mobno) {
			Mobno = mobno;
		}
		public int getRollno() {
			return Rollno;
		}
		public void setRollno(int rollno) {
			Rollno = rollno;
		}
		public String getCurrentAdd() {
			return CurrentAdd;
		}
		public void setCurrentAdd(String currentAdd) {
			CurrentAdd = currentAdd;
		}
		public String getEmailid() {
			return Emailid;
		}
		public void setEmailid(String emailid) {
			Emailid = emailid;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
	    
	    
}
