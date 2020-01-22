public class WolfTest {
	public static void main(String[] args) {

		Wolf MyWolf = new Wolf();
		MyWolf.setSex("Man");
		MyWolf.setName("Lucky");
		MyWolf.setWaight(80f);
		MyWolf.setAge(6);
		MyWolf.setCollor("black");

		System.out.println("Пол " + MyWolf.getSex());
		System.out.println("Имя " + MyWolf.getName());
		System.out.println("Вес " + MyWolf.getWaight());
		System.out.println("Возраст " + MyWolf.getAge());
		System.out.println("Цвет " + MyWolf.getCollor());

		MyWolf.go();
		MyWolf.sit();
		MyWolf.run();
		MyWolf.howl();
		MyWolf.hunt();
		System.out.println(MyWolf.howl());

	}
}
