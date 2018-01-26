package test_read_text;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class main {
static String [][] arr = new String[5][3];
static Scanner scn;
static Formatter x;
public static void main(String[] args) {
	//record();	
	System.out.println("record");
	openfile();
		readfile();
		out();
		
		
	}
private static void record() {
	try {
		x = new Formatter ("res//1.txt");
		scn = new Scanner(System.in);
		System.out.println("Ќомер");
		int a = Integer.parseInt(scn.nextLine());
		System.out.println("первое значение");
		String b = scn.nextLine();
		System.out.println("второе значение");
		String c = scn.nextLine();
		x.format("%d	%s	%s",a,b,c);
		x.close();
	} catch (Exception e) {System.out.println("ops");
		
	}
	
}
private static void out() {
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[i][j]+"  ");
		}
	System.out.println();
	}
}
private static void readfile() {
	
	while (scn.hasNext()) {
			for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=scn.next();
			}
			
		}
		
	}
	
}
private static void openfile() {
	
	try {
		scn = new Scanner(new File("res//1.txt"));
			}catch(Exception e){JOptionPane.showMessageDialog(null, "file not found");}
	
}

}
