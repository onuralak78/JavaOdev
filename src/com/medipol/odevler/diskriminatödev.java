package com.medipol.odevler;
import java.util.Scanner;
public class diskriminatödev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("(ax²+bx+c) ikinci dereceden bir denklemdir.\\n Denklemdeki sabitleri aþaðýdaki gibi sýrayla girin");
		
		System.out.print("a deðerini giriniz :"); 
        double a = sc.nextInt(); 
        System.out.print("b deðerini giriniz   :"); 
        double b = sc.nextInt(); 
        System.out.print("c deðerini giriniz   :"); 
        double c = sc.nextInt(); 
        double delta = (b * b) - (4 * a * c);
        
        if (delta > 0){ 
            double x1 = ((-1 * b) - Math.sqrt(delta)) / (2 * a); 
            double x2 = ((-1 * b) + Math.sqrt(delta)) / (2 * a); 
            System.out.println("x1= " + x1 + " x2= " + x2); 
        } 
        if (delta < 0){
            System.out.println("Denklemin Gerçel Kökü Yoktur."); 
        } 
        if (delta == 0){ 
            double x = (-1 * b) / (2 * a);
            System.out.println("Çakýþýk kökü var x1= x2= " + x);
	    }

	}

	}


