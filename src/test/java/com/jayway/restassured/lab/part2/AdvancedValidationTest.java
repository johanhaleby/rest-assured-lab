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

import org.junit.Test;

public class AdvancedValidationTest {

    // /shopping
    @Test
    public void groceriesContainsChocolateAndCoffee() {
    }

    // /shopping
    @Test
    public void groceriesContainsChocolateAndCoffeeUsingDoubleStarNotation() {
    }

    // /jsonStore
    @Test
    public void advancedJsonValidation() {
        // Verify status code 200 <= x < 300
        // Find book titles with price < 10
        // Find the price of cheapest book
        // Find the price of most expensive book
        // Find the title of the cheapest book
        // Sum of the length of all author names
    }
}
