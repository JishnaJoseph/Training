package AtmProject;

import java.util.Scanner;

public class ATMInterface {
	public static void main(String[] args) {
		ATMSystem[] array = new ATMSystem[20];
		int arrayLength = 2;
		ATMSystem obj4 = new ATMSystem();
		ATMSystem obj1 = new ATMSystem("Jishna", "123456789", 1234, 3000);
		ATMSystem obj2 = new ATMSystem("Dalvin", "123456780", 9876, 2000);
		array[0] = obj1;
		array[1] = obj2;
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println();
			System.out.println("======================================");
			System.out.println("	Welcome to Bank	");
			System.out.println("======================================");
			System.out.println("Automated Teller Machine");
			System.out.println("Choose 1 for Registration");
			System.out.println("Choose 2 for Withdraw");
			System.out.println("Choose 3 for Check Balance");
			System.out.println("Choose 4 for Deposit");
			System.out.println("Choose 5 for Change Pin");
			System.out.println("Choose 6 for EXIT");
			System.out.print("Choose the operation you want to perform:");
			int n = s.nextInt();
			switch (n) {
			case 1:
				System.out.println("Registration:");
				System.out.println("Enter your name:");
				String name = s.next();
				System.out.println("Enter the account number:");
				String accNo = s.next();
				System.out.println("Enter 4 digit atm pin:");
				int atmpin = s.nextInt();
				System.out.println("Enter the minimum balance:");
				double minBalance = s.nextDouble();
				ATMSystem obj3 = new ATMSystem(name, accNo, atmpin, minBalance);
				array[arrayLength] = obj3;
				arrayLength++;
				System.out.println("Registration Successfull!!!!!");
				System.out.println("======================================");
				break;
			case 2:
				System.out.println("Insert your atm card");
				System.out.println("Enter your 4 digit atm pin:");
				int pin = s.nextInt();
				int index = obj4.checkpin(pin, array, arrayLength);
				if (index != -1) {
					System.out.println("Enter money to be withdrawn:");
					double wAmount = s.nextDouble();
					ATMSystem obj5 = obj4.withdraw(wAmount, array[index]);
					if (obj5 != null) {
						array[index] = obj5;
					}
				}
				System.out.println("======================================");
				break;

			case 3:
				System.out.println("Enter your atm card");
				System.out.println("Check Balance:");
				System.out.println("Enter your 4 digit atm pin:");
				pin = s.nextInt();
				int index1 = obj4.checkpin(pin, array, arrayLength);
				if (index1 != -1) {
					System.out.println("Your Balance is :"
							+ array[index1].balance);
				}
				System.out.println("======================================");
				break;
			case 4:
				System.out.println("Enter your atm card");
				System.out.println("Deposit:");
				System.out.println("Enter your 4 digit atm pin:");
				pin = s.nextInt();
				int index2 = obj4.checkpin(pin, array, arrayLength);
				if (index2 != -1) {
					System.out.println("Enter money to be deposited:");
					double dAmount = s.nextDouble();
					ATMSystem obj6 = obj4.deposit(dAmount, array[index2]);
					array[index2] = obj6;

				}
				System.out.println("======================================");
				break;
			case 5:
				System.out.println("Enter your atm card");
				System.out.println("Change Pin:");
				System.out.println("Enter your current 4 digit atm pin:");
				pin = s.nextInt();
				int index3 = obj4.checkpin(pin, array, arrayLength);
				if (index3 != -1) {
					System.out.println("Enter the New Pin:");
					int newPin = s.nextInt();
					System.out.println("Confirm the New Pin:");
					int confirmPin = s.nextInt();
					ATMSystem obj7 = obj4.changePin(newPin, confirmPin,
							array[index3]);
					array[index3] = obj7;
				}
				System.out.println("======================================");
				break;
			case 6:
				System.exit(0);

			}

		}
	}
}
