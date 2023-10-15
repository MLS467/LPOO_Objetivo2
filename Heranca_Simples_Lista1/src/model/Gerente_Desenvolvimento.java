package model;

public class Gerente_Desenvolvimento extends Gerente {

    public Gerente_Desenvolvimento(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return this.getSalario() * ((double) 20 /100);
    }

    @Override
    public String toString() {
        return "\nGerente_Desenvolvimento{nome= " + super.getNome() + ";salário= " + super.getSalario() + "}";
    }
}