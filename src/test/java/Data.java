import java.io.*;
import java.util.Properties;

public class Data {

    private String api_key;
    private String username;
    private String pass;

    private String urlMain;
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

    private String nameList;
    private String description;
    private String language;
    private String idList;

    private String idMovie;
    private String rateMovie;


    public Data(){
        Properties properties = new Properties();
        try{
            properties.load(new FileReader("src/test/java/resources/data.properties"));
        }catch (IOException e){
            e.printStackTrace();
        }
        setApi_key(properties.getProperty("api_key"));
        setUsername(properties.getProperty("username"));
        setPass(properties.getProperty("password"));

        setUrlMain(properties.getProperty("urlMain"));
        setUrlToken(properties.getProperty("urlToken"));
        setUrlValidateToken(properties.getProperty("urlValidateToken"));
        setUrlCreateSession(properties.getProperty("urlCreateSession"));
        setUrlCreateList1(properties.getProperty("urlCreateList1"));
        setUrlCreateList2(properties.getProperty("urlCreateList2"));
        setUrlDeleteList(properties.getProperty("urlDeleteList"));
        setUrlApi_key(properties.getProperty("urlApi_key"));
        setUrlAddMovie(properties.getProperty("urlAddMovie"));
        setUrlClearLIst(properties.getProperty("urlClearLIst"));
        setUrlConfirm(properties.getProperty("urlConfirm"));
        setUrlMovieDetails(properties.getProperty("urlMovieDetails"));
        setUrlRating(properties.getProperty("urlRating"));

        setNameList(properties.getProperty("nameList"));
        setDescription(properties.getProperty("descriptionList"));
        setLanguage(properties.getProperty("languageList"));
        setIdList(properties.getProperty("idList"));

        setIdMovie(properties.getProperty("idMovie"));
        setRateMovie(properties.getProperty("rateMovie"));
    }

    public String getApi_key() {
        return api_key;
    }

    public void setApi_key(String api_key) {
        this.api_key = api_key;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUrlMain() {
        return urlMain;
    }

    public void setUrlMain(String urlMain) {
        this.urlMain = urlMain;
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

    public void setUrlCreateList1(String urlCreateList1) {
        this.urlCreateList1 = urlCreateList1;
    }

    public String getUrlCreateList2() {
        return urlCreateList2;
    }

    public void setUrlCreateList2(String urlCreateList2) {
        this.urlCreateList2 = urlCreateList2;
    }

    public String getUrlApi_key() {
        return urlApi_key;
    }

    public void setUrlApi_key(String urlApi_key) {
        this.urlApi_key = urlApi_key;
    }

    public String getUrlDeleteList() {
        return urlDeleteList;
    }

    public void setUrlDeleteList(String urlDeleteList) {
        this.urlDeleteList = urlDeleteList;
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

    public String getNameList() {
        return nameList;
    }

    public void setNameList(String nameList) {
        this.nameList = nameList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getIdList() {
        return idList;
    }

    public void setIdList(String idList) {
        this.idList = idList;
    }

    public String getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(String idMovie) {
        this.idMovie = idMovie;
    }

    public String getRateMovie() {
        return rateMovie;
    }

    public void setRateMovie(String rateMovie) {
        this.rateMovie = rateMovie;
    }
}
