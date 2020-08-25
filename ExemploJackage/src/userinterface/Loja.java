package userinterface;

import core.Produto;

public class Loja {
	public static void main(String args[]) {
		Produto p;
		
		p = new Produto(1,"Mouse",100);
		
		System.out.println(p.getId() + p.getNome() + p.getPreco());
	}

}
