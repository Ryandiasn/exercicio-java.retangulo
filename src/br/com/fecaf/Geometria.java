package br.com.fecaf;

import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;

public class Geometria {
    public static void main(String[] args) {

        // instanciar objeto
        Retangulo ObjRetangulo = new Retangulo();

        ObjRetangulo.nome = "Retangulo1";
        ObjRetangulo.lado1 = 10;
        ObjRetangulo.lado2 = 5;

        ObjRetangulo.exibirNaTela();
        ObjRetangulo.CalcularArea();
        ObjRetangulo.CalcularPerimetro();

        // pular linha
        System.out.println();

        // segunda instancia
        Retangulo ObjRetangulo2 = new Retangulo();

        ObjRetangulo2.nome = "Retangulo2";

        ObjRetangulo2.lado1 = 20;
        ObjRetangulo2.lado2 = 20;

        ObjRetangulo2.exibirNaTela();
        ObjRetangulo2.CalcularArea();
        ObjRetangulo2.CalcularPerimetro();

        // verificqr se é um quadrado

        ObjRetangulo.validarRetanguloEspecial();
        ObjRetangulo2.validarRetanguloEspecial();

        // instanciar circulo

        Circulo ObjCirculo = new Circulo();

        ObjCirculo.nome = "Circulo1";
        ObjCirculo.raio = 10;
        ObjCirculo.exibirInformacoes();
        ObjCirculo.calcularDiametro();
        ObjCirculo.calcularArea();
        ObjCirculo.calcularPerimetro();


        // Circulo 2

        Circulo ObjCirculo2 = new Circulo();

        ObjCirculo2.nome = "Circulo2";
        ObjCirculo2.raio = 20;
        ObjCirculo2.exibirInformacoes();
        ObjCirculo2.calcularDiametro();
        ObjCirculo2.calcularArea();
        ObjCirculo2.calcularPerimetro();

    }
}
