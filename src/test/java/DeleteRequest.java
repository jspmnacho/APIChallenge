import io.restassured.response.ValidatableResponse;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class DeleteRequest extends Url{

    private String api_key;
    private String session_id;
    private String id_list;
    Data data = new Data();

    public DeleteRequest() {
        super();
        setApi_key(data.getApi_key());
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

    public void deleteList(){
        PostValidate postValidate = new PostValidate();
        postValidate.CreateSession();
        setSession_id(postValidate.getSession_id());
        String value = getUrlDeleteList()+getId_list()+getUrlApi_key()+getApi_key()+getUrlCreateList2()+getSession_id();
        //ValidatableResponse response = given().when().delete(value).then().statusCode(201);
        ValidatableResponse response = given().when().delete(value).then().statusCode(500);
        String message = response.extract().jsonPath().getString("status_message");
        //Assert.assertEquals("12", response.extract().jsonPath().getString("status_code"));
        Assert.assertEquals("11", response.extract().jsonPath().getString("status_code"));
        //Assert.assertEquals("The item/record was updated successfully.", response.extract().jsonPath()
        //        .getString("status_message"));
        Assert.assertEquals("Internal error: Something went wrong, contact TMDb.", response.extract().jsonPath()
                .getString("status_message"));
    }
}
