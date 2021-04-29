
public class TestaEscopo {
	
	public static void main(String[] args) {

			System.out.println("testando condicionais");

			int idade = 21;
			int quantidadePessoas = 3;
			
			//boolean acompanhado = quantidadePessoas >= 2;
			
			//no Java, variáveis locais (main) e temporárais, NÃO EXISTE VALOR DEFAULT (PADRÃO);
			
			boolean acompanhado;
			
			if(quantidadePessoas >= 2) {
				 acompanhado = true; 
			} else {
				 acompanhado = false; 
			}
			
			System.out.println("Valor de acompanhado = " + acompanhado); //Porque aqui nao compila? Pois a variável ela existe somente dentro do bloco de codigo {}
			if (idade >= 18 && acompanhado) {
	
				System.out.println("Seja bem vindo!");
			}
				else {
					System.out.println("infelizmente você não pode entrar");
				}
			
			 
				
			}

		}