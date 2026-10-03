package vjezbe;

class Player {
    private int x;
    private int y;
    private int sirina;
    private int visina;
    private int zdravlje;

    public Player(int x, int y, int sirina, int visina, int zdravlje) {
        this.x = x;
        this.y = y;
        this.sirina = sirina;
        this.visina = visina;
        setZdravlje(zdravlje);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSirina() {
        return sirina;
    }

    public void setSirina(int sirina) {
        this.sirina = sirina;
    }

    public int getVisina() {
        return visina;
    }

    public void setVisina(int visina) {
        this.visina = visina;
    }

    public int getZdravlje() {
        return zdravlje;
    }

    public void setZdravlje(int zdravlje) {
        if (zdravlje >= 0 && zdravlje <= 100) {
            this.zdravlje = zdravlje;
        }
    }
}


class Enemy {
    private int x;
    private int y;
    private int sirina;
    private int visina;
    private int steta;

    public Enemy(int x, int y, int sirina, int visina, int steta) {
        this.x = x;
        this.y = y;
        this.sirina = sirina;
        this.visina = visina;
        setSteta(steta);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSirina() {
        return sirina;
    }

    public void setSirina(int sirina) {
        this.sirina = sirina;
    }

    public int getVisina() {
        return visina;
    }

    public void setVisina(int visina) {
        this.visina = visina;
    }

    public int getSteta() {
        return steta;
    }

    public void setSteta(int steta) {
        if (steta >= 0 && steta <= 100) {
            this.steta = steta;
        }
    }
}


public class Game {

    public static boolean checkCollision(Player p, Enemy e) {
        return p.getX() < e.getX() + e.getSirina()
                && p.getX() + p.getSirina() > e.getX()
                && p.getY() < e.getY() + e.getVisina()
                && p.getY() + p.getVisina() > e.getY();
    }

    public static void decreaseHealth(Player p, Enemy e) {
        int novoZdravlje = p.getZdravlje() - e.getSteta();

        if (novoZdravlje < 0) {
            novoZdravlje = 0;
        }

        p.setZdravlje(novoZdravlje);
    }

    public static void main(String[] args) {

        Player igrac = new Player(0, 0, 50, 50, 100);

        Enemy neprijatelj1 = new Enemy(30, 30, 40, 40, 20);
        Enemy neprijatelj2 = new Enemy(100, 100, 30, 30, 50);

        if (checkCollision(igrac, neprijatelj1)) {
            decreaseHealth(igrac, neprijatelj1);
            System.out.println("Doslo je do sudara sa prvim neprijateljem.");
        }

        if (checkCollision(igrac, neprijatelj2)) {
            decreaseHealth(igrac, neprijatelj2);
            System.out.println("Doslo je do sudara sa drugim neprijateljem.");
        }

        System.out.println("Zdravlje igraca: " + igrac.getZdravlje());
    }
}