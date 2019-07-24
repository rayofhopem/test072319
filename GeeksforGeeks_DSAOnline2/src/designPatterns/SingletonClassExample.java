package designPatterns;


public class SingletonClassExample {

	private static SingletonClassExample singletonInstance = null;
	String str;

	private SingletonClassExample() {
		str = "Hello World";
	}

	public static SingletonClassExample getInstance()

	{
		if (singletonInstance == null)
			singletonInstance = new SingletonClassExample();
		return singletonInstance;

	}

	public static void main(String[] args) {
		SingletonClassExample x = SingletonClassExample.getInstance();
		SingletonClassExample y = SingletonClassExample.getInstance();
		SingletonClassExample z = SingletonClassExample.getInstance();

		x.str = (x.str).toLowerCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
	}

}
