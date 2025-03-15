import java.util.Scanner;

public class Carro {

    private boolean ligado;
    private int marcha;
    private int velocidade;

    public Carro() {
        this.ligado = false;
        this.marcha = 0;
        this.velocidade = 0;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Carro ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void desligar() {
        if (ligado && marcha == 0 && velocidade == 0) {
            ligado = false;
            System.out.println("Carro desligado.");
        } else {
            System.out.println("O carro não pode ser desligado agora.");
        }
    }

    public void acelerar() {
        if (ligado) {
            if (marcha == 0) {
                System.out.println("Não é possível acelerar em ponto morto.");
            } else if (velocidade < 120) {
                if (velocidade < getVelocidadeMaximaMarcha()) {
                    velocidade++;
                    System.out.println("Velocidade atual: " + velocidade + " km/h");
                } else {
                    System.out.println("Velocidade máxima da marcha atingida.");
                }
            } else {
                System.out.println("Velocidade máxima atingida.");
            }
        } else {
            System.out.println("O carro está desligado.");
        }
    }

    public void diminuirVelocidade() {
        if (ligado) {
            if (velocidade > 0) {
                velocidade--;
                System.out.println("Velocidade atual: " + velocidade + " km/h");
            } else {
                System.out.println("O carro já está parado.");
            }
        } else {
            System.out.println("O carro está desligado.");
        }
    }

    public void virar(String direcao) {
        if (ligado) {
            if (velocidade >= 1 && velocidade <= 40) {
                System.out.println("Virando para a " + direcao + ".");
            } else {
                System.out.println("Não é possível virar nessa velocidade.");
            }
        } else {
            System.out.println("O carro está desligado.");
        }
    }

    public void verificarVelocidade() {
        if (ligado) {
            System.out.println("Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println("O carro está desligado.");
        }
    }

    public void trocarMarcha(int novaMarcha) {
        if (ligado) {
            if (novaMarcha >= 0 && novaMarcha <= 6) {
                if (novaMarcha == marcha + 1 || novaMarcha == marcha - 1 || novaMarcha == marcha) {
                    if (velocidade >= getVelocidadeMinimaMarcha(novaMarcha) && velocidade <= getVelocidadeMaximaMarcha(novaMarcha)) {
                        marcha = novaMarcha;
                        System.out.println("Marcha trocada para " + marcha + "ª marcha.");
                    } else {
                        System.out.println("Velocidade incompatível com a marcha!");
                    }
                } else {
                    System.out.println("Não é possível pular marchas.");
                }
            } else {
                System.out.println("Marcha inválida.");
            }
        } else {
            System.out.println("O carro está desligado.");
        }
    }

    private int getVelocidadeMinimaMarcha(int marcha) {
        switch (marcha) {
            case 1:
                return 0;
            case 2:
                return 21;
            case 3:
                return 41;
            case 4:
                return 61;
            case 5:
                return 81;
            case 6:
                return 101;
            default:
                return 0;
        }
    }

    private int getVelocidadeMaximaMarcha() {
        switch (marcha) {
            case 1:
                return 20;
            case 2:
                return 40;
            case 3:
                return 60;
            case 4:
                return 80;
            case 5:
                return 100;
            case 6:
                return 120;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Ligar");
            System.out.println("2. Desligar");
            System.out.println("3. Acelerar");
            System.out.println("4. Diminuir velocidade");
            System.out.println("5. Virar");
            System.out.println("6. Verificar velocidade");
            System.out.println("7. Trocar marcha");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    carro.ligar();
                    break;
                case 2:
                    carro.desligar();
                    break;
                case 3:
                    carro.acelerar();
                    break;
                case 4:
                    carro.diminuirVelocidade();
                    break;
                case 5:
                    System.out.print("Digite a direção (esquerda/direita): ");
                    String direcao = scanner.next();
                    carro.virar(direcao);
                    break;
                case 6:
                    carro.verificarVelocidade();
                    break;
                case 7:
                    System.out.print("Digite a nova marcha: ");
                    int novaMarcha = scanner.nextInt();
                    carro.trocarMarcha(novaMarcha);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}