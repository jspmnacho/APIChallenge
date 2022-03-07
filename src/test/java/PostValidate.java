import Body.CreateBodyBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;


import static io.restassured.RestAssured.given;

public class PostValidate extends Url{
    private String username;
    private String password;
    private String request_token;
    private String api_key;
    private String session_id;
    private String id_list;
    Data data = new Data();
    CreateBodyBuilder builder = new CreateBodyBuilder(getRequest_token());

    public PostValidate() {
        super();
        setApi_key(data.getApi_key());
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

    public String getId_list() {
        return id_list;
    }

    public void setId_list(String id_list) {
        this.id_list = id_list;
    }

    public void Token(){
        GetRequest getRequest = new GetRequest();
        getRequest.generarToken();
        setRequest_token(getRequest.getToken());
    }

    public void ValidateToken(){
        Token();
        setApi_key(data.getApi_key());
        setUsername(data.getUsername());
        setPassword(data.getPass());
        CreateBodyBuilder builder = new CreateBodyBuilder(getRequest_token());
        builder.username(data.getUsername())
                .password(data.getPass())
                .build();
        builder.prametersBody("ValidateToken");
        String body = builder.getSolicitudBody();
        String value = getUrlValidateToken()+getApi_key();
        Response response = (Response) given().contentType(ContentType.JSON).body(body).when()
                .post(value).then().statusCode(200).extract().response();
        Assert.assertEquals("true", response.jsonPath().getString("success"));
        Assert.assertEquals(getRequest_token(), response.jsonPath().getString("request_token"));


    }

    public void CreateSession() {
        setApi_key(data.getApi_key());
        String value = getUrlCreateSession()+ getApi_key();
        ValidateToken();
        CreateBodyBuilder builder = new CreateBodyBuilder(getRequest_token());
        builder.build();
        builder.prametersBody("CreateSession");
        String body = builder.getSolicitudBody();
        Response response = (Response) given().contentType(ContentType.JSON).body(body).when()
                .post(value).then().statusCode(200).extract().response();
        //System.out.println(response.getBody().prettyPrint());
        setSession_id(response.jsonPath().getString("session_id"));
        Assert.assertEquals("true", response.jsonPath().getString("success"));
        Assert.assertEquals(getSession_id(), response.jsonPath().getString("session_id"));

    }

    public void CreateList() {
        setApi_key(data.getApi_key());
        CreateSession();
        String value = getUrlCreateList1()+getApi_key()+getUrlCreateList2()+getSession_id();
        CreateBodyBuilder builder = new CreateBodyBuilder(getRequest_token());
        builder.nameList(data.getNameList())
                .descriptionList(data.getDescription())
                .lenguajeList(data.getLanguage())
                .build();
        builder.prametersBody("CreateList");
        String body = builder.getSolicitudBody();
        Response response = (Response) given().contentType(ContentType.JSON).body(body).when()
                .post(value).then().statusCode(201).extract().response();
        setId_list(response.jsonPath().getString("list_id"));
        Assert.assertEquals("true", response.jsonPath().getString("success"));
        Assert.assertEquals("The item/record was created successfully.", response.jsonPath()
                .getString("status_message"));
    }

    public void AddMovies(){
        CreateSession();
        String value = getUrlDeleteList()+data.getIdList()+getUrlAddMovie()
                +getUrlApi_key()+getApi_key()+getUrlCreateList2()+getSession_id();
        CreateBodyBuilder builder = new CreateBodyBuilder(getRequest_token());
        builder.idMovie(data.getIdMovie())
                .build();
        builder.prametersBody("AddMovies");
        String body = builder.getSolicitudBody();
        Response response = (Response) given().contentType(ContentType.JSON).body(body).when()
                .post(value).then().statusCode(201).extract().response();
        Assert.assertEquals(201, response.getStatusCode());
        Assert.assertEquals("true", response.jsonPath().getString("success"));
        Assert.assertEquals("12", response.jsonPath().getString("status_code"));
        Assert.assertEquals("The item/record was updated successfully.", response.jsonPath()
                .getString("status_message"));

    }

    public void ClearList(){
        CreateSession();
        String value = getUrlDeleteList()+data.getIdList()+getUrlClearLIst()
                +getUrlApi_key()+getApi_key()+getUrlCreateList2()+getSession_id()+getUrlConfirm();
        Response response = (Response) given().contentType(ContentType.JSON).body("").when()
                .post(value).then().statusCode(201).extract().response();
        Assert.assertEquals("true", response.jsonPath().getString("success"));
        Assert.assertEquals("12", response.jsonPath().getString("status_code"));
        Assert.assertEquals("The item/record was updated successfully.", response.jsonPath()
                .getString("status_message"));
    }

    public void RateMovie(){
        CreateSession();
        String value = getUrlMovieDetails()+data.getIdMovie()+getUrlRating()+getUrlApi_key()
                +getApi_key()+getUrlCreateList2()+getSession_id();
        CreateBodyBuilder builder = new CreateBodyBuilder(getRequest_token());
        builder.rateMovie(data.getRateMovie())
                .build();
        builder.prametersBody("RateMovie");
        String body = builder.getSolicitudBody();
        Response response = (Response) given().contentType(ContentType.JSON).body(body).when()
                .post(value).then().statusCode(201).extract().response();
        Assert.assertEquals("true", response.jsonPath().getString("success"));
        Assert.assertEquals("12", response.jsonPath().getString("status_code"));
        Assert.assertEquals("The item/record was updated successfully.", response.jsonPath()
                .getString("status_message"));
    }
}
