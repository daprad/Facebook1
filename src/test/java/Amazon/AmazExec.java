package Amazon;

import org.testng.annotations.Test;

public class AmazExec extends AmazeBase {
	
	@Test
	public static void ProductBooking() throws InterruptedException {
		bLaunch();
	    printURL();
	    title();
	    credentialsOne();
	    credentialsTwo();
	    searchProduct();
	    prod();
	    wh();
	}
}
