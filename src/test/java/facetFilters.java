import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//This file defines page objects so that they could be reused with different values
public class facetFilters {

	private static WebElement element = null;

	public static WebElement article(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id=\"content-type-facet\"]/ol/li[1]/a"));
		
		return element;

	}
	public static WebElement seeAllDisciplines(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id=\"discipline-facet\"]/div/a"));
		
		return element;

	}
	
	
}