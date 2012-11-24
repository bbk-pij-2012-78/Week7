import java.util.Random;

public class HashUtilities  {

	static int shortHash(int i) {
		Random rdm = new Random(i * System.currentTimeMillis());
		return rdm.nextInt(1000);
	}

}