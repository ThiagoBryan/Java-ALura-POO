public class TestaLacos2 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			for(int k = 0; k  < 10; k++) {
				if(k > i) {
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}