package prueba.banistmo.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AutocertificacionPage extends PageObject {
    public static final Target BOTON_PDF_AUTOCERTIFICACION = Target.the("Botón PDF de 'PJ-Autocertificación unificado- Fatca y CRS.pdf'")
            .locatedBy("//a[@href='/path/to/document/PJ-Autocertificacion.pdf']");
}