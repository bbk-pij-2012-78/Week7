public class Supermarket {

	//private SupermarketQueueArray sq1;
	private SupermarketQueuePointer sq1;

	public Supermarket(){
		this.sq1 = new SupermarketQueuePointer();
	}

	public void addPerson(Person prs){
		this.sq1.insert(prs);
	}

	public Person servePerson(){
		return this.sq1.retrieve();
	}

	public int getQueueSize(){
		return this.sq1.getSize();
	}
}