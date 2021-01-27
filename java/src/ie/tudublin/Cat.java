package ie.tudublin;

/* public class Cat extends Animal
{
    public Cat(String name, int numLives)
    {
        super(name);
        numLives = 9;
    }

   /*  private Cat(int numLives)
    {
        numLives = 9;
    } */
    
  /*   private Integer numLives;

    public static void kill() {
        if (numLives > 0) {
            numLives = numLives - 1;
            System.out.println("Ouch!");
        }

        if (numLives == 0) {
            System.out.println("Dead.");
        }

    }

    Cat ginger = new Cat("Ginger", 9);
 */ 
   /*  private void Integer(lives)
    {
        this.lives = lives;
    }
 */
   /*  private int (lives);
    private int lives;

    public Animal(int lives)
    {
        cat.lives = 9;
    }

    

    public void setLives(int lives)
    {
        lives = 9;
    }

    public Animal(int lives)
    {
        lives = 9;
    } */


//SOLUTION

public class Cat extends Animal
 {
     private int numLives;

     public Cat(String name)
     {
         super(name);
         numLives = 9;
     }

     void kill()
     {
         if (numLives > 0)
         {
             numLives --;
             System.out.println("Ouch!");
         }
         else
         {
             System.out.println("I am dead");
         }
     }

     public int getNumLives() {
         return numLives;
     }

     public void setNumLives(int numLives) {
         this.numLives = numLives;
     }
 } 