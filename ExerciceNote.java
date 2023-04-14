import java.util.Scanner;

public class ExerciceNote{

    public void nomrePair(ExerciceNote exe){
        System.out.println("0 : pour quitter");
        int saisi = 1;
        do{
            System.out.println("veuiller entrer un nombre ");
            Scanner  sc = new Scanner(System.in);
       
            if (sc.hasNextInt()) {
               saisi = sc.nextInt();
               if(exe.estNombrePair(saisi)){
                   System.out.println("le nombre est pair");
               }else{
                   System.out.println("le nombre n'est pas pair");
               };
           } else {
               System.out.println("Vous n'avez pas saisi un entier valide.");
           }
   
   
           }while(saisi!=0);

        
    }

      //verifier si un nombre entier est pair
      public boolean estNombrePair (int nombre){

        return nombre % 2==0 ?true:false;
   
      }

    
    //renverser une chaine de caractére

    public String reverseString(String chaine){
        
        StringBuilder sb = new StringBuilder(chaine);
        return sb.reverse().toString();
    }

      //Afficher une piramide à l'aide d'une chaine de caractère

    public void afficherPyramide(){
      
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

     //calculer la somme des nombres jusqu'a 10 000 
     public  void sommeNombre() {
        int somme = 0;
        for (int i = 1; i <= 10000; i++) {
            somme += i;
        }
        System.out.println("La somme des nombres jusqu'à 10000 est : " + somme);
    }

        

}