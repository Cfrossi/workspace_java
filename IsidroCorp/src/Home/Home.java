package Home;
import java.util.Scanner;

import core.Funcionario;

public class Home {
	public static void main(String args[]) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int opcao,contador;
		contador = 1;
		
		
		Funcionario func;
		
		func =  new Funcionario(1, "Caio Rossi", "Desenvolvedor java", 100.0 , 200);

		
		
			while(contador != 0) {
			System.out.println("Entre com a op��o desejada: ");
			System.out.println("1 - Exibir informa��es do Funcion�rio: ");
			System.out.println("2 - Sal�rio bruto");
			System.out.println("3 - Sal�rio liquido");
			System.out.println("4 - Exibir imposto de renda: ");
			System.out.println("5 - Valor hora: ");
			System.out.println("6 - Horas trabalhadas / m�s: ");
			System.out.println("0 - Para Sair");
			opcao = teclado.nextInt();
		
		switch(opcao){
			case 0:
				contador = 0;
				break;
			
			case 1:
				func.exibirInfo();
				contador = 1;
				break;
			case 2:
				System.out.println(func.CalcularSalarioBruto());
				contador = 1;
				break;
			case 3:
				func.SalarioLiquido();
				contador = 1;
				break;
			case 4:
				func.CalcularImposto();
				contador = 1;
				break;
			case 5:
				System.out.println(func.getValorHora());
				contador = 1;
				break;
			case 6:
				System.out.println(func.getNumhoras());
				contador = 1;
				break;
								
		}
		
		
		
	}
			teclado.close();
	}

}
