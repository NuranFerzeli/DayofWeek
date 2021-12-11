package cb;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		System.out.println("Həftənin gününü hesablama  proqramına xoş gəlmişsiniz!");
		System.out.println("Hesablanacaq günü daxil edin");
		Scanner input = new Scanner(System.in);
		Date dat1e = new Date();
		LocalDate d = LocalDate.now();
		int gun;
		gun = input.nextInt();
		int gun2 = (gun + dat1e.getDay()) % 7;
		switch (gun2) {
		case 1:
			System.out.println("Bazarertəsi");
			break;
		case 2:
			System.out.println("Çərşənbə axşamı");
			break;
		case 3:
			System.out.println("Çərşənbə");
			break;
		case 4:
			System.out.println("Cümə axşamı");
			break;
		case 5:
			System.out.println("Cümə");
			break;
		case 6:
			System.out.println("Şənbə");
			break;
		case 0:
			System.out.println("Bazar");
			break;
		}

//  0 bazar gunudur 

	}
}
