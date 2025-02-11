package com.loiane.cursojava.aula24;

public class ExerciciosAula24 {
    public static void main(String[] args) {


        //   Exercícios	de	Java	– Aula	24 – OO	– Classes	e	Atributos
        //  Link do curso: http://www.loiane.com/2013/10/curso-java-basico-java-se-gratuito/
        //  1. Escreva	uma classe para	representar	uma	lâmpada	que	está	à	venda	em
        //   um	supermercado.

        Lampada led = new Lampada();

        led.marca = "Philips";
        led.vontagem = 127;
        led.potencia = 10;

        System.out.println("\nLampada led\nmarca = " + led.marca + "\n" +
                "voltagem = " + led.vontagem + "\npotencia = " + led.potencia);


        //   2. Crie	uma classe Livro	que	represente	os	dados	básicos	de	um	livro,	sem	se
        //   preocupar	com	a	sua	finalidade.

        Livro aventura = new Livro();

        aventura.autor = "J. K. Rowling";
        aventura.editora = "Bloomsbury Publishing Rocco Presença";
        aventura.nome = "Harry Potter";
        aventura.qtdPaginas = 300;
        aventura.valor = 60.00;

        System.out.println("\nLivro aventura\nautor = " + aventura.autor + "\n" +
                "editora = " + aventura.editora + "\nnome = " + aventura.nome
        + "\npaginas = " + aventura.qtdPaginas + "\nvalor = " + aventura.valor);

        //   3. Usando	o	resultado	do	exercício	anterior como	base,	crie	uma classe
        // “LivroDeLivraria”	que	represente	os	dados	básicos	de	um	livro	que	está	à
        //   venda	em	uma	livraria.

        LivroDeLivraria detetive = new LivroDeLivraria();

        detetive.autor = "Árthur Conan Doyle";
        detetive.editora = "Editora Melhoramentos";
        detetive.nome = "Sherlock Holmes - The Sign of the Four";
        detetive.qtdPaginas = 232;
        detetive.valor = 64.00;
        detetive.ano = 1890;

        System.out.println("\nLivro detetive\nautor = " + detetive.autor + "\n" +
                "editora = " + detetive.editora + "\nnome = " + detetive.nome
                + "\npaginas = " + detetive.qtdPaginas + "\nvalor = " + detetive.valor);


        //    4. Usando	o	resultado	do	modelo	“Livro”	como	base,	crie	uma classe
        // “LivroDeBiblioteca”	que	represente	os	dados	básicos	de	um	livro	de	uma
        //   biblioteca,	que	pode	ser	emprestado	a leitores.

        LivroDeBiblioteca cronica = new LivroDeBiblioteca();

        cronica.autor = "Joaquim Ferreira dos Santos";
        cronica.editora = "Objetiva";
        cronica.nome = "As cem melhores crônicas brasileiras";
        cronica.qtdPaginas = 360;
        cronica.ano = 2007;

        System.out.println("\nLivro cronica\nautor = " + cronica.autor + "\n" +
                "editora = " + cronica.editora + "\nnome = " + cronica.nome
                + "\npaginas = " + cronica.qtdPaginas + "\nano = " + cronica.ano);

        //    5. Cria	uma	classe	para	representar	uma	conta	corrente	que	possui	um
        //   número,	um	saldo,	um	status	que	informa	se	ela	é	especial	ou	não,	um
        //   limite.


        //   6. Crie	uma	classe	que	represente	um	contato	da	agenda	do	seu	celular.


        //Parei exercicio 5 da aula 24
    }
}
