package July21;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1, x2, y1, y2;
		double dis;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x1 point");
		x1 = sc.nextInt();
		System.out.println("enter y1 point");
		y1 = sc.nextInt();
		System.out.println("enter x2point");
		x2 = sc.nextInt();
		System.out.println("enter y2 point");
		y2 = sc.nextInt();
		distance(x1,x2,y1,y2);
	}
		
		public static int distance(int x1,int x2, int y1, int y2){
		int dis = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("distancebetween" + "(" + x1 + "," + y1 + ")," + "("
				+ x2 + "," + y2 + ")=" + dis);
		return dis;
	}

}
