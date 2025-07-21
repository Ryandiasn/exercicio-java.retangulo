package br.com.fecaf.model;

public class Circulo {

    // atributos
    public String nome;
    public double raio;
    public double diametro;
    public double area;
    public double perimetro;

    // métodos
    public void exibirInformacoes () {
        System.out.println("/----------------------------/");
        System.out.println("Nome:" + nome);
        System.out.println("Raio:" + raio);
        System.out.println("/----------------------------/");



    }
    // calculo do diametro
    public void calcularDiametro () {
        diametro = raio * 2;
        System.out.println("Com base no Raio " + raio + " o Díâmetro de \"" +  nome + "\" é: " + diametro);
    }

    // calculo do perimetro
    public void calcularPerimetro () {
        perimetro = (2 * Math.PI) * raio;
        System.out.println("O valor do Perímetro de \"" + nome + "\" é: " + perimetro);
    }

    // calcular area
    public void calcularArea () {
        area = Math.pow(raio, 2) * Math.PI;
        System.out.println("O valor da Área de \"" + nome + "\" é: " + area);
    }

}
