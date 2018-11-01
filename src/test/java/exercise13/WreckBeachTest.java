package exercise13;

import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

public class WreckBeachTest {

    @Test(expected = InsufficientStaminaException.class)
    public void test1() throws InsufficientStaminaException {
        int     stamina = 1;
        int[]   stair   = {1};
        WreckBeach.maxStamina(stair, stamina);
        fail(); // should not get to this statement
    }

    @Test(expected = InsufficientStaminaException.class)
    public void test2() throws InsufficientStaminaException {
        int     stamina = 2;
        int[]   stair   = {1, 1};
        WreckBeach.maxStamina(stair, stamina);
        fail();
    }

    @Test(expected = InsufficientStaminaException.class)
    public void test3() throws InsufficientStaminaException {
        int     stamina = 2;
        int[]   stair   = {1, 1, 1};
        WreckBeach.maxStamina(stair, stamina);
        fail();
    }

    @Test
    public void test4() throws InsufficientStaminaException {
        int     stamina = 4;
        int[]   stair   = {1, 1, 1};
        assertEquals(1, WreckBeach.maxStamina(stair, stamina));
    }

    @Test
    public void test5() throws InsufficientStaminaException {
        int     stamina = 1;
        int[]   stair   = {0};
        assertEquals(1, WreckBeach.maxStamina(stair, stamina));
    }

    @Test
    public void test6() throws InsufficientStaminaException {
        int     stamina = 10;
        int[]   stair   = {0,2,0,2,0,3,1,4};
        assertEquals(5, WreckBeach.maxStamina(stair, stamina));
    }

    @Test
    public void test7() throws InsufficientStaminaException {
        int     stamina = 9;
        int[]   stair   = {0, 100, 0, 0, 0, 999, 0, 0, 0, 0, 0, 999, 0, 0, 5, 5};
        assertEquals(4, WreckBeach.maxStamina(stair, stamina));
    }

    @Test
    public void test8() throws InsufficientStaminaException {
        int     stamina = 12;
        int[]   stair   = {0, 100, 0, 0, 0, 999, 0, 0, 0, 0, 0, 999, 0, 0, 5, 5};
        assertEquals(7, WreckBeach.maxStamina(stair, stamina));
    }


    @Test(expected = InsufficientStaminaException.class)
    public void test9() throws InsufficientStaminaException {
        int     stamina = 12;
        int[]   stair   = {0, 100, 0, 0, 0, 999, 0, 0, 0, 0, 0, 999, 0, 0, 5, 5, 7, 7, 7};
        assertEquals(7, WreckBeach.maxStamina(stair, stamina));
    }

    @Test
    public void test10() throws InsufficientStaminaException {
        int     stamina = 12;
        int[]   stair   = {0, 1, 2, 3, 0, 1, 2, 3, 0, 1};
        assertEquals(5, WreckBeach.maxStamina(stair, stamina));
    }

    @Test(expected = InsufficientStaminaException.class)
    public void test11() throws InsufficientStaminaException {
        int     stamina = 12;
        int[]   stair   = {0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 0, 1, 2};
        assertEquals(5, WreckBeach.maxStamina(stair, stamina));
    }

    @Test
    public void test12() throws InsufficientStaminaException {
        int     stamina = 12;
        int[]   stair   = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        assertEquals(1, WreckBeach.maxStamina(stair, stamina));
    }

    @Test
    public void test13() throws InsufficientStaminaException {
        int     stamina = 12;
        int[]   stair   = {1, 1, 1, 1, 1, 50, 1, 1, 1, 1, 1};
        assertEquals(1, WreckBeach.maxStamina(stair, stamina));
    }

}
