import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class MyServiceTest {

    @Test
    public void testExternalApi() {

        // Create Mock
        ExternalApi mockApi =
                Mockito.mock(ExternalApi.class);

        // Stub Method
        when(mockApi.getData())
                .thenReturn("Mock Data");

        // Inject Mock
        MyService service =
                new MyService(mockApi);

        // Execute
        String result =
                service.fetchData();

        // Verify
        assertEquals("Mock Data", result);
    }
}