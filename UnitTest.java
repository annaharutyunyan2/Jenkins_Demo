package com.project;
import org.junit.Test;
import static org.junit.Assert.*;

public class UnitTest {
    @Test
        public void testConcatenate() {
            Main myUnit = new Main();

            String result = myUnit.concatenate("one", "two");

            assertEquals("onetwo", result);

        }
}
