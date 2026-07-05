import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
class MyServicetest{

    @Test
    public void testMyService(){ 

    ExternalApi external=Mockito.mock(ExternalApi.class);
    when(external.getData()).thenReturn("Mock Data");
    MyService myservice=new MyService(external);
    String res=myservice.fetchData();
    assertEquals("Mock Data",res);
    }
}