# Prueba técnica QA – Automatización API Wompi

Este proyecto contiene la automatización de pruebas funcionales de integración vía API
para la plataforma Wompi, utilizando Java y BDD con Cucumber.

## Tecnologías
- Java (LTS)
- Maven
- Cucumber (BDD)
- Rest Assured
- JUnit

## Escenarios automatizados
- Consulta de comercio exitosa
- Consulta con llave inválida
- Consulta con llave mal formada
- Consulta sin llave
- Creación de pago PSE (validación de autorización)

## Estructura
- features/: escenarios BDD
- services/: lógica de consumo API
- stepdefinitions/: pasos Cucumber
- utils/: constantes y configuración

## Ejecución
```bash
mvn test
