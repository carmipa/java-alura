package calculaSalaRetangular;

public class CalcularSalaRetangular implements ICalculoGeometrico{
		
	public double base;
	public double altura;
	public double area;
	public double perimetro;
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	// Area = base * altura

	@Override
	public void calculaArea() {
			
		area = base * altura;
		System.out.println("A área do retângulo é de: cm " + area);
			
	}
	
	//Perimetro = 2 * (base + altura)

	@Override
	public void calculaPerimetro() {
		
		perimetro = (base + altura) *2;
		System.out.println("O perímetro do retângulo é de: cm " + perimetro);
		
	}

}
