
	package galToLit;
	import java.util.Scanner;
	
	public class GalToLit {
		
	public static void main(String[] args) {
	// declare as variáveis
		Scanner scanner = new Scanner(System.in);
	double gallons;
	double liters=3.785;
	
	
	// adicione o cálculo aqui
	
	// exiba o resultado para o usuário
	System.out.println("Litro por galão:" +liters++);
	System.out.println("Quantos galões desejas adquirir?");
	 gallons = scanner.nextDouble();
	 double gallonsequals = (gallons*liters);
	
	System.out.println(+gallonsequals++);
	

	}
	
}