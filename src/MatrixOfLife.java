public class MatrixOfLife {

     Cell mx[][] = new Cell[7][7];

    public MatrixOfLife() {
        for(int i = 0; i < mx.length; i++)
            for(int j = 0; j < mx.length; j++)
                mx[i][j] = new Cell(0, false);
    }

    public void initCoord() {
        for(int i = 0; i < mx.length; i++)
            for(int j = 0; j < mx.length; j++) {
                mx[i][j].setI(i);
                mx[i][j].setJ(j);
            }
    }

    public void calculateNb(int i, int j) {

        int nb = 0;

        if(mx[i-1][j-1].isAlive() == true)
            nb++;
        if(mx[i-1][j].isAlive() == true)
            nb++;
        if(mx[i-1][j+1].isAlive() == true)
            nb++;
        if(mx[i][j-1].isAlive() == true)
            nb++;
        if(mx[i][j+1].isAlive() == true)
            nb++;
        if(mx[i+1][j-1].isAlive() == true)
            nb++;
        if(mx[i+1][j].isAlive() == true)
            nb++;
        if(mx[i+1][j+1].isAlive() == true)
            nb++;
        mx[i][j].setNb(nb);
    }

    public void initNb() {
        for(int i = 1; i < 6; i++)
            for(int j = 1; j < 6; j++) {
                calculateNb(i, j);
            }
    }

    public void nextGen() {
        for(int i = 0; i < mx.length; i++)
            for(Cell j : mx[i]) {
                if(j.getNb() < 2)
                    j.setAlive(false);

                if(j.getNb() > 3)
                    j.setAlive(false);

                if(j.getNb() == 3)
                    j.setAlive(true);
            }
        initNb();
    }
}
