Feature: Käyttäjä voi muokata vinkkejä

    Scenario: Käyttäjä voi avata muokkaus valikon
        Given lisätään lukuvinkki otsikolla "testi1"
        When avataan vinkin muokkaus vinkille "testi1"
        And poistutaan
        Then ohjelma vastaa "Löydettiin lukuvinkki!"