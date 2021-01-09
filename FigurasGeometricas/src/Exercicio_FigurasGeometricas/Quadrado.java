package Exercicio_FigurasGeometricas;

public class Quadrado extends Figura2D {
	
	private double lado ;
	
	

	public double getLado() {
		return lado;
	}



	public void setLado(double lado) {
		this.lado = lado;
	}



	@Override
	public double calcularArea() {
		
	
		return Math.pow(lado, 2);
	}



	@Override
	public String toString() {
		
		String s;
		System.out.println("Figura geomética quadrado:"+"\n");
		s ="Nome: "+ getNome()+"\n";
		s+= "Cor: "+getCor()+"\n";
		s+= "Cálculo da área: "+calcularArea()+" cm"+"\n";
		
		
		return s;
	}
	
	

	

}
