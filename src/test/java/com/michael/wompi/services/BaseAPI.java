package com.michael.wompi.services;

import io.restassured.RestAssured;
import com.michael.wompi.utils.Constantes;

public class BaseAPI {

    public BaseAPI() {
        RestAssured.baseURI = Constantes.BASE_URL;
    }
}
