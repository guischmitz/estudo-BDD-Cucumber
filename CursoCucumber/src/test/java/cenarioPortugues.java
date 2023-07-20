import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.time.format.DateTimeFormatter;

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

    Date entrega = new Date();
    @Dado("que a entrega deve ser realizada em {int}\\/{int}\\/{int}")
    public void queAEntregaDeveSerRealizadaEm(int dia, int mes, int ano) {
        Calendar cal = Calendar.getInstance();
        cal.set(ano,mes -1,dia);
        entrega = cal.getTime();
    }
    @Quando("atrasar em {int} dias")
    public void atrasarEmDias(int dia) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(entrega);
        cal.add(Calendar.DAY_OF_MONTH, dia);
        entrega = cal.getTime();
    }

    Date entregaFinal = new Date();

    @Então("a entrega deverá ser feita em {int}\\/{int}\\/{int}")
    public void aEntregaDeveráSerFeitaEm(int dia, int mes, int ano) {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        cal.set(ano,mes -1,dia);
        entregaFinal = cal.getTime();
        String entregaFormatada = format.format(entrega);
        String entregaFinalFormatada = format.format(entregaFinal);
        System.out.println(entregaFormatada);
        System.out.println(entregaFinalFormatada);
        Assert.assertEquals(entregaFormatada,entregaFinalFormatada);

    }

}
