public class Cell {
    private int nb;
    private boolean alive;
    private int i, j;

    public Cell() {
        this(0,false);
    }

    public Cell(int nb, boolean alive) {
        this.nb = nb;
        this.alive = alive;
    }

    public int getNb() {
        return nb;
    }

    public void setNb(int nb) {
        this.nb = nb;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    @Override
    public String toString() {
        return  "(" + nb + " " + alive + ")";
    }
}
