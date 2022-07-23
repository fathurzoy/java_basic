package Tugas2;

import java.util.Scanner;

public class Runer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Implementer implementer = new Implementer();
		Scanner myObj = new Scanner(System.in);  
		
		System.out.println("Pilih Operation: (+, -, /, *) ");
	    var operation = myObj.next(); 

		System.out.println("Masukan input pertama: ");
	    var input1 = myObj.next(); 
	    System.out.println("Masukan input kedua");
	    var input2 = myObj.next(); 
	    
	    switch (operation) {
		case "+":
			try {

				implementer.penjumlahan(Integer.parseInt(input1), Integer.parseInt(input2));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Tipe data harus number");  // Output user input
				e.printStackTrace();
				throw new Exception("Terjadi error");
			}
			break;
		case "-":
			try {
				implementer.pengurangan(Integer.parseInt(input1), Integer.parseInt(input2));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Tipe data harus number");  // Output user input
				e.printStackTrace();
				throw new Exception("Terjadi error");
			}
			break;
		case "/":
			try {
				implementer.pembagian(Integer.parseInt(input1), Integer.parseInt(input2));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Tipe data harus number");  // Output user input
				e.printStackTrace();
				throw new Exception("Terjadi error");
			}
			break;
		case "*":
			try {
				implementer.perkalian(Integer.parseInt(input1), Integer.parseInt(input2));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Tipe data harus number");  // Output user input
				e.printStackTrace();
				throw new Exception("Terjadi error");
			}
			break;
		default:
			System.out.println("Operator harus mengandung salah satu dari (+, -, /, *)");  // Output user input

			break;
		}
		
		
		
		
		
		
		
		

	}

}
