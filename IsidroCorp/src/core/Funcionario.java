package core;

public class Funcionario {
	private int NumFunc;
	private String nome;
	private String cargo;
	private double ValorHora;
	private int Numhoras;
	private double SalBruto;
	private double CalcImp;
	private double Imposto;
	private double SalLiquido;
	
	

	
	
	public Funcionario(int numFunc, String nome, String cargo, double valorHora, int numhoras) {
		NumFunc = numFunc;
		this.nome = nome;
		this.cargo = cargo;
		ValorHora = valorHora;
		Numhoras = numhoras;
	
	}


	public int getNumFunc() {
		return NumFunc;
	}


	public void setNumFunc(int numFunc) {
		NumFunc = numFunc;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public double getValorHora() {
		return ValorHora;
	}


	public void setValorHora(double valorHora) {
		ValorHora = valorHora;
	}


	public int getNumhoras() {
		return Numhoras;
	}


	public void setNumhoras(int numhoras) {
		Numhoras = numhoras;
	}
	
	
	
	public double CalcularSalarioBruto() {
		SalBruto = Numhoras * ValorHora;
		//System.out.printf("O Salário Bruto é: %.2f", SalBruto);
		//System.out.println("");
		return SalBruto;
		
		
	}
	
	public void CalcularImposto() {
		if(SalBruto <= 1000) {
			System.out.println("Funcionário isente de Imposto");
			System.out.println("");
		}
		else if((SalBruto > 1000) && (SalBruto <= 2500)) {
			Imposto = SalBruto - 1000;	
			CalcImp = (Imposto * 15) /100;
			System.out.printf("O Imposto cobrado sobre %.2f será de %.2f",SalBruto,CalcImp);
			System.out.println("");
			}
		else if((SalBruto > 2500) && (SalBruto <= 5000)) {
			Imposto = SalBruto - 1000;	
			CalcImp = (Imposto * 27.5) /100;
			System.out.printf("O Imposto cobrado sobre %.2f será de %.2f",SalBruto,CalcImp);
			System.out.println("");
			
		}
		else if(SalBruto > 5000) {
			Imposto = SalBruto - 1000;	
			CalcImp = (Imposto * 27.5) /100;
			System.out.printf("O Imposto cobrado sobre %.2f será de %.2f",SalBruto,CalcImp);
			System.out.println("");
		}
		else {
			System.out.println("O Imposto cobrado é: 1650.0");
			System.out.println("");
		}
		
	}
	
	public void exibirInfo() {
		System.out.println("Funcional: "+ NumFunc);
		System.out.println("Nome: "+nome);
		System.out.println("Cargo: "+cargo);
		System.out.println("Valor Hora: "+ValorHora);
		System.out.println("Número Horas trabalhadas: "+Numhoras);
		System.out.println("Salario bruto: "+ CalcularSalarioBruto());
		System.out.println("");
		
	}
	
	public void SalarioBruto() {
		System.out.println("Valor Hora: "+ValorHora);
		System.out.println("Número Horas trabalhadas: "+Numhoras);
		System.out.println("Salario bruto: "+ SalBruto);
		System.out.println("");
	}
	
	public void SalarioLiquido() {
		CalcularImposto();
		SalBruto = Numhoras * ValorHora;
		SalLiquido = SalBruto - CalcImp;
		System.out.println("Salário Liquido: "+ SalLiquido);
		System.out.println("");
	}

}

