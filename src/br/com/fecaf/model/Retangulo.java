package br.com.fecaf.model;



public class Retangulo {
    public double lado1, lado2;
    public double area;
    public double perimetro;
    public String nome;

    public void exibirNaTela() {
        System.out.println("--------------------/");
        System.out.println("Nome: " + nome);
        System.out.println("Lado 1: " + lado1);
        System.out.println("lado 2: " + lado2);
        System.out.println("--------------------/");


    }

    public void CalcularArea() {
        area = lado1 * lado2;
        {
            System.out.println("A area do retangulo \"" + nome + "\" é " + area);
        }

    }

    public void CalcularPerimetro() {
        perimetro = 2 * (lado1 + lado2);
        {
            System.out.println("O Perímetro do retângulo \"" + nome + "\" é " + perimetro);
        }
    }

    public void validarRetanguloEspecial() {
        if (lado1 == lado2) {
            System.out.println("O " + nome + " na verdade é um quadrado");
        } else {
            System.out.println("O " + nome + " não é um quadrado");
        }

    }
}



