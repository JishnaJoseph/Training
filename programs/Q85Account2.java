package day6;

public class Q85Account2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q85Account1 a1=new Q85Account1();  
		a1.insert(832345,"Ankit",1000);  
		a1.display();  
		a1.checkBalance();  
		a1.deposit(40000);  
		a1.checkBalance();  
		a1.withdraw(15000);  
		a1.checkBalance();  

	}

}
