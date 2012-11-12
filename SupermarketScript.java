public class SupermarketScript {

    public static void main(String[] args) {
	  SupermarketScript script = new SupermarketScript();
	  script.launch();
    }

    public void launch() {
		Supermarket sup = new Supermarket();
		sup.addPerson(new Person(34, "Nick Sutton"));
		sup.addPerson(new Person(35, "John"));
		sup.addPerson(new Person(36, "Dave"));
		sup.addPerson(new Person(37, "Tim"));
		sup.addPerson(new Person(38, "Steve"));
		sup.addPerson(new Person(39, "Rob"));

		System.out.println("Queue Size: " + sup.getQueueSize());

		Person prs = null;
		while (sup.getQueueSize() > 0){
			prs = sup.servePerson();
			System.out.println("Person Served: " + prs.personName());
			System.out.println("Queue Size: " + sup.getQueueSize());
		}
    }

}