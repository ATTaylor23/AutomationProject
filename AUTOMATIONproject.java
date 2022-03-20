package March17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class AUTOMATIONproject {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\taylo\\" +
                "Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://qa-duotify.us-east-2.elasticbeanstalk.com/register.php");

        System.out.println("1 =====================================");

        String actualTitle = driver.getTitle();
        String expectedTitle = ("Welcome to Duotify!");

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Test passed " + actualTitle);
        }else{
            System.out.println("Test failed. The current title was " + expectedTitle);
        }
        System.out.println("2 =====================================");
        System.out.println("PASSED");

        driver.findElement(By.id("hideLogin")).click();
        Thread.sleep(2000);

        System.out.println("3 =====================================");

        String chars = "abcdefghijklmnopqrstuvwxyz";
        Random randy = new Random();
        StringBuilder sb = new StringBuilder();
        StringBuilder username = new StringBuilder();
        for (int i = 0; i < 5; i++){
            sb.append(chars.charAt(randy.nextInt(chars.length())));
            username = sb;
        }
        driver.findElement(By.id("userName")).sendKeys(username + " ");
        Thread.sleep(1000);

        driver.findElement(By.id("firstName")).sendKeys("firstName");
        Thread.sleep(1000);

        driver.findElement(By.id("lastName")).sendKeys("lastName");
        Thread.sleep(1000);

        String chars2 = "abcdefghijklmnopqrstuvwxyz";
        Random randys = new Random();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder email = new StringBuilder();
        for (int i = 0; i < 5; i++){
            sb2.append(chars2.charAt(randys.nextInt(chars2.length())));
            email = sb2;
        }
        driver.findElement(By.id("email")).sendKeys(email + "@email.com");
        Thread.sleep(1000);

        driver.findElement(By.id("email2")).sendKeys(email + "@email.com");
        Thread.sleep(1000);

        driver.findElement(By.id("password")).sendKeys("password");
        Thread.sleep(1000);

        driver.findElement(By.id("password2")).sendKeys("password");
        Thread.sleep(1000);

        driver.findElement(By.name("registerButton")).click();
        Thread.sleep(1000);

        System.out.println("PASSED");

        System.out.println("4 =====================================");

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "http://qa-duotify.us-east-2.elasticbeanstalk.com/browse.php?";

        if(actualURL.equals(expectedURL)){
            System.out.println("Test passed: " + actualURL);
        }else{
            System.out.println("Test failed. The current URL was " + actualURL);
        }

        System.out.println("5 =====================================");

        driver.findElement(By.id("nameFirstAndLast")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("rafael")).click();
        Thread.sleep(1000);

        System.out.println("PASSED");

        System.out.println("6 =====================================");

        if(driver.getPageSource().contains("Login to your account")){
            System.out.println("PASSED");
        }else{
            System.out.println("FAIL");
        }

        System.out.println("7 =====================================");

        driver.findElement(By.id("LoginUsername")).sendKeys(username);
        Thread.sleep(1000);

        driver.findElement(By.id("LoginPassword")).sendKeys("password");
        Thread.sleep(1000);

        driver.findElement(By.name("loginButton")).click();
        Thread.sleep(1000);

        System.out.println("PASSED");

        System.out.println("8 =====================================");

        if(driver.getPageSource().contains("You Might Also Like")){
            System.out.println("PASSED");
        }else{
            System.out.println("FAIL");
        }

        System.out.println("9 =====================================");
        System.out.println("Thank your for playing Duotify!");

        driver.quit();

    }
}
