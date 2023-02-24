package com.juaracoding.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormyForm {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        driver.manage().window().maximize();
        System.out.println("Maximize Browser");

        //isi nama depan
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Reynaldo");
        System.out.println("print nama pertama");

        //isi nama belakang
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Wonges");
        System.out.println("print nama belakang");

        //isi job title
        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("QA Engineer");
        System.out.println("print job title");

        //pilih level pendidikan
        WebElement educationLevel = driver.findElement(By.id("radio-button-2"));
        educationLevel.click();
        System.out.println("eduction button clicked ");

        //pilih Jenis Kelamin
        WebElement jenisKelamin = driver.findElement(By.id("checkbox-1"));
        jenisKelamin.click();
        System.out.println("jenis kelamin checkbox clicked");

        //select-menu job experience
        WebElement jobExperience =driver.findElement(By.id("select-menu"));
        Select select = new Select(jobExperience);
        select.selectByValue("1");
        System.out.println("Job experience selected");

        //isi tanggal mulai kerja
        WebElement startDate = driver.findElement(By.id("datepicker"));
        startDate.sendKeys("02/23/2023");
        System.out.println("print tanggal mulai kerja");

        //klik tombol submit
        WebElement submitButton = driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary']"));
        submitButton.click();
        System.out.println("submit button clicked");

        System.out.println("Delay 3 Seconds");
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.quit();
        System.out.println("Quit Browser");

    }
}