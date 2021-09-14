package ProjetoJava;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExecucaoDoTeste {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Precos precos = new Precos();
		Bebidas bebidas = new Bebidas();
		Funcionario funcionario = new Funcionario();
		boolean continueLoop = true;

		//Primeira exercução visão do funcionario!!!
		do 
			{
				try
				{
					funcionario.Estoque();
					continueLoop = false;
				}
				catch(InputMismatchException InputMismatchException)
				{
					System.err.printf("\nException: %s\n",InputMismatchException);
					System.out.println("\nVocê deve entrar com um valor do tipo inteiro!\nPor favor, tente novamente.");
				}
			}
			while(continueLoop);
		
		for(int i=0; i<15; i++) {
			System.out.println("\n");
		}
				//Segunda exercução visão do cliente!!!
		do 
			{
				try
				{
					precos.bebidasPreco();
					continueLoop = false;
				}
				catch(InputMismatchException InputMismatchException)
				{
					System.err.printf("\nException: %s\n",InputMismatchException);
					System.out.println("\nVocê deve entrar com um valor do tipo inteiro!\nPor favor, tente novamente.");
					precos.bebidasPreco();
				}
			}
			while(continueLoop);

	}

}
