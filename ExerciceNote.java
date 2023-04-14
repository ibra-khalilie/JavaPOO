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

}