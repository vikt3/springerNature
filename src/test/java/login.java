import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public void login(String[] args) {

		// Setting chrome
		System.setProperty("chromedriver", "");
		WebDriver driver = new ChromeDriver();

		// Setting page url
		String baseUrl = "https://www.quidco.com/join-quidco/";
		String title = "";
		driver.get(baseUrl);

		// Closing unwanted dialog
		driver.findElement(By.xpath("//*[@id=\"modal-country\"]/div/div/div[3]/button")).click();

		// Checking if page opens
		title = driver.getTitle();
		if (title.contentEquals("Join Quidco Now!")) {
			System.out.println("Page works");
		} else {
			System.out.println("Page does not work");
			driver.close();
		}

		// Entering signup form information
		driver.findElement(By.xpath("//*[@id=\"modal-country\"]/div/div/div[3]/button")).click();
		driver.findElement(By.id("first_name_join")).sendKeys("Name");
		driver.findElement(By.id("last_name_join")).sendKeys("Surname");
		driver.findElement(By.id("new_email_join")).sendKeys("viktorijapoderskyte+yeldify3@gmail.com");
		driver.findElement(By.id("new_password_join")).sendKeys("easypass");

		// Checking terms and conditions checkbox
		if (!driver.findElement(By.id("agree_to_terms_label")).isSelected()) {
			driver.findElement(By.id("agree_to_terms_label")).click();
		}

		// Submitting form
		driver.findElement(By.id("join-quidco-submit-button")).click();

		// Checking if sign up was successful
		title = driver.getTitle();
		if (title.contentEquals("Quidco - The UK's #1 Cashback Site")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test failed");
		}
		driver.quit();

	}
	
}