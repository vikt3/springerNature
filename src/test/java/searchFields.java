import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//This file defines page objects so that they could be reused with different values
public class searchFields {

	private static WebElement element = null;

	public static WebElement lnk_searchField(WebDriver driver) {

		element = driver.findElement(By.id("query"));

		return element;

	}
	public static WebElement searchButton(WebDriver driver) {

		element = driver.findElement(By.id("search"));
		
		return element;

	}
	public static WebElement lnk_newSearch(WebDriver driver) {

		element = driver.findElement(By.id("global-search-new"));
		
		return element;

	}
	public static WebElement results(WebDriver driver) {

		element = driver.findElement(By.id("kb-nav--main"));
		
		return element;

	}
	public static WebElement search(WebDriver driver) {

		element = driver.findElement(By.id("kb-nav--main"));
		
		return element;

	}
	public static WebElement article(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id=\"content-type-facet\"]/ol/li[1]/a"));
		
		return element;

	}
}