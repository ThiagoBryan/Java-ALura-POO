
public class TestaSomatoria {

	public static void main(String[] args) {
		System.out.println("Soma");
		
		Integer contador = 0;
		Integer total = 0;
		
		while(contador <= 10) {
			total += contador;
			System.out.println(total);
			contador++;
		}
		System.out.println("Total: " + total);
	}
}
