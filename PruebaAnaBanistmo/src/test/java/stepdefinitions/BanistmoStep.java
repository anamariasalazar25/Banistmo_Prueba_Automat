package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import prueba.banistmo.tasks.SeleccionaBotonConoceMas;
import prueba.banistmo.tasks.SeleccionaOpcionLegales;
import prueba.banistmo.tasks.SeleccionaOpcionAprenderEsFacil;
import prueba.banistmo.tasks.SeleccionaOpcionFATCACRS;
import prueba.banistmo.tasks.ValidaDocumentoGenerado;
import prueba.banistmo.userinterfaces.AprenderEsFacilPage;
import prueba.banistmo.userinterfaces.LegalesPage;
import prueba.banistmo.userinterfaces.FatcaCrsPage;
import prueba.banistmo.userinterfaces.AutocertificacionPage;

public class BanistmoStep {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Banistmo");

    @Given("^que un usuario esta en la pagina de banistmo$")
    public void queUnUsuarioEstaEnLaPaginaDeBanistmo() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(new AprenderEsFacilPage()));        
    }

    @When("^selecciona la opcion aprender es facil$")
    public void seleccionaLaOpcionAprenderEsFacil() throws InterruptedException {
        Thread.sleep(TimeUnit.SECONDS.toMillis(5));
        actor.wasAbleTo(
                SeleccionaOpcionAprenderEsFacil.seleccionar()
        );
    }

    @When("^selecciona la opcion legales$")
    public void seleccionaLaOpcionLegales() throws InterruptedException {
        actor.wasAbleTo(
                SeleccionaOpcionLegales.seleccionarBoton()
        );
    }

    @When("^selecciona la opcion FATCA & CRS$")
    public void seleccionaLaOpcionFATCACRS() throws InterruptedException {
        actor.wasAbleTo(
                SeleccionaOpcionFATCACRS.seleccionarOpcion()
        );
    }

    @When("^selecciona el boton PJ-Autocertificación unificado- Fatca y CRS.pdf$")
    public void seleccionaElBotonAutocertificacion() throws InterruptedException {
        Thread.sleep(TimeUnit.SECONDS.toMillis(2));
        actor.wasAbleTo(
                SeleccionaBotonAutocertificacion.seleccionarBotonAutocertificacion()
        );
    }

     @Then("^valida que el documento generado sea el correcto$")
    public void validaQueElDocumentoGeneradoSeaElCorrecto() throws InterruptedException {
        Thread.sleep(TimeUnit.SECONDS.toMillis(5)); // Espera para que el archivo se descargue
        actor.wasAbleTo(
            ValidaDocumentoGenerado.conTexto("PJ-Autocertificación unificado- Fatca y CRS.pdf") // Aquí se pasa el nombre del archivo esperado
        );
        Thread.sleep(TimeUnit.SECONDS.toMillis(2)); // Un pequeño retraso para la estabilidad
    }
}