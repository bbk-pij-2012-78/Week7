public class SupermarketQueuePointer implements PersonQueue {

	private Person firstPerson;
	private Person lastPerson;
	private int size;

	public SupermarketQueuePointer() {
		firstPerson = null;
		lastPerson = null;
		size = 0;
	}

	public void insert(Person person) {
		if (firstPerson == null){
			firstPerson = person;
			lastPerson = person;
		}
		else {
			lastPerson.setNextPerson(person);
			lastPerson = person;
		}
		size++;
	}

	public Person retrieve() {
		Person tmpPerson = firstPerson;
		firstPerson = firstPerson.getNextPerson();
		size--;
		return tmpPerson;
	}

	public int getSize(){
		return this.size;
	}
}