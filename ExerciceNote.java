import java.util.Random;
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


    public void jeuxDuJusteNombre(int nombre){
        int saisie = nombre;
        Random random = new Random();
        int aleatoire = random.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Jeux du nombre du juste nombre");
        System.out.println("Entrer un nombre");
        do{
            if(saisie<aleatoire){
                System.out.println("Le nombre entré est plus petit");
                saisie = sc.nextInt();
            
            }else{

                System.out.println("le nombre entré est plusGrand");
                saisie = sc.nextInt();
            }

        }while(saisie!=aleatoire);

        System.out.println("Bravo!!");
        
    }


    //Compter le nombre de mot dans une phrase

    public void nombreDeMotsDansUnePhrase(){
 
        Scanner in = new Scanner(System.in);
        System.out.println("Veuiller rentrer écrire une phrase quelconque : ");
        String phrase = in.nextLine();
        System.out.println("Veuiller saisir le mot dont vous voulez connaitre son nombre : ");
        String mot = in.nextLine();
        String[] mots = phrase.split(" ");
        new ExerciceNote().sauvegarderPhrase(phrase);
        int nombreDeMot =0;
        for (String word : mots) {
          if(word.equalsIgnoreCase(mot)){
            nombreDeMot++;
          }
    
        }
        System.out.println("Le nombre de mot dans la phrase est : "+nombreDeMot);
    }

      //Sauvegarder le la phrase dans un fichier

      public void sauvegarderPhrase(String phrase){

    
        try {
            FileWriter writer = new FileWriter("fichier.txt");
            writer.write(phrase.toString());
            writer.close();
            System.out.println("Le texte a été sauvegardé dans le fichier.");
        } catch (IOException e) {
            System.out.println("Une erreur s'est produite lors de la sauvegarde du fichier.");
            e.printStackTrace();
        }

    }
        

}