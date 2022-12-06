package javaCore.t3t3t13;


/*На игровом поле находится робот. Позиция робота на поле описывается двумя целочисленным координатами:
        X и Y. Ось X смотрит слева направо, ось Y - снизу вверх. (Помните, как рисовали графики
        функций в школе?)
        В начальный момент робот находится в некоторой позиции на поле. Также известно,
        куда робот смотрит: вверх, вниз, направо или налево. Ваша задача — привести робота в
        заданную точку игрового поля.

        Робот описывается классом Robot. Вы можете пользоваться следующими его методами
        (реализация вам неизвестна):*/

public class Robot {

    private int x;
    private int y;
    Direction dir = Direction.UP;

    public static void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {
            if (robot.getDirection() != Direction.RIGHT) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();//Твой код здесь
                }
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        if (robot.getX() > toX) {
            if (robot.getDirection() != Direction.LEFT) {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnRight();//Твой код здесь
                }
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        if (robot.getY() < toY) {
            if (robot.getDirection() != Direction.UP) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();//Твой код здесь
                }
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }

        if (robot.getY() > toY) {
            if (robot.getDirection() != Direction.DOWN) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnRight();//Твой код здесь
                }
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }

    }

    public Direction getDirection() {
        return this.dir;// текущее направление взгляда
    }

    public int getX() {
        return this.x;// текущая координата X
    }

    public int getY() {
        return this.y;// текущая координата X
    }

    public void turnLeft() {
        if (this.dir == Direction.LEFT) {
            this.dir = Direction.DOWN;
        } else if (this.dir == Direction.DOWN) {
            this.dir = Direction.RIGHT;
        } else if (this.dir == Direction.RIGHT) {
            this.dir = Direction.UP;
        } else if (this.dir == Direction.UP) {
            this.dir = Direction.LEFT;
        }
    }

    public void turnRight() {
        if (this.dir == Direction.LEFT) {
            this.dir = Direction.UP;
        } else if (this.dir == Direction.DOWN) {
            this.dir = Direction.LEFT;
        } else if (this.dir == Direction.RIGHT) {
            this.dir = Direction.DOWN;
        } else if (this.dir == Direction.UP) {
            this.dir = Direction.RIGHT;
        }// повернуться на 90 градусов по часовой стрелке
    }

    public void stepForward() {
        if (this.dir == Direction.UP) {
            y++;// шаг в направлении взгляда
        } else if (dir == Direction.RIGHT) {
            x++;
        } else if (dir == Direction.DOWN) {
            y--;
        } else if (dir == Direction.LEFT) {
            x--;
        }
        // за один шаг робот изменяет одну свою координату на единицу
    }

    public static void main(String[] args) {

        Robot robot = new Robot();
        Robot.moveRobot(robot, 10, 10);

        System.out.println(robot.getX() + " " + robot.getY());
    }
}
