package arranjoHotel;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] vect = new Aluguel[10];
		
		System.out.println();
		System.out.print("Quantos quartos ira alugar : ");int n = sc.nextInt();sc.nextLine();
		System.out.println();
		System.out.println("======= DIARIA =======");
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("ALUGUEL #: " + i);
			System.out.print("Name : ");
			String nome = sc.nextLine();
			System.out.print("Email : ");
			String email = sc.nextLine();
			System.out.print("Quarto : ");
			int Quarto = sc.nextInt();sc.nextLine();
			
			if (vect[Quarto] != null) {
				System.out.println("");
				System.out.println("QUARTO JA ALUGADO.");
				System.out.println("ESCOLHA OUTRO QUARTO!");
				i --;
			} else {
				vect[Quarto] = new Aluguel(Quarto , nome, email);
			}
			System.out.println();
			System.out.println("=================");
		}
		
		System.out.println();
		System.out.println("========= QUARTOS ALUGADOS ==========");
		for (int i = 0; i < vect.length; i++) {
			
			if (vect[i] != null) {
				System.out.println(vect[i]);
			}	
		}
		sc.close();
	}
}
