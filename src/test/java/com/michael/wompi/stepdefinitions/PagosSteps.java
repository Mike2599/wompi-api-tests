package com.michael.wompi.stepdefinitions;

import com.michael.wompi.services.PagosService;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PagosSteps {

    PagosService pagosService = new PagosService();

    // =============================
    // CONSULTA COMERCIO
    // =============================
    @Cuando("consulto el comercio con la llave {string}")
    public void consulto_el_comercio(String publicKey) {
        pagosService.consultarComercio(publicKey);
    }

    // =============================
    // CREAR PAGO PSE
    // =============================
    @Cuando("creo un pago PSE exitoso")
    public void creo_un_pago_pse_exitoso() {
        pagosService.crearPagoPSE();
    }

    // =============================
    // VALIDAR STATUS CODE
    // =============================
    @Entonces("el codigo de respuesta es {int}")
    public void el_codigo_de_respuesta_es(Integer statusCode) {
        assertThat(
                pagosService.getResponse().getStatusCode(),
                is(statusCode)
        );
    }
}

