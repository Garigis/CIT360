package junit;

import org.junit.Test;
import org.junit.Assert;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by colbycooley on 11/9/16.
 */
public class TestFile {

    @Test
    public void addition() {
        double a = 2;
        double b = 4;
        double c = a + b;
        assertEquals(6, c);
    }
}