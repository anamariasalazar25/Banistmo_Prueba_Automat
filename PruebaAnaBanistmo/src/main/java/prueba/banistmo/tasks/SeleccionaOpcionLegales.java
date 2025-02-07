package prueba.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Visibility;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static prueba.banistmo.userinterfaces.HomePage.*;

public class SeleccionaAcercaNosotrosHome implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		if (Visibility.of(BOTON_CERRAR_VENTANA).viewedBy(actor).asBoolean())
			actor.attemptsTo(Click.on(BOTON_CERRAR_VENTANA));
		actor.attemptsTo(Click.on(BOTON_ACERCA_NOSOTROS));		 
	}

	public static SeleccionaAcercaNosotrosHome seleccionar() {
		return instrumented(SeleccionaAcercaNosotrosHome.class);
	}

}
