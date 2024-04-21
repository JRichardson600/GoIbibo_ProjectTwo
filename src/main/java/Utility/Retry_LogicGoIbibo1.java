package Utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_LogicGoIbibo1 implements IRetryAnalyzer {

	int retry = 3;
	int count = 0;

	@Override
	public boolean retry(ITestResult result) {

		if (count < retry) {
			count++;
			return true;
		}

		return false;
	}

}