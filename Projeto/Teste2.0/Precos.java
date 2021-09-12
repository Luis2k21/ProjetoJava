package ProjetoJava;

import java.text.NumberFormat;
import java.util.Scanner;

public class Precos extends Bebidas implements Adegaadm{

	private double preco;
	
	public Precos() {
		
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void bebidasPreco() {
		
		Scanner ler = new Scanner(System.in);
		Bebidas bebidas = new Bebidas();
		
		double somaTotal=0,Vinho=16.00,Breja=9.00, Azul=13.00, Ref=14.00, SucoCLeite=8.00, Agua=6.00;
		
		int num, bn, ba, fc;
		
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
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(0);
		String formatarMoeda = nf.format(somaTotal);
		System.out.println("\nCarrinho" +bebidas.formatarMoeda() + somaTotal);
		
		
		do {	
			
			System.out.println("\nVocê deseja finalizar está compra?");
			System.out.println("\n1 - Sim");
			System.out.println("\n2 - Não");
			System.out.println("\n3 - Sair do carrinho");
			fc = ler.nextInt();
				
		switch(fc) {
		case 1: 
			if(fc == 1) {
				System.out.println("\nCompra finalizada com sucesso!");
			}
			break;
		case 2: 
			if(fc == 2) {
				System.out.println("\nCompra não finalizada!");
			}
			default:
				System.out.println("\nObrigado por comprar na: "+Adegaadm.nome);
				System.out.println("\nCaso queira visitar um de nossos locais: "+Adegaadm.endereco);
		   }
		}while(fc != 3 && fc != 2 && fc != 1);
	}
}
