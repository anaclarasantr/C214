import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testeBuscaChris(){

        //Iniciando classe e passando o parametro que injeta as dependencias que são requiridas pelo construtor
        Service service = new Mock();
        App app = new App(service);

        //Passando id do mock
        //qualquer id diferente de 10 - o teste irá falhar
        Professor chris = app.buscaProf(10);

        assertEquals("Chris", chris.getNome());
        assertEquals(17, chris.getHorarioDeAtendimento());
        assertEquals("Chris", chris.getPeriodo());
    }

    @Test
    public void testeBuscaMarcelo(){

        Service service = new Mock();
        App app = new App(service);

        Professor marcelo = app.buscaProf(20);

        assertEquals("Marcelo", marcelo.getNome());
        assertEquals(15, marcelo.getHorarioDeAtendimento());
        assertEquals("integral", marcelo.getPeriodo());
    }


    
    @Test
    public void testeBuscaNull(){

        Service service = new Mock();
        App app = new App(service);

        Professor erro = app.buscaProf(0);

        assertEquals("erro", erro.getNome());
    }
}
