public class SupermarketQueueArray implements PersonQueue {

	private Person[] personArray;
	private int size;

	private static int INITIAL_ARRAY_SIZE = 5;

	public SupermarketQueueArray(){
		personArray = new Person[INITIAL_ARRAY_SIZE];
		size = 0;
	}

	public void insert(Person person) {
		if (isAlmostFull()) {
			reserveMoreMemory();
		}
		personArray[this.size] = person;
		this.size++;
	}

	public Person retrieve() {
		if (size > 0) {
			Person retPerson = personArray[0];
			moveQueueDown();
			return retPerson;
		} else {
			return null;
		}
	}

	private void moveQueueDown(){
		for (int x = 0;x < size;x++){
			personArray[x] = personArray[x+1];
		}
		personArray[size] = null;
		size--;
	}

	public int getSize(){
		return this.size;
	}

    private boolean isAlmostFull() {
	  if (personArray.length - size < 1) {
		return true;
	  } else {
		return false;
	  }
    }

    private void reserveMoreMemory() {
	  Person[] biggerArray = new Person[this.size*2];
	  for (int i = 0; i < this.size; i++) {
		biggerArray[i] = this.personArray[i];
	  }
	  this.personArray = biggerArray;
    }

}