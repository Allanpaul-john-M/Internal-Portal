package AssetManagementProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProcessorPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://stg-portal.icaniotech.com/");
		driver.manage().window().maximize();

		WebElement Email=driver.findElement(By.xpath("//*[@id=\"_google_GoogleLoginPortlet_INSTANCE_zhih_inputEmail\"]")); Email.sendKeys("sowmiya.r@icanio.com");

		WebElement password=driver.findElement(By.xpath("//*[@id=\"_google_GoogleLoginPortlet_INSTANCE_zhih_password\"]")); password.sendKeys("12");

		WebElement login=driver.findElement(By.xpath("//button[contains(@class,'button login-button h-12 md:h-9 !mb-5 md:!mb-8')]")); login.click();
		System.out.println("Login page is open");

		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		WebElement Asset=driver.findElement(By.xpath("//*[text()='Asset Management']"));	Asset.click();
		
		Thread.sleep(3000);
		WebElement Processor=driver.findElement(By.xpath("//a[text()='Processor']"));	Processor.click();
		WebElement AddAssetProcessor=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_zdlg_processorsearch\"]/div/div[2]/a")); AddAssetProcessor.click();

		Thread.sleep(3000);
		WebElement button3=driver.findElement(By.xpath("//button[contains(@class,'btn  btn-primary')]")); button3.click();
		WebElement CancelButton=driver.findElement(By.xpath("//a[text()=' Cancel ']")); CancelButton.click();

		Thread.sleep(3000);
		WebElement Processor1=driver.findElement(By.xpath("//a[text()=' Add Asset Processor']"));	Processor1.click();
		Thread.sleep(3000);//
		WebElement Processortext=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_zdlg_processor\"]")); 	Processortext.sendKeys("Hello");

		WebElement Processordes=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_zdlg_description\"]"));Processordes.sendKeys("How are you");

		WebElement button4=driver.findElement(By.xpath("//button[contains(@class,'btn  btn-primary')]")); button4.click();

		Thread.sleep(5000);
		WebElement InvalidSearch=driver.findElement(By.xpath("//input[@id='_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_zdlg_keyword']"));
		InvalidSearch.sendKeys("Lenovo"+Keys.ENTER);

		Thread.sleep(4000);	
		WebElement InvalidSearchbox4=driver.findElement(By.xpath("//input[@id='_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_zdlg_keyword']"));
		InvalidSearchbox4.clear();

		Thread.sleep(4000);	
		WebElement validSearch1=driver.findElement(By.xpath("//input[@id='_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_zdlg_keyword']"));
		validSearch1.sendKeys("Hello"+Keys.ENTER);
		System.out.println("Finish");

		Thread.sleep(6000);		
		WebElement Editicon=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_zdlg_assetProcessorsSearchContainerSearchContainer\"]/div[1]/table/tbody/tr[1]/td[4]/a[1]/img"));
		Editicon.click();

		WebElement ChangeDescriptionName=driver.findElement(By.xpath("//textarea[@id='_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_zdlg_description']"));
		ChangeDescriptionName.clear();

		WebElement NewDescriptionName=driver.findElement(By.xpath("//textarea[@id='_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_zdlg_description']"));
		NewDescriptionName.sendKeys("New Brand");
		WebElement Sumbitbutton=driver.findElement(By.xpath("//button[@class='btn  btn-primary']"));Sumbitbutton.click();

		Thread.sleep(5000);	
		WebElement Deletebutton14=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_zdlg_assetProcessorsSearchContainerSearchContainer\"]/div[1]/table/tbody/tr[1]/td[4]/a[2]/img"));
		Deletebutton14.click();
		driver.switchTo().alert().dismiss();

		Thread.sleep(5000);	
		WebElement Delete=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_zdlg_assetProcessorsSearchContainerSearchContainer\"]/div[1]/table/tbody/tr[1]/td[4]/a[2]/img"));
		Delete.click();
		driver.switchTo().alert().accept();
		System.out.println("Processor page is finished");

	}

}
