import org.junit.Test;


public class TMDB {

    @Test
    public void getRequestToken(){
        GetRequest getRequest = new GetRequest();
        getRequest.generarToken();
    }

    @Test
    public void postValidateToken(){
        PostValidate postValidate = new PostValidate();
        postValidate.ValidateToken();
    }

    @Test
    public void postCreateSession(){
        PostValidate createSession = new PostValidate();
        createSession.CreateSession();
    }

    @Test
    public void postCreateList(){
        PostValidate postValidate = new PostValidate();
        postValidate.CreateList();
    }

    @Test
    public void deleteDetailsList(){
        DeleteRequest deleteRequest = new DeleteRequest();
        deleteRequest.deleteList();
    }

    @Test
    public void postAddMovies(){
        PostValidate postValidate = new PostValidate();
        postValidate.AddMovies();
    }

    @Test
    public void postClearList(){
        PostValidate postValidate = new PostValidate();
        postValidate.ClearList();
    }

    @Test
    public void getMovieDetails(){
        GetRequest getRequest = new GetRequest();
        getRequest.MoviesDetails();
    }

    @Test
    public void postRateMovie(){
        PostValidate postValidate = new PostValidate();
        postValidate.RateMovie();
    }
}
