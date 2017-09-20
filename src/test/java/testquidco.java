import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testquidco {

	private static WebDriver driver = null;

	public static void main(String[] args) {

		// Setting chrome
		WebDriver driver = new ChromeDriver();

		String title = "";
		driver.get("https://www.quidco.com/join-quidco");

		// Closing unwanted dialog
		signupForm.lnk_otherCountry(driver).click();

		signupForm.lnk_Name(driver).sendKeys("Name");
		signupForm.lnk_Lastname(driver).sendKeys("Lastname");
		signupForm.lnk_Email(driver).sendKeys("viktorija+quidco1@gmail.com");
		signupForm.lnk_Password(driver).sendKeys("Superpass");
		signupForm.lnk_Terms(driver).click();
		signupForm.lnk_Submit(driver).click();

		title = driver.getTitle();
		if (title.contentEquals("Quidco - The UK's #1 Cashback Site")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test failed");
		}	

		// Initiating new broswer window for another testcase
		driver.get("https://www.quidco.com/join-quidco");

		signupForm.lnk_Email(driver).sendKeys("email@");
		signupForm.lnk_Password(driver).sendKeys("a");
		signupForm.lnk_Submit(driver).click();

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
		System.out.println("Test passed");

	}
}
