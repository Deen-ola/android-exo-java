package esgistp;

import java.nio.file.Paths;

public class main {
	
	 Employer[][] tab;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Les employés");
		Employer Emp1=new Employer(1001,"Jack","MAMA","masculin","12/03/1989","Externe",255000,25480,55875,25874110,147852);
		Employer Emp2=new Employer(1002,"Albert","ATTA","masculin","22/01/1993","Interne",255000,25480,55875,25874110,147852);
		Employer Emp3=new Employer(1003,"Jolie","NANA","feminin","12/08/1996","Interne",255000,25480,55875,25874110,147852);
		Employer Emp4=new Employer(1004,"Victor","WANOU","masculin","12/08/1996","Externe",255000,25480,55875,25874110,147852);
		
		
		//Tester les methodes
		Interne interne=null;
		double salaireInterne=interne.calculSalaire(2000, 254789);
		Externe externe=null;
		double salaireExterne=externe.calculSalaire(257895, 987452);
		Employer emp=null;
		double Monsalaire=emp.calculSalaire(salaireInterne, salaireExterne)	;
		//mon fichier
		//Path fichier=Paths.get(chemin de depot);
		//Files.write(bill.txt,1001,"Jack","MAMA","masculin","12/03/1989","Externe",255000,25480,55875,25874110,147852,StandardOpenOption.APPEND);
		
	}

}
