package AssetManagementProject;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class InternalPortalReport {

	public static void main(String[] args) {
		ExtentSparkReporter  reporter=new ExtentSparkReporter("./TestReport.html");
	    ExtentReports extent=new ExtentReports();
	    extent.attachReporter(reporter);
	    ExtentTest test=extent.createTest("Tc001 - Search  AssetManagement ");
	    test.pass("Login page");
	    test.pass("Brand"); 
	    test.pass("Type");
	    test.pass("Processor");
	    test.pass("Asset");
	    test.pass("Furnitures");
	    extent.flush();

	}

}
