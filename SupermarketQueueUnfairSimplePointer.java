public class SupermarketQueuePointer implements PersonQueue {

	private Person firstPerson;
	private Person lastPerson;
	private Person oldestPerson;
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
			oldestPerson = person;
		}
		else {
			lastPerson.setNextPerson(person);
			lastPerson = person;

			if (person.personAge() > oldestPerson.personAge()){
				oldestPerson = person;
			}
		}
		size++;
	}

	public Person retrieve() {
		Person retPerson = oldestPerson;

		retPerson.nextPerson().prevPerson() = retPerson.nextPerson();
		retPerson.prevPerson().nextPerson() = retPerson.prevPerson();
		size--;

		oldestPerson = firstPerson;
		Person tmpPerson = firstPerson.getNextPerson();

		while (tmpPerson != null){
			if (tmpPerson.personAge > oldestPerson.personAge){
				oldestPerson = tmpPerson;
			}
			tmpPerson = tmpPerson.getNextPerson();
		}
		return retPerson;
	}

	public int getSize(){
		return this.size;
	}
}