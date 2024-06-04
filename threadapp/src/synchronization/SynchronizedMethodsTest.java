package synchronization;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

class SynchronizedMethodsTest {

	@Test
	public void givenMultiThread_whenNonSyncMethod() throws InterruptedException {
		ExecutorService service = Executors.newFixedThreadPool(3);
		SynchronizedMethods summation = new SynchronizedMethods();
		IntStream.range(0, 1000).forEach(count -> service.submit(summation::calculate));
		service.awaitTermination(1000, TimeUnit.MILLISECONDS);
		assertEquals(1000, summation.getSum());
	}

}
