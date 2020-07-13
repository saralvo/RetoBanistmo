package com.prueba.certificacion.stepdefinitions;

import com.prueba.certificacion.task.SeleccionarArchivo;
import com.prueba.certificacion.task.SeleccionarTarifario;
import com.prueba.certificacion.userinterface.PaginaBanistmo;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ValidarPDFStepDefinitions {

    private PaginaBanistmo pagina;

    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^realizo el ingreso a Banistmo$")
    public void realizoElIngresoABanistmo() {
        theActorCalled("actor").attemptsTo(
                Open.browserOn(pagina)
        );
    }

    @Cuando("^selecciono la opcion de Tarifario$")
    public void seleccionoLaOpcionDeTarifario() {
        theActorInTheSpotlight().attemptsTo(
            SeleccionarTarifario.darClick(),
                SeleccionarArchivo.darClick()
        );
    }

    @Entonces("^debo poder visualizar el pdf seleccionado$")
    public void deboPoderVisualizarElPdfSeleccionado() {
        theActorInTheSpotlight().attemptsTo(
                Switch.toWindow("s56_ActualizarTarifarioDepositos_Dic2019")
        );
    }

}
