


void main() {

    Scanner sc = new Scanner(System.in);

    System.out.println("insira seu nome: ");
    String nm = sc.nextLine();

    System.out.println("Insira sua idade: ");
    int idd = sc.nextInt();

    PP pp = new PP(nm, idd);

    System.out.println("infpss: ");
    pp.exibirinf();

    if (pp.isMiidd()){

        System.out.println("Você é maior de idade");

    } else {

        System.out.println("Você é menor de idade");

    }

    sc.close();


}
