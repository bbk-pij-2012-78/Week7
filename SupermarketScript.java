public class SupermarketScript {

    public static void main(String[] args) {
	  SupermarketScript script = new SupermarketScript();
	  script.launch();
    }

    public void launch() {
		PersonQueue sup = new Supermarket();
		Person person = new Person();
		person.name = "Nick Sutton";
		person.age = 34;

		sup.addPerson(person);
		System.out.println(sup.getSize());
    }

}