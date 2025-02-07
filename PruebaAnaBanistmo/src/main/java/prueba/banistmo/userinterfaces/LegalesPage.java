package prueba.banistmo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LegalesPage {
    public static final Target OPCION_LEGALES = Target.the("Opción Legales")
            .located(By.xpath("//a[text()='Legales']"));
}
