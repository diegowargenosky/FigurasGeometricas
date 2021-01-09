package Exercicio_FigurasGeometricas;

public class Cubo extends Figura3D  

{
	
	private double aresta;

	@Override
	public double calcularVolume() {
		
		return Math.pow(aresta, 3);
	}

	@Override
	public double calcularArea() {
		
		return Math.pow(aresta, 2) * 6;
	}

	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}

	@Override
	public String toString() {
		
		String cb;
		System.out.println("Figura geométrica cubo: "+"\n");
		cb = "Nome: "+getNome()+"\n";
		cb += "Cor: "+getCor()+"\n";
		cb += "Cálculo do volume: "+calcularVolume()+"\n";
		cb += "Área total: "+calcularArea()+" PI cm²"+"\n";
		
		return cb;
	}
	
	
	
	

	

}
