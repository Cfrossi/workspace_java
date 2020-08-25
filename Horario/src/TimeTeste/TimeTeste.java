package TimeTeste;
import java.util.Scanner;

import Time.Time;

public class TimeTeste {
	public static void main(String args[]) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		Time t= new Time();
		t.setTime(3, 40, s);
		
		System.out.println("Hora universal = "+ t.exibirHoraUniversal());

		
		teclado.close();
	}

}
