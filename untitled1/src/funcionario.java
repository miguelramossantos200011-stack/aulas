public class funcionario {

    protected String nome;
    protected double salario;
    protected String area;

    public funcionario(String nome, double salario, String area) {

        this.nome = nome;
        this.salario = salario;
        this.area = area;

    }

    public void trabalhar() {

        System.out.println(this.nome + "está trabalhando");

    }

    public String get_nome() {return this.nome;}

    public double get_salario() {return this.salario;}

    public String get_area() {return this.area;}

}
