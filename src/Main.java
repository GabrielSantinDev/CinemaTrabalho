
import model.*;
import util.ListaGeneros;

public class Main {

    public static void main(String[] args) {

        Cinema cinema = new Cinema();

        Funcionario funcionario = new Funcionario("Nathanzinho", 19);
        cinema.setFuncionario(funcionario);

        ListaGeneros generos = new ListaGeneros();

        Filme f1 = new Filme("Missão: Impossível - O Julgamento Final", 170, "2025", generos.acao);
        Filme f2 = new Filme("Trem-Bala", 125, "2022", generos.comedia);
        Filme f3 =  new Filme("Hereditário", 120, "2018", generos.terror);
        Filme f4 = new Filme("Blade Runner 2049", 160, "2017", generos.ficcaoCientifica);
        Filme f5 = new Filme("Robô Selvagem", 85, "2024", generos.animacao);
        Filme f6 = new Filme("Onde os Fracos Não Têm Vez", 120, "2007", generos.outro);

        Ator tomCruise = new Ator("Tom Cruise", 63);
        tomCruise.addPapel("Ethan Hunt");
        f1.addAtor(tomCruise);

        Ator bradPitt = new Ator("Brad Pitt", 61);
        bradPitt.addPapel("Ladybug");
        f2.addAtor(bradPitt);

        Ator aaronTaylorJohnson = new Ator("Aaron Taylor-Johnson", 35);
        aaronTaylorJohnson.addPapel("Tangerine");
        f2.addAtor(aaronTaylorJohnson);

        Ator toniCollete = new Ator("Toni Collette", 52);
        toniCollete.addPapel("Annie Graham");
        f3.addAtor(toniCollete);

        Ator ryanGosling = new Ator("Ryan Gosling", 44);
        ryanGosling.addPapel("K");
        f4.addAtor(ryanGosling);

        Ator harissonFord = new Ator("Harisson Ford", 82);
        harissonFord.addPapel("Rick Deckard");
        f4.addAtor(harissonFord);

        Ator pedroPascal = new Ator("Pedro Pascal", 50);
        pedroPascal.addPapel("Fink");
        f5.addAtor(pedroPascal);

        Ator markHamill = new Ator("Mark Hamill", 73);
        markHamill.addPapel("Thorn");
        f5.addAtor(markHamill);

        Ator javierBardem = new Ator("Javier Bardem", 56);
        javierBardem.addPapel("Anton Chigurh");
        f6.addAtor(javierBardem);

        Sala sala1 = cinema.addSala(new Sala(500));
        Sala sala2 = cinema.addSala(new Sala(350));
        Sala sala3 = cinema.addSala(new Sala(300));
        Sala sala4 = cinema.addSala(new Sala(250));
        Sala sala5 = cinema.addSala(new Sala(200));

        Sessao s1 = new Sessao(sala1, f1, "16:00");
        Sessao s2 = new Sessao(sala2, f2, "20:00");
        Sessao s3 = new Sessao(sala3, f3, "17:30");
        Sessao s4 = new Sessao(sala4, f4, "16:00");
        Sessao s5 = new Sessao(sala5, f5, "16:00");
        Sessao s6 = new Sessao(sala1, f2, "19:00");
        Sessao s7 = new Sessao(sala3, f6, "20:00");

    }

}