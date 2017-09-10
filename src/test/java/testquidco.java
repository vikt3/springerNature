import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class testquidco {

	
	public static void main(String[] args) {

		login A2 = new login();
		A2.login(args);
		
		errors A1 = new errors();
		A1.errorMessages(args);
		
		System.out.println("Test passed");

	}
}
