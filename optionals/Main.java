
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;


public class Main {
    public static void main(String[] args) {
        List<Nota> notas = new ArrayList<>();

        notas.add(new Nota("Castellano", 9));
        //notas.add(new Nota("Matemáticas", 4));
        notas.add(new Nota("Castellano", 9));

        //System.out.println("Nota más baja: " + obtenerNotaBaja(notas).getName());
        System.out.println("Hello");
        Optional<Nota> notaMasBaja = obtenerNotaBajaOptional(notas);
        
        notaMasBaja.ifPresent(System.out::println);
    }

    public static Nota obtenerNotaBaja(List<Nota> notas) {

        int notaBaja = 5;
        for (Nota nota: notas) {
            if (nota.getNota() <= notaBaja) {
               return nota;
            }
        }
        return null;
    }

    public static Optional<Nota> obtenerNotaBajaOptional(List<Nota> notas) {
        int notaBaja = 5;
        for (Nota nota: notas) {
            if (nota.getNota() <= notaBaja) {
               return Optional.of(nota);
            }
        }
        return Optional.empty();
    }

}
