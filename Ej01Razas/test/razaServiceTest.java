import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class razaServiceTest {
    static razaService rs;
    static List<String> lista;

    @BeforeAll
    static void setRs(){
        rs = new razaService();
        lista = rs.getRazasPerros();
        lista.add("Fox terrier");
        lista.add("Samoyedo");
    }


    @Test
    void agregarRaza() {
        int tamanoInicial = lista.size();
        rs.agregarRaza("Beagle");
        assertEquals(tamanoInicial+1,lista.size());
    }

    @Test
    void eliminarRaza() {
        int tamanoInicial = lista.size();
        rs.eliminarRaza("Fox terrier");
        assertEquals(tamanoInicial-1,lista.size());
    }

    @Test
    void verLista() {
        rs.verLista();
    }
}