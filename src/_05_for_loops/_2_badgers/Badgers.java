package _05_for_loops._2_badgers;

public class Badgers {
	public static void main(String[] args) {
		for (int y = 0; y<2; y++) {
			for (int i = 0; i<10; i ++) {
				System.out.print("Badger");
				if (i !=9) {
					System.out.print(", ");
				}
			
			}
			System.out.println();
			for (int i = 0; i<2; i ++) {
				System.out.print("Mushroom");
				if (i !=1) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}
		System.out.println("A Snake!!!");






	}
}
