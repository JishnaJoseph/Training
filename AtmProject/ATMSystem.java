package AtmProject;

public class ATMSystem {
	String name;
	String accountNum;
	int pin;
	double balance;

	public ATMSystem(String name, String accountNum, int pin, double balance) {
		this.name = name;
		this.accountNum = accountNum;
		this.pin = pin;
		this.balance = balance;
	}

	public ATMSystem() {

	}

	public int checkpin(int pinNo, ATMSystem[] array, int length) {
		for (int i = 0; i < length; i++) {
			if (array[i].pin == pinNo) {
				System.out.println("Hi " + array[i].name);
				System.out.println("Acc No : " + array[i].accountNum);
				return i;
			}
		}
		System.out.println("Pin is not correct");
		return -1;
	}

	ATMSystem withdraw(double amount, ATMSystem obj) {
		if (amount <= obj.balance) {
			double newBalance = obj.balance - amount;
			obj.balance = newBalance;
			System.out.println("Please Collect your Amount");
			System.out.println("New Balance: " + newBalance);
			return obj;
		} else {
			System.out.println("Not Enough Balance");
		}
		return null;
	}

	ATMSystem deposit(double amount, ATMSystem obj) {
		double newAmount = obj.balance + amount;
		obj.balance = newAmount;
		System.out.println("New Balance: " + newAmount);
		return obj;

	}

	ATMSystem changePin(int newPin, int confirmPin, ATMSystem obj) {
		if (newPin == confirmPin) {
			obj.pin = newPin;
			System.out.println("Pin changed successfully");
			return obj;
		} else {
			System.out.println("new pin and confirm pin are not same");
		}
		return null;
	}
}
