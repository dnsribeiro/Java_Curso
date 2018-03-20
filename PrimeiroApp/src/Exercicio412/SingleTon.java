package Exercicio412;

public final class SingleTon {

	private static final SingleTon sg = new SingleTon();

	private SingleTon() {

	}

	public static SingleTon getSingleTon() {		
		return SingleTon.sg;
	}
}
