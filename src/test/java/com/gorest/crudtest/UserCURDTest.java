package com.gorest.crudtest;

import com.gorest.model.UserPojo;
import com.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class UserCURDTest extends TestBase {

    //1.	verifyUserCreatedSuccessfully()
    @Test
    public void verifyUserCreatedSuccessfully() {
        UserPojo userPojo = new UserPojo();
        userPojo.setUserName("prime");
        userPojo.setEmail("prime345@gmail.com");
        userPojo.setGender("male");
        userPojo.setStatus("active");

        Response response = (Response) given().log().all()
                .header("Content-Type", "application/json")
                .when()
                .body(userPojo)
                .post();
        response.prettyPrint();
        response.then().log().all().statusCode(201);
    }

    @Test
    public void UserUpdateSuccessfully() {

    }

    @Test
    public void verifyUserUpdateSuccessfully() {
        UserPojo userPojo = new UserPojo();
        userPojo.setUserName("prime");
        userPojo.setEmail("prime345@gmail.com");
        userPojo.setGender("male");
        userPojo.setStatus("active");

        Response response = (Response) given().log().all()
                .header("Content-Type", "application/json")
                .when()
                .body(userPojo)
                .post();
        response.prettyPrint();
        response.then().log().all().statusCode(201);
    }
}
