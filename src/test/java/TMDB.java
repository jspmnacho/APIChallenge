import org.junit.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class TMDB {

    @Test
    public void getRequestToken(){
        RequestToken requestToken = new RequestToken();
        requestToken.generarToken();
        System.out.println(requestToken.getToken());
    }

    @Test
    public void postValidateToken(){
        Validate validateToken = new Validate();
        validateToken.ValidateToken();
    }

    @Test
    public void postCreateSession(){
        Validate createSession = new Validate();
        createSession.CreateSession();
        System.out.println(createSession.getSession_id());
    }

    @Test
    public void postCreateList(){
        Validate validateToken = new Validate();
        validateToken.CreateList();
        //Datos Nulos ??
    }

    @Test
    public void getDetailsList(){
        Validate validateToken = new Validate();
        validateToken.CreateList();
    }

}
