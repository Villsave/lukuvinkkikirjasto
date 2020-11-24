package lukuvinkkikirjasto;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import java.util.ArrayList;
import lukuvinkkikirjasto.userinterface.*;

public class StepDefinitions {
    UserInterface ui;
    ArrayList<String> syotteet;
    StubIO io;

    @Before 
    public void setup() {
        syotteet = new ArrayList<>();
    }

    @Given("valikosta valitaan linkin lisäys")
        public void ohjelmaKäynnistetään() {
            syotteet.add("u");
    }

    @When("valikosta valitaan vinkkien listaus")
        public void vinkkienListaus() {
            syotteet.add("l");
        }
 
    @When("käyttäjä lisää vinkin otsikolla {string}")
        public void linkinLisäysOtsikolla(String otsikko) {
            syotteet.add(otsikko);
        }
    
    @When("käyttäjä lisää tyhjän {string} otsikon")
        public void linkinLisäysTyhjäOtsikko(String tyhjä) {
            syotteet.add(tyhjä);
        }

    @When("käyttäjä syöttää valikkoon väärän symbolin")
        public void vääräSymboliValikkoon() {
            syotteet.add("t");
        }


    @Then("ohjelma vastaa {string}") 
        public void ohjelmaVastaa(String vastaus) {            
            syotteet.add("p");
            io = new StubIO(syotteet);
            ui = new UserInterface(io);
            ui.run();
            ArrayList<String> vastaukset = io.getOutputs();
            assertTrue(vastaukset.contains(vastaus));
        }
    
}