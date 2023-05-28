import org.testng.annotations.DataProvider;

public class DataProviderHelper {
    @DataProvider(name = "provider")
    public Object[][] dataProvider() {
        Object[][] data = new Object[3][3];
        data[0][0] = 123;
        data[0][1] = "Saif";
        data[0][2] = 1111;
        data[1][0] = 456;
        data[1][1] = "Kasif";
        data[1][2] = 2222;
        data[2][0] = 789;
        data[2][1] = "Ishak";
        data[2][2] = 3333;

        return data;
    }
}