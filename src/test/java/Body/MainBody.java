package Body;

public class MainBody {

    public String username;
    public String password;
    public String request_token;

    public String nameList;
    public String descriptionList;
    public String lenguajeList;

    private String idMovie;
    private String rateMovie;

    public MainBody() {
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

    public String getNameList() {
        return nameList;
    }

    public void setNameList(String nameList) {
        this.nameList = nameList;
    }

    public String getDescriptionList() {
        return descriptionList;
    }

    public void setDescriptionList(String descriptionList) {
        this.descriptionList = descriptionList;
    }

    public String getLenguajeList() {
        return lenguajeList;
    }

    public void setLenguajeList(String lenguajeList) {
        this.lenguajeList = lenguajeList;
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
