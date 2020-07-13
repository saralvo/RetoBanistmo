package com.prueba.certificacion.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/personas/")
public class PaginaBanistmo extends PageObject {

    public static final Target TARIFARIO = Target.the("seleccionar tarifario").locatedBy("//a[contains(text(),'Tarifario')]");
    public static final Target ABRIR_DDA = Target.the("seleccionar archivo").locatedBy("//tr[2]//td[2]//span[1]//a[1]//img[1]");
}
