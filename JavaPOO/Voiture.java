package JavaPOO;

public class Voiture {
    private String marque;
    private String model;
    private double kilometre;


    
    public Voiture(String marque, String model, double kilometre) {
        this.marque = marque;
        this.model = model;
        this.kilometre = kilometre;
    }

    public Voiture() {
    }

    public void afficherInformation(){
        System.out.println("Marque :"+this.getMarque());
        System.out.println("Model :"+this.getModel());
        System.out.println("Nombre de kilometres : "+this.getKilometre());

    }
        
    public void setMarque(String marque) {
        this.marque = marque;
    }


    public void setModel(String model) {
        this.model = model;
    }


    public void setKilometre(double kilometre) {
        this.kilometre = kilometre;
    }


    public String getMarque() {
        return marque;
    }
    public String getModel() {
        return model;
    }
    public double getKilometre() {
        return kilometre;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((marque == null) ? 0 : marque.hashCode());
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        long temp;
        temp = Double.doubleToLongBits(kilometre);
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
        Voiture other = (Voiture) obj;
        if (marque == null) {
            if (other.marque != null)
                return false;
        } else if (!marque.equals(other.marque))
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (Double.doubleToLongBits(kilometre) != Double.doubleToLongBits(other.kilometre))
            return false;
        return true;
    }

    
    
}
