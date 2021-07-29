package day7;

public class Q118VirtualDemo {
	public static void main(String[] args) {
    Q118Salary s = new Q118Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
    Q118Employee e = new Q118Salary("John Adams", "Boston, MA", 2, 2400.00);
    
    System.out.println("Call mailCheck using Salary reference --");
    
    s.mailCheck();
    System.out.println("\n Call mailCheck using Employee reference--");
    e.mailCheck();

}}
