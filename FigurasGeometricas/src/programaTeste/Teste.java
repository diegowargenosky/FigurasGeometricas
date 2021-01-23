package programaTeste;

import java.util.Scanner;

import classeMae.FiguraGeometrica;
import entidades.Cilindro;
import entidades.Circulo;
import entidades.Cubo;
import entidades.Piramide;
import entidades.Quadrado;
import entidades.Triangulo;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Quadrado quadrado = new Quadrado();

		System.out.println("Vamos calcular a área de um quadrado" + "\n");
		System.out.println("Informe a medida dos lados:");
		double ladoQ = sc.nextDouble();

		System.out.println("Nome:");
		sc.nextLine();
		String nomeQ = sc.nextLine();

		System.out.println("Cor:");
		String corQ = sc.nextLine();

		quadrado.setNome(nomeQ);
		quadrado.setCor(corQ);
		quadrado.setLado(ladoQ);

		System.out.println("Cálculo da área do quadrado: ");
		System.out.println(quadrado.calcularArea());
		System.out.println("---------------------------------------------");
///////////////////////////////////////////////////////////////////////////////////////////////////
		Triangulo triangulo = new Triangulo();

		System.out.println("Vamos calcular a área de um triângulo:" + "\n");

		System.out.println("Informe a medida da base:");
		double baseT = sc.nextDouble();

		System.out.println("Informe a medida da altura:");
		double alturaT = sc.nextDouble();

		System.out.println("Nome:");
		sc.nextLine();
		String nomeT = sc.nextLine();

		System.out.println("Cor:");
		String corT = sc.nextLine();

		triangulo.setBase(baseT);
		triangulo.setAltura(alturaT);
		triangulo.setNome(nomeT);
		triangulo.setCor(corT);

		System.out.println("Cálculo da área do triângulo:");
		System.out.println(triangulo.calcularArea());
		System.out.println("------------------------------------------");
/////////////////////////////////////////////////////////////////////////////////////////////////////		
		Circulo circulo = new Circulo();
		System.out.println("Vamos calcular a área de um círculo:" + "\n");

		System.out.println("Informe o valor do raio do círculo:");
		double raioC = sc.nextDouble();

		System.out.println("Nome:");
		sc.nextLine();
		String nomeC = sc.nextLine();

		System.out.println("Cor:");
		String corC = sc.nextLine();

		circulo.setNome(nomeC);
		circulo.setCor(corC);
		circulo.setRaio(raioC);
		System.out.println("Cálculo da área do círculo:");
		System.out.println(circulo.calcularArea());
		System.out.println("------------------------------------------------");
///////////////////////////////////////////////////////////////////////////////////////////////////////		

		Piramide piramide = new Piramide();
		System.out.println("Vamos calcular o volume e a área total de uma pirâmide:" + "\n");

		System.out.println("Informe o valor das arestas:");
		double arestasP = sc.nextDouble();

		System.out.println("Informe o valor da altura:");
		double alturaP = sc.nextDouble();

		System.out.println("Nome:");
		sc.nextLine();
		String nomeP = sc.nextLine();

		System.out.println("Cor:");
		String corP = sc.nextLine();

		piramide.setNome(nomeP);
		piramide.setCor(corP);
		piramide.setAltura(alturaP);
		piramide.setArestas(arestasP);

		System.out.println("Cálculo do volume da pirâmide:");
		System.out.println(piramide.calcularVolume() + "\n");

		System.out.println("Cálculo da área total da pirâmide:");
		System.out.println(piramide.AreaTotal());
		System.out.println("--------------------------------------------");
///////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("Vamos calcular o volume e a área de um cubo:");

		Cubo cubo = new Cubo();

		System.out.println("Nome:");
		
		String nomeCB = sc.nextLine();

		System.out.println("Cor:");
		String corCB = sc.nextLine();

		System.out.println("Informe a medida da aresta:");
		double arestaCB = sc.nextDouble();

		cubo.setNome(nomeCB);
		cubo.setCor(corCB);
		cubo.setAresta(arestaCB);

		System.out.println("Cálculo da área do cubo:");
		System.out.println(cubo.calcularArea());
		System.out.println("Cálculo do volume do cubo:");
		System.out.println(cubo.calcularVolume());
		System.out.println("--------------------------------------------------------------");
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("Vamos calcular a área e volume de um cilindro:");

		Cilindro cilindro = new Cilindro();

		System.out.println("Nome:");
		sc.nextLine();
		String nomeCL = sc.nextLine();

		System.out.println("Cor");
		String corCL = sc.nextLine();

		System.out.println("Altura:");
		double alturaCL = sc.nextDouble();

		System.out.println("Raio:");
		double raioCL = sc.nextDouble();

		cilindro.setNome(nomeCL);
		cilindro.setCor(corCL);
		cilindro.setAltura(alturaCL);
		cilindro.setRaio(raioCL);

		System.out.println("Área total do cilindro:");
		System.out.println(cilindro.calcularArea());

		System.out.println("Volume do cilindro:");
		System.out.println(cilindro.calcularVolume() + "\n");

		System.out.println("Segue abaixo a lista com todas as formas geométricas com suas medidas e cálculos:" + "\n");

		List<FiguraGeometrica> figurasGeometricas = new ArrayList<FiguraGeometrica>();

		figurasGeometricas.add(quadrado);
		figurasGeometricas.add(triangulo);
		figurasGeometricas.add(circulo);
		figurasGeometricas.add(piramide);
		figurasGeometricas.add(cubo);
		figurasGeometricas.add(cilindro);

		for (FiguraGeometrica f : figurasGeometricas) {

			System.out.println(f);

		}
		sc.close();

	}

}
