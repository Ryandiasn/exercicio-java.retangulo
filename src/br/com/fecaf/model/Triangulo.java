package br.com.fecaf.model;

import java.util.Arrays;

public class Triangulo {

    // Atributos

    public double base;
    public double ladob;
    public double ladoc;
    public double altura;
    public String nome;
    public double area;
    public double perimetro;

    public void exibirInformacoes () {
        System.out.println("/-----------------------------/");
        System.out.println("Nome do Objeto: " + nome);
        System.out.println("A base é " + base);
        System.out.println("O lado B é " + ladob);
        System.out.println("O lado C é " + ladoc);
        System.out.println("A altura é " + altura);

    }

    public boolean validarTriangulo () {
        if (ladob + ladoc >= base && ladob + base >= ladoc && ladoc + base >= ladob) {
            System.out.println("----------------------------------------");
            System.out.println("O objeto \"" + nome + "\" é um Triângulo");
            return true;
        } else {
            System.out.println("O objeto \"" + nome + "\" não é um  Triângulo");
            return false;
        }

    }
    // calculo de area
    public void calcularArea () {
        area = (base * altura) / 2;
        System.out.println("A Área do objeto \"" + nome + "\" é " + area);

    }

    // calculo de perimetro
    public void calculoPerimetro() {
        perimetro = ladob + ladoc + base;
        System.out.println("O valor do Perímetro é: " + perimetro);
    }

    // tipo de triangulo
    public void tipoTriangulo () {
        if (base == ladob && base == ladoc && ladob == ladoc) {
        System.out.println("Este é um triângulo do tipo equilátero");
        } else if (base == ladob || base == ladoc || ladoc == ladob) {
            System.out.println("Este é um triângulo Isósceles");
        } else {
            System.out.println("Este é um triângulo Escaleno");
        }

    }

    // verificar se é um triangulo reetangulo utilizando de arrays
    public void verificaTrianguloRetangulo () {

        // formula triangulo retangulo: c² + c² = h²
        double [] ladosTriangulo = {base, ladob, ladoc};

        Arrays.sort(ladosTriangulo);

        double cateto1 = ladosTriangulo[0];
        double cateto2 = ladosTriangulo[1];
        double hipotenusa = ladosTriangulo[2];

        if (Math.pow(cateto1, 2) + Math.pow(cateto2, 2) == Math.pow(hipotenusa, 2)) {
            System.out.println("È um triângulo Retângulo");
        }
    }
}
