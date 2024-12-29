package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class ExerciciosAula19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1 criar vetorA com 5 posições e com valores e 
        //Passar para VetorB com 5 posições.
        /* 
        int[] vetorA = new int[5];
        
        vetorA[0] = 10; 
        vetorA[1] = 20; 
        vetorA[2] = 30; 
        vetorA[3] = 40; 
        vetorA[4] = 50; 

        int[] vetorB = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i];
        }

        System.out.println("VetorB:");
        for (int i : vetorB) {
            System.out.println(i);
        }
            

        //2 vetorB de 8 posições inteiros recebe o dobro do vetorA .

        
        int[] vetorA = new int[8];
        
        vetorA[0] = 5; 
        vetorA[1] = 10; 
        vetorA[2] = 15; 
        vetorA[3] = 20; 
        vetorA[4] = 25; 
        vetorA[5] = 30; 
        vetorA[6] = 35; 
        vetorA[7] = 40; 

        int[] vetorB = new int[8];

        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i] * 2;
        }

        System.out.println("VetorB:");
        for (int i : vetorB) {
            System.out.println(i);
        }
             

        //3 vetor de 15 elementos recebendo o dobro de outros vetores.

       
        int[] vetorA = new int[15];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (i + 1);
        }
        

        int[] vetorB = new int[15];

        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i] * vetorA[i];
        }

        System.out.println("VetorB:");
        for (int i : vetorB) {
            System.out.println(i);
        }
             

             //parei no exercício 7
            //4 vetorB receber o dobro do vetorA de 15 elementos.

               double[] vetorA = new double[15];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (i + 1) * (i + 1);
        }
        

        double[] vetorB = new double[15];

        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = Math.sqrt(vetorA[i]);            
        }

        System.out.println("VetorB:");
        for (double i : vetorB) {
            System.out.println(i);
        }
            
            //5 vetorB = vetorA * i
        
            int[] vetorA = new int[10];

            for (int i = 0; i < vetorA.length; i++) {
                vetorA[i] = (i + 1);
            }
            
    
            int[] vetorB = new int[10];
    
            for (int i = 0; i < vetorA.length; i++) {
                vetorB[i] = vetorA[i] * i;            
            }
    
            System.out.println("VetorB:");
            for (int i : vetorB) {
                System.out.println(i);
            }
        
                    //6 vetorC = vetorB + vetorA
        
                    int[] vetorA = new int[10];
                    int[] vetorB = new int[10];
                    int[] vetorC = new int[10];

                    for (int i = 0; i < vetorA.length; i++) {
                        vetorA[i] = (i + 1);                       
                    }
                    
            
                    for (int i = 0; i < vetorB.length; i++) {
                        vetorB[i] = vetorA[i] * i;            
                    }

                    for (int i = 0; i < vetorC.length; i++) {
                        vetorC[i] = vetorA[i] + vetorB[i];            
                    }

            
                    System.out.println("VetorC:");
                    for (int i : vetorC) {
                        System.out.println(i);
                    }
                        
                    //7 vetorC = vetorB - vetorA
        
                    int[] vetorA = new int[10];
                    int[] vetorB = new int[10];
                    int[] vetorC = new int[10];

                    for (int i = 0; i < vetorA.length; i++) {
                        vetorA[i] = (i + 1);                       
                    }
                    
            
                    for (int i = 0; i < vetorB.length; i++) {
                        vetorB[i] = vetorA[i] * i;            
                    }

                    for (int i = 0; i < vetorC.length; i++) {
                        vetorC[i] = vetorA[i] - vetorB[i];            
                    }

            
                    System.out.println("VetorC:");
                    for (int i : vetorC) {
                        System.out.println(i);
                    }
                
                      //8 vetorC = vetorB * vetorA
        
                      int[] vetorA = new int[10];
                      int[] vetorB = new int[10];
                      int[] vetorC = new int[10];
  
                      for (int i = 0; i < vetorA.length; i++) {
                          vetorA[i] = (i + 1);                       
                      }
                      
              
                      for (int i = 0; i < vetorB.length; i++) {
                          vetorB[i] = vetorA[i] * i;            
                      }
  
                      for (int i = 0; i < vetorC.length; i++) {
                          vetorC[i] = vetorA[i] * vetorB[i];            
                      }
  
              
                      System.out.println("VetorC:");
                      for (int i : vetorC) {
                          System.out.println(i);
                      }
                      
                          //9 vetorC = vetorB / vetorA
        
                          int[] vetorA = new int[10];
                          int[] vetorB = new int[10];
                          int[] vetorC = new int[10];
      
                          for (int i = 0; i < vetorB.length; i++) {
                              vetorB[i] = (i + 1) * 2;                       
                          }
                          
                  
                          for (int i = 0; i < vetorA.length; i++) {
                              vetorA[i] = vetorB[i] * (i + 1);            
                          }
      
                          for (int i = 0; i < vetorC.length; i++) {
                              vetorC[i] = vetorA[i] / vetorB[i];            
                          }
      
                  
                          System.out.println("VetorC:");
                          for (int i : vetorC) {
                              System.out.println(i);
                          }
                              

                        //10 vetorB = vetorA % 2
        
                          int[] vetorA = new int[10];
                          int[] vetorB = new int[10];
                         
      
                          for (int i = 0; i < vetorA.length; i++) {
                              vetorA[i] =  (i + 1);            
                          }

                          for (int i = 0; i < vetorB.length; i++) {
                              vetorB[i] = vetorA[i] % 2;                       
                          }
                          
                  
                          System.out.println("VetorB:");
                          for (int i : vetorB) {
                              System.out.println(i);
                          }
                              

                              
                        //11 a quantidade de elementos neste vetor
        
                          int[] vetorA = new int[10];                          
                         
      
                          for (int i = 0; i < vetorA.length; i++) {
                              vetorA[i] =  (i + 1) * 2;            
                          }                        
                  
                   System.out.println(vetorA.length);
                   

                //12 a soma dos elementos neste vetor
                    
                int[] vetorA = new int[10];    
                int soma = 0;                      
                                    
                
                for (int i = 0; i < vetorA.length; i++) {
                    vetorA[i] =  (i + 1) * 2;            
                }                        

            for (int i : vetorA) {
                soma += i;
            }

            System.out.println(soma);
               
                //13 soma dos vetores múltiplos de 5
      
                int[] vetorA = new int[10];    
                int soma = 0;                      
                                    
                
                for (int i = 0; i < vetorA.length; i++) {
                    vetorA[i] =  (i + 1);            
                }                        

            for (int i : vetorA) {
                if (i % 5 == 0) {
                    soma += i;                    
                }
            }

            System.out.println(soma);
            
        //14 media aritmética dos ímpares
            
        int[] vetorA = new int[10];  
        int soma = 0;
        int cont = 0;  
        int mediaAritmetica;                      
                            
        
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] =  (i + 1);            
        }                        

        for (int i : vetorA) {
        if (i % 2 != 0) {
            soma += i; 
            cont++;                  
        }
        }
        System.out.println("soma " + soma);
        System.out.println("cont " + cont);
        mediaAritmetica = soma / cont;

        System.out.println("Média " + mediaAritmetica);
       
        //15 calcular o percentual de pares e ímpares

        int[] vetorA = new int[10]; 
        int contImpar = 0; 
        int contPar = 0; 
        int percentImpar;
        int percentPar;                        
        
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] =  (i + 1);            
        }                        

        for (int i : vetorA) {
            if (i % 2 != 0) {
                contImpar++;
            } else {
                contPar++;
            }
        }

        percentPar = contPar * 10;
        percentImpar = contImpar * 10;
        System.out.println("percentual par " + percentPar + "%");
        System.out.println("percentual ímpar " + percentImpar + "%");
       

        //16 soma dos vetores menores que 15,
        // quantidade que é maior q 15, media maiores que 15

        int[] vetorA = new int[10]; 
        int somaMenor = 0; 
        int somaMaior = 0; 
        int qtd = 0; 
        int media;
        int cont = 0;
                               
        
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] =  (i + 1) * 3;            
        }                        

        for (int i : vetorA) {
            if (i < 15) {
                somaMenor += i;
            } if(i == 15) {
                qtd++;
            } if (i > 15) {
                cont++;
                somaMaior += i;
            }
        }

        media = somaMaior / cont;
        System.out.println("Soma dos vetores inferiores a 15= " + somaMenor);
        System.out.println("Quantidade dos vetores iguais a 15= " + qtd);
        System.out.println("Média dos vetores superiores a 15= " + media);
        

        //17 quantidade de pessoas acima de 35 anos.

        int[] vetorA = new int[10];       
        int cont = 0; 
        
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] =  (i + 1) * 8;            
        }                        

        for (int i : vetorA) {
            if (i > 35) {
                cont++;
            } 
        }
        System.out.println("Quantidade de pessoas acima dos 35 anos: " +  cont);
       

        //18 a menor idade, maior idade e suas posições.

        
        int[] vetorA = new int[10];       
        int menorIdade = Integer.MAX_VALUE;
        int maiorIdade = Integer.MIN_VALUE;
        int posicaoMenor = 0;
        int posicaoMaior = 0; 
        
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] =  (i + 1) * 8;            
        }  

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] < menorIdade) {
                menorIdade = vetorA[i];
                posicaoMenor = i;
            }
            if (vetorA[i] > maiorIdade) {
                maiorIdade = vetorA[i];
                posicaoMaior = i;
            }
        }

        System.out.println("Menor idade "+ menorIdade + " na posição " + posicaoMenor);
        System.out.println("Maior idade " + maiorIdade + " na posição " + posicaoMaior); 
        

        //19  calcular a media e se for maior que 7 o aluno está aprovado
        // menor que 7 o aluno está reprovado.

        double[] nota1 = new double[10];
        double[] nota2 = new double[10];
        double[] result = new double[10];

        for (int i = 0; i < nota1.length; i++) {
        System.out.println("Informe a nota1 na posição " + i);
        nota1[i] = scan.nextDouble();

        System.out.println("Informe a nota2 na posição " + i);
        nota2[i] = scan.nextDouble();

        result[i] = (nota1[i] + nota2[i]) / 2;
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] >= 7) {
                System.out.println("O aluno " + i  +" está aprovado com " + result[i] + " pontos" );
            } else {
                System.out.println("O aluno " + i  +" está reprovado com " + result[i] + " pontos" );
            }

        }
        
        //20 vetor com 20 elementos
        double[] vetorA = new double[20];
        double cotacaoDollar = 6.14;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = cotacaoDollar * (i + 1);
            System.out.println((i + 1) + " Dollar: R$ " + vetorA[i]);
        }

        //22 gerar aleatoriamente um vetor de 20 elementos com valores de 0 e 1

        int[] vetorA = new int[10];
        int cont0 = 0;
        int cont1 = 0;

        for (int i : vetorA) {
            i = (int)Math.round(Math.random() * 1);
            System.out.println(i);
            if (i == 1) {
                cont0++;
            } else {
                cont1++;
            }
        }

       System.out.println("Percentual de 0: " + (cont0 * 10) + "%");
       System.out.println("Percentual de 1: " + (cont1 * 10) + "%");



        // 23 vetor de 10 elementos e uma flag para parar o jogo se não tiver pelo menos um elemento par


        int[] vetorA = new int[10];
        int contPar = 0;
        boolean parar = false;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Forneça um valor inteiro para a pasição " + i);
            vetorA[i] = scan.nextInt();

        }
        System.out.println("resultado " + vetorA[8]);

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                contPar++;
                System.out.println("houve par");
            }
            if (vetorA[(vetorA.length - 1)] % 2 == 1 && contPar == 0) {
               parar = true;
            }
            if (parar == true) {
                System.out.println("Sem número par, o processo foi enterrompido");
                break;
            }
        }
        System.out.println("O processo chegou ao final com " + contPar + " números pares");



         // 24 verificar se é palindromo

        boolean polindromo = true;
        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Forneça um valor inteiro para a pasição " + i);
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (i < 5) {
                if (vetorA[i] == vetorA[(vetorA.length - 1) - i]) {

                } else {
                    polindromo = false;
                }
            }
        }

        if (polindromo) {
            System.out.println("É políndromo");
        }



        //25 criar vetor A B C com 10 elementos cada. Se A for par B recebe 1 e
        // se for ímpar B recebe 0

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Forneça um valor inteiro para a pasição " + i);
            vetorA[i] = scan.nextInt();
            if (vetorA[i] % 2 == 0) {
                vetorB[i] = 1;
            } else {
                vetorB[i] = 0;
            }
        }

        System.out.println("VetorA");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i]);
        }

        System.out.println("VetorB");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println(vetorB[i]);
        }



        //26 se as regras:
        // A[i] > B[i], C[i] = 1
        //A[i] < B[i], C[i] = -1
        //A[i] == B[i], C[i] = 0

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Forneça um valor inteiro para o vetorA na pasição " + i);
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Forneça um valor  inteiro para o vetorB na pasição " + i);
            vetorB[i] = scan.nextInt();
            if (vetorA[i] > vetorB[i]) {
                vetorC[i] = 1;
            } if (vetorA[i] < vetorB[i]) {
                vetorC[i] = -1;
            } if (vetorA[i] == vetorB[i]) {
                vetorC[i] = 0;
            }
        }

        System.out.println("VetorA");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("VetorB");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

        System.out.println("VetorC");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }



        //27 se as regras:
        // A[i] < 7 B[i] = a
        // A[i] == 7 B[i] = b
        // A[i] > 7 && A[i] < 10  B[i] = c
        // A[i] == 10 B[i] = d
        // A[i] > 10 B[i] = e

        int[] vetorA = new int[10];
        String[] vetorB = new String[10];


        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Forneça um valor inteiro para o vetorA na pasição " + i);
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] < 7) {
                vetorB[i] = "a";
            }
            if (vetorA[i] == 7) {
                vetorB[i] = "b";
            }
            if (vetorA[i] > 7 && vetorA[i] < 10) {
                vetorB[i] = "c";
            }
            if (vetorA[i] == 10) {
                vetorB[i] = "d";
            }
            if (vetorA[i] > 10) {
                vetorB[i] = "e";
            }
        }

        System.out.println("VetorA");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("VetorB");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

         

        //28 vetorB[1] = vetorA[10]
        //   vetorB[2] = vetorA[9] assim por diante

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Forneça um valor inteiro para o vetorA na pasição " + i);
            vetorA[i] = scan.nextInt();            
        }

        for (int i = 0; i < vetorB.length; i++) {
            vetorB[9 - i] = vetorA[i];
        }

        System.out.println("vetorA");
        for (int i : vetorA) {
            System.out.println(i);
        }

        System.out.println("vetorB");
        for (int i : vetorB) {
            System.out.println(i);
        }
            

        //29 vetorC vai receber vetorA e vetorB, vetorC com 20 elementos

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[20];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Forneça um valor inteiro para o vetorA na pasição " + i);
            vetorA[i] = scan.nextInt();  
        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Forneça um valor inteiro para o vetorA na pasição " + i);
            vetorB[i] = scan.nextInt();  
        }

        for (int i = 0; i < vetorC.length; i++) {
            if (i < vetorA.length) {
                vetorC[i] = vetorA[i];
            } else if (i >= vetorA.length) {
                vetorC[i] = vetorB[i - vetorB.length];
            }
        }

        System.out.println();
        for (int i : vetorC) {
            System.out.print(i + " ");
        }
            

        // 30 vetorA contendo valores pares e ímpares
         //   vetorB contendo valores pares do vetorA
         //   vetorC contendo valores ímpares do vetorA

         int[] vetorA = new int[20];
         String[] vetorB = new String[20];
         String[] vetorC = new String[20];
         int contB = 0;
         int contC = 0;

         for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Forneça um valor inteiro para o vetorA na pasição " + i);
            vetorA[i] = scan.nextInt();  
        }

         for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorB[contB] = vetorA[i] + " ";
                contB++;
            } else {
                vetorC[contC] = vetorA[i] + " ";
                contC++;
            }
         }

         System.out.println("vetorB");
        for (String i : vetorB) {
            System.out.print(i + " ");
        }

        System.out.println("\nvetorC");
        for (String i : vetorC) {
            System.out.print(i + " ");
        }
        

        // 31 leia o vetorA e se for par armazene no início do vetorB
        // se for ímpar armazene nas posições restante do vetorB

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int contPar = 0;
        int contImpar = vetorA.length - 1;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Forneça um valor inteiro para o vetorA na pasição " + i);
            vetorA[i] = scan.nextInt(); 
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorB[contPar] = vetorA[i];
                contPar++;
            } else {
                vetorB[contImpar] = vetorA[i];
                contImpar--;
            }
        }

        System.out.println("vetorB");
        for (int i : vetorB) {
            System.out.print(i + " ");
        }
           

            //32 faça uma tabuada com cada número do vetorA de 5 elementos

            int[] vetorA = new int[5];

            for (int i = 0; i < vetorA.length; i++) {
                System.out.println("Forneça um valor inteiro para o vetorA na pasição " + i);
                vetorA[i] = scan.nextInt(); 
            }

            for (int i = 0; i < vetorA.length; i++) {
                System.out.println("\nTabuada de " + vetorA[i] + ":");
                for (int j = 1; j <= 10; j++) {
                    System.out.println(vetorA[i] + " x " + j + " = " + (vetorA[i] * j));
                }
            }
                

            // 33 vetorA de 10 elmentos e uma mensagem indicando se é primo ou não

            int[] vetorA = new int[10];
            boolean verifica;

            for (int i = 0; i < vetorA.length; i++) {
                System.out.println("Informe uma sequência de números para verificar se é primo para o vetorA na pasição " + i);
                do {
                    vetorA[i] = scan.nextInt(); 
                    if (vetorA[i] <= 1) {
                        System.out.println("Informe um número maior que 1!");
                    }

                } while (vetorA[i] <= 1);
            }

            for (int i = 0; i < vetorA.length; i++) {
                verifica = true;

                for (int j = 2; j < vetorA[i]; j++) {

                    if (vetorA[i] % j == 0) {
                        verifica = false;
                    }
                }
                if (verifica) {
                    System.out.println(vetorA[i] + " É primo");
                } else {
                    System.out.println(vetorA[i] + " Não é primo");
                }

            }
               

                //34 vetorA de 10 elementos e uma relação de quantos números são pares

                int[] vetorA = new int[10];
                

                for (int i = 0; i < vetorA.length; i++) {
                    System.out.println("Forneça um valor inteiro para o vetorA na pasição " + i);
                    vetorA[i] = scan.nextInt(); 
                }

                for (int i = 0; i < vetorA.length; i++) {
                    System.out.println("\nQuantidade de pares do número " + vetorA[i] + ": ");
                    for (int j = 0; j <= vetorA[i]; j++) {
                        if (j % 2 == 0) {
                            System.out.print(j + " ");
                        }
                    }
                    System.out.println();
                } 
                    

        //35 emprimir a relação de divisores de cada elemento do vetorA

        int[] vetorA = new int[10];
                

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Forneça um valor inteiro para o vetorA na pasição " + i);
            vetorA[i] = scan.nextInt(); 
        }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("\nQuantidade de divisores do número " + vetorA[i] + ": ");
            for (int j = 2; j <= vetorA[i]; j++) {
                if (vetorA[i] % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        } 
            

            //36 vetorA de 11 elementos que vai receber 2 elevado a sua posição
            // vetorA = 2 elevado a i

            int[] vetorA = new int[11];

            System.out.println("vetorA:");
            for (int i = 0; i < vetorA.length; i++) {
                vetorA[i] = (int)Math.pow(2, i);
                System.out.print(vetorA[i] + " ");
            }
                */

            //37 vetorB vai receber o fatorial do vetorA
            // vetorB = fatorial vetorA

            int[] vetorA = new int[15];

            for (int i = 0; i < vetorA.length; i++) {
                System.out.println("Cálculo de fatorial: Forneça um valor para o vetorA na pasição " + i);
                vetorA[i] = scan.nextInt(); 
            }

            
        //   5! =  5 * 4 * 3 * 2 * 1 = 120
       
        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Fatorial de " + vetorA[i]);

            System.out.print(vetorA[i] + "! = ");
            int fatorital = 1;
            for (int j = vetorA[i]; j > 1; j--) {
                fatorital *= j;
                System.out.print(j + " . ");
            }
            System.out.println("1 = " + fatorital);
        }


                

                
    
            
        




    }
}
