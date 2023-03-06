import jdk.jfr.StackTrace;

public class Main {

    void Test() {
        MatrixOfLife ob = new MatrixOfLife();

        ob.mx[3][2].setAlive(true);
        ob.mx[3][3].setAlive(true);
        ob.mx[2][4].setAlive(true);

        ob.initCoord();
        ob.initNb();

        for(int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++)
                System.out.print(ob.mx[i][j].getNb() + " ");
            System.out.println();
        }

        ob.nextGen();

        System.out.println();

        for(int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++)
                System.out.print(ob.mx[i][j].getNb() + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Main test = new Main();
        test.Test();



    }
}