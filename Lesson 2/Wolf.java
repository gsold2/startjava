public class Wolf {

	private String sex;
	private String name;
	private float waight;
	private int age;
	private String collor;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getWaight() {
		return waight;
	}

	public void setWaight(float waight) {
		this.waight = waight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 8) {
			System.out.println("Некорректный возраст");
		} else {
			this.age = age;
		}
	}

	public String getCollor() {
		return collor;
	}

	public void setCollor(String collor) {
		this.collor = collor;
	}

	public void go() {
		System.out.println("Да, иду я иду.");
	}

	public void sit() {
		System.out.println("Да, сижу я сижу.");
	}

	public void run() {
		System.out.println("Да, бегу я бегу.");
	}

	public Boolean howl() {
		System.out.println("А теперь повоем.");
		return true;
	}

	public void hunt() {
		System.out.println("Счастливой охоты.");
	}
}
