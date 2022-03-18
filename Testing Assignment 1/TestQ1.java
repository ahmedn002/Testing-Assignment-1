package Testing;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestQ1 {
    @Test
    public void test1(){ assertTrue(Q1.Dividable(12).equals("YES")); }
    @Test
    public void test2(){ assertTrue(Q1.Dividable(9).equals("NO")); }
}
