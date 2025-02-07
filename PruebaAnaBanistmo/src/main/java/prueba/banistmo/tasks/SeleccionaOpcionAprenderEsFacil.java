package prueba.banistmo.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
public class ScrollToElement implements Task {

	 private Target target;

	    public ScrollToElement(Target target) {
	        this.target = target;
	    }

	    public static ScrollToElement scrollTo(Target target) {
	        return new ScrollToElement(target);
	    }

	    public <T extends Actor> void performAs(T actor) {
	        WebElement element = target.resolveFor(actor);
	        int yOffset = calculateVerticalOffset(element, actor);
	        ((JavascriptExecutor) actor.abilityTo(BrowseTheWeb.class).getDriver()).executeScript("window.scrollTo(0, arguments[0]);", yOffset);
	    }


	    private int calculateVerticalOffset(WebElement element, Actor actor) {
	        JavascriptExecutor jsExecutor = (JavascriptExecutor) actor.abilityTo(BrowseTheWeb.class).getDriver();
	        long windowHeight = (Long) jsExecutor.executeScript("return window.innerHeight");
	        long elementY = element.getLocation().getY();
	        return (int) (elementY - (windowHeight / 2));
	    }
}
