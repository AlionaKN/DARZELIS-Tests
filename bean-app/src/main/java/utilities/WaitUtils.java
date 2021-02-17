package utilities;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;


public class WaitUtils {
	public void wait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

	}
}

