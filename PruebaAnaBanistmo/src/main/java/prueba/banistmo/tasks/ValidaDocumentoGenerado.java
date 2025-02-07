package prueba.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.junit.Assert;

import net.serenitybdd.screenplay.questions.Text;

public class ValidaVentanaEmergente implements Task{
	
	private Target elemento;
	private String textoEsperado;

    public ValidaVentanaEmergente(Target elemento, String textoEsperado) {
    	this.elemento = elemento;
        this.textoEsperado = textoEsperado;
    }
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		String textoH4 = Text.of(elemento).viewedBy(actor).asString();
        Assert.assertEquals("El texto capturado no coincide con el esperado", textoEsperado, textoH4);

		
	}

	public static ValidaVentanaEmergente conTexto(Target elemento, String textoEsperado) {
		return instrumented(ValidaVentanaEmergente.class, elemento, textoEsperado);
	}

}
