package basic.dev;

import java.util.Scanner;

public class kiemtra3canhcuatamgiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.print("nhập cạnh a = ");
       int a = sc.nextInt();
       System.out.print("nhập cạnh b = ");
       int b = sc.nextInt();
       System.out.print("nhập cạnh c = ");
       int c = sc.nextInt();
       if((a + b) > c && (b + c) > a && (c + a) > b) {
			System.out.print("Đây là ba cạnh tam giác ");

  } else {

           System.out.print("Đây không là ba cạnh của tam giác");

}
	}
}

