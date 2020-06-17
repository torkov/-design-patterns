package service;

public class MainService {

	private static Employee getChain() {
		
		Employee kasa1 = new ZaChujbina();
		Employee kasa2 = new ZaStranata();
		Employee kasa3 = new Plovdiv();
		Employee client = new Client();
		Observer momche = new momche("Ivan");
		
		ZaChujbina.setNextEmployee(ZaStranata);
		ZaStranata.setNextEmployee(Plovdiv);
		return Plovdiv;
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		Employee chain = getChain();
		chain.employeeMessage(1, "Tozi paket e za stranata");
		chain.employeeMessage(2, "Tozi paket e za plovdiv");
		
		stateKasa1();
		stateKasa2();
		stateKasa3();		
		
	}
	
	public static void stateKasa1() {
		
		Proces status = new Proces();
		
		status.applyState(kasa1);
		State obrabotkaState = kasa1.getState();
		String tekushtState = obrabotkaState.getStateName();
		System.out.println(kasa1.getName() + " Vav proces na: " + tekushtState);
	}
	
	
	
     public static void stateKasa2() {
		
	    Proces status = new Proces();
		
		status.applyState(kasa2);
		State obrabotkaState = kasa2.getState();
		String tekushtState = obrabotkaState.getStateName();
		System.out.println(kasa2.getName() + " Vav proces na: " + tekushtState);
	}
     
     
     
     public static void stateKasa3() {
 		
 	    Proces status = new Proces();
 		
 		status.applyState(kasa3);
 		State obrabotkaState = kasa3.getState();
 		String tekushtState = obrabotkaState.getStateName();
 		System.out.println(kasa3.getName() + " Vav proces na: " + tekushtState);
 	}
      
     

}
