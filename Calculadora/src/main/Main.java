package main;
import java.util.Scanner;
import javax.swing.*;

public class Main {

	

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Calculadora con eclipse!!! enfasis II
		// yesica, johan, alejandro
		
	

    	Scanner teclado=new Scanner(System.in);
    	int  suma,resta,division,multiplicacion;
    	String num1=JOptionPane.showInputDialog(null,"Ingrese el primer numero: ");
		int n1= new Integer(num1);
    	String num2=JOptionPane.showInputDialog(null,"Ingrese el segundo numero: ");
		int n2= new Integer(num2);
    	
    	suma=n1+n2;
    	resta=n1-n2;
    	multiplicacion=n1*n2;
    	
    	JOptionPane.showMessageDialog(null,"el resultado es ");
    	JOptionPane.showMessageDialog(null,"suma es "+suma);
    	JOptionPane.showMessageDialog(null,"resta es "+resta);
    	JOptionPane.showMessageDialog(null,"resta es "+multiplicacion);

}}
