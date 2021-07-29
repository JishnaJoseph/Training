package day6;

public class HRManagement1 {
	String name;
	String designation;
	String manager;
	double salary;
	int totalLeave;
	int pendingLeave;
	
	void addEmployee(String nam,String des,String mgr,double sal,int tot)
	{  
		name=nam;  
		designation=des;  
		manager=mgr;  
		salary=sal;
		totalLeave=tot;
		pendingLeave=totalLeave;
		}
	
	void salaryslipdisplay()
	{
		System.out.println("Name : " +name);
		System.out.println("Designation : " +designation);
		System.out.println("Manager : " +manager);
		System.out.println("Total Leave : " +totalLeave);
		System.out.println("Pending Leave : " +pendingLeave);
		System.out.println("Salary : " +salary);
		System.out.println("---------------------");
	}
	
	void applyLeave(int leave)
	{
		if(pendingLeave>leave)
		{
			pendingLeave-=leave;
		}
		else{
			System.out.print("Dont have enough Leave");
		}
	}
}
