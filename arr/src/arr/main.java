package arr;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int[] arr_w = new int[4];
		int[] arr_user = new int[4];
		int token = 0;
				
		arr_w = num_win();
		check(arr_w);
	
	}

	public static void check(int arr_w[])
	{
		int[] arr_user = new int[4];
		int token = 0;
		while(token != 4) {
			arr_user = num_user();
			for(int x = 0; x< 4; x++) {
				for(int y = 0; y< 4; y++) {
					if (arr_user[x] == arr_w[y]) {
						if(arr_user[y] == arr_w[y]) {
							System.out.println("��� "+ arr_w[y]);
							token++;
						}
						else System.out.println("������ "+ arr_w[y]);
					}
						
				}
				
					}
			if (token != 4) {
				token = 0;
			}
		}
			/*
			
			for(int x = 0; x< 4; x++) {
			if (arr_user[0] == arr_w[x]) {
							if (arr_user[0] == arr_w[0]) {
				System.out.println("��� "+ arr_w[0]);
				token++;
								}
							else {
								System.out.println("������ "+ arr_w[x]);
								}
									}
					}
		for(int x = 0; x< 4; x++) {
			if (arr_user[1] == arr_w[x]) {
							if (arr_user[1] == arr_w[1]) {
				System.out.println("��� "+ arr_w[1]);
				token++;
								}
							else {
								System.out.println("������ "+ arr_w[x]);
								}
									}
					}
		
		for(int x = 0; x< 4; x++) {
			if (arr_user[2] == arr_w[x]) {
							if (arr_user[2] == arr_w[2]) {
				System.out.println("��� "+ arr_w[2]);
				token++;
								}
							else {
								System.out.println("������ "+ arr_w[x]);
								}
									}
					}
		for(int x = 0; x< 4; x++) {
			if (arr_user[3] == arr_w[x]) {
							if (arr_user[3] == arr_w[3]) {
				System.out.println("��� "+ arr_w[3]);
				token++;
								}
							else {
								System.out.println("������ "+ arr_w[x]);
								}
									}
					}
		if (token != 4) {
		token = 0;
		}
		}	
	*/
	}

	public static int rnd(int min, int max)
    {//������� �������� ����� � �������� ���������
            max -= min;
            return (int) (Math.random() * ++max) + min;
    }

	public static int[] num_win() {
		//������� 4� ��������������� ����� � �������
		int[] arr = new int[4];
		int y = 0;
		int token = 0;
		arr[0] = rnd(1,9);
			while(token == 0 ) {
			y = rnd(1,9);
			if (y != arr[0]) {
				arr[1] = y;
				token = 1;	
							}
					}
					token = 0;
		while(token == 0) {
			y = rnd(1,9);
			if(y != arr[0]) {
				if (y != arr[1]) {
					arr[2] = y;
					token = 1;
								}
				
							}
						}
		token = 0;
		while(token == 0) {
			y = rnd(1,9);
			if(y != arr[0]) {
				if (y != arr[1]) {
					if(y!= arr[2]) {
					arr[3] = y;
					token = 1;
								}
							  }
				
							}
						}
		return arr;
		
	}

	public static int[] num_user()

	{   
		System.out.println("������� �����");
		Scanner scn = new Scanner(System.in);
		String a = scn.nextLine(); //��������� ������ 
		int token = 0;
		int b = a.length();// ������ ����� ������
		int[] num_user = new int[4];
		while(token == 0) {
					//��������� ������ �� ���������� ��������� ������	
			if (b != 4) {
				System.out.println("������� 4� ������� �����");
				a = scn.nextLine();
						}
			else{token = 1;}
		}
	//��������� ��������� ���������� � ������
		for(int i = 0; i < 4; i++ ) {
	char ch = a.charAt(i); //��������� ������ ��������� ������		
	int int_ch = Character.getNumericValue(ch); // ��������� ������ � ���
		num_user[i] = int_ch;
		}
		
				
			
			return num_user;
	}






}
