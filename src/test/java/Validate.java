import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class Validate extends Url{
    private String username;
    private String password;
    private String request_token;
    private String api_key;
    private String session_id;

    public Validate() {
        super();
    }

    public String Token(){
        String token = "";
        RequestToken requestToken = new RequestToken();
        requestToken.generarToken();
        return token = requestToken.getToken();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRequest_token() {
        return request_token;
    }

    public void setRequest_token(String request_token) {
        this.request_token = request_token;
    }

    public String getApi_key() {
        return api_key;
    }

    public void setApi_key(String api_key) {
        this.api_key = api_key;
    }

    public String getSession_id() {
        return session_id;
    }

    public void setSession_id(String session_id) {
        this.session_id = session_id;
    }

    public void ValidateToken(){
        Url url = new Url();
        Data data = new Data();
        setApi_key(data.getApi_key());
        setUsername(data.getUsername());
        setPassword(data.getPass());
        String value = url.getUrlValidateToken();
        setRequest_token(Token());
        String request = "{\"username\": \""+getUsername()+"\",\"password\": \""+getPassword()+"\",\"request_token\":\""+getRequest_token()+"\"}";
        given().contentType("application/json").body(request).when().post(value+getApi_key()).then().log().body().and().statusCode(200);
    }

    public String CreateSession() {
        String session = "";
        Url url = new Url();
        Data data = new Data();
        setApi_key(data.getApi_key());
        String value = url.getUrlCreateSession();
        //setRequest_token(Token());
        String body = "{\"request_token\": \"d29948e7532e54a15ee25a60d9b3f143c5b9d92c\"}";
        //given().contentType("application/json").body(body).when().post(value+getApi_key()).then().log().body().and().statusCode(200);
        Response response = (Response) given().contentType(ContentType.JSON).body(body).when()
                .post(value + getApi_key()).then().statusCode(200).extract().response();
        System.out.println(response.getBody().prettyPrint());
        return session = response.jsonPath().getString("session_id");

  }
/*
    public void CreateList() {
        Url url = new Url();
        Data data = new Data();
        setApi_key(data.getApi_key());
        String session = CreateSession();
        System.out.println(session);
        String value1 = url.getUrlCreateList1();
        String value2 = url.getUrlCreateList2();
        String body = "{\"name\": \"Test_2\",\"description2\": \"algo random\",\"language\": \"en\"}";
        //given().contentType("application/json").body(body).when().post(value1+getApi_key()+value2+getSession_id())
        //        .then().log().body().and().statusCode(200);
        given().contentType("application/json").body(body).when()
                .post("/list?api_key="+getApi_key()+"&session_id="+session).then()
                .log().body().and().statusCode(200);
    }
*/
}
