import java.util.Scanner;

public class Quiz1 {

        public static void main (String[] args) {
            int numeroAcertos = 0;
            String linha1 = "Aluno: Lucas Neves Souza";
            String linha2 = "Universidade Unifan - Turma: ESN2";
            String linha3 = "Bem vindo ao Quiz de conhecimentos gerais. Se Divirta";

            System.out.println(linha1 + "\n" + linha2 + "\n" + "\n" + linha3);

            // métodos das questões
            numeroAcertos = numeroAcertos + questao1();
            numeroAcertos = numeroAcertos + questao2();
            numeroAcertos = numeroAcertos + questao3();
            numeroAcertos = numeroAcertos + questao4();
            numeroAcertos = numeroAcertos + questao5();
            numeroAcertos = numeroAcertos + questao6();
            numeroAcertos = numeroAcertos + questao7();
            numeroAcertos = numeroAcertos + questao8();
            numeroAcertos = numeroAcertos + questao9();
            numeroAcertos = numeroAcertos + questao10();
            numeroAcertos = numeroAcertos + questao11();
            numeroAcertos = numeroAcertos + questao12();
            numeroAcertos = numeroAcertos + questao13();
            numeroAcertos = numeroAcertos + questao14();
            numeroAcertos = numeroAcertos + questao15();

            System.out.println("\n" + "Fim do Quiz! Parabéns... Você acertou " + numeroAcertos + " de 15 perguntas");

            // gabarito
            System.out.println("\n" + "Gabarito:");
            System.out.println("Questao 1) D");
            System.out.println("Questao 2) B");
            System.out.println("Questao 3) C");
            System.out.println("Questao 4) B");
            System.out.println("Questao 5) A");
            System.out.println("Questao 6) C");
            System.out.println("Questao 7) B");
            System.out.println("Questao 8) D");
            System.out.println("Questao 9) A");
            System.out.println("Questao 10) D");
            System.out.println("Questao 11) C");
            System.out.println("Questao 12) A");
            System.out.println("Questao 13) D");
            System.out.println("Questao 14) B");
            System.out.println("Questao 15) D");
        }
        // Questões
        public static int questao1() {
            int cont = 0; // contador de repostas corretas
            String respostaUsuario = "";

            System.out.println("====================================================");

            Questao questao1 = new Questao();
            questao1.pergunta = "1) Qual o animal mais rápido do mundo?";
            questao1.opcaoA = "A) Peixe-vela";
            questao1.opcaoB = "B) Cascavel-chifruda";
            questao1.opcaoC = "C) Guepardo";
            questao1.opcaoD = "D) Falcão Peregrino";
            questao1.correta = "D";
            questao1.escrevaQuestao();
            respostaUsuario = leiaResposta();
            if (questao1.isCorreta(respostaUsuario)) {
                cont ++;
            }
            System.out.println("====================================================");
            return cont;
        }

        public static int questao2() {
            int cont = 0;
            String respostaUsuario = "";

            System.out.println("====================================================");

            Questao questao2 = new Questao();
            questao2.pergunta = "2) Qual o nome dado ao supercontinente que compunha a superfície terrestre que deu origem à configuração dos continentes atualmente?";
            questao2.opcaoA = "A) Continental";
            questao2.opcaoB = "B) Pangeia";
            questao2.opcaoC = "C) Mesosfera";
            questao2.opcaoD = "D) Manaslu";
            questao2.correta = "B";
            questao2.escrevaQuestao();
            respostaUsuario = leiaResposta();
            if (questao2.isCorreta(respostaUsuario)) {
                cont ++;
            }
            System.out.println("====================================================");
            return cont;
        }

        public static int questao3() {
            int cont = 0;
            String respostaUsuario = "";

            System.out.println("====================================================");

            Questao questao3 = new Questao();
            questao3.pergunta = "3)Qual foi o maior conflito armado internacional ocorrido na América Latina?";
            questao3.opcaoA = "A) 1º Guerra Mundial";
            questao3.opcaoB = "B) Guerra dos canudos";
            questao3.opcaoC = "C) Guerra do Paraguai";
            questao3.opcaoD = "D) Guerra do Cenepa";
            questao3.correta = "C";
            questao3.escrevaQuestao();
            respostaUsuario = leiaResposta();
            if (questao3.isCorreta(respostaUsuario)) {
                cont ++;
            }
            System.out.println("====================================================");
            return cont;
        }

