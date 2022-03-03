import io.restassured.RestAssured;

public abstract class Url {

    private String urlToken;
    private String urlValidateToken;
    private String urlCreateSession;
    private String urlCreateList1;
    private String urlCreateList2;
    private String urlDeleteList;
    private String urlApi_key;
    private String urlAddMovie;
    private String urlClearLIst;
    private String urlConfirm;
    private String urlMovieDetails;
    private String urlRating;

    Data data = new Data();


    public Url() {
        RestAssured.baseURI = data.getUrlMain();
        setUrlToken(data.getUrlToken());
        setUrlValidateToken(data.getUrlValidateToken());
        setUrlCreateSession(data.getUrlCreateSession());
        setUrlCreateList1(data.getUrlCreateList1());
        setUrlCreateList2(data.getUrlCreateList2());
        setUrlDeleteList(data.getUrlDeleteList());
        setUrlApi_key(data.getUrlApi_key());
        setUrlAddMovie(data.getUrlAddMovie());
        setUrlClearLIst(data.getUrlClearLIst());
        setUrlConfirm(data.getUrlConfirm());
        setUrlMovieDetails(data.getUrlMovieDetails());
        setUrlRating(data.getUrlRating());

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

    public String getUrlDeleteList() {
        return urlDeleteList;
    }

    public void setUrlDeleteList(String urlDeleteList) {
        this.urlDeleteList = urlDeleteList;
    }

    public String getUrlApi_key() {
        return urlApi_key;
    }

    public void setUrlApi_key(String urlApi_key) {
        this.urlApi_key = urlApi_key;
    }

    public String getUrlAddMovie() {
        return urlAddMovie;
    }

    public void setUrlAddMovie(String urlAddMovie) {
        this.urlAddMovie = urlAddMovie;
    }

    public String getUrlClearLIst() {
        return urlClearLIst;
    }

    public void setUrlClearLIst(String urlClearLIst) {
        this.urlClearLIst = urlClearLIst;
    }

    public String getUrlConfirm() {
        return urlConfirm;
    }

    public void setUrlConfirm(String urlConfirm) {
        this.urlConfirm = urlConfirm;
    }

    public String getUrlMovieDetails() {
        return urlMovieDetails;
    }

    public void setUrlMovieDetails(String urlMovieDetails) {
        this.urlMovieDetails = urlMovieDetails;
    }

    public String getUrlRating() {
        return urlRating;
    }

    public void setUrlRating(String urlRating) {
        this.urlRating = urlRating;
    }
}
