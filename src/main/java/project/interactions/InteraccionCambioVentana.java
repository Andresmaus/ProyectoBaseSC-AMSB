package project.interactions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.Set;

public class InteraccionCambioVentana implements Interaction {
    private int numTab;

    public InteraccionCambioVentana(int numTab) {
        this.numTab = numTab;
    }

    public static InteraccionCambioVentana getIN(int numTab){
        return new InteraccionCambioVentana(numTab);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Set<String> allWindows = Serenity.getWebdriverManager().getCurrentDriver().getWindowHandles();
        int i = 0;
        for(String curWindow : allWindows){
            i++;
            if (i == numTab) {
                Serenity.getWebdriverManager().getCurrentDriver().switchTo().window(curWindow);
                break;
            }
        }
    }
}
