package Launch.selenium;
//LOGIN TO AMAZON
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Scenario2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
EdgeDriver driver= new EdgeDriver();//empty browser
driver.manage().window().maximize();
driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0"); //URL
Thread.sleep(10000);
driver.findElement(By.id("ap_email")).sendKeys("ambikawale27@gmail.com"); //type India
driver.findElement(By.id("continue")).click();
driver.findElement(By.name("password")).sendKeys("12345");
driver.findElement(By.id("signInSubmit")).click();


	}

}
