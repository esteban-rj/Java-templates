import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        List<Libro> libros = new ArrayList<Libro>();
        libros.add(new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1200));
        libros.add(new Libro("El Hobbit", "J.R.R. Tolkien", 300));
        libros.add(new Libro("Cien años de soledad", "Gabriel García Márquez", 500));
        libros.add(new Libro("En agosto nos vemos", "Gabriel García Márquez", 500));
        libros.add(new Libro("Amor en tiempo del colera", "Gabriel García Márquez", 500));
        libros.add(new Libro("1984", "George Orwell", 328));
        libros.add(new Libro("Un mundo feliz", "Aldous Huxley", 250));
        libros.add(new Libro("Un mundo feliz2", "Aldous Huxley", 250));
        libros.add(new Libro("Un mundo feliz3", "Aldous Huxley", 250));

        List<Libro> librosVariasPaginas = libros.stream().filter(libro -> libro.getPaginas() > 300).collect(Collectors.toList());
        
        librosVariasPaginas.forEach(libro -> System.out.println(libro.getTitulo()));

        System.out.println("-------------------");

        Map<String, List<Libro>> librosPorAutor = libros.stream().filter(libro -> libro.getPaginas() < 1000).collect(Collectors.groupingBy(Libro::getAutor));
        librosPorAutor.forEach((autor, listaDeLibros) -> {
            System.out.println("Autor: " + autor);
            listaDeLibros.forEach(libro -> System.out.println(libro.getTitulo()));
        });
    }
}