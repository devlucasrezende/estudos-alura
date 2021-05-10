import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DoublePositivo {

	//Quando definir uma anota��o � boa pr�tica definir onde ela � v�lida (seria na classe, nos atributos, nos m�todos?) - Como faz isso? @Target (informando onde vai ser 
	//Utilizado
	//@Retention define se s� ser� utilizada a anota��o durante a leitura do c�digo ou ap�s (bytecode)
	
	
	
	
	
}
