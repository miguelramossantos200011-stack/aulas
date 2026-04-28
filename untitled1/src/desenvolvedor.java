public class desenvolvedor extends funcionario {

    private String linguagem;

    public desenvolvedor(String nome, double salario, String area, String linguagem) {

        super(nome, salario, area);
        this.linguagem = linguagem;

    }

    public void programar() {

        System.out.println("O programador " + this.nome + " da área " + this.area + "está programando em " + this.linguagem);

    }

}
