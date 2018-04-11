package marina.edu.test.tests;


import marina.edu.test.appmanager.TestBase;
import marina.edu.test.model.GroupData;
import org.testng.annotations.Test;

import static marina.edu.test.appmanager.NavigationHelper.wd;

public class GroupCreationTests extends TestBase {


    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().gotoGroupPage();
       /** app.getGroupHelper().initGroupCreation(wd); **/
        app.getGroupHelper().fillGroupForm(new GroupData("petrushka1", "petrushka1", "petrushka2"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
    }

}
