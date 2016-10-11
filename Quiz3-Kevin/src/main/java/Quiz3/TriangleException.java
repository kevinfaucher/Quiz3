package Quiz3;

import java.io.*;

public class TriangleException extends Exception {

	private double triA;

	public TriangleException(double triA) {

		this.triA = triA;

	}

	public double getA() {
		return triA;
	}

}