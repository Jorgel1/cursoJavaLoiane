package com.loiane.cursojava.aula24;

import javax.imageio.ImageReader;
import java.util.Date;

public class ExerciciosAula24 {
    public static void main(String[] args) {


        //   Exercícios	de	Java	– Aula	24 – OO	– Classes	e	Atributos
        //  Link do curso: http://www.loiane.com/2013/10/curso-java-basico-java-se-gratuito/
        //  1. Escreva	uma classe para	representar	uma	lâmpada	que	está	à	venda	em
        //   um	supermercado.

        Lampada led = new Lampada();

        led.marca = "Philips";
        led.voltagem = 127;
        led.potencia = 10;

        System.out.println("\nLampada led\nmarca = " + led.marca + "\n" +
                "voltagem = " + led.voltagem + "\npotencia = " + led.potencia);

        //versão da professora

        LampadaProfessora lampada = new LampadaProfessora();
        lampada.tensao = "Bivolt";
        lampada.garantiaMeses = 36;
        lampada.potencia = 7;
        lampada.cor = "Amarelo";
        lampada.tipoLuz = "Amarelo";
        lampada.tipoAbajur = true;

        lampada.tipos = new String[5];
        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "Lampeões";

        System.out.print("\nLampada\nmodelo = " + lampada.tensao + "\n" +
                "garantia = " + lampada.garantiaMeses + "\npotencia = " + lampada.potencia
                + "\ncor = " + lampada.cor + "\ntipo de luz = " + lampada.tipoLuz);

        System.out.print( "\ntipos = ");
        for (String tipo : lampada.tipos) {
            if (!(tipo == null || tipo.isEmpty())) {
                System.out.print(tipo + ", ");
            }
        }
        System.out.println();



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

        //versao professora

        LivrodeBibliotecaProfessora livrodeBiblioteca = new LivrodeBibliotecaProfessora();

        livrodeBiblioteca.autor = "Joaquim Ferreira dos Santos";
        livrodeBiblioteca.editora = "Objetiva";
        livrodeBiblioteca.nome = "As cem melhores crônicas brasileiras";
        livrodeBiblioteca.qtdPaginas = 360;

        livrodeBiblioteca.emprestado = true;
        livrodeBiblioteca.dataEntrega = new Date();
        livrodeBiblioteca.nomeCliente = "Davi";

        System.out.println("\nLivro cronica\nautor = " + livrodeBiblioteca.autor + "\n" +
                "editora = " + livrodeBiblioteca.editora + "\nnome = " + livrodeBiblioteca.nome
                + "\npaginas = " + livrodeBiblioteca.qtdPaginas  + "\nemprestado? = " + livrodeBiblioteca.emprestado + "\ndata entrega = " + livrodeBiblioteca.dataEntrega);


        //    5. Cria	uma	classe	para	representar	uma	conta	corrente	que	possui	um
        //   número,	um	saldo,	um	status	que	informa	se	ela	é	especial	ou	não,	um
        //   limite.

        ContaCorrente jose = new ContaCorrente();

        jose.numero = "100343";
        jose.agencia = "123";
        jose.saldo = 120.00;
        jose.especial = true;
        jose.limiteEspecial = 500.00;

        System.out.println("\nConta Corrente\nNúmero = " + jose.numero + "\nagencia = " + jose.agencia + "\n" +
                "Saldo = " + jose.saldo + "\nEspecial = " + jose.especial
                + "\nLimite = " + jose.limiteEspecial);

        //   6. Crie	uma	classe	que	represente	um	contato	da	agenda	do	seu	celular.

        Contato marcio = new Contato();

        marcio.numeroTelefone = 27999104142L;
        marcio.nome = "Marcio da Costa";

        System.out.println("\nContato:\nNome = " + marcio.nome + "\n" +
                "Telefone = " + marcio.numeroTelefone);

        //versao professora

        ContatoProfessora contatoProfessora = new ContatoProfessora();

        contatoProfessora.telefones = new String[5];
        contatoProfessora.telefones[0] = "27999104140";
        contatoProfessora.telefones[1] = "27999104141";
        contatoProfessora.telefones[2] = "27999104142";
        contatoProfessora.nome = "Marcio da Costa";
        contatoProfessora.endereco = "Rua Amazonas";
        contatoProfessora.email = "marcio.costa@gmail.com";

        System.out.println("\nContato:\nNome = " + contatoProfessora.nome +
                "\nEndereço = " + contatoProfessora.endereco +
                "\nTelefone = " + contatoProfessora.telefones[0] +
                "\nTelefone = " + contatoProfessora.telefones[1] +
                "\nTelefone = " + contatoProfessora.telefones[2] +
                "\nEmail = " + contatoProfessora.email);

        //Finalizei correção dos exercicios aula 24



    }
}
