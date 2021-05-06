import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;

public class cuzdan {


    public static class actionClass {
        public static void main(String[] args) throws InterruptedException, IOException {

            System.setProperty("webdriver.chrome.driver", "C:/Users/ali/Desktop/selenium/ChromeDriver/chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--no-sandbox"); // Bypass OS security model, MUST BE THE VERY FIRST OPTION
            chromeOptions.setExperimentalOption("useAutomationExtension", false);
            chromeOptions.setHeadless(false);
            chromeOptions.addArguments("start-maximized"); // open Browser in maximized mode
            chromeOptions.addArguments("disable-infobars"); // disabling infobars
            chromeOptions.addArguments("--disable-extensions"); // disabling extensions




            WebDriver driver = new ChromeDriver(chromeOptions);

            driver.get("https://blockchair.com/dogecoin/address/AAjRgioxGwqF4BZNYVZyPvs2zmMncLvGUH");

            driver.manage().window().maximize();

            Thread.sleep(5000);


            int i;
            for (i = 2; i < 1000000; i++) {

                System.out.println(i);
                int x;
                for (x = 1; x < 11; x++) {
                    System.out.println(x);


                    Thread.sleep(500);                                                                                        //div[2]/div[3]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/a
                    WebElement dogead = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div["+x+"]/div[3]/div[2]/div[2]/div[1]/a")));
                    dogead.getText();
                    System.out.println(dogead);
                    String dogead1 = dogead.getText();
                    System.out.println(dogead1);
                    String dogead2 = dogead1;
                    System.out.println(dogead2);

                    BufferedWriter bufferedWriter = null;

                    File file = new File("dubai.txt");

                    if (!file.exists()) {

                        file.createNewFile();
                    }

                    //  fileWriter nesnesine true parametre geçersek eklenen content'i dosyanın sonuna ekler

                    FileWriter fileWriter = new FileWriter(file, true);
                    bufferedWriter = new BufferedWriter(fileWriter);

                    String content = dogead2 + "\n";
                    bufferedWriter.write(content);
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    System.out.println("file write Success");


                }

                driver.findElement(By.xpath("//*[@href='?page="+i+"']")).click();


                Thread.sleep(1000);

            }


        }}}


