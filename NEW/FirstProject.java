import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstProject {
	static int arr[] = new int[100];
	static int c = 0;
	
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prateekbhardwaj\\Downloads\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://hris.qainfotech.com/");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.id("txtUserName"));
		
		driver.findElement(By.xpath("//span[text()='Login Panel']")).click();		
		
		ele.sendKeys("prateekbhardwaj");
		driver.findElement(By.id("txtPassword")).click();
		Thread.sleep(10000);
	//	driver.findElement(By.cssSelector(".btn.pull-left")).click();
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		Thread.sleep(7000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	//	jse.executeScript("window.scrollBy(0,250)", "");
		WebElement ele1 = driver.findElement(By.xpath("(//span[text()='6'])[last()]")); // Enter_the_Date
		Actions action = new Actions(driver);
		action.moveToElement(ele1).build().perform();
		List<WebElement> list = driver.findElements(By.xpath("//span[@class='blk ng-scope']//b[@class='ng-binding']"));
		String punch = list.get(list.size() - 1).getText();
		System.out.println(punch);
		Calendar calendar = Calendar.getInstance();
		String presentTime = calendar.getTime().toString();
		String currentTime = presentTime.substring(11, 16);
		System.out.println("current time: " + currentTime);
		int setHours = 8;
		int setMinutes = 00;

		String s = null;

		s = punch;
		String b = s.substring(9, s.length());

		int count = 0;
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == ',')
				count++;
		if (count % 2 == 0) {

			timeCalculator(currentTime);
			int time = setHours * 60 + setMinutes;
			int j = 0;
			for (int i = 0; i <= count; i++) {
				timeCalculator(b.substring(j, j + 5));
				j += 10;
			}
			int diff = 0;
			int totaldiff = arr[0] - arr[1];
			for (int i = 2; i <= c; i += 2) {
				int di = arr[i + 1] - arr[i];
				diff += di;
			}
			int totalTime = totaldiff - diff;
			int remainingTime = time - totalTime;
			int finalTime = arr[0] + remainingTime;
			int hour = finalTime / 60;
			int min = finalTime % 60;
			int hour1 = remainingTime / 60;
			int min1 = remainingTime % 60;
			int hour2 = totalTime / 60;
			int min2 = totalTime % 60;
			System.out.printf("Your have to complete %d hours %d mins", hour1, min1);
			System.out.printf("\n\nYour have completed %d hours %d mins", hour2, min2);
			System.out.printf("\n\nYour %d hours %d mins will complete at \"%d:%d\"\n", setHours, setMinutes, hour,
					min);

		} else
			System.out.println("\nyour time sheet is not updated");
		driver.close();
	}

	static void timeCalculator(String time) {
		Integer a = Integer.valueOf(time.substring(0, 2));
		Integer b = Integer.valueOf(time.substring(3));
		Integer f = a * 60 + b;
		arr[c++] = f;
	}


	}

