package control;

import model.*;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {
    public static void main(String[] args) {

        Gerente_Geral gerente1 = new Gerente_Geral();
        Gerente_Geral gerente2 = new Gerente_Geral("Ichigo", 5000.00);

        Desenvolvedor_Junior junior1 = new Desenvolvedor_Junior();
        Desenvolvedor_Junior junior2 = new Desenvolvedor_Junior("Orihime", 8500.00);

        System.out.println("\nLista de gerentes e desenvolvedores:\n");
        System.out.println(gerente1);
        System.out.println(gerente2);
        System.out.println(junior1);
        System.out.println(junior2);

        gerente1.setNome("Uryu");
        gerente1.setSalario(12000.00);

        junior1.setNome("Rukia");
        junior1.setSalario(4500.00);

        System.out.println("\nLista de gerentes e desenvolvedores após alterações:\n");
        System.out.println(gerente1);
        System.out.println(gerente2);
        System.out.println(junior1);
        System.out.println(junior2);

        System.out.println("\nLista de gerentes e desenvolvedores com seus bônus:\n");
        System.out.println(gerente1 + " bônus= " + gerente1.getBonus());
        System.out.println(gerente2 + " bônus= " + gerente2.getBonus());
        System.out.println(junior1 + " bônus= " + junior1.getBonus());
        System.out.println(junior2 + " bônus= " + junior2.getBonus());

        Gerente_Desenvolvimento gerenteDes1 = new Gerente_Desenvolvimento("Byakuya", 6500.00);
        Gerente_Desenvolvimento gerenteDes2 = new Gerente_Desenvolvimento("Sosuke", 4500.00);

        Desenvolvedor_Senior senior1 = new Desenvolvedor_Senior("Renji", 3500.00);
        Desenvolvedor_Senior senior2 = new Desenvolvedor_Senior("Toshiro", 3500.00);
        Desenvolvedor_Senior senior3 = new Desenvolvedor_Senior("Gin", 3500.00);

        Desenvolvedor_Pleno pleno1 = new Desenvolvedor_Pleno("Sajin", 2500.00);
        Desenvolvedor_Pleno pleno2 = new Desenvolvedor_Pleno("Shunsui", 2500.00);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(gerenteDes1);
        funcionarios.add(gerenteDes2);
        funcionarios.add(senior1);
        funcionarios.add(senior2);
        funcionarios.add(senior3);
        funcionarios.add(pleno1);
        funcionarios.add(pleno2);
        funcionarios.add(junior1);
        funcionarios.add(junior2);

        System.out.println(funcionarios);

        double somaSalario = 0;
        for (Funcionario func : funcionarios) {
            somaSalario += func.getSalario();
        }
        System.out.println("\nTotal dos salários = " + NumberFormat.getCurrencyInstance().format(somaSalario));

        somaSalario = 0;
        for (Funcionario func : funcionarios) {
            somaSalario += func.getSalario() + func.getBonus();
        }
        System.out.println("Total com bônus = " + NumberFormat.getCurrencyInstance().format(somaSalario) + "\n");

        System.out.println("Detalhes dos funcionários:\n");
        for (Funcionario func : funcionarios) {
            System.out.print(func.getClass().getSimpleName());
            System.out.println("{nome= " + func.getNome() + "; bônus= " + NumberFormat.getCurrencyInstance().format(func.getBonus()) + "; salário bruto= " + NumberFormat.getCurrencyInstance().format((func.getSalario() + func.getBonus())) + "};");
        }

        double somaReajuste = 0;
        for (Funcionario func : funcionarios) {
            somaReajuste += func.getSalario() + func.getSalario() * 5/100;
        }
        System.out.println("\nTotal com reajuste de 5% = " + NumberFormat.getCurrencyInstance().format(somaReajuste) + "\n");
    }
}
