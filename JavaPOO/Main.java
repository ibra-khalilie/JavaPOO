package JavaPOO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Main {

   

        public static void main(String[] args) {

            //Test des exercices pour la classe ExercieNote
            /* 
            ExerciceNote exe =  new ExerciceNote();

            if (args.length == 0) {
                System.out.println("Veuillez renseigner le chemin du fichier en argument.");
                return;
            }
            
    
            String chemin = args[0];
            System.out.println("voici le premier argument :"+chemin);
            int nbMots = ExerciceNote.nombreDeMotsDansUnFichier(chemin);
            System.out.println("Le fichier contient " + nbMots + " mots.");
    
            String tab = "merci";
          
    
            System.out.println(exe .reverseString(tab));
            exe.afficherPyramide();
            exe.sommeNombre();
            exe.nomrePair(exe);
            exe.nombreDeMotsDansUnePhrase();
            
            System.out.println("veuiller entrer un nombre pour commencer le jeux ");
           
            int saisi = -1;
            Scanner  sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                saisi = sc.nextInt();
                exe.jeuxDuJusteNombre(saisi);
            }else{
                System.out.println("Veuiller saisir un entier valide");
            }
         
    
        }
        */

        //création d'une instance rectangle
        Rectangle rectangle = new Rectangle(3, 8);

        System.out.println("La classe rectangle");
        rectangle.display();
        System.out.println("La classe square");
        Rectangle square = new Square(5);
        square.display();
        System.out.println("la surface du carré");
      
    
        ;
       
        //Creation d'un utilisateur
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setUsername("Ibrahima");
        utilisateur.setPassword("passe");
        System.out.println("l'utilsateur est  :"+utilisateur.getUsername());


        //Creation de voiture
        Voiture voiture = new Voiture();
        voiture.setKilometre(100000);
        voiture.setMarque("AUDI");
        voiture.setModel("RS8");

        Voiture voiture2 = new Voiture();
        voiture2.setKilometre(100000);
        voiture2.setMarque("FORD");
        voiture2.setModel("128");

        List<Voiture> voitures = new ArrayList<>();
        voitures.add(0, voiture);
        voitures.add(voiture2);

        utilisateur.listerVoiture(voitures);






        // test de la classe Singleton
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("adresse singleton 1 "+singleton1+ "adresse singleton 1"+singleton2);
        if(singleton1.equals(singleton2)){
            System.out.println("Les instances sont identiques");
        }







    }

        

        
        


    
}
