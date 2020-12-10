package prog;

import robocode.*;


public class TargetBot extends Robot {

    public void run() {
        double y = getBattleFieldHeight();
        double x = getBattleFieldWidth();

        if (getHeading()>180) {
            turnRight(360-getHeading() );
        }
        else {
            turnLeft(getHeading());
        }
        System.out.println(getHeading());
        ahead(y/2-getY());
        if (getX()<x/2)
            turnRight(90);
        else
            turnLeft(90);
        ahead(getY()-y);
        while (true){
            turnLeft(180);
            ahead(y);
        }
    }
}
