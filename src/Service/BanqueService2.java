package Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//activite 2.2
public class BanqueService2 {
	
	public double conversion(double montant) {
		return montant*3.36;
	}
	public Compte getCompte(String code) {
		return new Compte(code,600,new Date());
	}
    public List<Compte> getComptes(){
    	List<Compte> comptes=new ArrayList<>(); 
    	Compte cp = new Compte("123",400,new Date());
    	Compte cp2= new Compte("145",500,new Date());
    	comptes.add(cp);
    	comptes.add(cp2);
    	return comptes;
    }
public static void main(String[] args) {
	BanqueService2 bs=new BanqueService2();
	bs.getComptes().add(new Compte("12",12,new Date()));
	System.out.println(bs.conversion(1));
	System.out.println(bs.getCompte("0"));
  }
}