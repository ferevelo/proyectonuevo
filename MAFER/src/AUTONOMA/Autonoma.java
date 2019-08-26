package AUTONOMA;

import java.util.Scanner;

public class Autonoma {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String operacion1, operacion2, pa, pb;
		/*
		 * Para utilizar, primero ingrese la primera palabra pulse enter, 
		 * NOTA: en la operacion en esta para poner 2n => 2*n,
		 * y en operacion1 solo van incognitas de n,
		 * y en operacion2 incognitas de m
		 * Cada paso de enter, hasta que aparesca el resultado
		 */
		

		System.out.println("Ingrese la primera palabra");
		pa=entrada.nextLine();
		
		System.out.println("Ingrese operacion");
		operacion1=entrada.nextLine();
		
		System.out.println("Ingrese la segunda palabra");
		pb=entrada.nextLine();
		
		System.out.println("Ingrese operacion");
		operacion2=entrada.nextLine();
	
		String a, b;
		a=b="";
		System.out.println("L = { "+pa+"^("+operacion1+") "
				+pb+"^("+operacion2+") ; n>=0 ^ m>=0 }");
		
		for(int i=0; i<=10; i++)
		{
			a=operar(operacion1, i, pa);
			b=operar(operacion2, i, pb);
			//presentar valores remplazando el valor por la igconita
			/*System.out.println(pa+"^("+reemplazar(operacion1, "n", i)+") "
			+pb+"^("+reemplazar(operacion2, "m", i)+") = "+(a+b));*/
			//presentar valores mostrando el valor de la operacion dentro del ()
			System.out.println(pa+"^("+resultado_operacion(operacion1, i)+") "
					+pb+"^("+resultado_operacion(operacion2, i)+") = "+(a+b));
		}
		
		entrada.close();
	}
	
	public static String reemplazar(String frase, String palabra, int numero)
	{
		String completo=frase.replace(palabra, Integer.toString(numero));
		return completo;
	}
	
	public static String operar(String operacion, int j, String palabra) {
		int resultado = resultado_operacion(operacion, j);
		String reproducir;
		reproducir = reproducir(palabra, resultado);
		return reproducir;
	}
	
	public static String reproducir(String palabra, int maximo)
	{
		String variable="";
		for(int i=1; i<=maximo; i++)
		{
			variable+=palabra;
		}
		return variable;
	}
		
	public static int resultado_operacion(String operacion, int n)
	{
		int tam = operacion.length();
	    String A[] = new String[100];
	    //Array para almacenar operadores.
	    String operaciones[] = new String[100];
	    int pos = 0;
	    int sum = 0;
	    String aux = "";

	    //inicializa primer operador.
	    operaciones[0] = "+";
	    int index_operacion = 1;
	    for(int i = 0; i<tam ; i++)
	    {
	        if(operacion.charAt(i) == '+' 
	        		|| operacion.charAt(i) == '-'
	        		|| operacion.charAt(i) == '*'
	        		|| operacion.charAt(i) == '/')
	        {
	            A[pos] = aux;
	            operaciones[index_operacion] = String.valueOf(operacion.charAt(i));
	            pos++;   
	            index_operacion++;
	            aux = "";            
	        }
	        else
	        {
	            aux = aux + operacion.charAt(i);
	        }
	        //System.out.println(i+" posicion "+aux);
	    }
	    A[pos] = aux;
	    pos++;

	    for(int i = 0; i<pos ; i++)
	    {
	    	//Reemplazar con el valor
	    	if(A[i].equals("n") || A[i].equals("m"))
	    	{
	    		A[i]=String.valueOf(n);
	    	}
	        //Determina la operación a realizar.         
	        if(operaciones[i].equals("+")){
	         sum=sum+Integer.parseInt(A[i]);    
	        }else if (operaciones[i].equals("-")){
	            sum=sum-Integer.parseInt(A[i]);            
	        }else if (operaciones[i].equals("*")){
	            sum=sum*Integer.parseInt(A[i]);            
	        }else if (operaciones[i].equals("/")){
	            sum=sum/Integer.parseInt(A[i]);            
	        }       
/*tipo entero
ingrese x;
x=2*3
dentro de x se almacena la operacion*/	
	    }
	    //System.out.println("=  "+sum);
	    return sum;
	}
}

