
public class TestaEscopo {
	
	public static void main(String[] args) {

			System.out.println("testando condicionais");

			int idade = 21;
			int quantidadePessoas = 3;
			
			//boolean acompanhado = quantidadePessoas >= 2;
			
			//no Java, vari�veis locais (main) e tempor�rais, N�O EXISTE VALOR DEFAULT (PADR�O);
			
			boolean acompanhado;
			
			if(quantidadePessoas >= 2) {
				 acompanhado = true; 
			} else {
				 acompanhado = false; 
			}
			
			System.out.println("Valor de acompanhado = " + acompanhado); //Porque aqui nao compila? Pois a vari�vel ela existe somente dentro do bloco de codigo {}
			if (idade >= 18 && acompanhado) {
	
				System.out.println("Seja bem vindo!");
			}
				else {
					System.out.println("infelizmente voc� n�o pode entrar");
				}
			
			 
				
			}

		}