package AssetManagementProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.Enter;

public class AssetPage {

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

		Thread.sleep(5000);
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


		Thread.sleep(5000);
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
		System.out.println("Next");
		WebElement SUMBIT1=driver.findElement(By.xpath("//button[@class='btn  btn-primary']"));SUMBIT1.click();

		Thread.sleep(4000);
		WebElement DeleteFun=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_uyqd_assetsSearchContainerSearchContainer\"]/div[1]/table/tbody/tr[1]/td[6]/a[2]/img"));
		DeleteFun.click();
		driver.switchTo().alert().accept();

//		Thread.sleep(5000);
//		WebElement DeleteFun1=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_uyqd_assetsSearchContainerSearchContainer\"]/div[1]/table/tbody/tr[6]/td[6]/a[2]/img"));
//		DeleteFun1.click();
//		driver.switchTo().alert().accept();
		System.out.println("Asset page is finished");

//		WebElement AssetAllocation=driver.findElement(By.xpath("//a[text()='Asset Allocation']")); AssetAllocation.click();
//		Thread.sleep(5000);
//
//		WebElement AssetAllocationbutton=driver.findElement(By.xpath("//a[text()='Add AssetAllocation']")); AssetAllocationbutton.click();
//		Actions Build=new Actions(driver);
//
//		Build.moveToElement(AssetAllocationbutton).perform();
//
//		WebElement consultant=driver.findElement(By.xpath("//a[text()='Consultant']")); consultant.click();
//
//		Thread.sleep(5000);
//		WebElement ClickSubmitButton=driver.findElement(By.xpath("//button[@class='btn  btn-primary']"));ClickSubmitButton.click();
//
//		Thread.sleep(3000);
		//WebElement Clickthecancelbutton=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_krqe_assetAllocationForm\"]/a"));
		//Clickthecancelbutton.click();

		//Thread.sleep(4000);
		//WebElement AssetAllocation4=driver.findElement(By.xpath("//a[text()='Asset Allocation']")); AssetAllocation4.click();
		//Thread.sleep(5000);

		//		WebElement AssetAllocationbutton1=driver.findElement(By.xpath("//a[text()='Add AssetAllocation']")); AssetAllocationbutton1.click();
		//		Actions Build10=new Actions(driver);
		//
		//		Thread.sleep(3000);
		//		Build10.moveToElement(AssetAllocationbutton).perform();
		//		Thread.sleep(5000);
		//		
		//		WebElement Consultant=driver.findElement(By.xpath("//a[text()='Consultant']")); Consultant.click();

	
		WebElement consultantname=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_krqe_employeeId\"]")); consultantname.click();

//		WebElement consultantname1=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_krqe_employeeId\"]"));
//		Select Favnamne1=new Select(consultantname1);
//		Favnamne1.selectByVisibleText(" Dawid Malan"); 
//
//
//		WebElement Assetname=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_krqe_assetId\"]")); Assetname.click();
//		WebElement Assetname2=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_krqe_assetId\"]")); Select Favlap=new Select(Assetname2);
//		Favlap.selectByVisibleText(" MAC");
//
//		WebElement From=driver.findElement(By.xpath("//input[@id='_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_krqe_from']"));From.click();
//		WebElement From1=driver.findElement(By.xpath("//input[@id='_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_krqe_from']"));From1.sendKeys(Keys.ENTER);
//
//		WebElement To=driver.findElement(By.xpath("//input[@id='_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_krqe_to']"));To.click();
//		WebElement To1=driver.findElement(By.xpath("//input[@id='_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_krqe_to']"));To1.sendKeys(Keys.ENTER);
//
//
//		WebElement Remark=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_krqe_remark\"]")); Remark.sendKeys("asdfghjkl");
//		WebElement Sumbit1=driver.findElement(By.xpath("//span[text()='Submit']")); Sumbit1.click();
//
//		Thread.sleep(4000);
//		WebElement Editeiconbutton=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_krqe_employeeAssetsSearchContainerSearchContainer\"]/div[1]/table/tbody/tr[1]/td[7]/a[1]/img"));
//		Editeiconbutton.click();
//
//		WebElement consultantname2=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_krqe_employeeId\"]"));
//		consultantname2.clear();
//
//		WebElement consultantname3=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_krqe_employeeId\"]"));
//		Select Favnamne2=new Select(consultantname1);
//		Favnamne2.selectByVisibleText("JP Duminy"); 
//		WebElement Sumbit2=driver.findElement(By.xpath("//span[text()='Submit']")); Sumbit2.click();
//
//		Thread.sleep(2000);
//		WebElement Assetdelete=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_krqe_employeeAssetsSearchContainerSearchContainer\"]/div[1]/table/tbody/tr[3]/td[7]/a[2]/img"));
//		Assetdelete.click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().dismiss();
//		WebElement Assetdelete1=driver.findElement(By.xpath("//*[@id=\"_com_resourcemanagement_asset_AssetManagementPortlet_INSTANCE_krqe_employeeAssetsSearchContainerSearchContainer\"]/div[1]/table/tbody/tr[3]/td[7]/a[2]/img"));
//		Assetdelete1.click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();


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
