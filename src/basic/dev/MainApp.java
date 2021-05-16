package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
   System.out.print("Nhập vao thang trong năm =");
   int n = sc.nextInt();
   switch(n) {
   case 1,3,5,7,8,10,12:System.out.print("tháng có 31 ngày");break;
   case 4,6,9,11:System.out.print("Tháng có 30 ngày");break;
   case 2:System.out.print("Tháng có 28 ngày");break;
   default :System.out.print("Tháng không có");break;
	}
	}
}
