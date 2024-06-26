package AssetManagementProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FurnituresPage {

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
		WebElement Furnitures=driver.findElement(By.xpath("//a[text()='Furnitures and Equipments']")); Furnitures.click();
		WebElement AddFurButton=driver.findElement(By.xpath("//a[text()=' Add Fur & Equip']")); AddFurButton.click();

		Thread.sleep(5000);
		WebElement FurnituresSumbit=driver.findElement(By.xpath("//button[@class='btn  btn-primary']"));FurnituresSumbit.click();

		WebElement FurnituresCancel=driver.findElement(By.xpath("//a[text()=' Cancel ']")); FurnituresCancel.click();
		Thread.sleep(3000);
		WebElement AddFurButton1=driver.findElement(By.xpath("//a[text()=' Add Fur & Equip']")); AddFurButton1.click();

		WebElement itemname=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_vaju_itemName\"]"));
		itemname.sendKeys("Apple");

		WebElement numofitem=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_vaju_numberOfItems\"]")); numofitem.clear();

		WebElement numofitem1=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_vaju_numberOfItems\"]")); numofitem1.sendKeys("3");

		WebElement Discarded=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_vaju_discardedItems\"]"));Discarded.clear();

		WebElement Discarded1=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_vaju_discardedItems\"]"));Discarded1.sendKeys("2");

		WebElement submit=driver.findElement(By.xpath("//button[contains(@class,'btn  btn-primary')]")); submit.click();

		Thread.sleep(3000);
		WebElement FurnituresEdit=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_vaju_assetFurnitureItemsSearchContainerSearchContainer\"]/div[1]/table/tbody/tr[5]/td[6]/a[1]/img"));
		FurnituresEdit.click();

		Thread.sleep(3000);
		WebElement itemname1=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_vaju_itemName\"]"));itemname1.clear();
		WebElement itemname2=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_vaju_itemName\"]"));itemname2.clear();
		itemname2.sendKeys("Vivo");

		WebElement Furnituressubmit=driver.findElement(By.xpath("//button[contains(@class,'btn  btn-primary')]")); Furnituressubmit.click();


		WebElement FurnituresDelete=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_vaju_assetFurnitureItemsSearchContainerSearchContainer\"]/div[1]/table/tbody/tr[5]/td[6]/a[2]/img"));
		FurnituresDelete.click();
		driver.switchTo().alert().dismiss();

		Thread.sleep(3000);
		WebElement FurnituerDelete2=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_vaju_assetFurnitureItemsSearchContainerSearchContainer\"]/div[1]/table/tbody/tr[5]/td[6]/a[2]/img"));
		FurnituerDelete2.click();
		driver.switchTo().alert().accept();
		System.out.println("Furniyures page is Finished");
		driver.quit();

	}

}
