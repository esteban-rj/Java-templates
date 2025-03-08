
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pelicula> peliculas =new ArrayList<>();
        peliculas.add(new Pelicula("El Padrino", 175, 18, "Francis Ford Coppola", "Drama"));
        peliculas.add(new Pelicula("El Padrino II", 202, 18, "Francis Ford Coppola", "Drama"));
        peliculas.add(new Pelicula("El Padrino III", 162, 18, "Francis Ford Coppola", "Drama"));
        peliculas.add(new Pelicula("El Padrino IV", 180, 18, "Francis Ford Coppola", "Drama"));
        peliculas.add(new Pelicula("El Padrino V", 190, 18, "Francis Ford Coppola", "Drama"));
        peliculas.add(new Pelicula("El Padrino VI", 195, 18, "Francis Ford Coppola", "Drama"));
        peliculas.add(new Pelicula("El Padrino VII", 200, 18, "Francis Ford Coppola", "Drama"));
        peliculas.add(new Pelicula("El Padrino VIII", 205, 18, "Francis Ford Coppola", "Drama"));

        ArrayList<Pelicula> peliculas2 = new ArrayList<>();

        for (Pelicula pelicula : peliculas) {
            peliculas2.add(pelicula);
        }
        
        peliculas.forEach( (pelicula) -> System.out.println(pelicula.getDuracion()));

        Collections.sort(peliculas, (p1, p2) -> Integer.compare(p1.getDuracion(), p2.getDuracion()));

        System.out.println("Después de ordenar por duración:");

        peliculas.forEach( (pelicula) -> System.out.println(pelicula.getDuracion()));

        peliculas2.sort((p1, p2) -> Integer.compare(p1.getDuracion(), p2.getDuracion()));

        System.out.println("Después de ordenar por duración:");

        peliculas2.forEach( (pelicula) -> System.out.println(pelicula.getDuracion()));
    }
}