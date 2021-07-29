package day5;

public class CallbyValue {

	int data = 50;

	void change(int data) {
		data = data + 100;
		System.out.println("inside method "+data);
	}

	public static void main(String args[]) {
		CallbyValue obj = new CallbyValue();
		System.out.println("before change " + obj.data);
		obj.change(500);
		System.out.println("after change " + obj.data);

	}

}
