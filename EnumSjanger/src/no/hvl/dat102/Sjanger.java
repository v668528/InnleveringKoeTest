package no.hvl.dat102;

public enum Sjanger {
	ACTION(0), DRAMA(1), HISTORY(2), SciFi(3);
	private int nr;

	private Sjanger(int n) { // Konstruktør
		this.nr = n;
	}

	public int getNr() {
		return nr;
	}

	public static Sjanger finnSjanger(int n) {
		Sjanger sjang = null;
		for (Sjanger sj : Sjanger.values()) {
			if (sj.nr == n) {
				sjang = sj;
				break;
			}
		}
		return sjang;
	}// metode

	public static Sjanger finnSjanger(String navn) {
		Sjanger sjang = null;
		for (Sjanger sj : Sjanger.values()) {
			if (sj.toString().equals(navn.toUpperCase())) {
				sjang = sj;
				break;
			}
		}
		return sjang;
	}// metode

}// class
