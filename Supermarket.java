public class Supermarket implements PersonQueue {

	private Person[] personArray;
	private int size;

	private static int INITIAL_ARRAY_SIZE = 5;

	public Supermarket() {
	  personArray = new Person[INITIAL_ARRAY_SIZE];
	  size = 0;
    }

	public void insert(Person person) {
		personArray[this.size] = person;
		this.size++;
	}

	public Person retrieve() {
		if (size > 0) {
			return personArray[0];
		} else {
			return null;
		}
	}

	public void addPerson(Person prs) {
		this.insert(prs);
	}

	public void servePerson() {
		Person person = retrieve();
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