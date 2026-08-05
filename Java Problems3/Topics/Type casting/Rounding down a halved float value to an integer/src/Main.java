import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		float number = scanner.nextFloat();
		int result = (int) Math.floor(number / 2);

		System.out.println(result);
	}
}