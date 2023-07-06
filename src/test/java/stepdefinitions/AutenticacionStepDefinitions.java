package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import project.tasks.AbrirApp;

public class AutenticacionStepDefinitions {
    @Given("ingresa a la apk saucelabs")
    public void indraIngresaALaApkSaucelabs() {
        OnStage.theActorCalled("AMSB").wasAbleTo(AbrirApp.saucelabs());
    }

    @When("Digita las credenciales de acceso {string} y {string}")
    public void digitaLasCredencialesDeAccesoY(String user, String pass) {
        OnStage.theActorInTheSpotlight().attemptsTo();
    }
    @Then("verifica que ingreso correctamente")
    public void verificaQueIngresoCorrectamente() {
        OnStage.theActorInTheSpotlight().should(

                //GivenWhenThen.seeThat((Question<Boolean>) Matchers.equalTo(""))

        );
    }
}
