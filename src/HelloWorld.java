import java.util.List;

public class HelloWorld {

	public static void main(String[] args) {
		var list = List.of("Hello", "World", "Java", "10");
		list.stream()
				.filter(s -> !"Java".equals(s) && !"10".equals(s))
				.forEach(System.out::println);
	}

}
