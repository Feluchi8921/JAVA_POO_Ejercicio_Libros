package Libros;

public class Libro {
    public static int libro2;
    //Atributos
    private String autor;
    private String titulo;
    private int paginas;

    //Constructores
    public Libro() {
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
    }
    public Libro(String autor, String titulo, int paginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
    }

    //Metodos

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void mostrarLibro(){
        System.out.println("El libro "+getTitulo()+", del autor "+getAutor()+", tiene " +getPaginas()+ " páginas");
    }

    public boolean compararLibros(Libro libro1, Libro libro2){
        return (libro1.getPaginas()>libro2.getPaginas());
    }
}
