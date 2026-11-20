void main() {
    String[] paraules = {"gat", "girafa", "gos"};
    String mesLlarga = paraules[0];

    for (int i = 1; i < paraules.length; i++) {
        if (paraules[i].length() > mesLlarga.length()) {
            mesLlarga = paraules[i];
        }
    }

    System.out.println("Paraula més llarga: " + mesLlarga);
    System.out.println("Longitud: " + mesLlarga.length());
}
