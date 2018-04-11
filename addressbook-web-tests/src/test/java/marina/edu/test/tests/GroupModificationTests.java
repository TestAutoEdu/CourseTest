package marina.edu.test.tests;

import marina.edu.test.appmanager.TestBase;
import marina.edu.test.model.GroupData;
import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {
   @Test
    public void testGroupModification() {
       app.getNavigationHelper().gotoGroupPage();
       app.getGroupHelper().selectGroup();
       app.getGroupHelper().initGroupModification();
       app.getGroupHelper().fillGroupForm(new GroupData("ttt", "eee", "sss"));
       app.getGroupHelper().submitGroupModification();
       app.getGroupHelper().returnToGroupPage();
   }
}
