/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jayway.restassured.lab.part2;

import com.jayway.restassured.RestAssured;
import org.junit.Test;

public class CustomAuthDemoTest {

    // /custom-auth/secretMessage
    @Test
    public void customAuthDemo() {
        // Before you can access the secretMessage you must login with a post to /custom-auth/login
        // It expects you to add operandA and operandB and send it back as a query param "sum".
        // You must also supply the id as a query param. If everything is correct you should be able to
        // access the secret message at /custom-auth/secretMessage.
    }

    // /custom-auth/secretMessage2
    @Test
    public void customAuthDemo2() {
        // The same kind of authentication procedure is required for "secretMessage2". But we don't want to duplicate
        // the code for the login procedure! What we want to do instead is to create a reusable authentication filter and
        // use this filter in both the previous and this test.
    }
}
