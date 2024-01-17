package dev.dj;

import io.quarkus.test.junit.QuarkusTest;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
class UserResourceTest {
    @Test
    void testHelloEndpoint() {
        given()
          .when().get("/user")
          .then()
             .statusCode(200)
             .body(matchesJsonSchemaInClasspath("schema/user-list-schema.json"));
    }

}