package com.company;

public class Main {
    enum Direction {
        UP, DOWN, LEFT, RIGHT
    }
    public static void main(String[] args)
    {
        class Robot {
            int X, Y;
            Direction dir;

            Robot(int x, int y, Direction d) {
                X = x;
                Y = y;
                dir = d;
            }

            void rotateLeft() {
                switch (dir) {
                    case UP: {
                        dir = Direction.LEFT;
                        break;
                    }
                    case DOWN: {
                        dir = Direction.RIGHT;
                        break;
                    }
                    case LEFT: {
                        dir = Direction.DOWN;
                        break;
                    }
                    case RIGHT: {
                        dir = Direction.UP;
                        break;
                    }
                }
            }

            void rotateRight() {
                switch (dir) {
                    case UP: {
                        dir = Direction.RIGHT;
                        break;
                    }
                    case DOWN: {
                        dir = Direction.LEFT;
                        break;
                    }
                    case LEFT: {
                        dir = Direction.UP;
                        break;
                    }
                    case RIGHT: {
                        dir = Direction.DOWN;
                        break;
                    }
                }
            }

            void stepForward() {
                switch (dir) {
                    case UP: {
                        Y++;
                        break;
                    }
                    case DOWN: {
                        Y--;
                        break;
                    }
                    case LEFT: {
                        X--;
                        break;
                    }
                    case RIGHT: {
                        X++;
                        break;
                    }

                }
            }

            void moveRobot(Robot robot, int toX, int toY) {
                int x = X, y = Y;
                if (toX<x)
                {
                    while (robot.dir != Direction.LEFT)
                        robot.rotateRight();
                    while (robot.X != toX)
                        robot.stepForward();
                }
                else if (toX>x)
                {
                    while (robot.dir !=Direction.RIGHT)
                        robot.rotateRight();
                    while (robot.X != toX)
                        robot.stepForward();
                }
                if (toY<y)
                {
                    while (robot.dir !=Direction.DOWN)
                        robot.rotateRight();
                    while (robot.Y !=toY)
                        robot.stepForward();
                }
                else if (toY>y)
                {
                    while (robot.dir !=Direction.UP)
                        robot.rotateRight();
                    while (robot.Y!=toY)
                        robot.stepForward();
                }
            }
        }
        // write your code here
        Robot r = new Robot(0, 0, Direction.DOWN);
        r.stepForward();
        r.rotateLeft();
        r.stepForward();
        r.rotateRight();
        r.stepForward();
        System.out.println(r.X + "  " + r.Y);
        r.moveRobot(r, 2, 3);
        System.out.println(r.X + "  " + r.Y);
    }
}
