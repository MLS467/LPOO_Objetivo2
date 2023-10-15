package control;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Veiculo_Controller {
    public static void main(String[] args) {

        Bicicleta Bike1 = new Bicicleta(2, "Humana", "Prince", "Rua", 2017, 26, "123aaa");
        System.out.println(Bike1);

        Carro Automovel1 = new Carro(2, "Gasolina", "Volkswagen", "Variant", 1967, 45, "1020304050", "123bbb", "BBB-111");
        System.out.println(Automovel1);

        Caminhao Caminhao1 = new Caminhao(5, "Diesel", "Volvo", "FH 540", 2016, 400, "8090100102", "123ccc", "CCC-222");
        System.out.println(Caminhao1);

        Bicicleta Bike2 = new Bicicleta(2, "Humana", "MarcaBicicleta2", "Rua", 2023, 26, "PlacaBicicleta2");
        Bicicleta Bike3 = new Bicicleta(2, "Eletricidade", "MarcaBicicleta3", "Rua", 2014, 26, "PlacaBicicleta3");
        Bicicleta Bike4 = new Bicicleta(2, "Gasolina", "MarcaBicicleta4", "Trilha", 2019, 29, "PlacaBicicleta4");
        Bicicleta Bike5 = new Bicicleta(2, "Humana", "MarcaBicicleta5", "Rua", 2021, 29, "PlacaBicicleta5");

        Carro Automovel2 = new Carro(4, "Gasolina", "MarcaCarro2", "Modelo2", 1985, 150, "PlacaCarro2", "Chassi2");
        Carro Automovel3 = new Carro(4, "Eletricidade", "MarcaCarro3", "Modelo3", 2023, 250, "PlacaCarro3", "Chassi3");
        Carro Automovel4 = new Carro(4, "Álcool/Gasolina", "MarcaCarro4", "Modelo4", 2017, 320, "PlacaCarro4", "Chassi4");
        Carro Automovel5 = new Carro(4, "Gasolina", "MarcaCarro5", "Modelo5", 1987, 0, "PlacaCarro5", "Chassi5");

        Caminhao Caminhao2 = new Caminhao(5, "Diesel", "MarcaCaminhao2", "Modelo2", 2015, 800, "PlacaCaminhao2", "Chassi2");
        Caminhao Caminhao3 = new Caminhao(3, "Diesel", "MarcaCaminhao3", "Modelo3", 2010, 500, "PlacaCaminhao3", "Chassi3");
        Caminhao Caminhao4 = new Caminhao(2, "Diesel", "MarcaCaminhao4", "Modelo4", 1991, 200, "PlacaCaminhao4", "Chassi4");
        Caminhao Caminhao5 = new Caminhao(2, "Diesel", "MarcaCaminhao5", "Modelo5", 2005, 80, "PlacaCaminhao5", "Chassi5");

        List<Veiculo> veiculosList = new ArrayList<>();
        veiculosList.add(Bike1);
        veiculosList.add(Bike2);
        veiculosList.add(Bike3);
        veiculosList.add(Bike4);
        veiculosList.add(Bike5);
        veiculosList.add(Automovel1);
        veiculosList.add(Automovel2);
        veiculosList.add(Automovel3);
        veiculosList.add(Automovel4);
        veiculosList.add(Automovel5);
        veiculosList.add(Caminhao1);
        veiculosList.add(Caminhao2);
        veiculosList.add(Caminhao3);
        veiculosList.add(Caminhao4);
        veiculosList.add(Caminhao5);

        veiculosList.sort(Comparator.comparing(Veiculo::getAnoFabricacao).reversed());
        System.out.println("\nLista de veículos classificados pelo ano em ordem decrescente:");
        System.out.println(veiculosList);

        System.out.println("\nLista de carros classificados pelo ano em ordem decrescente:");
        for (Veiculo veiculo : veiculosList) {
            if (veiculo instanceof Carro) {
                System.out.print(veiculo);
            }
        }

        System.out.println("\n\nLista de bicicletas classificadas pelo ano em ordem decrescente:");
        for (Veiculo bicicleta : veiculosList) {
            if (bicicleta instanceof Bicicleta) {
                System.out.print(bicicleta);
            }
        }

        Automovel2.setPlaca("IUA-1000");
        Automovel5.setPlaca("IAF-0897");
        Caminhao1.setPlaca("IJN-0410");
        Caminhao2.setPlaca("IRD-6658");
        Caminhao4.setPlaca("IMW-3284");

        System.out.println("\n\nLista de carros que possuem placas com a letra inicial 'I' classificados pelo ano em ordem decrescente:");
        for (Veiculo automovel: veiculosList) {
            if (automovel instanceof Automovel) {
                if (((Automovel) automovel).getPlaca().startsWith("I") || ((Automovel) automovel).getPlaca().startsWith("i")) {
                    System.out.print(automovel);
                }
            }
        }


    }
}
