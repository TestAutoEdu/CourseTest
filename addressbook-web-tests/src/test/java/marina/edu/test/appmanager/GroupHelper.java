package marina.edu.test.appmanager;

import com.sun.javafx.binding.ExpressionHelperBase;
import marina.edu.test.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GroupHelper extends HelperBase {

   public GroupHelper (WebDriver wd)
   {super(wd);}


    public void returnToGroupPage() {
        wd.findElement(By.linkText("group page")).click();
    }

    public void submitGroupCreation() {
        wd.findElement(By.name("submit")).click();
    }

    public void fillGroupForm(GroupData groupData) {
        type(groupData.getName(), By.name("group_name"));
        type(groupData.getHeader(), By.name("group_header"));
        type(groupData.getFooter(), By.name("group_footer"));

    }

    private void type(String name, By group_name) {

    }

    private void type(String name, By locator, String text) {
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }


    public void initGroupCreation() {

        wd.findElement(By.name("new")).click();
    }

    public void deleteSelectedGroup() {
        wd.findElement(By.xpath("//div[@id='content']/form/input[5]")).click();
    }

    public void selectGroup() {
        wd.findElement(By.name("selected[]")).click();
    }

    public void initGroupModification() {
        click(By.name("edit"));

    }

    protected void click(By edit) {

    }

    public void submitGroupModification() {
        click(By.name("update"));
    }

    public void initGroupCreation(WebDriver wd) {
        this.wd = wd;
    }
}