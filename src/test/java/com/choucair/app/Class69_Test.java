package com.choucair.app;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Created by wospina on 08/06/2016.
 */
public class Class69_Test {
    static WebDriver _driver;

    @BeforeClass
    public static void openBasicHtmlForPage() {
        _driver = new FirefoxDriver();
        //Maximiza la ventana del navegador.
        _driver.manage().window().maximize();
        //Open formulario de pagina html.
        _driver.get("http://compendiumdev.co.uk/selenium/basic_html_form.html");
    }

    @Test
    public void getOptions(){
        //Create a Select Class for multiSection Box field.
        Select select = new Select(_driver.findElement(By.cssSelector("select[multiple='multiple']")));
        //Retrieve all the list options available in the mutiSelection Box Field.
        //Assign the retrieve list options to the list<WebElement> type variable.
        List<WebElement> list_options = select.getOptions();

        //Clear the text area field
        _driver.findElement(By.cssSelector("textarea")).clear();

        //Create for loop
        //Extract the label text of the each and every retrieved list options.
        //Enter the extracted label text into the text area field.
        for (WebElement temp: list_options){
            //Extract the label text of the list options
            String label_text = temp.getText();

            //Enter the extracted label text into text area field.
            _driver.findElement(By.cssSelector("textarea")).sendKeys(label_text);

            //Go to the new line after entering the label text
            _driver.findElement(By.cssSelector("textarea")).sendKeys("\n");

        }
    }

    @AfterClass
    public static void closeBrowserWindowAndQuitSelenium(){
        //Close the browser window
        _driver.close();
        //Salir de Selenium
        _driver.quit();
    }
}
