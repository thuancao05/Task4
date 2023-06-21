package core;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onFinish(ITestContext result) {
        Log.info("End auto test");

    }

    @Override
    public void onStart(ITestContext result) {
        Log.info("Start auto test");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailure(ITestResult result) {
        Log.error("This test case failed: " + result.getName());

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("This test case skipped: " + result.getName());

    }

    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Log.info("This test case succeed: " + result.getName());

    }
}