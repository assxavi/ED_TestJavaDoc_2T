package biblioteca;

import java.util.ArrayList;
import java.util.List;
/**
 * La clase {@code Biblioteca} representa una biblioteca que gestiona una lista de libros.
 * Proporciona métodos para agregar, eliminar y buscar libros.
 *
 * @author Yeray Valdepeñas
 * @version 2.0
 */
public class Biblioteca {

    // TODO: Documentar estos atributos
    /**
     * Lista de libros que almacena la biblioteca.
     * Esta lista contiene todos los libros registrados en la biblioteca.
     */
    private final List<biblioteca.Libro> libros;

    // TODO: Documentar este método
    /**
     * Constructor de la clase {@code Biblioteca}.
     * Inicializa la lista de libros como una nueva lista vacía.
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // TODO: Documentar este método.
    //  Test: NO HAY QUE TESTEAR ESTE METODO
    /**
     * Constructor de la clase {@code Biblioteca}.
     * Inicializa la biblioteca con una lista preexistente de libros.
     *
     * @param libros Lista de libros con los que se inicializa la biblioteca.
     */
    public Biblioteca(List<biblioteca.Libro> libros) {
        this.libros = libros;
    }

    // TODO: Testear este metodo.
    //  Test: Comprobar si se ha agregado
    /**
     * Agrega un libro a la biblioteca.
     *
     * @param libro El libro que se desea agregar a la biblioteca.
     * @return {@code true} si el libro fue agregado correctamente, {@code false} si no.
     *
     * @see #eliminarLibro Para eliminar libros de la biblioteca.
     */
    public boolean agregarLibro(biblioteca.Libro libro) {
        return libros.add(libro);
    }

    // TODO: Testear este metodo.
    //  Test: comprobar si se ha eliminado
    /**
     * Elimina un libro de la biblioteca.
     *
     * @param libro El libro que se desea eliminar de la biblioteca.
     * @return {@code true} si el libro fue eliminado correctamente, {@code false} si no.
     *
     * @see #agregarLibro Para agregar libros a la biblioteca.
     */
    public boolean eliminarLibro(biblioteca.Libro libro) {
        return libros.remove(libro);
    }

    // TODO: Documentar este método
    /**
     * Obtiene la lista de libros en la biblioteca.
     *
     * @return Una lista que contiene todos los libros registrados en la biblioteca.
     */
    public List<biblioteca.Libro> getLibros() {
        return libros;
    }

    // TODO: Documentar este método.
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.
    /**
     * Busca un libro en la biblioteca por su título.
     *
     * @param titulo El título del libro a buscar.
     * @return El libro encontrado, o {@code null} si no se encuentra un libro con ese título.
     *
     * @see #encuentraLibrosPorAutor(String) Para buscar libros por autor.
     */
    public biblioteca.Libro encuentraLibroPorTitulo(String titulo) {
        for (biblioteca.Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo.
    //  No testearlo
    // Este metodo está obsoleto. Hay que documentarlo como tal.
    //  Recuerda: las anotaciones @deprecated y @link a la nueva
    //  versión mejorada encuentraLibrosPorAutor(...)
    //  En esta ocasión, NO TESTEAREMOS este metodo */
    /**
     * Busca un libro en la biblioteca por su autor.
     * Este método está obsoleto y se recomienda usar el método {@link #encuentraLibrosPorAutor(String)}.
     *
     * @param autor El autor del libro a buscar.
     * @return El primer libro encontrado del autor, o {@code null} si no se encuentra ningún libro.
     *
     * @deprecated Este método ha sido reemplazado por {@link #encuentraLibrosPorAutor(String)} desde la versión 2.0.
     */
    @Deprecated
    public biblioteca.Libro encuentaLibroPorAutor(String autor) {
        for (biblioteca.Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    /** TODO: Documentar este metodo
    // Este metodo sustituye al metodo anterior. Está disponible desde la
    //  versión 2.0. Hay que documentarlo teniéndolo en cuenta.
    // TODO: Testear este metodo.
    //  Test: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test: Comprobar la lista de libros que devuelve para un autor No existente */
    /**
     * Busca todos los libros de un autor en la biblioteca
     *
     * @param autor El autor de los libros a buscar.
     * @return Una lista con todos los libros del autor, o {@code null} si no se encuentran libros del autor.
     *
     * @since 2.0
     */
    public List<biblioteca.Libro> encuentraLibrosPorAutor(String autor) {
        List<biblioteca.Libro> listaLibros = null;
        for (biblioteca.Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
