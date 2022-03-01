import io.restassured.RestAssured;

public abstract class Url {

    private String urlToken;
    private String urlValidateToken;
    private String urlCreateSession;
    private String urlCreateList1;
    private String urlCreateList2;


    public Url() {
        RestAssured.baseURI = "https://api.themoviedb.org/3";
        setUrlToken("/authentication/token/new?api_key=");
        setUrlValidateToken("/authentication/token/validate_with_login?api_key=");
        setUrlCreateSession("/authentication/session/new?api_key=");
        setUrlCreateList1("/list?api_key=");
        setUrlCreateList2("&session_id=");
    }

    public String getUrlToken() {
        return urlToken;
    }

    public void setUrlToken(String urlToken) {
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
