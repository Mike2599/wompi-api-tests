package com.michael.wompi.services;

import com.michael.wompi.utils.Constantes;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PagosService {

    private Response response;

    public PagosService() {
        RestAssured.baseURI = Constantes.BASE_URL;
    }

    // =============================
    // CONSULTAR COMERCIO
    // =============================
    public void consultarComercio(String publicKey) {
        response =
                given()
                        .when()
                        .get("/merchants/" + publicKey);
    }

    // =============================
    // CREAR PAGO PSE
    // =============================
    public void crearPagoPSE() {

        String body = """
                {
                  "amount_in_cents": 150000,
                  "currency": "COP",
                  "reference": "PSE-%s",
                  "customer_email": "qa@test.com",
                  "acceptance_token": "%s",
                  "accept_personal_auth": "%s",
                  "redirect_url": "https://www.google.com",
                  "payment_method": {
                    "type": "PSE",
                    "user_type": 0,
                    "user_legal_id_type": "CC",
                    "user_legal_id": "1069879849",
                    "financial_institution_code": "1007"
                  }
                }
                """.formatted(
                System.currentTimeMillis(),
                Constantes.ACCEPTANCE_TOKEN,
                Constantes.PERSONAL_DATA_TOKEN
        );

        response =
                given()
                        .contentType("application/json")
                        .body(body)
                        .when()
                        .post("/transactions");
    }

    public Response getResponse() {
        return response;
    }
}
