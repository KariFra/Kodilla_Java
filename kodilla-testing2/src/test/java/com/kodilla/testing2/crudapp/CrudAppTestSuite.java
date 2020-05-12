package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.stream.Collectors;
import static org.junit.Assert.assertTrue;

public class CrudAppTestSuite {
    public static final String BASE_URL = "https://karifra.github.io/";
    private WebDriver driver;
    private Random generator;

    @Before
    public void initTests(){
        driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(BASE_URL);
        generator = new Random();
    }


    private String createCrudAppTask() throws InterruptedException {
        final String TITLE_XPATH = "/html/body/main/section[1]/form/fieldset[1]/input";
        final String CONTENT_XPATH = "/html/body/main/section[1]/form/fieldset[2]/textarea";
        final String ADD_BUTTON_XPATH = "/html/body/main/section[1]/form/fieldset[3]/button";
        String taskName = "Task number "+ generator.nextInt(10000);
        String taskContent = taskName +" content.";

        WebElement title = driver.findElement(By.xpath(TITLE_XPATH));
        title.sendKeys(taskName);

        WebElement content = driver.findElement(By.xpath(CONTENT_XPATH));
        content.sendKeys(taskContent);

        WebElement button = driver.findElement(By.xpath(ADD_BUTTON_XPATH));
        button.click();
        Thread.sleep(5000);
        return taskName;
    }


    private void shouldSendTrelloCard(String taskName) throws InterruptedException {
     driver.navigate().refresh();

     while(!driver.findElement(By.xpath("//select[1]")).isDisplayed());

     driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
             .filter(anyForm -> anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
             .getText().equals(taskName))
             .forEach(theForm -> {
             WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
             Select select = new Select(selectElement);
             select.selectByIndex(1);

             WebElement buttonCreateCard = theForm.findElement(By.xpath(".//button[contains(@class,\"card-creation\")]"));
             buttonCreateCard.click();
             });
     Thread.sleep(5000);
    }


    private boolean checkTaskExistsInTrello(String taskName) throws InterruptedException {
        final String TRELLO_URL="https://trello.com/login";
           boolean result = false;
         WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
         driverTrello.get(TRELLO_URL);

         driverTrello.findElement(By.id("user")).sendKeys(System.getenv("TRELLO_USER"));
        driverTrello.findElement(By.id("login")).submit();

        Thread.sleep(5000);

        driverTrello.findElement(By.id("password")).sendKeys(System.getenv("TRELLO_PASSWORD"));
        driverTrello.findElement(By.id("login-submit")).submit();

        Thread.sleep(14000);

        driverTrello.findElements(By.xpath("//a[@class=\"board-tile\"]")).stream()
                .filter(aHref -> aHref.findElements(By.xpath(".//div[@title=\"Kodilla Application\"]"))
                        .size()>0)
                .forEach(aHref -> aHref.click());

        Thread.sleep(3000);

        result = driverTrello.findElements(By.xpath("//span")).stream()
                .filter(theSpan -> theSpan.getText().contains(taskName))
                .collect(Collectors.toList())
                .size() > 0;

        driverTrello.close();

           return result;
    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
    String taskName = createCrudAppTask();
    shouldSendTrelloCard(taskName);
    assertTrue(checkTaskExistsInTrello(taskName));

        driver.switchTo().alert().accept();
        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm -> anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                        .getText().equals(taskName))
                .forEach(form -> {
                    WebElement deleteButton = driver.findElement(By.xpath(".//button[@data-task-delete-button=\"\"]"));
                    deleteButton.click();
                });
    }

    @After
    public void cleanAfterTests(){
        driver.close();
    }
}
