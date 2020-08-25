package Time;

public class Time {
	private int hora;
	private int minuto;
	private int segundo;
	
	public void setTime(int h, int m, int s) {
		this.hora = h;
		this.minuto = m;
		this.segundo = s;
	}
	
	public String exibirHoraUniversal() {
		String horaSTR
		horaSTR = formata(this.hora)+":"+formata(this.minuto)+":"+formata(this.segundo);
		return horaSTR;
	}
	
	
	

	}

