package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {
    Turtle zofka = new Turtle();

    public void start() {


        //TODO implementace domácího úkolu

/*
        nakresliPrasatko(200,50);
        nakresliMnohouhelnik(600,200);
        nakresliKolecko(800,200);
        nakresliSlunicko(1000, 200);

 */

        nakresliSlunicko(200, 100);
        nakresliDomek(200, 400);
        nakresliDomek(350, 400);
        nakresliDomek(500, 400);
        nakresliDomek(650, 400);
        nakresliDomek(800, 400);
        nakresliDomek(200, 650);
        nakresliDomek(800, 650);
        nakresliPrasatko(500, 500);


        pismenoA(50, 800);
        pismenoL(300, 800);
        pismenoZSHackem(400, 800);
        pismenoB(550, 800);
        pismenoESHackem(630, 800);
        pismenoT(750, 800);
        pismenoA(900, 800);


    }

    private void pismenoT(double x, double y) {
        zofka.setLocation(x, y);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(120);
        zofka.turnLeft(90);
        zofka.move(60);
        zofka.turnLeft(180);
        zofka.move(120);
        zofka.turnLeft(90);
    }

    private void pismenoESHackem(double x, double y) {
        zofka.setLocation(x, y);
        zofka.move(120);
        zofka.turnRight(90);
        zofka.move(35);
        zofka.turnLeft(135);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(135);
        zofka.move(35);
        for (int i = 0; i < 2; i++) {
            zofka.turnLeft(180);
            zofka.move(70);
            zofka.turnLeft(90);
            zofka.move(60);
            zofka.turnLeft(90);
            zofka.move(70);
        }
        zofka.turnLeft(90);
    }

    private void pismenoB(double x, double y) {
        zofka.setLocation(x, y);
        zofka.move(120);
        zofka.turnRight(90);
        for (int a = 0; a < 90; a++) {
            zofka.move(1);
            zofka.turnRight(2);
        }
        zofka.turnRight(180);
        for (int a = 0; a < 90; a++) {
            zofka.move(1);
            zofka.turnRight(2);
        }
        zofka.turnRight(90);
    }

    private void pismenoZSHackem(double x, double y) {
        zofka.setLocation(x, y);
        zofka.turnRight(45);
        zofka.move(180);
        zofka.turnLeft(135);
        zofka.move(40);
        zofka.turnRight(135);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnRight(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnRight(135);
        zofka.move(40);
        zofka.turnLeft(180);
        zofka.move(80);
        zofka.turnRight(135);
        zofka.move(180);
        zofka.turnLeft(135);
        zofka.move(80);
        zofka.turnLeft(90);
    }

    private void pismenoL(double x, double y) {
        zofka.setLocation(x, y);
        zofka.move(120);
        zofka.turnLeft(180);
        zofka.move(120);
        zofka.turnLeft(90);
        zofka.move(70);
        zofka.turnLeft(90);
    }

    private void pismenoA(double x, double y) {
        zofka.setLocation(x, y);
        zofka.turnRight(45);
        zofka.move(50);
        zofka.turnRight(45);
        zofka.move(140);
        zofka.turnRight(180);
        zofka.move(140);
        zofka.turnRight(135);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(150);
        zofka.turnLeft(135);
    }

    private void nakresliKolecko(double x, double y) {
        zofka.setLocation(x, y);
        for (int i = 0; i < 360; i++) {
            zofka.move(1);
            zofka.turnLeft(1);
        }
    }

    private void nakresliSlunicko(double x, double y) {
        zofka.setLocation(x, y);
        for (int i = 0; i < 10; i++) {
            for (int a = 0; a < 36; a++) {
                zofka.move(1);
                zofka.turnLeft(1);
            }
            zofka.turnRight(90);
            zofka.move(20);
            zofka.turnLeft(180);
            zofka.move(20);
            zofka.turnRight(90);
        }
    }

    private void nakresliDomek(double x, double y) {
        zofka.setLocation(x, y);
        for (int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnLeft(90);
        }
        zofka.move(100);
        zofka.turnLeft(45);
        zofka.move(70.7);
        zofka.turnLeft(90);
        zofka.move(70.7);
        zofka.turnRight(135);
    }

    private void nakresliMnohouhelnik(double x, double y) {
        zofka.setLocation(x, y);
        zofka.move(50);
        for (int i = 0; i < 7; i++) {
            zofka.turnLeft(45);
            zofka.move(100);
        }
        zofka.turnLeft(45);
        zofka.move(50);
    }

    private void nakresliPrasatko(double x, double y) {
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