        public static int questao4() {
            int cont = 0;
            String respostaUsuario = "";

            System.out.println("====================================================");

            Questao questao4 = new Questao();
            questao4.pergunta = "4) Em qual país se encontra o Coliseu?";
            questao4.opcaoA = "A) Roma";
            questao4.opcaoB = "B) Grécia";
            questao4.opcaoC = "C) Suécia";
            questao4.opcaoD = "D) Egito";
            questao4.correta = "B";
            questao4.escrevaQuestao();
            respostaUsuario = leiaResposta();
            if (questao4.isCorreta(respostaUsuario)) {
                cont ++;
            }
            System.out.println("====================================================");
            return cont;
        }
        public static int questao5() {
            int cont = 0;
            String respostaUsuario = "";

            System.out.println("====================================================");

            Questao questao5 = new Questao();
            questao5.pergunta = "5) Qual o maior continente do mundo?";
            questao5.opcaoA = "A) Ásia";
            questao5.opcaoB = "B) Oceania";
            questao5.opcaoC = "C) América";
            questao5.opcaoD = "D) Europa";
            questao5.correta = "A";
            questao5.escrevaQuestao();
            respostaUsuario = leiaResposta();
            if (questao5.isCorreta(respostaUsuario)) {
               cont ++;
            }
            System.out.println("====================================================");
            return cont;
        }
        public static int questao6() {
            int cont = 0;
            String respostaUsuario = "";

            System.out.println("====================================================");

            Questao questao6 = new Questao();
            questao6.pergunta = "6) Quantos estados tem no Brasil?";
            questao6.opcaoA = "A) 28";
            questao6.opcaoB = "B) 22";
            questao6.opcaoC = "C) 26";
            questao6.opcaoD = "D) 27";
            questao6.correta = "C";
            questao6.escrevaQuestao();
            respostaUsuario = leiaResposta();
            if (questao6.isCorreta(respostaUsuario)) {
                cont ++;
            }
            System.out.println("====================================================");
            return cont;
        }
        public static int questao7() {
            int cont = 0;
            String respostaUsuario = "";

            System.out.println("====================================================");

            Questao questao7 = new Questao();
            questao7.pergunta = "7) Qual foi o primeiro presidente do Brasil?";
            questao7.opcaoA = "A) Nilo Peçanha";
            questao7.opcaoB = "B) Deodoro da Fonseca";
            questao7.opcaoC = "C) Getúlio Vargas";
            questao7.opcaoD = "D) Juscelino Kubitschek";
            questao7.correta = "B";
            questao7.escrevaQuestao();
            respostaUsuario = leiaResposta();
            if (questao7.isCorreta(respostaUsuario)) {
                cont ++;
            }
            System.out.println("====================================================");
            return cont;
        }
        public static int questao8() {
            int cont = 0;
            String respostaUsuario = "";

            System.out.println("====================================================");

            Questao questao8 = new Questao();
            questao8.pergunta = "8) Qual o bioma predominante do centro oeste?";
            questao8.opcaoA = "A) Pantanal";
            questao8.opcaoB = "B) Pampa";
            questao8.opcaoC = "C) Caatinga";
            questao8.opcaoD = "D) Cerrado";
            questao8.correta = "D";
            questao8.escrevaQuestao();
            respostaUsuario = leiaResposta();
            if (questao8.isCorreta(respostaUsuario)) {
                cont ++;
            }
            System.out.println("====================================================");
            return cont;
        }
        public static int questao9() {
            int cont = 0;
            String respostaUsuario = "";

            System.out.println("====================================================");

            Questao questao9 = new Questao();
            questao9.pergunta = "9) Quantas constituições teve o Brasil?";
            questao9.opcaoA = "A) 7";
            questao9.opcaoB = "B) 8";
            questao9.opcaoC = "C) 4";
            questao9.opcaoD = "D) 2";
            questao9.correta = "A";
            questao9.escrevaQuestao();
            respostaUsuario = leiaResposta();
            if (questao9.isCorreta(respostaUsuario)) {
                cont ++;
            }
            System.out.println("====================================================");
            return cont;
        }
        public static int questao10() {
            int cont = 0;
            String respostaUsuario = "";

            System.out.println("====================================================");

            Questao questao10 = new Questao();
            questao10.pergunta = "10) Quem pintou a monalisa?";
            questao10.opcaoA = "A) Van Gogh";
            questao10.opcaoB = "B) Pablo Picasso";
            questao10.opcaoC = "C) Salvador Dalí";
            questao10.opcaoD = "D) Leonardo da Vinci";
            questao10.correta = "D";
            questao10.escrevaQuestao();
            respostaUsuario = leiaResposta();
            if (questao10.isCorreta(respostaUsuario)) {
                cont ++;
            }
            System.out.println("====================================================");
            return cont;
        }
        public static int questao11() {
            int cont = 0;
            String respostaUsuario = "";

            System.out.println("====================================================");

            Questao questao11 = new Questao();
            questao11.pergunta = "11) Qual personagem do folclore brasileiro tem os pés virados para trás?";
            questao11.opcaoA = "A) Saci";
            questao11.opcaoB = "B) Mula sem cabeça";
            questao11.opcaoC = "C) Curupira";
            questao11.opcaoD = "D) Boto cor de rosa";
            questao11.correta = "C";
            questao11.escrevaQuestao();
            respostaUsuario = leiaResposta();
            if (questao11.isCorreta(respostaUsuario)) {
                cont ++;
            }
            System.out.println("====================================================");
            return cont;
        }
        public static int questao12() {
            int cont = 0;
            String respostaUsuario = "";

            System.out.println("====================================================");

            Questao questao12 = new Questao();
            questao12.pergunta = "12) Quanto tempo a luz do Sol demora para chegar à Terra?";
            questao12.opcaoA = "A) 8 minutos";
            questao12.opcaoB = "B) 12 minutos";
            questao12.opcaoC = "C) 8 horas";
            questao12.opcaoD = "D) 1 dia";
            questao12.correta = "A";
            questao12.escrevaQuestao();
            respostaUsuario = leiaResposta();
            if (questao12.isCorreta(respostaUsuario)) {
                cont ++;
            }
            System.out.println("====================================================");
            return cont;
        }
        public static int questao13() {
            int cont = 0;
            String respostaUsuario = "";

            System.out.println("====================================================");

            Questao questao13 = new Questao();
            questao13.pergunta = "13) Qual foi o recurso utilizado inicialmente pelo homem para explicar a origem das coisas?";
            questao13.opcaoA = "A) A Biologia";
            questao13.opcaoB = "B) A Filosofia";
            questao13.opcaoC = "C) A Astronomia";
            questao13.opcaoD = "D) A Mitologia";
            questao13.correta = "D";
            questao13.escrevaQuestao();
            respostaUsuario = leiaResposta();
            if (questao13.isCorreta(respostaUsuario)) {
                cont ++;
            }
            System.out.println("====================================================");
            return cont;
        }
        public static int questao14() {
            int cont = 0;
            String respostaUsuario = "";

            System.out.println("====================================================");

            Questao questao14 = new Questao();
            questao14.pergunta = "14) Quem foi o primeiro homem a pisar na Lua?";
            questao14.opcaoA = "A) Charles Duke";
            questao14.opcaoB = "B) Neil Armstrong";
            questao14.opcaoC = "C) Buzz Aldrin";
            questao14.opcaoD = "D) Yuri Gagarin";
            questao14.correta = "B";
            questao14.escrevaQuestao();
            respostaUsuario = leiaResposta();
            if (questao14.isCorreta(respostaUsuario)) {
                cont ++;
            }
            System.out.println("====================================================");
            return cont;
        }
        public static int questao15() {
            int cont = 0;
            String respostaUsuario = "";

            System.out.println("====================================================");

            Questao questao15 = new Questao();
            questao15.pergunta = "15) Quais são os cromossomos que determinam o sexo masculino?";
            questao15.opcaoA = "A) Cromossomo X";
            questao15.opcaoB = "B) Cromossomo Z";
            questao15.opcaoC = "C) Cromossomo W";
            questao15.opcaoD = "D) Cromossomo Y";
            questao15.correta = "D";
            questao15.escrevaQuestao();
            respostaUsuario = leiaResposta();
            if (questao15.isCorreta(respostaUsuario)) {
                cont ++;
            }
            System.out.println("====================================================");
            return cont;
        }


