class Person {
	private int age;
	private String name;
	private Person nextPerson;
	private Person prevPerson;

	public Person(int newAge, String newName){
		this.age = newAge;
		this.name = newName;
		this.nextPerson = null;
		this.prevPerson = null;
	}

	public String personName(){
		return this.name;
	}

	public int personAge(){
		return this.age;
	}

	public Person getNextPerson(){
		return this.nextPerson;
	}

	public void setNextPerson(Person prs){
		this.nextPerson = prs;
	}

	public Person getPrevPerson(){
		return this.prevPerson;
	}
}