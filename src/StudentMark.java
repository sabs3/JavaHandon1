import java.util.Scanner;
public class StudentMark {
	
public static void main(String []args){
		//pull request
		Scanner user_input = new Scanner(System.in);
		
		String student;
		System.out.print("Enter the student name: ");
		student= user_input.next();
		
		int math, english, hindi, science, social;

		System.out.print("Enter student mark for Mathematics, English, Hindi, Science & Social Science: ");
		math = user_input.nextInt();
		english = user_input.nextInt();
		hindi = user_input.nextInt();
		science = user_input.nextInt();
		social = user_input.nextInt();
		
		int [] mark = {math, english, hindi, science, social};
		String[] subjects = new String[] {"Mathematics", "English", "Hindi", "Science", "Social Science"};
		
		String comment = null;
		for (int x=0; x<(mark.length); x++){
		if(mark[x] <40){
			comment = "Poor";
		}else if (mark[x] <60){
			comment = "Average";
		}else if (mark[x] < 80){
			comment = "Good";
		}else if (mark[x] < 90){
			 comment = "Very Good";
		}else if (mark[x] >= 90){
			comment = "Excellent";
			}
		System.out.println(student + " got " + comment + " grade in "+ subjects[x]);
		}
	}
}


