import io.restassured.response.ValidatableResponse;
import static io.restassured.RestAssured.given;

public class RequestToken extends Url{

    private String api_key;
    private String token;

    public RequestToken() {
        super();
        setApi_key(api_key);
    }

    public String getApi_key() {
        return api_key;
    }

    public void setApi_key(String api_key) {
        this.api_key = api_key;
    }

    public String getToken() {
        generarToken();
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void generarToken(){
        Url url = new Url();
        Data data = new Data();
        setApi_key(data.getApi_key());
        String value = url.getUrlToken();
        ValidatableResponse response = given().when().get(value+getApi_key()).then().log().body()
                .and().statusCode(200);
        String token = response.extract().jsonPath().getString("request_token");
        setToken(token);
   }
}
