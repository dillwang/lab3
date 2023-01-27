import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.*;

public class ListTests {
    @Test
    public void testFilter() {
        List<String> input1 = new ArrayList<>(Arrays.asList("", "", "a", "ab", ""));
        StringChecker check = new StringChecker() {
            @Override
            public boolean checkString(String s) {
                if (s.contains("a")) {
                    return true;
                }
                return false;
            }
        };
        List<String> test1 = new ArrayList<>(Arrays.asList("a", "ab"));
        assertEquals(test1, ListExamples.filter(input1, check));}
    
    @Test
    public void testMerge() {
        List<String> input1 = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
        List<String> input2 = new ArrayList<>(Arrays.asList("r", "s", "t"));
        List<String> expect1 = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e","r", "s", "t"));
        assertEquals(expect1, ListExamples.merge(input1, input2));
    }

}

