package model;

public class Gerente_Geral extends Gerente {

    public Gerente_Geral() {
    }

    public Gerente_Geral(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return this.getSalario() * 0.4;
    }

    @Override
    public String toString() {
        return "\nGerente_Geral{nome= " + super.getNome() + ";salário= " + super.getSalario() + "}";
    }


}