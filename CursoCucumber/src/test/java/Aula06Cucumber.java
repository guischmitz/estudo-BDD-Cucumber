import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Aula06Cucumber {
    @Given("que criei o arquivo corretamente")
    public void que_criei_o_arquivo_corretamente() throws Throwable {
        System.out.println("Passou com sucesso!");
    }
    @When("executá-lo")
    public void executá_lo() throws Throwable{
        System.out.println("Deu boa");
    }
    @Then("a especificação deve finalizar com sucesso")
    public void a_especificação_deve_finalizar_com_sucesso() throws Throwable{
        System.out.println("Passou também!");
    }
}

