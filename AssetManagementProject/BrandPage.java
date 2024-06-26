package AssetManagementProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrandPage {

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
		WebElement Brand=driver.findElement(By.xpath("//a[text()='Brand']")); Brand.click();

		Thread.sleep(7000);
		WebElement AddAssetBrand=driver.findElement(By.xpath("//a[text()=' Add Asset Brand']"));  AddAssetBrand.click();
		Thread.sleep(4000);
		WebElement ClickSave=driver.findElement(By.xpath("//button[@class='btn btn-btn_property btn-primary']"));ClickSave.click();

		WebElement Cancelbutton=driver.findElement(By.xpath("//a[text()=' Cancel ']")); Cancelbutton.click();

		Thread.sleep(7000);
		WebElement AddAssetBrand1=driver.findElement(By.xpath("//a[text()=' Add Asset Brand']"));  AddAssetBrand1.click();

		WebElement text = driver.findElement(By.xpath("//*[@id='_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_nyfm_brand']")); text.sendKeys("Redmi");

		WebElement description=driver.findElement(By.xpath("//textarea[contains(@class,'field form-control')]"));	description.sendKeys("Note 10Pro");

		WebElement Savebutton=driver.findElement(By.xpath("//button[contains(@class,'btn btn-btn_property btn-primary')]"));Savebutton.click();
		System.out.println("Ok");

		Thread.sleep(7000);
		WebElement InvalidSearchbox=driver.findElement(By.xpath("//input[@id='_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_nyfm_keyword']"));
		
		InvalidSearchbox.sendKeys("Mobile"+Keys.ENTER);
		Thread.sleep(5000);
		
		WebElement SeacrchBox=driver.findElement(By.xpath("//input[@id='_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_nyfm_keyword']"));
		SeacrchBox.clear();

		Thread.sleep(5000);
		
		WebElement validSearchbox=driver.findElement(By.xpath("//input[@id='_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_nyfm_keyword']"));
		validSearchbox.sendKeys("Redmi"+Keys.ENTER);
		System.out.println("Ok");

		Thread.sleep(7000);
		WebElement Edit=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_nyfm_assetBrandsSearchContainerSearchContainer\"]/div[1]/table/tbody/tr[1]/td[4]/a[1]/img")); 
		Edit.click();

		Thread.sleep(5000);
		WebElement EditAsset=driver.findElement(By.xpath("//input[@id='_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_nyfm_brand']")); EditAsset.clear(); 

		WebElement EditAssetBrand=driver.findElement(By.xpath("//input[@id='_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_nyfm_brand']"));

		EditAssetBrand.sendKeys("Apple");

		WebElement Savebutton2=driver.findElement(By.xpath("//button[@class='btn btn-btn_property btn-primary']")); Savebutton2.click();
		Thread.sleep(5000);
		driver.navigate().refresh();

		Thread.sleep(6000);
		WebElement delete=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_nyfm_assetBrandsSearchContainerSearchContainer\"]/div[1]/table/tbody/tr[5]/td[4]/a[2]/img"));
		delete.click();

		driver.switchTo().alert().dismiss();

		Thread.sleep(3000);
		WebElement Againdelete=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_nyfm_assetBrandsSearchContainerSearchContainer\"]/div[1]/table/tbody/tr[5]/td[4]/a[2]/img"));
		Againdelete.click();
		driver.switchTo().alert().accept();

		System.out.println("Brand page is finish");

	}

}
