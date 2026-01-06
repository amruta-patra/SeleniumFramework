package rahulshettyacademy.TestComponents;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	int count = 0;
	int maxTry = 3;
	
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(count<maxTry)
		{
			count++;
			System.out.println("Retrying " + result.getName() +
					" | Retry count: " + count);
			return true; // re-run immediately
		}
		return false;
	}

	/*private static final int MAX_RETRY = 3; // number of retries
	private ThreadLocal<Integer> retryCount =
			ThreadLocal.withInitial(() -> 0);

	@Override
	public boolean retry(ITestResult result) {

		int currentRetry = retryCount.get();

		System.out.println(
				"Executing " + result.getName() +
						" | Attempt: " + (currentRetry + 1)
		);

		if (currentRetry < MAX_RETRY) {
			System.out.println("Retrying " + result.getName() +
					" | Retry count: " + retryCount);
			retryCount.set(currentRetry + 1);
			return true; // immediate retry
		}

		retryCount.remove(); // cleanup
		return false;
	}*/
}
