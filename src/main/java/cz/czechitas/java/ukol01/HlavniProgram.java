package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {
    Turtle zofka = new Turtle();
    public void start() {


        //TODO implementace domácího úkolu


        nakresliPrasatko(200,200);
    }

    private void nakresliPrasatko(double x,double y) {
        zofka.setLocation(x, y);
        zofka.turnLeft(90);

        for (int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnLeft(90);
        }
        zofka.move(100);
        zofka.turnLeft(45);
        zofka.move(70.7);
        zofka.turnLeft(90);
        zofka.move(70.7);
        zofka.turnLeft(45);
        zofka.move(20);
        double predniNohyX = zofka.getX();
        double predniNohyY = zofka.getY();
        zofka.turnRight(120);
        zofka.move(40);
        zofka.setLocation(predniNohyX, predniNohyY);
        zofka.turnLeft(60);
        zofka.move(40);
        zofka.setLocation(predniNohyX, predniNohyY);
        zofka.turnLeft(60);
        zofka.move(70);
        double zadniNohyX = zofka.getX();
        double zadniNohyY = zofka.getY();
        zofka.turnRight(120);
        zofka.move(40);
        zofka.setLocation(zadniNohyX, zadniNohyY);
        zofka.turnLeft(60);
        zofka.move(40);
        zofka.turnLeft(150);

}

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
