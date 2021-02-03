package ie.tudublin;

import ddf.minim.analysis.TriangularWindow;
import processing.core.PApplet;

public class HelloProcessing2 extends PApplet
{

	//first code to be executed
	public void settings()
	{
		size(500, 500);
	}
	//second method to get excecuted
	public void setup() {
		
	}
	//draw gets called 60 times a second
	public void draw()
	{	
		background(255, 0, 0);

		noStroke();	
		fill(255, 255, 0);
		ellipse(250, 350, 300, 300);

		fill(51, 204, 255);
		triangle(120, 345, 260, 90, 400, 345);

		/* background(0); //black
		stroke(255); //pen coloour
		//stroke(0, 255, 0);
		line(10, 10, 100, 100); //x1, y1, x2, y2
		//line(); //four parameters

		noStroke();	

		//circle
		ellipse(200,200, 100, 50); //cx, cy, w, h


		fill(0, 0, 255);
		//rectangle
		rect(20, 100, 70, 90); //
		point(200, 60);

		fill(0, 255, 255);
		triangle(200, 90, 300, 200, 10, 60);

		//draw text to screen
		fill(0);
		text("Hello World!", 300, 300);
 */
	}
}
