import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestOne {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before method");
    }

    @Test(priority = 2)
    public void test1(){
        System.out.println("Test 1");
    }

    @Test(priority = 1)
    public void test2(){
        System.out.println("Test 2");
    }



    @Test(dataProvider = "provider")
    public void test3(int ssn, String name){
       // System.out.println("SSN is "+ssn);
        // System.out.println("Name is "+name);
    }

    @DataProvider(name = "provider")
    public Object[][] dataProvider(){
        Object[][] data = new Object[2][2];
        data[0][0] = 123;
        data[0][1] = "Kasif";
        data[1][0] = 236;
        data[1][1] = "Asma";

        return data;
    }
}
