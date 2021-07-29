package day6;

public class HRManagement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HRManagement1 emp1=new HRManagement1();
		emp1.addEmployee("Jishna", "Ass.Software Developer", "Rahul", 20000, 10);
		HRManagement1 emp2=new HRManagement1();
		emp2.addEmployee("Joseph", "Software Developer", "Ethan", 30000, 10);
		emp2.applyLeave(2);
		emp1.salaryslipdisplay();
		emp2.salaryslipdisplay();

	}

}
