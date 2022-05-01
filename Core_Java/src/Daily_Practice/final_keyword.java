package Daily_Practice;

class car {
	final void driving() {
		System.out.println("In car adding the accelarate feature");
	}
}

class suzuki extends car {
	final void acfeature() {
		System.out.println("updated feature in suzuki car");
	}

}

public class final_keyword {
	public static void main(String[] args) {

		suzuki s = new suzuki();
		s.driving();
		s.acfeature();
	

	}

}
