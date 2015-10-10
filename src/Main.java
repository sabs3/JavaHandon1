import java.util.Scanner;
public class Main {
	
	public static void main (String[] args) {
		
		int subject;
		int i = 0;
		int average = 0;
		
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Enter the name of student");
		String student = user_input.next();
		
		System.out.print("Enter the number of Subjects: ");
		int numberofSub = user_input.nextInt();
		
		int arrayofMarks[] = new int[numberofSub];		
		
		
		for (i = 0; i< numberofSub; i++) {
			System.out.print("Enter the mark for subject " + (i+1) + " : ");
			subject = user_input.nextInt();
			StudentMark grade = new StudentMark(subject);
			arrayofMarks[i] = subject;
			System.out.println(student + " got " + grade.getComment() + " grade for subject " + (i+1));
			}
		
		for (i =0; i<numberofSub; i++) {
			average =average+arrayofMarks[i];
			}
		
		average = average/100;
		StudentMark avegrade = new StudentMark(average);
		System.out.println("The average grade is" + " : " + avegrade.getComment());
	}	

}
