import io.restassured.response.ValidatableResponse;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class GetRequest extends Url{

    private String api_key;
    private String token;
    Data data = new Data();

    public GetRequest() {
        super();
        setApi_key(data.getApi_key());
    }

    public String getApi_key() {
        return api_key;
    }

    public void setApi_key(String api_key) {
        this.api_key = api_key;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void generarToken(){
        String value = getUrlToken()+getApi_key();
        ValidatableResponse response = given().when().get(value).then().log().body()
                .and().statusCode(200);
        setToken(response.extract().jsonPath().getString("request_token"));
        //System.out.println(response.extract().jsonPath().getString("success"));
        Assert.assertEquals("true", response.extract().jsonPath().getString("success"));
   }

   public void MoviesDetails(){
       String value = getUrlMovieDetails()+data.getIdMovie()+getUrlApi_key()+getApi_key();
       ValidatableResponse response = given().when().get(value).then().log().body()
               .and().statusCode(200);
       String token = response.extract().jsonPath().getString("original_title");
       Assert.assertEquals("The Fifth Element", response.extract().jsonPath().getString("title"));
   }
}
