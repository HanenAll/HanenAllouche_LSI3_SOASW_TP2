package Service;

import java.util.Date;

//activite 2.2
public class Compte {
	double solde;
	String code;
	Date dateCreation;
	
	public Compte(String code,double solde, Date dateCreation) {
		this.code=code;
		this.solde=solde;
		this.dateCreation=dateCreation;
	}
	public String toString() {
	  return ("solde :"+ solde + "code: " + code + "date de creation :" + dateCreation);
	}
	
	}

