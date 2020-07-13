package com.prueba.certificacion.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.prueba.certificacion.userinterface.PaginaBanistmo.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarTarifario implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(TARIFARIO),
                Click.on(TARIFARIO)
        );
    }

    public static SeleccionarTarifario darClick() { return instrumented(SeleccionarTarifario.class); }
}
