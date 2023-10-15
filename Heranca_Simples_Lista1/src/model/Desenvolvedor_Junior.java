package model;

public class Desenvolvedor_Junior extends Desenvolvedor {

    public Desenvolvedor_Junior() {
    }

    public Desenvolvedor_Junior(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return this.getSalario() * (5/100);
    }

    @Override
    public String toString() {
        return "\nDesenvolvedor_Junior{nome= " + super.getNome() + ";salário= " + super.getSalario() + "}";
    }
}