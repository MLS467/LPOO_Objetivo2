package model;

public class Desenvolvedor_Senior extends Desenvolvedor {


    public Desenvolvedor_Senior(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return this.getSalario() * (10/100);
    }

    @Override
    public String toString() {
        return "\nDesenvolvedor_Senior{nome= " + super.getNome() + ";salário= " + super.getSalario() + "}";
    }
}