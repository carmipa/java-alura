package calculaSalaRetangular;

public class TesteAreaPerimetro {
	
	public static void main(String[] args) {
		
		CalcularSalaRetangular calcula = new CalcularSalaRetangular();
		
		System.out.println("\n..........................................\n");
		calcula.setAltura(100);
		calcula.setBase(40);
		calcula.calculaArea();
		System.out.println("\n..........................................\n");
		calcula.calculaPerimetro();
		System.out.println("\n..........................................\n");
			
	}
}
