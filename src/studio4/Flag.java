package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {

		//blue background
		StdDraw.setPenColor(117, 170,219 );
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.5);

		//white lines
		StdDraw.setPenColor(255,255,255);
		StdDraw.filledRectangle(0.5, 0.65, 0.5, 0.025);

		StdDraw.setPenColor(255,255,255);
		StdDraw.filledRectangle(0.5, 0.35, 0.5, 0.025);

		// Black line
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.13);
		
	}
}