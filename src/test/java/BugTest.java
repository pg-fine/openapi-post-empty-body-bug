import de.fine.pg.bugs.autogen.api.DefaultApi;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BugTest {
  @Test
  void testBug() {
    DefaultApi api = new DefaultApi();
    Assertions.assertDoesNotThrow(
        api::buggyRequest
    );
  }
}
