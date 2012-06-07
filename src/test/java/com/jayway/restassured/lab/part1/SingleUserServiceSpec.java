package com.jayway.restassured.lab.part1;

import org.junit.Test;

import static com.jayway.restassured.RestAssured.expect;
import static org.hamcrest.Matchers.equalTo;

public class SingleUserServiceSpec {

    @Test
    public void returns_json_document_with_firstName_equalTo_Tim() throws Exception {
        expect().
                body("firstName", equalTo("Tim")).
        when().
                get("/service/single-user").prettyPrint();
    }

    @Test
    public void returns_json_document_with_lastName_equalTo_Testerman() throws Exception {

    }

    @Test
    public void returns_json_document_with_expected_email() throws Exception {

    }

    @Test
    public void returns_the_expected_json_document() throws Exception {
        // Validate all JSON attributes at the same time

    }
}
