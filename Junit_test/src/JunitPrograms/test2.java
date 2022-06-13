package JunitPrograms;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class test2 {
	@BeforeAll
	static void setup(){
		System.out.println("@BeforeAll executed");
	}

	@BeforeEach
	void setupThis(){
		System.out.println("@BeforeEach executed");
	}
	@AfterEach
	void tearThis(){
		System.out.println("@AfterEach executed");
	}

	@AfterAll
	static void tear(){
		System.out.println("@AfterAll executed");
	}

}
