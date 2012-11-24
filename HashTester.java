public class HashTester {

    public static void main(String[] args) {
	  	printHashCode("This is a test string");
	  	printHashCode("HashUtilities");
	  	printHashCode("Clustered");
	  	printHashCode("Kensington");
    }

    private static void printHashCode(String str) {
		HashUtilities hu = new HashUtilities();
		System.out.println(hu.shortHash(str.hashCode()));
	}

}