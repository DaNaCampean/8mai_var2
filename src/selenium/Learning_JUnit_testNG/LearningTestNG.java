package selenium.Learning_JUnit_testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LearningTestNG {

/*
    @Test
    public void testSubtraction() {
        int result =4-2;
        Assert.assertEquals(2, result);
    }
    @Test
        public void testAddition() {
            int result = 2 + 2;
            Assert.assertEquals(4, result);
        }

        @Test
        public void testSubtraction1() {
            int result =4-2;
            Assert.assertEquals(2, result);
        }
        */

    @Test(priority=1)
    public void test1() {
        System.out.println("Starting execution of TEST1");
    }
    @Test(priority=0)
    public void test2() {
        System.out.println("Starting execution of TEST2");
    }
    @Test(priority=2)
    public void test3() {
        System.out.println("Starting execution of TEST3");
    }


    }

