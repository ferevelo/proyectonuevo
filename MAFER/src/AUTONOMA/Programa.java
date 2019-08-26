package AUTONOMA;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		// Declaracion de las Variables a y b tipo String
		String letra1 = "";
		String letra2 = "";
		
		String acu1="";
		String acu2="";
		
		// Declaracion de las variables n y m tipo int
		int n=0;
		int m=0;
		
		int ac=0;
		
		// Ingreso de las variables tipo String por teclado 
		System.out.println("********************************");
		System.out.println("LENGUAJE FORMAL Y POR COPRENSION");
		System.out.println("********************************");
		System.out.print("Ingrese la Primera Letra: ");
		letra1 = entrada.nextLine();
		System.out.print("Ingrese la Segunda Letra: ");
		letra2 = entrada.nextLine();
		
		// Ingreso de las variables tipo int por teclado 
		System.out.print("Ingrese el Valor de n: ");
		n = entrada.nextInt();
		System.out.print("Ingrese el Valor de m: ");
		m = entrada.nextInt();
		
		System.out.println("El lenguaje por COMPRENSION queda de la siguiente manera:");
		
		System.out.println("********************************");
		System.out.println("Por COMPRENSION");
		System.out.println("L={"+letra1+"^"+n+" "+letra2+"^"+m+" "+";"+" "+"n>=1"+" "+"^"+" "+"m>=1"+"}");
		System.out.println("********************************");
		
		System.out.println("FORMALMENTE");
		
		for (int z=1; z<=10; z++)
		{
			
		// Procesos de las variables
		for (int x=1; x<=n; x++)
		{
			//letra1=letra1+"a";
			System.out.print(letra1);
		}
		
		for (int y=1; y<=m; y++)
		{
			
			System.out.print(letra2);
		}
		
		System.out.println();
		
		}
		
		entrada.close();
	}

}

