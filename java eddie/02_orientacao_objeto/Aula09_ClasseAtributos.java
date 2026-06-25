public class Aula09_ClasseAtributos {
    public static void main(String[]args) {
        Carro09 meucarro = new Carro09();
        meucarro.modelo = "Fusca";
        meucarro.cor: "Azul";
        meucarro.ano: 1975;

        Carro09 meucarro2 = new Carro09();
        meucarro2.modelo: "Fiat";
        meucarro2.cor: "Preto";
        meucarro2.ano: 2009;

        System.out.println("Carro criado" + meucarro.modelo + " " + meucarro.cor)

    }
}