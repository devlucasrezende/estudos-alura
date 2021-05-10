import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DoublePositivo {

	//Quando definir uma anotação é boa prática definir onde ela é válida (seria na classe, nos atributos, nos métodos?) - Como faz isso? @Target (informando onde vai ser 
	//Utilizado
	//@Retention define se só será utilizada a anotação durante a leitura do código ou após (bytecode)
	
	
	
	
	
}
