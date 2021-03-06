package marina.edu.test.appmanager;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    protected ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

    @BeforeMethod

    public void setUp() throws Exception {
        app.init();
    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }

}
