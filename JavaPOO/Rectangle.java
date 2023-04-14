package JavaPOO;

public class Rectangle {

    private double largeur;
    private double longeur;
    
    public Rectangle(double largeur, double longeur){
        this.largeur = largeur;
        this.longeur = longeur;
    }



    public void display() {
        for (int i = 1; i <= this.getLargeur(); i++) {
            for (int j = 1; j <= this.getLongeur(); j++) {
                if (i == 1 || i == this.getLargeur() || j == 1 || j == this.getLongeur()) {
                    System.out.print("#");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }



    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public void setLongeur(double longeur) {
        this.longeur = longeur;
    }

    public double getLongeur() {
        return longeur;
    }
    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(largeur);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(longeur);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rectangle other = (Rectangle) obj;
        if (Double.doubleToLongBits(largeur) != Double.doubleToLongBits(other.largeur))
            return false;
        if (Double.doubleToLongBits(longeur) != Double.doubleToLongBits(other.longeur))
            return false;
        return true;
    }

   
    
}
