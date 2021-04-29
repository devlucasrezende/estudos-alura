package exercicios;

public class ExercicioImpostoDeRenda {
	
	 public static void main(String[] args) {

	        double salario = 1900.0;

	        if (salario >= 1900.00 && salario <= 2800.00) {
	        	
	        	System.out.println("O IR é 7.5%, podendo deduzir até R$142,00");
	        
	        } if (salario >= 2800.01 && salario <= 3751.00) {
	        	
	        	System.out.println("O IR é 15%, podendo deduzir até R$350,00");
	        } else if (salario >= 3751.01 && salario <= 4664.0) {
	        	
	        	System.out.println("O IR é 22,5%, podendo deduzir até R$636,00");
	        	
	        }
	        
	        
	        
	        
	        	
	        	
	    }
	}


