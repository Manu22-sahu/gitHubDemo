package testYANTRA;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Tree{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Choice to Sort");
		int ch = sc.nextInt();
		
		switch(ch)
		{
		case 1 : 

		TreeSet ts=new TreeSet<Student>(Student.sortById);
		ts.add(new Student(2,"Anu", 81));
		ts.add(new Student(5,"Anushka", 80));
		ts.add(new Student(8,"Manali", 85));
		ts.add(new Student(1,"Manu", 60));
		ts.add(new Student(9,"Monika", 75));
		
		System.out.println(ts);
		break;
			
		case 2 :		
			TreeSet ts1=new TreeSet<Student>(Student.sortByName);
		ts1.add(new Student(2,"Anu", 81));
		ts1.add(new Student(5,"Anushka", 80));
		ts1.add(new Student(8,"Manali", 85));
		ts1.add(new Student(1,"Manu", 60));
		ts1.add(new Student(9,"Monika", 75));
		System.out.println(ts1);
		break;
			
		case 3 :
			TreeSet ts2=new TreeSet<Student>(Student.sortByPercentage);
			ts2.add(new Student(2 ,"Anu", 81));
			ts2.add(new Student(5,"Anushka", 80));
			ts2.add(new Student(8,"Manali", 85));
			ts2.add(new Student(1,"Manu", 60));
			ts2.add(new Student(9,"Monika", 75));
			System.out.println(ts2);
			break;
			
		}
		

	}

}	
