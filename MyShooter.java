package prog;

import robocode.HitByBulletEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;

public class MyShooter extends Robot {



    public void run() {

    setAdjustRadarForGunTurn(true);
    getInPosition();
    while(true)
        turnRadarLeft(360);


    }


    public void onScannedRobot(ScannedRobotEvent event) {
        double sd = event.getDistance();
        double sb = event.getBearing();
        double sh = event.getHeading();






    }

    public void onHitByBullet(HitByBulletEvent event) {

    }

    private void getInPosition(){
        double y = getBattleFieldHeight();
        double x = getBattleFieldWidth();

        if (getHeading()>180) {
            turnRight(180-getHeading() );
        }
        else {
            turnLeft(180+getHeading());
        }

        ahead(getY());
        if (getX()>x/2) {
            turnRight(90);
            ahead(getX()-x/2);
            System.out.println(getX()/2-x);

        }
        else {
            turnLeft(90);
            ahead(x/2-getX());
        }
        turnGunLeft(90);
        fire(3);



    }
}