        // leitura de repostas
        public static String leiaResposta() {
            Scanner ler = new Scanner(System.in);
            String resp;
            do {
                System.out.println("Digite a reposta: ");
                resp = ler.next();
            } while (!respostaValida(resp));
            return resp;
        }

        // verificação das respostas
        public static boolean respostaValida(String resp) {
            if(resp.equalsIgnoreCase("A")|| resp.equalsIgnoreCase("B")|| resp.equalsIgnoreCase("C")|| resp.equalsIgnoreCase("D")) {
                return true;
            }
            System.out.println("Resposta inválida...");
            return false;
        }

        // Classes das questões
        public static class Questao {
            String pergunta = "";
            String opcaoA = "";
            String opcaoB = "";
            String opcaoC = "";
            String opcaoD = "";
            String correta = "";

            // verificação das respostas
            public boolean isCorreta(String resposta) {
                if(resposta.equalsIgnoreCase(this.correta)) {
                    System.out.println("Parabéns resposta Correta! - Letra: " + this.correta);
                    return true;
                } else {
                    System.out.println("Resposta Incorreta!");
                    System.out.println("A opção correta é a letra: " + this.correta);
                    return false;
                }
            }

            // opções
            public void escrevaQuestao() {
                System.out.println(this.pergunta);
                System.out.println();
                System.out.println(this.opcaoA);
                System.out.println(this.opcaoB);
                System.out.println(this.opcaoC);
                System.out.println(this.opcaoD);
            }
        }
    }

