import org.testng.annotations.Test;


public class TMDB {

    @Test (groups = { "group0", "group1"})
    public void getRequestToken(){
        GetRequest getRequest = new GetRequest();
        getRequest.generarToken();
    }

    @Test (groups = { "group1"})
    public void postValidateToken(){
        PostValidate postValidate = new PostValidate();
        postValidate.ValidateToken();
    }

    @Test (groups = { "group1"})
    public void postCreateSession(){
        PostValidate createSession = new PostValidate();
        createSession.CreateSession();
    }

    @Test (groups = { "group2"})
    public void postCreateList(){
        PostValidate postValidate = new PostValidate();
        postValidate.CreateList();
    }

    @Test (groups = { "group3"})
    public void postAddMovies(){
        PostValidate postValidate = new PostValidate();
        postValidate.AddMovies();
    }

    @Test (groups = { "group2"})
    public void postClearList(){
        PostValidate postValidate = new PostValidate();
        postValidate.ClearList();
    }

    @Test (groups = { "group3"})
    public void getMovieDetails(){
        GetRequest getRequest = new GetRequest();
        getRequest.MoviesDetails();
    }

    @Test (groups = { "group3"})
    public void postRateMovie(){
        PostValidate postValidate = new PostValidate();
        postValidate.RateMovie();
    }

    @Test (groups = { "group4"})
    public void deleteDetailsList(){
        DeleteRequest deleteRequest = new DeleteRequest();
        deleteRequest.deleteList();
    }
}
