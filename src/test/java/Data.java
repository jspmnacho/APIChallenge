import java.io.*;
import java.util.Properties;

public class Data {

    private String api_key;
    private String username;
    private String pass;


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
}
