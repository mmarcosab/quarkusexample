package br.com.demo.controller;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class DistritoControllerTest {

    @Test
    public void test200(){
        RestAssured.given().get("distritos").then().statusCode(200);
    }

}
