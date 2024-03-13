package temperatura;

public class ConversorTemperaturaPadrao implements IConversorTemperatura{
	
	public double celsius;
	public double fahrenheit;
		
	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}

	public double getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}


	@Override
	public void celsiuParaFahrenheit() {
		
		System.out.println("\n..........................................\n");
		System.out.println("Conversor de Celsius Para Fahrenheit");
		
		fahrenheit = (celsius * 1.8) +32;
		
		System.out.println("A temperatura em Fahrenheit é de: " + fahrenheit + "°F");
		System.out.println("\n..........................................\n");
		
	}

	@Override
	public void FahrenheitParaCelsius() {
		
		System.out.println("Conversor de Fahrenheit Para Celsius");
		
		celsius = (fahrenheit -32) / 1.8; 
		
		System.out.println("A temperatura em Celsius é de: " + celsius + "°F");
		System.out.println("\n..........................................\n");
		
	}

}
