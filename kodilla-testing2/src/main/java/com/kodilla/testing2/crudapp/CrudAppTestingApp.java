package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CrudAppTestingApp {
    public static final String ELEMENT_SEARCH = "/html/body/main/section/form/fieldset/input"; //absolute
    public static final String SECOND_ELEMENT_SEARCH = "/html/body/main/section/form/fieldset[2]/textarea"; //position
    public static final String XPATH_POSITION = "//select[1]"; //position
    public static final String XPATH_SELECT = "//div[contains(@class, \"tasks-container\")]/form/div/fieldset/select[1]"; //relative

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://karifra.github.io/");
        WebElement element = driver.findElement(By.xpath(ELEMENT_SEARCH));
        element.sendKeys("New robotic task");

        WebElement secondElement = driver.findElement(By.xpath(SECOND_ELEMENT_SEARCH));
        secondElement.sendKeys("New robotic task content");

        while (!driver.findElement(By.xpath(XPATH_SELECT)).isDisplayed());

        WebElement thirdElement = driver.findElement(By.xpath(XPATH_SELECT));
        Select select = new Select(thirdElement);
        select.selectByIndex(1);



    }
}
