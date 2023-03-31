package api.test;

import io.restassured.*;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class loginTest {
    static String API_PATH = "https://serverest.dev/login";
}

@Test
public void TC001_nãoLogarComCamposVazios(){

    restassured.when()

    .get(API_PATH) 

    .then() 

    .assertThat() 

    .statusCode(200) 

    .body("size()", CoreMatchers.is(0)); 

}