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

         */

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

        // 0 - 9   1 - 8    2 - 7  3  - 6   4 - 5
        // 1 2 345      5 43 2 1


    }
}