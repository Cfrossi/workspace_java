package userinterface;

import model.QuestaoMultiplaEscolha;
import model.QuestaoSimples;
import java.util.Scanner;

public class prova {
	public static void main(String args[]) {
		String aluno;
		Scanner teclado;
		teclado  = new Scanner(System.in);
				
		QuestaoSimples q1,q2;
		
		q1 = new QuestaoSimples("O Lula tem 10 dedos?: ", "nao");	
		
		System.out.println(q1.aplicarQuestao());
		aluno = teclado.nextLine();
		
		if (q1.corrigir(aluno)) {
			System.out.println("Você acertou a resposta");
		}
		else {
			System.out.println("Você errou a resposta");
		}
		
		q2 = new QuestaoMultiplaEscolha("Palmeiras tem Mundial?", "nao", "1 - Ganhou no torneio de cachaça", "2 - naooooooooooooooooooo", "3 - Só se for no torneio de bocha",
				"4 - talvez no playstation");
		
		System.out.println(q2.aplicarQuestao());
		aluno = teclado.nextLine();
		
		if (q1.corrigir(aluno)) {
			System.out.println("Você acertou a resposta");
		}
		else {
			System.out.println("Você errou a resposta");
		}
		
	}

}
