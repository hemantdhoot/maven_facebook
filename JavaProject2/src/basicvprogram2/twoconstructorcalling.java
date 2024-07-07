package basicvprogram2;
class oneconstructorcalling {
	oneconstructorcalling() {
		System.out.println("1");
	}
}

public class twoconstructorcalling {
	twoconstructorcalling()
	{
		System.out.println("2");
	}
	

	public static void main(String[] args) {
		System.out.println("ram");
		new twoconstructorcalling();
		new oneconstructorcalling();

	}

}
