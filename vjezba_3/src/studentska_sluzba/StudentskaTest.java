package studentska_sluzba;

import java.util.ArrayList;

public class StudentskaTest {

public static void main(String[] args) {
		
		ArrayList<Student> studenti = new ArrayList<>();
		
		Student s1 = new Student();
		s1.addGrade(10);
		s1.addGrade(10);
		s1.addGrade(10);
		
		System.out.printf("%nProsjecna ocjena studenta %s %s: %.2f", 
				s1.getIme(), s1.getPrezime(), s1.gradeAverage());
		
		if (s1.loanStatus())
			System.out.printf("%nStudent %s %s %d ima pravo na studentski kredit.", 
					s1.getIme(), s1.getPrezime(), s1.getBrojIndeksa());
		else
			System.out.printf("%nStudent %s %s %d nema pravo na studentski kredit.", 
					s1.getIme(), s1.getPrezime(), s1.getBrojIndeksa());
		
		Student s2 = new Student("Janko", "Jankovic", 2);
		s2.addGrade(7);
		s2.addGrade(6);
		s2.addGrade(8);
		
		System.out.printf("%nProsjecna ocjena studenta %s %s: %.2f", 
				s2.getIme(), s2.getPrezime(), s2.gradeAverage());
		
		if (s2.loanStatus())
			System.out.printf("%nStudent %s %s %d ima pravo na studentski kredit.", 
					s2.getIme(), s2.getPrezime(), s2.getBrojIndeksa());
		else
			System.out.printf("%nStudent %s %s %d nema pravo na studentski kredit.", 
					s2.getIme(), s2.getPrezime(), s2.getBrojIndeksa());
		
		studenti.add(s1);
		studenti.add(s2);
		
		for (Student s : studenti) {
			System.out.printf("%n%s, %s, %B", s.getIme(), s.getPrezime(), s.loanStatus());
		}
		
	}

}
