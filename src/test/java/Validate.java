import Body.CreateBodyBuilder;
import Body.MainBody;
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
    Data data = new Data();

    public Validate() {
        super();
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

    @Override
    public String toString() {
        return "{" +
                "\"username\":" + username + '\'' +
                ", password='" + password + '\'' +
                ", request_token='" + request_token + '\'' +
                ", api_key='" + api_key + '\'' +
                ", session_id='" + session_id + '\'' +
                '}';
    }

    public void Token(){
        RequestToken requestToken = new RequestToken();
        requestToken.generarToken();
        setRequest_token(requestToken.getToken());
    }

    public void ValidateToken(){
        Token();
        setApi_key(data.getApi_key());
        setUsername(data.getUsername());
        setPassword(data.getPass());
        CreateBodyBuilder builder = new CreateBodyBuilder(getRequest_token());
        MainBody bodyBuilder = builder.username(data.getUsername())
                .password(data.getPass())
                .build();
        String value = getUrlValidateToken()+getApi_key();
        String body = "{\"username\": \""+bodyBuilder.getUsername()
                +"\",\"password\": \""
                +bodyBuilder.getPassword()+"\",\"request_token\":\""
                +bodyBuilder.getRequest_token()+"\"}";
        Response response = (Response) given().contentType(ContentType.JSON).body(body).when()
                .post(value).then().statusCode(200).extract().response();

    }

    public void CreateSession() {
        setApi_key(data.getApi_key());
        String value = getUrlCreateSession()+ getApi_key();
        ValidateToken();
        String body = "{\"request_token\": \""+getRequest_token()+"\"}";
        Response response = (Response) given().contentType(ContentType.JSON).body(body).when()
                .post(value).then().statusCode(200).extract().response();
        //System.out.println(response.getBody().prettyPrint());
        setSession_id(response.jsonPath().getString("session_id"));

  }

    public void CreateList() {
        setApi_key(data.getApi_key());
        CreateSession();
        String value = getUrlCreateList1()+getApi_key()+getUrlCreateList2()+getSession_id();
        String body = "{\"name\": \"Test_5\",\"description\": \"Descripcion_5\",\"language\": \"en\"}";
        Response response = (Response) given().contentType(ContentType.JSON).body(body).when()
                .post(value).then().statusCode(201).extract().response();
        //System.out.println(response.getBody().prettyPrint());

    }
}
