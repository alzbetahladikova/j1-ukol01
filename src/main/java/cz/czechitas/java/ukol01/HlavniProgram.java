package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {
    Turtle zofka = new Turtle();
    public void start() {


        //TODO implementace domácího úkolu


        nakresliPrasatko(200,50);
        nakresliMnohouhelnik(600,200);
        nakresliKolecko(800,200);
        nakresliSlunicko(1000, 200);


    }

    private void nakresliKolecko(double x, double y) {
        zofka.setLocation(x, y);
        for (int i = 0; i < 360; i++) {
            zofka.move(1);
            zofka.turnLeft(1);
        }}
    private void nakresliSlunicko(double x, double y) {
        zofka.setLocation(x, y);
        for (int i = 0; i < 10; i++) {
            for (int a = 0;a < 36; a++) {
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
