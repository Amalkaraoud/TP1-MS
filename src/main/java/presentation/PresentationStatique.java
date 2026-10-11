package presentation;

import dao.DaoIMP;
import metier.MetierIMP;

public class PresentationStatique {
    public static void main(String[] args) {
        DaoIMP dao = new DaoIMP();          // instanciation statique du DAO
        MetierIMP metier = new MetierIMP(); // instanciation statique du métier

        metier.setDao(dao);                 // injection de dépendance

        System.out.println(metier.calcul());
    }
}