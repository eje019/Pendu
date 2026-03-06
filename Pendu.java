public class Pendu {
    private String[] listeMots = {
        "maison", 
        "ordinateur", 
        "java", 
        "programmation", 
        "fenetre", 
        "bouton", 
        "souris", 
        "clavier", 
        "ecran", 
        "jeu"
    };

    private String motSecret;

    private int nbErreurs = 0;

    private String motMasque;

    private char[] lettresProposees = new char[26];

    private int nbLettresProposees = 0;

    public Pendu() {

    //on veut choisir un mot au hasard dans listeMots

    int index = (int)(Math.random() * listeMots.length);

    String MotMasque = "";

    motSecret = listeMots[index];

    for (int i = 0; i < motSecret.length() -1 ; i++)
        motMasque = "_";
    }
   
}



