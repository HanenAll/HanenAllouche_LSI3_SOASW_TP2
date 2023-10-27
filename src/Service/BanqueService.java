package Service;
//activite 2.1
public class BanqueService {
	public double conversion(double montant) {
		return montant*3.36;
	}
	

public static void main(String[] args) {
	BanqueService bs=new BanqueService();
	double montant=5.23;
	bs.conversion(montant);
	System.out.println("le montant apres la conversion "+bs.conversion(montant));
}
}