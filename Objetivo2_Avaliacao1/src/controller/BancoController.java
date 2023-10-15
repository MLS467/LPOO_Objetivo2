package controller;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BancoController {
    public static void main(String[] args) {

        ContaCorrente ichigo = new ContaCorrente(2000.00, 500, 60.00);
        ContaCorrente byakuya = new ContaCorrente(15000.00, 1250, 45.77);
        ContaCorrente renji = new ContaCorrente(9805.00, 8000, 27.50);

        ContaPoupanca ulquiorra = new ContaPoupanca(5000.00);
        ContaPoupanca aizen = new ContaPoupanca(25000.00);
        ContaPoupanca grimmjow = new ContaPoupanca(13675.68);

        Cliente orihime = new Cliente("Orihime", 600, 63.44);
        Cliente rukia = new Cliente("Rukia", 250, 28.99);
        Cliente chad = new Cliente("Chad", 1400, 57.73);

        System.out.println("Informações das contas:");
        System.out.println(ichigo);
        System.out.println(byakuya);
        System.out.println(renji);
        System.out.println(ulquiorra);
        System.out.println(aizen);
        System.out.println(grimmjow);
        System.out.println(orihime);
        System.out.println(rukia);
        System.out.println(chad);

        List<Conta> ContaList = new ArrayList<>();
        ContaList.add(ichigo);
        ContaList.add(byakuya);
        ContaList.add(renji);
        ContaList.add(ulquiorra);
        ContaList.add(aizen);
        ContaList.add(grimmjow);

        List<Associado> AssociadoList = new ArrayList<>();
        AssociadoList.add(ichigo);
        AssociadoList.add(byakuya);
        AssociadoList.add(renji);
        AssociadoList.add(orihime);
        AssociadoList.add(rukia);
        AssociadoList.add(chad);

        System.out.println("Lista de contas bancárias:");
        System.out.println(ContaList);

        System.out.println("Lista de associados no banco:");
        System.out.println(AssociadoList);

        ulquiorra.deposita(1000.00);
        ulquiorra.atualiza(5);
        ulquiorra.saca(50.00);

        ichigo.deposita(500.00);
        ichigo.saca(400.00);

        ichigo.setQdeCotas(100);
        byakuya.setQdeCotas(400);
        renji.setQdeCotas(600);
        orihime.setQdeCotas(300);
        rukia.setQdeCotas(600);
        chad.setQdeCotas(600);

        System.out.println(AssociadoList);

        AssociadoList.sort(Comparator.comparing(Associado::getQtdeCotas).reversed());
        System.out.println("Lista de associados em ordem decrescente de cotas:");
        System.out.println(AssociadoList);

        Associado associado_maior_cota = Collections.max(AssociadoList, Comparator.comparing(Associado::getQtdeCotas));
        System.out.println("Associados com o maior número de cotas:");
        for (Associado assoc: AssociadoList) {
            if (assoc.getQtdeCotas() >= associado_maior_cota.getQtdeCotas()) {
                System.out.println(assoc);
            }
        }

        ContaList.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println("Lista de contas em ordem decrescente de saldos:");
        System.out.println(ContaList);

        System.out.println("Lista de associados que possuem conta cadastrada:");
        for (Associado associado: AssociadoList) {
            if (associado instanceof ContaCorrente) {
                System.out.println(associado);
            }
        }

        Conta conta_maior_saldo = Collections.max(ContaList, Comparator.comparing(Conta::getSaldo));
        System.out.println("Contas com o maior saldo:");
        for (Conta conta: ContaList) {
            if (conta.getSaldo() >= conta_maior_saldo.getSaldo()) {
                System.out.println(conta);
            }
        }
    }
}
