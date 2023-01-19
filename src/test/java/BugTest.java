import de.fine.pg.bugs.autogen.ApiException;
import de.fine.pg.bugs.autogen.api.DefaultApi;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BugTest {
  @Test
  void testBug() {
    DefaultApi api = new DefaultApi();
    try {
      api.buggyRequest();
    } catch(NullPointerException e) {
      Assertions.fail("Null Exception caught", e);
    } catch(Exception e) {
      //ignore other exceptions
    }
  }
}
