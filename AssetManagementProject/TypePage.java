package AssetManagementProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypePage {

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
		WebElement Type=driver.findElement(By.xpath("//a[text()='Type']"));	Type.click();

		WebElement AddAssetType=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_mucl_typesearch\"]/div/div[2]/a"));AddAssetType.click();

		Thread.sleep(5000);
		WebElement Clickbutton2=driver.findElement(By.xpath("//button[contains(@class,'btn  btn-primary')]")); Clickbutton2.click();

		WebElement Caancelbutton=driver.findElement(By.xpath("//a[@class='cancelButton ']"));Caancelbutton.click();

		Thread.sleep(5000);
		WebElement AddAssetType1=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_mucl_typesearch\"]/div/div[2]/a"));AddAssetType1.click();

		WebElement Type1=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_mucl_type\"]")); Type1.sendKeys("Apple Phone");

		WebElement des=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_mucl_description\"]")); des.sendKeys("I like It");
		WebElement Clickbutton3=driver.findElement(By.xpath("//button[contains(@class,'btn  btn-primary')]")); Clickbutton3.click();
		System.out.println("Fine");

		Thread.sleep(5000);
		WebElement InvalidKeyword=driver.findElement(By.xpath("//input[@id='_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_mucl_keyword']"));
		InvalidKeyword.sendKeys("Asus"+Keys.ENTER);

		Thread.sleep(4000);
		WebElement ClearKeyword=driver.findElement(By.xpath("//input[@id='_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_mucl_keyword']"));
		ClearKeyword.clear();

		Thread.sleep(4000);
		WebElement ValidLetter=driver.findElement(By.xpath("//input[@id='_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_mucl_keyword']"));
		ValidLetter.sendKeys("Apple Phone"+Keys.ENTER);

		Thread.sleep(7000);
		WebElement EditButton=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_mucl_assetTypesSearchContainerSearchContainer\"]/div[1]/table/tbody/tr[1]/td[4]/a[1]/img"));
		EditButton.click();

		Thread.sleep(6000);
		WebElement ChangeDescription1=driver.findElement(By.xpath("//textarea[@id='_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_mucl_description']"));ChangeDescription1.clear();
		WebElement ChangeDescription=driver.findElement(By.xpath("//textarea[@id='_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_mucl_description']")); ChangeDescription.sendKeys("Brand");

		WebElement Save=driver.findElement(By.xpath("//button[@class='btn  btn-primary']")); Save.click();

		Thread.sleep(5000);

		WebElement Deletebutton=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_mucl_assetTypesSearchContainerSearchContainer\"]/div[1]/table/tbody/tr[1]/td[4]/a[2]/img"));
		Deletebutton.click();
		driver.switchTo().alert().dismiss();

		Thread.sleep(7000);
		WebElement Deletebutton1=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_mucl_assetTypesSearchContainerSearchContainer\"]/div[1]/table/tbody/tr[1]/td[4]/a[2]/img"));
		Deletebutton1.click();
		driver.switchTo().alert().accept();
		System.out.println("Type page is finished");

	}

}
