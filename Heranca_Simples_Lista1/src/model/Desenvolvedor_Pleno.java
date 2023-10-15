package model;

public class Desenvolvedor_Pleno extends Desenvolvedor {

    public Desenvolvedor_Pleno(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return this.getSalario() * 0.5;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedor_Pleno{nome= " + super.getNome() + ";salário= " + super.getSalario() + "}";
    }
}
