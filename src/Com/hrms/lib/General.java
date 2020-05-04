package Com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import Com.utility.Log;
public class General extends Global {

	public void openapplication()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tit tiri tiww\\Desktop\\Testing\\chromedriver.exe");
		driver=new ChromeDriver();
		Log.info("*******started execution***********");
		driver.navigate().to(url);
		Log.info("Application Opened Successfully");
		System.out.println(driver.getTitle()); 
		System.out.println("Application opened");
	}
	
	public void closebrowser(){
		driver.quit();
		Log.info("Appliation closed");
		}
	
		public void login() throws Exception{
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		Thread.sleep(3000);
		System.out.println("login completed");
		}
		public void logout(){
		driver.findElement(By.linkText(link_logout)).click();
		Log.info("Application close successfully");
		Log.info("*******End execution***********");
		System.out.println("logout completed");
		}
		public void addemp() throws Exception{
			driver.switchTo().frame("rightMenu");
			//click on add button
			driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
			Thread.sleep(4000);
			System.out.println("clicked on add button");
			driver.findElement(By.xpath("//input[@name='txtEmpFirstName']")).sendKeys("agarwal");
		    driver.findElement(By.xpath("//input[@name='txtEmpLastName']")).sendKeys("ayush");
			driver.findElement(By.xpath("//input[@value='Save']")).click();
			Thread.sleep(4000);
			System.out.println("New employee added");
			//exit from frame;
			driver.switchTo().defaultContent();
		 }
		public void delemp(){
		System.out.println("delete emp"); }

}