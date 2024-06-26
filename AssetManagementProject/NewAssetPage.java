package AssetManagementProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewAssetPage {

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
		WebElement AssetClick = driver.findElement(By.xpath("//a[text()='Asset']"));	AssetClick.click();
		Thread.sleep(5000);

		WebElement AddAssetClick = driver.findElement(By.xpath("//a[contains(@class,'btn  btn-primary btn-default')]"));	AddAssetClick.click();
		Thread.sleep(5000);

		WebElement Submit=driver.findElement(By.xpath("//button[contains(@class,'btn  btn-primary')]")); Submit.click();
		WebElement Cancel=driver.findElement(By.xpath("//a[text()=' Cancel ']"));Cancel.click();

		Thread.sleep(3000);
		WebElement AddAssetClick1= driver.findElement(By.xpath("//a[contains(@class,'btn  btn-primary btn-default')]"));	AddAssetClick1.click();

		WebElement Name = driver.findElement(	By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_uyqd_name\"]"));	Name.sendKeys("Gideon");

		WebElement description13 = driver.findElement(By.xpath("//textarea[contains(@class,'field form-control')]"));	description13.sendKeys("How are you");

		WebElement Type11 = driver.findElement(	By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_uyqd_typeId\"]"));Select FavType = new Select(Type11);
		FavType.selectByValue("901");

		WebElement Brand12 = driver.findElement(	By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_uyqd_brandId\"]"));	Select FavBrand = new Select(Brand12);
		FavBrand.selectByVisibleText(" Acer ");

		WebElement SerialNo = driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_uyqd_serialNo\"]"));	SerialNo.sendKeys("10");

		WebElement RamSize = driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_uyqd_ramSize\"]"));RamSize.clear();
		WebElement RamSize1 = driver.findElement(	By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_uyqd_ramSize\"]"));	RamSize1.sendKeys("8Gp");

		WebElement StorgeSize = driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_uyqd_storageSize\"]"));	StorgeSize.clear();
		WebElement StorgeSize1 = driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_uyqd_storageSize\"]"));StorgeSize1.sendKeys("512Gp");

		WebElement StorgeType = driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_uyqd_storageType\"]"));StorgeType.sendKeys("Processor");

		WebElement OperatingSystem = driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_uyqd_operatingSystem\"]"));OperatingSystem.sendKeys("Windows");

		WebElement MACAddres = driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_uyqd_macAddress\"]"));MACAddres.sendKeys("123.0032");

		WebElement Processor3 = driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_uyqd_processorId\"]"));Select pross = new Select(Processor3);
		pross.selectByValue("905");

		WebElement DeviceOwner = driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_uyqd_deviceOwnership\"]"));	Select Owner = new Select(DeviceOwner);
		Owner.selectByVisibleText("  Personal");
		System.out.println("ok");


		Thread.sleep(3000);
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("window.scrollTo(0,document.body.scrollHeight)", " ");

		WebElement Active=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_uyqd_isActive\"]")); Active.click();
		WebElement Submit6=driver.findElement(By.xpath("//button[contains(@class,'btn  btn-primary')]")); Submit6.click();


		Thread.sleep(5000);
		WebElement Invalidnum=driver.findElement(By.xpath("//input[@id='_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_uyqd_keyword']"));
		Invalidnum.sendKeys("Car"+Keys.ENTER);

		Thread.sleep(5000);
		WebElement Invalidnum1=driver.findElement(By.xpath("//input[@id='_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_uyqd_keyword']"));
		Invalidnum1.clear();

		WebElement validnumber=driver.findElement(By.xpath("//input[@id='_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_uyqd_keyword']"));
		validnumber.sendKeys("Gideon"+Keys.ENTER);
		System.out.println("Ok");
		driver.navigate().refresh();

		Thread.sleep(3000);
		WebElement validnumber8=driver.findElement(By.xpath("//input[@id='_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_uyqd_keyword']"));
		validnumber8.sendKeys("Gideon"+Keys.ENTER);


		Thread.sleep(5000);
		WebElement Edite=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_uyqd_assetsSearchContainerSearchContainer\"]/div[1]/table/tbody/tr[1]/td[6]/a[1]/img"));
		Edite.click();

		Thread.sleep(4000);
		WebElement Name1 = driver.findElement(	By.xpath("//input[@id='_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_uyqd_name']"));
		Name1.clear();

		Thread.sleep(4000);
		WebElement Name2 = driver.findElement(	By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_uyqd_name\"]"));Name2.sendKeys("john");


		Thread.sleep(3000);
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("window.scrollTo(0,document.body.scrollHeight)", " ");

		WebElement SUMBIT=driver.findElement(By.xpath("//button[@class='btn  btn-primary']"));SUMBIT.click();
		Thread.sleep(3000);
		WebElement validnumber9=driver.findElement(By.xpath("//input[@id='_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_uyqd_keyword']"));
		validnumber9.clear();

		WebElement validnumber10=driver.findElement(By.xpath("//input[@id='_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_uyqd_keyword']"));
		validnumber10.sendKeys("john"+Keys.ENTER);

		Thread.sleep(4000);
		WebElement DeleteFun=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_uyqd_assetsSearchContainerSearchContainer\"]/div[1]/table/tbody/tr[1]/td[6]/a[2]/img"));
		DeleteFun.click();
		driver.switchTo().alert().dismiss();

		Thread.sleep(4000);
		WebElement DeleteFun1=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_uyqd_assetsSearchContainerSearchContainer\"]/div[1]/table/tbody/tr[9]/td[6]/a[2]/img"));
		DeleteFun1.click();
		driver.switchTo().alert().accept();
		System.out.println("Asset page is finished");

	}

}
