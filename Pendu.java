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

    public String motSecret;

    public int nbErreurs = 0;

    public String motMasque;

    public char[] lettresProposees = new char[26];

    public int nbLettresProposees = 0;

    public Pendu() {

    //on veut choisir un mot au hasard dans listeMots

    int index = (int)(Math.random() * listeMots.length);

    motSecret = listeMots[index];

    motMasque="";

    for (int i = 0; i < motSecret.length() ; i++){
        motMasque += "_";
    }

    nbErreurs = 0;
    nbLettresProposees = 0;
   
}

}



