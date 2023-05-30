import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class cashbackTestNg {
    @org.testng.annotations.Test
    public void testOne(){
        CashBackService service = new CashBackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    public void testTwo(){
        CashBackService service = new CashBackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    public void testThree(){
        CashBackService service = new CashBackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }

    public void testfour(){
        CashBackService service = new CashBackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }


}
