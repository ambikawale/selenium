package Launch.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
	}

}
