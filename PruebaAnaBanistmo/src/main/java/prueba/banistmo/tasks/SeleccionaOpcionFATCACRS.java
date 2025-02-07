package prueba.banistmo.tasks;

import static prueba.banistmo.userinterfaces.ProveedoresPage.*;

import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionaBotonConoceMas implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			Thread.sleep(TimeUnit.SECONDS.toMillis(2));
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		actor.attemptsTo(
	            Click.on(BOTON_CONOCE_MAS)	            
	        );
		
	}

	public static SeleccionaBotonConoceMas seleccionarBotonConoceMas() {
		return instrumented(SeleccionaBotonConoceMas.class);
	}

}
