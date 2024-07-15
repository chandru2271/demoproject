package stepdefinition;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataTableOrangeHrm {
	@Given("user sending the datas at step level for orngehrm page")
	public void user_sending_the_datas_at_step_level_for_orngehrm_page(DataTable dataTable) throws InterruptedException {
	  
		List<String> asList = dataTable.asList();
		for(String s:asList) {
			System.out.println(s);
		}
		WebDriverManager.chromedriver().setup();
	   WebDriver driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement uname = driver.findElement(By.name("username"));
	for(String s:asList) {
		uname.sendKeys(s);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		uname.clear();
	}
	}
	@Given("user passing dates at step level")
	public void user_passing_dates_at_step_level(DataTable dataTable) {
	 
		List<List<String>> asLists = dataTable.asLists();
		for(List<String> s:asLists) {
			for(String a:s)
				System.out.println(a);
		}
	}
	


}
