/*
package javaCore.t4t2t8;

public class TestRobot {

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {

        RobotConnection robotConnection = null;
        for (int i = 0; i <= 3; i++) {
            if (i == 3) {
                throw e;
            }
            try {
                robotConnection = robotConnectionManager.getConnection();
                robotConnection.moveRobotTo(3, 3);
                return;
            } catch (RobotConnectionException e) {
                continue;
            } finally {
                if (robotConnection != null) {
                    try {
                        robotConnection.close();
                    } catch (Exception e) {

                    }

                }
            }
        }
    }
}
*/
