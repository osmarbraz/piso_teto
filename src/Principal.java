/*
 * Universidade Federal de Santa Catarina - UFSC
 * Departamento de Informática e Estatística - INE
 * Programa de Pós-Graduação em Ciências da Computação - PROPG
 * Disciplina: Projeto e Análise de Algoritmos
 * Prof Alexandre Gonçalves da Silva 
 *
 * Cálculo de Piso e Teto
 * 
 * Página 40 Thomas H. Cormen 3 ed
 *
 */

/**
 * @author Osmar de Oliveira Braz Junior
 */
public class Principal {

    /**
     * O teto (ceiling) de um número real x é o resultado do arredondamento de x
     * para cima.
     *
     * Página 40 Thomas H. Cormen 3 ed
     *
     * teto(a/b) <= (a+(b-1))/b
     *
     * Em outras palavras, o teto de x é o único número inteiro j tal que
     * j−1<x<=j Ex. O teto de 5/2 = 2.5 é 3
     *
     * Em java pode ser utilizando Math.ceil(double)
     *
     * @param a Número real a ser calculado o teto.
     * @param b Número real a ser calculado o teto.
     * @return um valor inteiro com o teto de x.
     */
    public static int teto(double a, double b) {
        int teto = (int) ((a + (b - 1)) / b);
        return teto;
    }

    /**
     * O teto (ceiling) de um número real x é o resultado do arredondamento de x
     * para cima.
     *
     * Página 40 Thomas H. Cormen 3 ed
     *
     * Em outras palavras, o teto de x é o único número inteiro j tal que
     * j−1<x<=j Ex. O teto de 2.5 é 3
     *
     * Em java pode ser utilizando Math.ceil(double)
     *
     * @param x Número real a ser calculado o teto.
     * @return um valor inteiro com o teto de x.
     */
    public static int teto(double x) {
        //Pego a parte inteira de x;
        int parteInteira = (int) x;
        //Pego a parte fracionária de x
        double parteFracionaria = x - parteInteira;
        //Retorno x subtraindo a parte fracionária e adiciona 1;
        return (int) (x - parteFracionaria) + 1;
    }

    /**
     * O piso (= floor) de um número real x é o resultado do arredondamento de x
     * para baixo.
     *
     * Página 40 Thomas H. Cormen 3 ed
     *
     * piao(a/b) <= (a-(b-1))/b
     *
     * Em outras palavras, o piso de x é o único número inteiro i tal que
     * i<=x<i+1. Ex. O piso de 5/2 = 2.5 é 2
     *
     * Em java pode ser utilizando Math.floor(double)
     *
     * @param a Número real a ser calculado o piso.
     * @param b Número real a ser calculado o piso.
     * @return um valor inteiro com o piso de x.
     */
    public static int piso(double a, double b) {
        int piso = (int) ((a - (b - 1)) / b);
        return piso;
    }

    /**
     * O piso (= floor) de um número real x é o resultado do arredondamento de x
     * para baixo.
     *
     * Página 40 Thomas H. Cormen 3 ed
     *
     * Em outras palavras, o piso de x é o único número inteiro i tal que
     * i<=x<i+1. Ex. O piso de 2.5 é 2
     *
     * Em java pode ser utilizando Math.floor(double)
     *
     * @param x Número real a ser calculado o piso.
     * @return um valor inteiro com o piso de x.
     */
    public static int piso(double x) {
        //Pego a parte inteira de x
        int parteInteira = (int) x;
        //Pego a parte fracionária de x
        double parteFracionaria = x - parteInteira;
        //Retorno x subtraindo a parte fracionária 
        return (int) (x - parteFracionaria);
    }

    public static void main(String[] args) {

        System.out.println(">>> Cálculo do Piso e Teto <<<");

        System.out.println("\n>>> Teto");
        System.out.println("teto(5/2):" + teto(5, 2));
        System.out.println("teto(2.5):" + teto(2.5));

        System.out.println("\n>>> Piso");
        System.out.println("piso(5/2):" + piso(5, 2));
        System.out.println("piso(2.5):" + piso(2.5));
    }
}
