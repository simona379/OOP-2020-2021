package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet 
{
    
    public void settings()
	{
		// If you want to use the width and 
		// height built in variables, they have to be after settings 
		// is called
		size(500, 500);
    }
    
    public void setup() 
    {
   //Make fields of type float in the BugZap class for playerX, playerY and playerWidth and give these default values. 
/*         float playerX = height;
        float playerY = width;
        float playerWidth = width; */
        playerX = 230;
        playerY = 400;
        playerWidth = 270;
        playerHeight = 50;

    }

  /*   float playerX = 20;
    float playerY = 20;
    float playerWidth = width/5;
    float playerHeight = width/5;

 */

    float playerX, playerY, playerWidth, playerHeight;


    //Write a method that draws the player character (float h)
    public void drawPlayer(float x, float y, float w, float h)
    {
       // ellipse(x, height / 2, mouseX, mouseY);
       //triangle(x, y, 58, 20, w, h);
       line(x, y, w, y);
    }
    

    public void draw() 
    {
        this.drawPlayer(playerX, playerY, playerWidth, playerHeight);

    }

    //methods to get the player moving in response to the keys
    public void keyPressed()
	{
		if (keyCode == LEFT)
		{
            //System.out.println(playerX);
            //System.out.println("Left arrow pressed");
            playerX--;
           
            //System.out.println(playerX);
		}
		if (keyCode == RIGHT)
		{
            //System.out.println(playerX);
            //System.out.println("Right arrow pressed");
            
            playerX++;
            //System.out.println(playerX);
		}
		if (key == ' ')
		{
			System.out.println("SPACE key pressed");
		}
	}	




}
