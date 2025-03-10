package com.loiane.cursojava.aula27;

public class ExerciciosAula27 {
    public static void main(String[] args) {

//        Exercícios	de	Java	– Aulas	25	a	27 – OO	– Classes	e	Métodos
//        Link do curso: http://www.loiane.com/2013/10/curso-java-basico-java-se-gratuito/
//        1. Escreva	uma classe para	representar	uma	lâmpada. Desenvolva	métodos
//        para	ligar,	desligar	a	lampada.

        Lampada lampada = new Lampada();
        lampada.tensaoVolts = 127;
        lampada.potenciaW = 10;
        //lampada.ligarLampada();
        lampada.desligarLampada();

        System.out.println("\nLampada:\n" +
                "tensao = " + lampada.tensaoVolts + "v\n" +
                "potência = " + lampada.potenciaW + "w\n" +
                "A lâmpada está ligada = " + lampada.ligada);


//        2. Cria	uma	classe	para	representar	uma	conta	corrente	que	possui	um
//        número,	um	saldo,	um	status	que	informa	se	ela	é	especial	ou	não,	um
//        limite. Desenvolva	métodos	para	realizar	saque	(verificando	se	o	cliente
//                pode	realizar	saques),	despositar	dinheiro,	consultar	saldo	e	verificar	se	o
//        cliente	está	usando	cheque	especial	ou	não.	Desenvolva	um	programa
//        para	testar	essa	classe.




//        3. Escreva	uma	class	para	representar	um	Aluno.	Adicione	atributos
//        relacionados	às	caracteristicas	de	um	Aluno,	como	nome,	matricula,	curso
//        que	está	matriculado,	nome	de	3	disciplinas	que	está	cursando e	as	notas
//        dessas 3 disciplinas. Desenvolva	um	método	para	verificar	se	o	aluno	está
//        aprovado	(nota	maior	ou	igual	a	7)	em	uma determinada	disciplina.
//        Escreva	um	programa	para	testar	essa	classe,	que	pede	as	informações	do
//            aluno	ao	usuário	e	ao	final	informa	o	nome	das	disciplinas,	mostra as
//        notas e	mostra	se	o	aluno	foi	aprovado	ou	não.


//        4. Reescreva	o	exercício	6	da	aula	20	(Jogo	da	Velha).	Desenvolva	uma	classe
//        para	representar	o	Jogo	da	Velha.	Desenvolva	uma	classe	para	testar	o
//        Jogo.


    }
}
