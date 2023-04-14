package JavaPOO;

public class Square extends Rectangle{

        // Constructeur
        public Square(double cote) {
            super(cote, cote);
        }
        
        // Méthode pour calculer la surface
        public double calculerSurface() {
            return super.getLargeur() * super.getLongeur();
        }
    
}
