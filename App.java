public class App{
    public static void main(String[] args) {
        Pendu jeu = new Pendu();
        System.out.println("Mot secret : " + jeu.motSecret);
        System.out.println("Mot masqué : " + jeu.motMasque);
        System.out.println("Nombre d'erreurs : " + jeu.nbErreurs);
    }
}