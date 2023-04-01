import java.util.EnumSet;
public class Main {
    public static void main(String[] args) {

        System.out.println("Todos los libros:\n");
        for (Libro libro : Libro.values())
        System.out.printf("%-10s%-45s%s\n", libro, libro.getTitulo(), libro.getAnioCopyrigth());

        System.out.println("\nMostrar un rango de constantes enum:\n");
        for (Libro libro : EnumSet.range( Libro.JHTP6, Libro.CPPHTP4 )){
            System.out.printf("%-10s%-45s%s\n", libro, libro.getTitulo(), libro.getAnioCopyrigth());
        }
    }
}