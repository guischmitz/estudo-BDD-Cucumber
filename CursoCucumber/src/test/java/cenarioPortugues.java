import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class cenarioPortugues {

    @Dado("Que criei o cenário Português")
    public void queCrieiOCenarioPortugues() throws Throwable{
    }

    @Quando("executar o cenario Português")
    public void executarOCenarioPt() throws Throwable{
    }

    @Então("deve rodar com sucesso")
    public void deveRodarComSucesso() throws Throwable{
    }

    private int contador = 0;

    @Dado("que o valor do contator é {int}")
    public void queOValorDoContator(int int1) {
        contador = int1;
    }

    @Quando("eu somar {int}")
    public void euSomar(int int1) {
        contador = contador + int1;
    }

    @Então("o valor do contador deve ser {int}")
    public void oValorDoContadorDeveSer(int int1) {
        System.out.println(contador);
        System.out.println(int1);
        Assert.assertEquals(int1, contador);
    }
}
