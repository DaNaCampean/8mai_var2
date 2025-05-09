package selenium.Learning_JUnit_testNG;

import org.junit.Assert;
import org.junit.Test;


public class LearningJUnit {

        @Test
        public void testSubtraction() {
        int result = 4-2;
        Assert.assertEquals(2, result);
    }

        @Test
        public void testAddition() {
            int result = 2 + 2;
            Assert.assertEquals(4, result);
        }

    @Test
    public void testSubtraction1() {
        int result = 4-2;
        Assert.assertEquals(2, result);
    }



    }

