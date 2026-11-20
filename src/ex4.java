void main() {
    Scanner input = new Scanner (System.in);
    System.out.println("Diga'm una paraula");
    String [] frase = {input.nextLine()};
    String paraula = frase[0];
    if (paraula.length() < 3) {
        System.out.println(paraula);
    }
    int inici = paraula.length() - 3;
    String ultimTros = paraula.substring(inici);

    if (ultimTros.equals("ing")) {
        System.out.println(paraula + "ly");
    } else {
        System.out.println(paraula + "ing");
    }
}
