package sn.FatyNdao.l2gl.app;

import sn.FatyNdao.l2gl.app.model.*;
import sn.FatyNdao.l2gl.app.model.Module;


public class Main {
    public static void main(String[] args) {
        Personne p = new Etudiant("Aïssatou", "A@gmail.com", "E01");
        //System.out.println(p.identite("X"));

        Affichable e = new Etudiant("Awa", "aw@yahoo.com", "E01");
        Affichable e2 = new Etudiant("Maty", "M@mail.com", "E02");

        Affichable[] elements = {e,e2};
        for (int i = 0; i < elements.length; i++) {
            IO.println(elements[i].Afficher());
        }

        Etudiant et1 = new Etudiant("Mounasse", "Moun@e", "ET01");
        Etudiant et2 = new Etudiant("Mounasse", "Moun@e", "ET01");
        Etudiant et3 = et1;
        Module m = new Module("C01", "Algortithme");
        Module m2 = new Module("C02", "JAVA");
        Note n = new Note(et1, m, 14.5);
        //Note n2 = new Note(et2, m2, -9.0);
        Note n3 = new Note(et1, m, 7.0);
        Double note = 14d;

        Duo d = new Duo(m, note);
        Duo d2 = new Duo("Cle", et1);
        Duo d3 = new Duo(et1, "Cle");

        Etudiant[] Tet = {et1, et2, et3};
        Module[] tm = {m, m2};
        String[] liste = {"Belle", "Jouva", "Attraction"};

        Registre<Etudiant> TabEtu = new Registre<>(Tet, 100);
        Registre<Module> TabMod = new Registre<>(tm, 100);

        Etudiant et4 = new Etudiant("Moye", "Moy@e", "ET02");
//        Etudiant et5 = new Etudiant("Pruja", "Pruj@a", "ET02");
        TabEtu.ajouter(et4);
        IO.println(TabMod.chercherParID("C02").Afficher());
//        TabEtu.ajouter(et5);
        //System.out.println(n.estValide());
        //System.out.println(n3.estValide());
        //System.out.println(n.mention());
        //n3.setValeur(17.0);
        //System.out.println(n3);

        //System.out.println();
//        System.out.println(et1.equals(et2));
//        System.out.println(et1==et3);
//        System.out.println(n.equals(n3));
//        System.out.println(et1.carte());
        IO.println(d2.equals(d3));

    }

}
