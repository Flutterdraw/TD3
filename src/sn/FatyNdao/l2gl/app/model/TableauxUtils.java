package sn.FatyNdao.l2gl.app.model;

import java.util.Objects;

public class TableauxUtils {
    public static <T> int indexOf(T[] tab, T cible){
        if (tab==null){
            throw new IllegalArgumentException("La cible ne peut pas etre nulle.");
        }
        for (int i = 0; i < tab.length; i++){
            if (Objects.equals(tab[i], cible)) {
                return i;
            }
        }
        return -1;
    }
}
