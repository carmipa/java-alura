package temperatura;

public class TesteConversorDeTemperatura {

	public static void main(String[] args) {
		
		ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();
		
		conversor.setCelsius(20);
		conversor.celsiuParaFahrenheit();
		conversor.setFahrenheit(68);
		conversor.FahrenheitParaCelsius();

	}

}
