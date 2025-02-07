package prueba.banistmo.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProveedoresPage extends PageObject{
	public static final Target BOTON_CONOCE_MAS = Target.the("Boton conoce más").locatedBy("//a[@class='fancybox']/button[@class='btn btn-primary'][1]");
	public static final Target TITULO_PANTALLA_EMERGENTE = Target.the("pantalla emergente").locatedBy("//div[@id='inline1']/div/h4[contains(text(),'Aviso de Convocatoria')]");
}
