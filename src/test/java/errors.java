import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class errors {

	public void errorMessages(String[] args2) {

		// Setting chrome
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

		// Entering incorrect data
		driver.findElement(By.id("new_email_join")).sendKeys("<script>badmail</script>");
		driver.findElement(By.id("new_password_join")).sendKeys("a");
		driver.findElement(By.id("join-quidco-submit-button")).click();

		// Checking error messages
		if (driver.getPageSource().contains("Email address is invalid")) {
			System.out.println("Correct error messages for email");
			if (driver.getPageSource().contains("Oops, that's not long enough")) {
				System.out.println("Correct error messages for password");
			}
		} else {
			System.out.println("Page does not work");
		}
		driver.quit();
	}

}