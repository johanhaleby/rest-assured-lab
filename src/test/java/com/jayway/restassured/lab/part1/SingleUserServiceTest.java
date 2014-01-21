package com.jayway.restassured.lab.part1;

import org.junit.Test;

import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class SingleUserServiceTest {

    @Test
    public void returns_json_document_with_firstName_equalTo_Tim() {
        when().
                get("/service/single-user").
        then().
                body("firstName", equalTo("Tim"));
    }

    @Test
    public void returns_json_document_with_lastName_equalTo_Testerman() {

    }

    @Test
    public void returns_json_document_with_expected_email() {

    }

    @Test
    public void returns_the_expected_json_document()  {
        // Validate all JSON attributes at the same time

    }
}
