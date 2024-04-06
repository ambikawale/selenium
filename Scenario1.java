package Launch.selenium;
//search India
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver= new ChromeDriver();//empty browser
driver.manage().window().maximize();
driver.get("https://www.google.com"); //URL
driver.findElement(By.name("q")).sendKeys("India"); //type India
driver.findElement(By.name("btnK")).click();



	}

}
