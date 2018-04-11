package marina.edu.test.tests;

import marina.edu.test.appmanager.marina.edu.ApplicationManager2;
import marina.edu.test.appmanager.marina.edu.GroupHelper2;
import marina.edu.test.model.GroupData;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupCreationTests2 extends ApplicationManager2 {


    @Test
    public void testGroupCreationTests2() throws Exception {
        GroupHelper2.goToGroupPage("groups");
        List<GroupData> before = GroupHelper2.getGroupList();
        GroupHelper2.formFilling();
        driver.findElement(By.linkText("group page")).click();
        List<GroupData> after = GroupHelper2.getGroupList();
        Assert.assertEquals(after.size(), before.size() + 1);
    }


}
