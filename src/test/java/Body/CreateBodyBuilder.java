package Body;

public class CreateBodyBuilder implements BodyBuilder {

    private String username;
    private String password;
    private String request_token;
    private String solicitudBody;

    private String nameList;
    private String descriptionList;
    private String lenguajeList;

    private String idMovie;
    private String rateMovie;

    public CreateBodyBuilder(String request_token) {
        this.request_token = request_token;
    }

    public CreateBodyBuilder username(String val) {
        username = val;
        return this;
    }

    public CreateBodyBuilder password(String val) {
        password = val;
        return this;
    }

    public CreateBodyBuilder request_token(String val) {
        request_token = val;
        return this;
    }

    public String getSolicitudBody() {
        return solicitudBody;
    }

    public void setSolicitudBody(String solicitudBody) {
        this.solicitudBody = solicitudBody;
    }

    public CreateBodyBuilder nameList(String val) {
        nameList = val;
        return this;
    }

    public CreateBodyBuilder descriptionList(String val) {
        descriptionList = val;
        return this;
    }

    public CreateBodyBuilder lenguajeList(String val) {
        lenguajeList = val;
        return this;
    }

    public CreateBodyBuilder idMovie(String val) {
        idMovie = val;
        return this;
    }

    public CreateBodyBuilder rateMovie(String val) {
        rateMovie = val;
        return this;
    }

    @Override
    public MainBody build()  {
        MainBody body = new MainBody();
        body.setUsername(this.username);
        body.setPassword(this.password);
        body.setRequest_token(this.request_token);
        body.setNameList(this.nameList);
        body.setDescriptionList(this.descriptionList);
        body.setLenguajeList(this.lenguajeList);
        body.setIdMovie(this.idMovie);
        body.setRateMovie(this.rateMovie);
        return body;
    }

    public void prametersBody(String solicitud){

        switch (solicitud){

            case "ValidateToken":
                setSolicitudBody(
                        "{\"username\": \""+ build().getUsername()+
                                "\",\"password\": \""+build().getPassword()+
                                "\",\"request_token\": \""+build().getRequest_token()+"\"}");
                break;

            case "CreateSession":
                setSolicitudBody(
                        "{\"request_token\": \""+build().getRequest_token()+"\"}");
                break;

            case "CreateList":
                setSolicitudBody(
                        "{\"name\":\""+ build().getNameList()+
                                "\",\"description\":\""+build().getDescriptionList()+
                                "\",\"language\":\""+build().getLenguajeList()+"\"}");
                break;

            case "AddMovies":
                setSolicitudBody(
                        "{\"media_id\": "+ build().getIdMovie()+"}");
                break;

            case "RateMovie":
                setSolicitudBody(
                        "{\"value\":"+build().getRateMovie()+"}");
                break;

            default: {
                System.out.println("Opcion incorrecta");
            }
        }

    }

}
