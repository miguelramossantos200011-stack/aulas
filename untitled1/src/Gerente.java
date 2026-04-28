public class Gerente extends funcionario {

    private int equipe;

    public Gerente(String nome, double salario, String area, int equipe) {

        super(nome, salario, area);
        this.equipe = equipe;

    }

    public void aprovar_verba() {

        System.out.println("O gerente " + this.nome + "da area" + this.area + " da equipe " + this.equipe + "aprovou a verba");

    }

    public int get_equipe() {return this.equipe;}

}
