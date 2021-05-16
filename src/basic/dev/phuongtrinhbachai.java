package basic.dev;

import java.util.Scanner;

public class phuongtrinhbachai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
        float x1, x2, detail;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Nhap a= ");
        a = scan.nextInt();
        
        System.out.print("Nhap b= ");
        b = scan.nextInt();
        
        System.out.print("Nhap c= ");
        c = scan.nextInt();
        
        detail = (b*b - (4*a*c))/(2*a);
        if (detail<0) {
            System.out.println("Phương trình vô nghiệm");
        } else if(detail==0) {
            x1=x2= (-b/(2*a));
            System.out.println("Phương trình có nghiệm kép x1 = x2= " + x1);
        }
        else {
            x1 = (float) ((-b + sqrt(detail))/(2*a));
            x2 = (float) ((-b - sqrt(detail))/(2*a));
            System.out.println("PT co 2 nghiem x1 = " + x1 + "x2 = " + x2);
        } 
                
            
    }

	private static int sqrt(float detail) {
		// TODO Auto-generated method stub
		return 0;
	} 

	}

