import io.restassured.RestAssured;

public class Url {

    private String urlToken;
    private String urlValidateToken;
    private String urlCreateSession;
    private String urlCreateList1;
    private String urlCreateList2;


    public Url() {
        RestAssured.baseURI = "https://api.themoviedb.org/3";
        urlToken = "/authentication/token/new?api_key=";
        urlValidateToken = "/authentication/token/validate_with_login?api_key=";
        urlCreateSession = "/authentication/session/new?api_key=";
        urlCreateList1 = "/list?api_key=";
        urlCreateList2 ="&session_id=";
    }

    public String getUrlToken() {
        return urlToken;
    }

    public void setUrlToken() {
        this.urlToken = urlToken;
    }

    public String getUrlValidateToken() {
        return urlValidateToken;
    }

    public void setUrlValidateToken(String urlValidateToken) {
        this.urlValidateToken = urlValidateToken;
    }

    public String getUrlCreateSession() {
        return urlCreateSession;
    }

    public void setUrlCreateSession(String urlCreateSession) {
        this.urlCreateSession = urlCreateSession;
    }

    public String getUrlCreateList1() {
        return urlCreateList1;
    }

    public void setUrlCreateList1(String urlCreateList) {
        this.urlCreateList1 = urlCreateList;
    }

    public String getUrlCreateList2() {
        return urlCreateList2;
    }

    public void setUrlCreateList2(String urlCreateList2) {
        this.urlCreateList2 = urlCreateList2;
    }
}
