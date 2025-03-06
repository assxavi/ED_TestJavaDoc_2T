package Libro;

/**
 * La clase Libro representa un libro en una biblioteca con atributos como título, autor y año de publicación.
 * Proporciona métodos para obtener y establecer esos atributos.
 * @author [yeray valdepeñas Terrero] [assxavi@github.com]
 *
 */
public class Libro {
    // TODO: Documentar estos atributos
    /**
     * El título del libro.
     */
    private String titulo;

    /**
     * El autor del libro.
     */
    private String autor;
    /**
     * El año de publicación del libro.
     */
    private int anioPublicacion;
    // TODO: Documentar este método
    /**
     * Constructor para crear un libro con un título, autor y año de publicación especificados.
     *
     * @param titulo El título del libro.
     * @param autor El autor del libro.
     * @param anioPublicacion El año en que se publicó el libro.
     */
    // TODO: Testear este método
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    /**
     * Obtiene el título del libro.
     *
     * @return El título del libro.
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     * Establece el título del libro.
     *
     * @param titulo El nuevo título del libro.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // TODO: Documentar este método
    /**
     * Obtiene el autor del libro.
     *
     * @return El autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    // TODO: Documentar este método
    /**
     * Obtiene el año de publicación del libro.
     *
     * @return El año de publicación del libro.
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    /**
     * Establece el año de publicación del libro.
     *
     * @param anioPublicacion El nuevo año de publicación del libro.
     */
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}