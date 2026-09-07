import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choix = 0;
        while (choix != 6) {
            System.out.println("1. Addition de plusieurs nombres");
            System.out.println("2. Factorielle d'un nombre");
            System.out.println("3; Verification d'un nombre premier");
            System.out.println("4. Affichage d'une table de multiplication");
            System.out.println("5. Calcul d'une puissance");
            System.out.println("6. Quitter");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("Entrez le nombre de valeurs à additionner :");
                    int n = scanner.nextInt();
                    int somme = 0;
                    for (int i = 0; i < n; i++) {
                        System.out.println("Entrez la valeur " + (i + 1) + " :");
                        int valeur = scanner.nextInt();
                        somme += valeur;
                    }
                    System.out.println("La somme est : " + somme);
                    break;
                case 2:
                    System.out.println("Entrez un nombre pour calculer sa factorielle :");
                    int num = scanner.nextInt();
                    int factorielle = 1;
                    for (int i = 1; i <= num; i++) {
                        factorielle *= i;
                    }
                    System.out.println("La factorielle de " + num + " est : " + factorielle);
                    break;
                case 3:
                    System.out.println("Entrez un nombre pour vérifier s'il est premier :");
                    int nombre = scanner.nextInt();
                    boolean estPremier = true;
                    if (nombre <= 1) {
                        estPremier = false;
                    } else {
                        for (int i = 2; i < nombre; i++) {
                            if (nombre % i == 0) {
                                estPremier = false;
                                break;
                            }
                        }
                    }
                    if (estPremier) {
                        System.out.println(nombre + " est un nombre premier.");
                    } else {
                        System.out.println(nombre + " n'est pas un nombre premier.");
                    }
                    break;
                case 4:
                    System.out.println("Entrez un nombre pour afficher sa table de multiplication :");
                    int table = scanner.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(table + " x " + i + " = " + (table * i));
                    }
                    break;
                case 5:
                    System.out.println("Entrez la base :");
                    int base = scanner.nextInt();
                    System.out.println("Entrez l'exposant :");
                    int exposant = scanner.nextInt();
                    int puissance = 1;
                    for (int i = 1; i <= exposant; i++) {
                        puissance *= base;
                    }
                    System.out.println(base + " à la puissance " + exposant + " est : " + puissance);
                    break;
                case 6:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            scanner.close();
            }
        }
        }
    }
