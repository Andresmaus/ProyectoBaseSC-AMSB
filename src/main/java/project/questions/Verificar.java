package project.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
public class Verificar implements Question {
    public static Verificar ingresoApp() {
        return new Verificar();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return 0;
    }
}
