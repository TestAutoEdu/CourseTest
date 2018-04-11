package marina.edu.test.tests;

import marina.edu.test.appmanager.marina.edu.ApplicationManager2;
import marina.edu.test.appmanager.marina.edu.GroupHelper2;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupDeletionTests2 extends ApplicationManager2 {


    @Test
    public void testGroupCreationTests2() throws Exception {
        GroupHelper2.goToGroupPage("groups");
        GroupHelper2.selectGroup("(//input[@name='selected[]'])[3]");
        GroupHelper2.deleteGroup();
    }




}
