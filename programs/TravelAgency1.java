package day6;

public class TravelAgency1 {
	String name;
	String source;
	String destination;
	String modeofTravel;
	double amount;
	int numberofPersons;
	int numberofDays;

	void travelDetails(String nam, String sc, String des, String mot, int nop, int nod) {
		name = nam;
		source = sc;
		destination = des;
		modeofTravel = mot;
		numberofPersons = nop;
		numberofDays = nod;
	}

	void travelslipdisplay() {
		System.out.println("Name : " + name);
		System.out.println("Souce : " + source);
		System.out.println("Destination : " + destination);
		System.out.println("Mode of Travel : " + modeofTravel);
		System.out.println("Number of Persons : " + numberofPersons);
		System.out.println("Number of Days : " + numberofDays);
		System.out.println("Total Amount : " + amount);

		System.out.println("---------------------");
	}

	public double travelExpense(String mode, int noofPersons, int noofDays) {
		int ratePerDay=100;
		int exp = 0;
		switch (mode) {
		case "Airways":
			exp = 10000;
			break;
		case "Railways":
			exp = 2000;
			break;
		case "Bus":
			exp = 4000;
			break;
		default:
			System.out.println("Invalid mode of transport");

		}
		double dayExp = ratePerDay * noofDays * noofPersons;
		double modeExp = exp * noofPersons;
		amount = dayExp + modeExp;
		return amount;
	}

	public String destination(String dest) {
		String detination;
		switch (dest) {
		case "Delhi":
			detination = "Delhi";
			break;
		case "Bangalore":
			detination = "Bangalore";
			break;
		case "Chennai":
			detination = "Chennai";
			break;
		default:
			System.out.println("Invalid destination");

		}
		return destination;
	}

}