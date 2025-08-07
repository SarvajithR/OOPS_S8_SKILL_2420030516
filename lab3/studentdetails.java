package lab3;

public class studentdetails {

	public static void main(String[] args) {
		  long rollNumber = 2420030250l;
	        String studentName = "Samhith";
	        float marks = 89.1f;
	        char gender = 'M';
	        boolean passStatus = true;

	        System.out.println("Roll Number: " + rollNumber);
	        System.out.println("Name: " + studentName);
	        System.out.println("Marks: " + marks);
	        System.out.println("Gender: " + gender);
	        System.out.println("Pass/Fail Status: " + (passStatus ? "Pass" : "Fail"));
	}
}
