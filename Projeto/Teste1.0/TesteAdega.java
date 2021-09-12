package ProjetoJava;

import java.util.Scanner;

public class TesteAdega{

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Bebidas bebidas = new Bebidas();
		Adega adega = new Adega(" ", " ");
		
		
		double somaTotal=0,Vinho=16.00,Breja=9.00, Azul=13.00, Ref=14.00, SucoCLeite=8.00, Agua=6.00;
		int num, bn, ba;

			System.out.println("\n\t\tBem vindo ao menu de opções");
			
		do {
			
			System.out.println("\nEscolha uma das opções de bebidas abaixo");
			bebidas.bebidasInfo();
			num = ler.nextInt();
			
		switch(num) {
		
		case 1: 
			if(num == 1) {
				
				System.out.println("\nEscolha uma das opções");
				bebidas.bebidasAlcoolicas();
				ba = ler.nextInt();
				
			switch(ba) {
			case 1: 
				if(ba == 1) {
					somaTotal += Vinho;
				}break;
			case 2: 
				if(ba == 2) {
					somaTotal += Breja;
				}break;
			case 3: 
				if(ba == 3) {
					somaTotal += Azul;
				}
			}
		}
			
		case 2: 
			if(num == 2) {
				
				System.out.println("\nEscolha uma das opções");
				bebidas.bebidasNaturais();
				bn = ler.nextInt();
				
			switch(bn) {
			case 1:
				if(bn == 1) {
					somaTotal += Ref;
					}break;
			case 2:
				if(bn == 2) {
					somaTotal += SucoCLeite;
					}break;
			case 3:
				if(bn == 3) {
					somaTotal += Agua;
					  }break;
				  }
			  }
		  }
	   }while(num != 4);
			System.out.println("\nCarrinho "+ bebidas.formatarMoeda()+ somaTotal);
			adega.imprimirEndereco(null);
	}
}
