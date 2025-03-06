import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void agregarLibro() {
        BibliotecaTest biblioteca;
        assertTrue(biblioteca.agregarLibro(this.libro));
    }

    @Test
    void eliminarLibro() {
    }

    @Test
    void getLibros() {
    }

    @Test
    void encuentraLibroPorTitulo() {
        biblioteca.Biblioteca biblio = new biblioteca.Biblioteca();
        biblio.agregarLibro(this.libro);

        assertNotNull(biblio.getLibros());

        assertEquals(biblio.getLibros().size(), 1);

    }

    @Test
    void encuentaLibroPorAutor() {
    }

    @Test
    void encuentraLibrosPorAutor() {
    }
}