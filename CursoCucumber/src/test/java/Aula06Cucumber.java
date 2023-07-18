import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Aula06Cucumber {
    @Given("que criei o arquivo corretamente")
    public void queCrieiOArquivoCorretamente() throws Throwable {
        System.out.println("Passou com sucesso!");
    }
    @When("executá-lo")
    public void executáLo() throws Throwable{
        System.out.println("Deu boa");
    }
    @Then("especificação deve finalizar com sucesso")
    public void aEspecificaçãoDeveFinalizarComSucesso() throws Throwable{
        System.out.println("Passou também!");
    }
}

