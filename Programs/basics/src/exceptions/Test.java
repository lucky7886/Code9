package exceptions;

import java.io.IOException;

public class Test {

	public void run() throws ServerException {

		int code = 1;
		if (code != 0) {
			//throw new IOException("could not connect to server");
			throw new ServerException("could not connect to server");
		
		}

		System.out.println("Running successfully");
	}

}
