package utils;
import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ExtentManager {

    public static ExtentReports extentReports;

    public static ExtentReports getReport() {

        if (extentReports == null) {

            ExtentSparkReporter sparkReporter =
                    new ExtentSparkReporter(
                            "test-output/ExtentReport.html"
                    );

            sparkReporter.config()
                    .setReportName("Automation Report");

            extentReports = new ExtentReports();

            extentReports.attachReporter(sparkReporter);
        }

        return extentReports;
    }
}
