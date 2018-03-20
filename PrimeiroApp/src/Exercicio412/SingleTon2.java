package Exercicio412;

public class SingleTon2 {

	private static SingleTon2 sg2;

	private SingleTon2() {

	}

	public static SingleTon2 getSingleTon2() {
		if (SingleTon2.sg2 == null)
			SingleTon2.sg2 = new SingleTon2();
		return SingleTon2.sg2;
	}
}
