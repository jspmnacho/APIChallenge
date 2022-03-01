package Body;

public class CreateBodyBuilder implements BodyBuilder {

    public String username;
    public String password;
    public String request_token;

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

    @Override
    public MainBody build()  {
        MainBody body = new MainBody();
        body.setUsername(this.username);
        body.setPassword(this.password);
        body.setRequest_token(this.request_token);
        return body;
    }

    public void prametersBody(){

    }

}
