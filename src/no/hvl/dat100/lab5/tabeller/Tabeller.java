package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		
		
		for (int x = 0; x < tabell.length; x++) {
			
			System.out.println(tabell[x]);
				
		}
	


		// TODO
//		throw new UnsupportedOperationException("skrivUt ikke implementert");

	}

	// b)
	public static String tilStreng(int[] tabell) {
		
		String printer = "[";
		
		if (tabell.length > 0 ) {
			
			for (int x = 0; x < tabell.length -1; x++) {
				printer += (tabell[x] + ",");
			}
			
		printer += (tabell[tabell.length -1]);
		
		}
		
		printer += "]";
		
		
		System.out.println(printer);
		
		return printer;
		
		
		
		
		// TODO
		//throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)
	public static int summer(int[] tabell) {
		
		int sum = 0;

//		for (int x = 0; x < tabell.length; x++) {
//			sum += tabell[x];
//					}
		
//		for (int x : tabell) {
//			sum += x;
//		}
		int x = 0;
		
		while (x < tabell.length) {
			sum += tabell[x];
			x++;
		}
		
		return sum;

		// TODO
		//throw new UnsupportedOperationException("summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		
		for (int l : tabell) {
			if (l == tall) return true;
		}
		
		return false;

		// TODO
		//throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		
		for (int l = 0; l < tabell.length; l++) {
			if (tall == tabell[l]) return l;
		}
		return -1;

		// TODO
		//throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {
		
		int[] Ny = new int[tabell.length];
		
		for (int l = 0; l < tabell.length; l++) {
			Ny [l] = tabell[tabell.length -1 -l];
		}
		
		return Ny;

		// TODO
		// throw new UnsupportedOperationException("reverser ikke implementert");
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		
		for (int l = 0; l < tabell.length -1; l++)  {
			if (tabell[l] > tabell[l +1]) return false;
		}
		
		return true;
		// TODO
		//throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		
		int[] Ny = new int[tabell1.length + tabell2.length];
		
		for (int x = 0; x < tabell1.length; ++x) {
			Ny[x] = tabell1[x];
		}
		
		for (int x = 0; x < tabell2.length; ++x) {
			Ny[tabell1.length +x] = tabell2[x];
		}

		return Ny;
		// TODO
		//throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
