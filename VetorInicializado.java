

public class VetorInicializado {

	public static void main(String[] args) {
		int[] dias_meses = { 31, 28, 31, 30, 31, 30, 
				             31, 31, 30, 31, 30, 31 };
		/*
		System.out.println("Abril possui " + dias_meses[3] 
				+ " dias.");
		*/
		for (int i = 0; i < dias_meses.length; i++) {
			System.out.println(dias_meses[i]);
		}
	}

}
