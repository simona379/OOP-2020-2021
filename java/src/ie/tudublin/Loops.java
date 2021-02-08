package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet {

    //500px x 500px of program window
    public void settings() {
        size(500, 500);
        cx = width / 2;
        cy = height / 2;        
    }

    int mode = 0;

    float cx;
    float cy;

    public void keyPressed() {
        // the value of mode will be the number of the 
        // number key pressed
        if (keyCode >= '0' && keyCode <= '9')
            mode = keyCode - '0';
    }

    //hue (0-255), saturation (0 : black, 255: white), brightness = 3 numbers
    public void setup() {
        colorMode(HSB);
    }

    //draw method
    public void draw() {
        //balck
        background(0);
        noStroke();
        switch (mode)
        {
            case 0:
            {
                //drawing circle
                //ellipse(cx, cy, 100, 100);
                //cx = width/2
                fill(50, 255, 255);
                if (mouseX < cx)
                {
                    rect(0, 0, cx, height);
                }
                else
                {
                    rect(cx, 0, cx, height);
                }

            }
            break;

            case 1:
            {
                fill(50, 255, 255);
/*                 if (mouseY > cy && mouseX < cx)
                {
                    rect(0, 0, cx, cy);
                }
                else 
                {
                    rect(cx, 0, cx, cy);
                } */
                //solution:
                if (mouseX < cx && mouseY < cy)
                {
                    rect(0, 0, cx, cy);
                }
                else if (mouseX > cx && mouseY < cy)
                {
                    rect(cx, 0, cx, cy);
                }
                // had this bit below
                else if (mouseY > cy && mouseX < cx)
                {
                    rect(0, cy, cx, cy);
                }
                else
                {
                    rect(cx, cy, cx, cy);
                }
            }
            break;
              /*   case 1:
                    fill(50, 255, 255);
                    if ((mouseX < cx) && (mouseY < cy))
                    {
                        rect(0, 0, cx, cy);
                    }
                    else
                    {
                        rect(cx, 0, cx, cy);
                    }
                break; */
            
            case 2:
            {
                //for loops
                //int numRects = (int) (mouseX / 10.0f);
                int numRects = 10;
                //initializing and calculation
                float w = width / (float) numRects;
                //cgap works as a gradient
                float cgap = 255 / (float) numRects;
                for(int i = 0 ; i < numRects ; i ++)
                {

                    fill(i * cgap, 255, 255);
                    rect(i * w, 0, w, height);
                }
            }
            break;

          /*   case 3:
                int numCirc = 10;
                float ww = width / (float) numCirc;
                float ccgap = 255 / (float) numCirc;
                for (int i = 0 ; i < numCirc ; i++)
                {
                    fill(i * ccgap, 255, 255);
                    ellipse(i * ww, 0, ww, height);
                }
            break;

            case 6:

            break;
 */

            case 3:
            {
                int numCircles = (int)(mouseX / 10.0f);
                float w = width / (float) numCircles;
                float cgap = 255 / (float) numCircles;
                for(int i = 0 ; i < numCircles ; i ++)
                {
                    fill(cgap * i, 255, 255);
                    ellipse(w / 2 + (i * w), cy, w, w);
                }
            }
        }
    }
}
