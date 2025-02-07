package prueba.banistmo.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static prueba.banistmo.userinterfaces.AcercaNosotrosPage.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionaOpcionProveedores implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
	            Click.on(OPCION_PROVEEDORES_DESPLEGABLE)	            
	        );
		
	}

	public static SeleccionaOpcionProveedores seleccionarOpcion() {
		return instrumented(SeleccionaOpcionProveedores.class);
	}

}
