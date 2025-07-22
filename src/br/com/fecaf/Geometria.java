package br.com.fecaf;

import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;
import br.com.fecaf.model.Triangulo;

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


        // instanciar triangulo

        Triangulo ObjTriangulo = new Triangulo();

        ObjTriangulo.nome = "Triângulo1";
        ObjTriangulo.base = 10;
        ObjTriangulo.ladob = 5;
        ObjTriangulo.ladoc = 4;
        ObjTriangulo.altura = 0;

        boolean validaTriangulo = ObjTriangulo.validarTriangulo();
            if (validaTriangulo) {
                ObjTriangulo.exibirInformacoes();
                ObjTriangulo.calcularArea();
                ObjTriangulo.calculoPerimetro();
                ObjTriangulo.tipoTriangulo();
                ObjTriangulo.verificaTrianguloRetangulo();

            }


        Triangulo ObjTriangulo2 = new Triangulo();

        ObjTriangulo2.nome = "Triângulo2";
        ObjTriangulo2.base = 10;
        ObjTriangulo2.ladob = 10;
        ObjTriangulo2.ladoc = 10;
        ObjTriangulo2.altura = 7;

        boolean validaTriangulo2 = ObjTriangulo2.validarTriangulo();
            if (validaTriangulo2) {
                ObjTriangulo2.exibirInformacoes();
                ObjTriangulo2.calcularArea();
                ObjTriangulo2.calculoPerimetro();
                ObjTriangulo2.tipoTriangulo();
                ObjTriangulo.verificaTrianguloRetangulo();

            }



    }
}
