import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class alumnoServiceTest {
    static alumnoService as;

    @BeforeAll
    static void setAs(){
        as = new alumnoService();
        List<Alumno> lista = as.getListaAlumnos();
        lista.add(new Alumno("Lau",new double[]{5, 5, 5}));
        lista.add(new Alumno("Pau",new double[]{3, 4, 3}));

    }
    /*
    void crearAlumno() {
        //pendiente, tiene scanner
        Alumno resultado = Alumno.getUserInput();
        assertTrue(as.crearAlumno());

    }*/
    @Test
    void agregarAlumno() {
        int tamanoInicial = as.getListaAlumnos().size();
        as.agregarAlumno(new Alumno("Hector",new double[]{3, 4, 5}));
        assertEquals(tamanoInicial+1,as.getListaAlumnos().size());
    }

    @Test
    void buscarAlumnoEncontrado() {
        assertTrue(as.buscarAlumno("Lau"));
    }
    @Test
    void buscarAlumnoNoEncontrado() {
        assertFalse(as.buscarAlumno("Armando"));
    }

    @Test
    void notaFinal() {
        assertEquals(5,as.notaFinal(0));
    }

    @Test
    void verListado(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        as.verListado();

        assertEquals("[Alumno{nombre='Lau', notas=[5.0, 5.0, 5.0]}, Alumno{nombre='Pau', notas=[3.0, 4.0, 3.0]}]\n", outContent.toString());


    }
}