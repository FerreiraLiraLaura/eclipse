
	package galToLit;
	import java.util.Scanner;
	
	public class GalToLit {
		
	public static void main(String[] args) {
	// declare as variáveis
		Scanner scanner = new Scanner(System.in);
	double gallons=10;
	double liters=3.785;
	int galoes;
	
	// adicione o cálculo aqui
	
	// exiba o resultado para o usuário
	System.out.println(gallons+" gallonsequals "+liters+" liters");
	System.out.println("Quantos galões desejas adquirir?");
	 galoes = scanner.nextInt();
	 double gallonsequals = (galoes*liters);
	
	System.out.println(+gallonsequals++);
	}
	
}