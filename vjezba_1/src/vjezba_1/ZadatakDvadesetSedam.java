package vjezba_1;

// ---> Ovo je zapravo 28. zadatak, na PDF-u sa zadacima <---

/*Takmičari su radili testove iz matematike i programiranja. 
 * Za svaki predmet dobili su određeni broj poena (cio broj od 0 do 50). 
 * Takmičari se rangiraju po ukupnom broju poena iz oba predmeta. 
 * Ako dva takmičara imaju isti broj poena, pobjednik je onaj koji ima više poena iz programiranja. 
 * Potrebno je napisati program koji određuje pobjednika takmičenja.*/

public class ZadatakDvadesetSedam {
	
	public static void main(String[] args) {
		
		int bodoviMat1 = 40;
		int bodoviProg1 = 31;
		
		int bodoviMat2 = 39;
		int bodoviProg2 = 32;
		
		int ukupno1 = bodoviMat1 + bodoviProg1;
		int ukupno2 = bodoviMat2 + bodoviProg2;
		
		System.out.printf("Matematika1: %d\nProgramiranje1: %d\n\nMatematika2: %d\nProgramiranje2: %d\n", bodoviMat1, bodoviProg1, bodoviMat2, bodoviProg2);
		
		if (ukupno1 > ukupno2 || (ukupno1 == ukupno2 && bodoviProg1 > bodoviProg2)) { 
			System.out.print("Pobijedio je takmicar 1.");
		}
		
		else {
			System.out.print("Pobijedio je takmicar 2.");
		}
		
	}

}
