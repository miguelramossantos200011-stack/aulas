


public class Empresa {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Ana Silva", 12000.60, "Vendas", 1);

        desenvolvedor dev = new desenvolvedor("Miguel", 23000.98, "BackEnd", "java");

        System.out.println("====+ Dados do gerente +====");
        System.out.println("nome: " + gerente.get_nome());
        System.out.println("salário: " + gerente.get_salario());
        System.out.println("área: " + gerente.get_area());
        System.out.println("equipe: " + gerente.get_equipe());
        gerente.trabalhar();
        gerente.aprovar_verba();

        System.out.println("====+ Dados do desenvolvedor +====");
        System.out.println("nome: " + dev.get_nome());
        System.out.println("salário: " + dev.get_salario());
        System.out.println("área: " + dev.get_area());
        dev.trabalhar();
        dev.trabalhar();
        dev.programar();


    }
}