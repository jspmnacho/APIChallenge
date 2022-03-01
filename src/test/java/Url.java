import io.restassured.RestAssured;

public abstract class Url {

    private String urlToken;
    private String urlValidateToken;
    private String urlCreateSession;
    private String urlCreateList1;
    private String urlCreateList2;
    Data data = new Data();


    public Url() {
        RestAssured.baseURI = data.getUrlMain();
        setUrlToken(data.getUrlToken());
        setUrlValidateToken(data.getUrlValidateToken());
        setUrlCreateSession(data.getUrlCreateSession());
        setUrlCreateList1(data.getUrlCreateList1());
        setUrlCreateList2(data.getUrlCreateList2());
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
