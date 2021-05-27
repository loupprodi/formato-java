import java.util.Scanner;

public class Teste {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		double r, l, b, h;
		double rr, ll, a; 

		System.out.println("Digite o valor para o raio do circulo: ");
		r=entrada.nextInt();
		Forma bc = new Circulo ("Bidimensional", "Circulo", r);
		System.out.println(bc.toString());
		
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println();
		
		System.out.println("Digite o valor para o lado do quadrado: ");
		l=entrada.nextInt();
		Forma bq = new Quadrado ("Bidimensional", "Quadrado", l);
		System.out.println(bq.toString());
		
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println();
		
		System.out.println("Digite o valor para a base do triângulo: ");
		b=entrada.nextInt();
		System.out.println("Digite o valor para a altura do triângulo: ");
		h=entrada.nextInt();
		Forma bt = new Triangulo ("Bidimensional", "Triângulo", b, h);
		System.out.println(bt.toString());
		
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println();
		
		
		System.out.println("Digite o valor para o raio da esfera: ");
		rr=entrada.nextInt();
		Forma te = new Esfera ("Tridimensional", "Esfera", rr);
		System.out.println(te.toString());
		
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println();
		
		System.out.println("Digite o valor para o lado do cubo: ");
		ll=entrada.nextInt();
		Forma tc = new Cubo ("Tridimensional", "Cubo", ll);
		System.out.println(tc.toString());
		
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println();
		
		System.out.println("Digite o valor para a aresta do tetraedro: ");
		a=entrada.nextInt();
		Forma tt = new Tetraedo ("Tridimensional", "Tetraedro", a);
		System.out.println(tt.toString());
		
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println();
		
		
	}

}
