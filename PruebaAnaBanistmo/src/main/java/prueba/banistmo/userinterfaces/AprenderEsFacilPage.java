package prueba.banistmo.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AprenderEsFacilPage extends PageObject {
    public static final Target OPCION_APRENDER_ES_FACIL = Target.the("Opción 'aprender es fácil' en el pie de página")
            .locatedBy("//footer//a[text()='Aprender es fácil']");
}
