package dam1920.proyectoMavenRubenLopez;

public class CalculosMatematicos {
	
	public static int factorial (int n) {
		
		int factorial = 1;
		
		for (int i=1;i<=n;i++)
		{
			factorial *= i;
		}
		
		return factorial ;
	}
	
	public static ArrayList<Integer> listaDePrimosHasta(int numero){
		
		ArrayList<Integer> listaDePrimos = new ArrayList<Integer>();
		
		listaDePrimos.add(1);
		listaDePrimos.add(2);
		listaDePrimos.add(3);
		
		for(int i=5; i<=numero; i+=2) {
			
			if(esPrimo(i)) listaDePrimos.add(i);
		}
		
		return listaDePrimos;
		
	}

}
