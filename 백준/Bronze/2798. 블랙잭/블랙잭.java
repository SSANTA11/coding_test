
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfCards = sc.nextInt();
		int target = sc.nextInt();
		int cards[] = new int[numberOfCards];
		int max = 0;
		for (int i = 0; i < numberOfCards; i++) {
			cards[i] = sc.nextInt();
		}
		for (int i = 0; i < numberOfCards - 2; i++) {
			for (int j = i + 1; j < numberOfCards - 1; j++) {
				for (int k = j + 1; k < numberOfCards; k++) {
					int temp = cards[i] + cards[j] + cards[k];
					if (max < temp && target >= temp) {
						max = temp;
					}
				}
			}
		}
		System.out.println(max);
		sc.close();
	}
}
