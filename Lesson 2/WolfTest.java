public class WolfTest {
	public static void main(String[] args) {
		Wolf myWolf = new Wolf();
		myWolf.setSex("Man");
		myWolf.setName("Lucky");
		myWolf.setWaight(80f);
		myWolf.setAge(6);
		myWolf.setCollor("black");

		System.out.println("Пол " + myWolf.getSex());
		System.out.println("Имя " + myWolf.getName());
		System.out.println("Вес " + myWolf.getWaight());
		System.out.println("Возраст " + myWolf.getAge());
		System.out.println("Цвет " + myWolf.getCollor());

		myWolf.go();
		myWolf.sit();
		myWolf.run();
		myWolf.howl();
		myWolf.hunt();
		System.out.println(myWolf.howl());
	}
}
