package calculator;

import java.util.Scanner;

public class calculadora {
	public static void main (String  [] args){
	
	Scanner ler= new Scanner (System.in);
	
	double rest = 0;
	
	System.out.println ("Digite um numero:    " );
	double a = ler.nextDouble();
	
	System.out.println ("Digete o segundo numero:    ");
	double b= ler.nextDouble();
	
	System.out.println ("Escolha a op��o:  ");
	System.out.println( "1: Soma  2:Divisao 3:Multiplica�ao  4:subtra�ao");
	int op= ler.nextInt();
	
	switch (op) 
	
	{
	
	case 1: rest= a+b;
	break;
	
	case 2: rest= a/b;
	break;
	
	case 3:rest= a*b;
	break;
	
	case 4: rest= a-b;
	break;
	
	}
	System.out.println (rest);
	
				}
 
}
