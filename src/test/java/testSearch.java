import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;


public class testSearch {

	private static WebDriver driver = null;

	public static void main(String[] args) {

		// Setting chrome
		WebDriver driver = new ChromeDriver();

		String title = "";
		driver.get("https://link.springer.com/");

		//Checking if the page is opened 
		title = driver.getTitle();
		if (title.contentEquals("Home - Springer")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test failed");
		}
		
		//Checking search field basic function and new search link (Happy path)
		searchFields.lnk_searchField(driver).sendKeys("Turing");
		searchFields.searchButton(driver).sendKeys(Keys.ENTER);
		searchFields.lnk_newSearch(driver).click();
		searchFields.lnk_searchField(driver).sendKeys("(test) AND NOT (robots)");
		searchFields.searchButton(driver).sendKeys(Keys.ENTER);
		searchFields.lnk_newSearch(driver).click();
		
		//Checking advanced search with bad year inputs (Unhappy path)
		driver.get("https://link.springer.com/advanced-search/");
		searchFields.startYear(driver).sendKeys("9999");
		searchFields.endYear(driver).sendKeys("0000");
		searchFields.searchButton(driver).sendKeys(Keys.ENTER);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is : "  + currentUrl);
		//Page does not break but no error messages present, shows all article instead
		
		driver.quit();
		System.out.println("Test passed");

	}
}
