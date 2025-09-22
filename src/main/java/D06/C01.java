package D06;

import org.junit.Assert;
import org.junit.Test;

import java.io.FilterOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class C01 {
    //Dosya yükleme ve bunu kontrol etme.
    //File exist
    @Test
    public void Test(){
        System.out.println(System.getProperty("user.dir")); //C:\Users\testinium\IdeaProjects\JUnitFramework

        String anaDizin = System.getProperty("user.home");//C:\Users\testinium
        System.out.println(anaDizin);

        String file = "C:\\Users\\testinium\\OneDrive\\Masaüstü\\Betradar Links.tx";
        Assert.assertTrue(Files.exists(Paths.get(file)));

    }
}
