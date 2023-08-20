package Libros;

public class main {
    public static void main (String []args){
        Libro libro1 = new Libro("Vasconcellos", "Mi planta de Naranja Lima", 156);
        Libro libro2 = new Libro("Borges", "Cien años de soledad", 452);

        libro1.mostrarLibro();

        System.out.println(libro1.compararLibros(libro1, libro2) ? "El libro "+libro1.getTitulo()+ " tiene más páginas que "
                +libro2.getTitulo() : "El libro "+libro1.getTitulo()+ " tiene menos páginas que "
                +libro2.getTitulo());
    }
}
