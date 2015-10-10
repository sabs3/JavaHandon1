
public class StudentMark {
	
	private int mark;
	private String comment;
	
	public StudentMark(int mark){
		this.mark = mark;
		grades();
	}
	
	public void grades() {
		if(mark < 40) {
			comment = "Poor";
		}else if (mark < 60) {
			comment = "Average";
		}else if (mark < 80) {
			comment = "Good";
		}else if (mark < 90) {
			comment = "Very Good";
		}else if (mark >= 90) {
			comment = "Excellent";
		}
	}
	
	public String getComment() {
		return comment;		
	}
	
	
	}
	
	




