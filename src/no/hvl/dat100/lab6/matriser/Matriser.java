package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		
		for (int[] tabell : matrise) {
			for (int tall : tabell) {
				System.out.print(tall );
			}
			System.out.println();
		}
		
		// TODO
//		throw new UnsupportedOperationException("skrivUt ikke implementert");
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		String gruppe = "";
		
		for (int[] tabell : matrise) {
			for (int tall : tabell) {
				gruppe += tall + " ";
			}
			gruppe += "\n";
		}
		return gruppe;

		// TODO
		//throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int [][]Ny = new int [matrise.length][];
		
		for (int x = 0; x < matrise.length; x++) {
			Ny[x] = new int [matrise[x].length];
			
			for (int k = 0; k < matrise.length; k++) {
				Ny[x][k] = matrise[x][k] * tall;
				
			}	
		}
		return Ny;
		
		// TODO
		//throw new UnsupportedOperationException("skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		
		
		
		for (int x = 0; x < a.length; x++) {
			
			for (int k = 0; k < b.length; k++) {
				
				if (a[x][k] != b[x][k]) {
					
					return false;
				}
		
				
			
			}
		}
			return true;
			

		// TODO
		//throw new UnsupportedOperationException("erLik ikke implementert");
	
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
