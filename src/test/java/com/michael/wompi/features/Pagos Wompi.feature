Feature: Pagos Wompi API

  Scenario: 01 - Consultar comercio exitoso
    When consulto el comercio con la llave "pub_stagtest_g2u0HQd3ZMh05hsSgTS2lUV8t3s4mOt7"
    Then el codigo de respuesta es 200

  Scenario: 02 - Consultar comercio con llave invalida
    When consulto el comercio con la llave "pub_invalida"
    Then el codigo de respuesta es 422

  Scenario: 03 - Consultar comercio con llave mal formada
    When consulto el comercio con la llave "pub_stagtest_no_existe"
    Then el codigo de respuesta es 422

  Scenario: 04 - Consultar comercio sin llave
    When consulto el comercio con la llave ""
    Then el codigo de respuesta es 401

  Scenario: 05 - Crear pago PSE (validación de autorización)
    When creo un pago PSE exitoso
    Then el codigo de respuesta es 401

