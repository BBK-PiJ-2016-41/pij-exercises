public class Launcher {
    public static void main(String[] args){
   
		HospitalManager myHospital = new HospitalManager();
		
		Patient firstPatient = new Patient("Doris", 45, "Angina");
		Patient secondPatient = new Patient("Malcolm", 15, "Broken arm");
		Patient thirdPatient = new Patient("Ray", 20, "Burns");
			
		System.out.println(myHospital.getNoPatients());
		
		myHospital.addPatient(firstPatient);
		myHospital.addPatient(secondPatient);
		myHospital.addPatient(thirdPatient);
		
		System.out.println(myHospital.getNoPatients());	
	
		Patient traverser = firstPatient;
		while (traverser.getNextPatient() != null) {
				traverser = traverser.getNextPatient();
		}
			
		Patient fourthPatient = new Patient("Sandy", 33, "Shark attack");
		myHospital.addPatient(fourthPatient);
		
		System.out.println(myHospital.getNoPatients());	
		
		traverser = firstPatient;
		while (traverser.getNextPatient() != null) {
				traverser = traverser.getNextPatient();
		}
		
		boolean deleted = myHospital.deletePatient("Malcolm");
		System.out.println(deleted);
		
		System.out.println(myHospital.getNoPatients());
		
		traverser = firstPatient;
		while (traverser.getNextPatient() != null) {
				traverser = traverser.getNextPatient();
		}
		
		
		
		
   }
}