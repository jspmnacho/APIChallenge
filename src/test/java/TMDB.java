import org.junit.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class TMDB {

    @Test
    public void getRequestToken(){
        RequestToken requestToken = new RequestToken();
        System.out.println(requestToken.getToken());
    }

    @Test
    public void postValidateToken(){
        Validate validateToken = new Validate();
        validateToken.ValidateToken();
    }

    @Test
    public void postCreateSession(){
        Validate validateToken = new Validate();
        validateToken.CreateSession();
    }
/*
    @Test
    public void postCreateList(){
        Validate validateToken = new Validate();
        validateToken.CreateList();
    }
*/
}
