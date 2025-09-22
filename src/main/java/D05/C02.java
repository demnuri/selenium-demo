package D05;

import org.junit.Test;
import utilities.TestBaseBeforeClasAfterClass;

public class C02 extends TestBaseBeforeClasAfterClass {

    //beforaclass afterclasss
    @Test
    public void Test(){
        driver.get("https://www.google.com");
    }

}
