package Network;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List publicaciones = new ArrayList();
        Escrita es = new Escrita("Manolo", "A12345", "Tiene un segarro");
        es.darLikes();
        publicaciones.add(es);
        System.out.println(es);

        System.out.println("");

        Fotografica fo = new Fotografica("Armando", "Casa Paco", "Bar casa Paco");
        for(int i = 0; i <= 9; i++){
            fo.darLikes();
        }
        System.out.println(fo);

        publicaciones.add(fo);

        publicaciones.stream()
                .filter(nombre -> nombre.equals("Armando"))
                .forEach(System.out :: println);
    }
}
