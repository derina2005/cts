import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.verify;
public class Verify {
    @Test
    public void VerifyTest(){
        ExternalApi api=Mockito.mock(ExternalApi.class);
        MyService my=new MyService(api);
        my.fetchData();
        verify(api).getData();
    }
}
