import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestRunner {
    @Test
    public void sumTest(){
        Simple simple = mock(Simple.class);
        when(simple.sum(anyInt(),anyInt())).thenReturn(10);
        Assertions.assertEquals(10,5);
    }
}
