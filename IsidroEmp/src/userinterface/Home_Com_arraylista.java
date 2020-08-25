package userinterface;


import java.util.ArrayList;

import model.Chefe;
import model.Comissionado;
import model.Empreiteiro;
import model.Funcionario;
import model.Horista;

public class Home_Com_arraylista {
	public static void main(String args[]) {
		
		ArrayList<Funcionario> lista;
		lista = new ArrayList<Funcionario>();
		
		lista.add(new Chefe("Caio",1,1000,10,850));
		lista.add(new Comissionado("Fernando", 2, 750, 500));
		lista.add(new Horista("Rossi", 3, 30, 200));
		lista.add(new Empreiteiro("joão", 4, 25000));
		
		
		for (Funcionario f : lista) {
			System.out.println("Funcionario = "+ f.getNome() + "Salario = "+ f.calcularSalario());
		}
		
			
		}
		
		
	}

