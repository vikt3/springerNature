    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;

 public class signupForm {

    private static WebElement element = null;

 public static WebElement lnk_otherCountry(WebDriver driver){

    element = driver.findElement(By.xpath("//*[@id=\"modal-country\"]/div/div/div[3]/button"));

    return element;

    }

 public static WebElement lnk_Name(WebDriver driver){

    element = driver.findElement(By.id("first_name_join"));

 return element;

    }

 public static WebElement lnk_Lastname(WebDriver driver){

	 element = driver.findElement(By.id("last_name_join"));

	 return element;

	    }
 
 public static WebElement lnk_Password(WebDriver driver){

	 element = driver.findElement(By.id("new_password_join"));

	 return element;

	    }
 
 public static WebElement lnk_Email(WebDriver driver){

	    element = driver.findElement(By.id("new_email_join"));

	 return element;

	    }
 public static WebElement lnk_Submit(WebDriver driver){

	    element = driver.findElement(By.id("join-quidco-submit-button"));

	 return element;

	    }
 public static WebElement lnk_Terms(WebDriver driver){

	    element = driver.findElement(By.id("agree_to_terms_label"));

	 return element;

	    }
}