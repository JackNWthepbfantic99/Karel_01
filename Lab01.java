/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Your Name here>  // replace <...> with your name
* @version <date/of/completion> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab01 {

     public static void main(String[] args) {
     Display.openWorld("maps/school.map");    
  Display.setSize(10, 10);
  Display.setSpeed(3);     
  Robot lisa = new Robot();
  Robot ricky = new Robot(4, 5, Display.SOUTH, 0);
  lisa.move();
  lisa.move();
  lisa.turnLeft();
  lisa.move();
  lisa.turnLeft();
  lisa.move();
  lisa.pickBeeper();
  lisa.turnLeft();
  lisa.turnLeft();
  lisa.move();
  lisa.turnLeft();
  lisa.turnLeft();
  lisa.turnLeft();
  lisa.move();
  lisa.turnLeft();
  lisa.move();
  lisa.move();
  lisa.move();
  lisa.turnLeft();
  lisa.move();
  lisa.move();
  lisa.move();
  lisa.turnLeft();
  lisa.move();
  lisa.move();
  lisa.turnLeft();
  lisa.turnLeft();
  lisa.turnLeft();
  lisa.move();
  lisa.putBeeper();
  ricky.pickBeeper();
  ricky.move();
  ricky.turnLeft();
  ricky.move();
  ricky.move();
  ricky.turnLeft();
  ricky.move();
  ricky.move();
  ricky.turnLeft();
  ricky.turnLeft();
  ricky.turnLeft();
  ricky.move();
  ricky.move();
  ricky.turnLeft();
  ricky.move();
  ricky.turnLeft();
  ricky.move();
  ricky.move();
  ricky.turnLeft();
  ricky.turnLeft();
  ricky.turnLeft();
  ricky.move();
  ricky.move();
  ricky.turnLeft();
  ricky.move();
  ricky.move();
  ricky.putBeeper();
  ricky.turnLeft();
  ricky.turnLeft();
  ricky.move();
  
   }
}
