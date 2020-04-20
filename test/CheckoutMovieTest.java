import com.twu.biblioteca.CheckoutMovie;
import com.twu.biblioteca.database.MediaLibrary;
import org.junit.Before;

public class CheckoutMovieTest {
    CheckoutMovie checkoutMovie;
    MediaLibrary library;

    @Before
    public void setUp(){
        library = new MediaLibrary();
        checkoutMovie = new CheckoutMovie(library);
    }
}
