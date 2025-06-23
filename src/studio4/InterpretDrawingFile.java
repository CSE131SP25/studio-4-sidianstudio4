package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double pOne = in.nextDouble();
		double pTwo = in.nextDouble();
		double pThree = in.nextDouble();
		double pFour = in.nextDouble();
		
		Color color = new Color(r, g, b);
		StdDraw.setPenColor(color);
		
		if (shape.equals("rectangle")) {
			if (isFilled) {
				StdDraw.filledRectangle(pOne,pTwo,pThree,pFour);
			}
			else {
				StdDraw.rectangle(pOne,pTwo,pThree,pFour);
			}
		}
		else if (shape.equals("ellipse")) {
			if (isFilled) {
				StdDraw.filledEllipse(pOne,pTwo,pThree,pFour);
			}
			else {
				StdDraw.ellipse(pOne,pTwo,pThree,pFour);

			}
		}
		
		
		
	}
}
