
public class Test {
	public static void main(String[] args) {
		Person taro = new Person();
		
		taro.name ="taro";
		taro.age =18;
		System.out.println(taro.name);
		System.out.println(taro.age);
		
		
		Person jiro = new Person("jiro",20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		
		
		Person a =new Person("saburo");
		System.out.println(a.name);
		System.out.println(a.age);
		
		Person b = new Person(25);
		System.out.println(b.name);
		System.out.println(b.age);
		
		Person c = new Person("hanako",17);
		System.out.println(c.name);
		System.out.println(c.age);
	}
}
