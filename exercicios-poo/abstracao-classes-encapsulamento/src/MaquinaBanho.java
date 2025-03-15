import java.util.Scanner;

public class MaquinaBanho {

    private int nivelAgua;
    private int nivelShampoo;
    private boolean petNoBanho;
    private boolean maquinaLimpa;

    public MaquinaBanho() {
        this.nivelAgua = 0;
        this.nivelShampoo = 0;
        this.petNoBanho = false;
        this.maquinaLimpa = true;
    }

    public void darBanho() {
        if (petNoBanho && nivelAgua >= 10 && nivelShampoo >= 2) {
            nivelAgua -= 10;
            nivelShampoo -= 2;
            System.out.println("Banho realizado com sucesso!");
            maquinaLimpa = false;
        } else if (!petNoBanho) {
            System.out.println("Não há pet na máquina.");
        } else if (nivelAgua < 10) {
            System.out.println("Nível de água insuficiente.");
        } else {
            System.out.println("Nível de shampoo insuficiente.");
        }
    }

    public void abastecerAgua() {
        if (nivelAgua + 2 <= 30) {
            nivelAgua += 2;
            System.out.println("Água abastecida. Nível atual: " + nivelAgua + " litros.");
        } else {
            System.out.println("Capacidade máxima de água atingida.");
        }
    }

    public void abastecerShampoo() {
        if (nivelShampoo + 2 <= 10) {
            nivelShampoo += 2;
            System.out.println("Shampoo abastecido. Nível atual: " + nivelShampoo + " litros.");
        } else {
            System.out.println("Capacidade máxima de shampoo atingida.");
        }
    }

    public void verificarNivelAgua() {
        System.out.println("Nível de água: " + nivelAgua + " litros.");
    }

    public void verificarNivelShampoo() {
        System.out.println("Nível de shampoo: " + nivelShampoo + " litros.");
    }

    public void verificarPetNoBanho() {
        if (petNoBanho) {
            System.out.println("Há um pet na máquina.");
        } else {
            System.out.println("Não há pet na máquina.");
        }
    }

    public void colocarPet() {
        if (!petNoBanho) {
            petNoBanho = true;
            System.out.println("Pet colocado na máquina.");
        } else {
            System.out.println("Já há um pet na máquina.");
        }
    }

    public void retirarPet() {
        if (petNoBanho) {
            petNoBanho = false;
            System.out.println("Pet retirado da máquina.");
        } else {
            System.out.println("Não há pet na máquina.");
        }
    }

    public void limparMaquina() {
        if (!maquinaLimpa) {
            if (nivelAgua >= 3 && nivelShampoo >= 1) {
                nivelAgua -= 3;
                nivelShampoo -= 1;
                maquinaLimpa = true;
                System.out.println("Máquina limpa.");
            } else if (nivelAgua < 3) {
                System.out.println("Nível de água insuficiente para limpeza.");
            } else {
                System.out.println("Nível de shampoo insuficiente para limpeza.");
            }
        } else {
            System.out.println("A máquina já está limpa.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MaquinaBanho maquina = new MaquinaBanho();

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Dar banho");
            System.out.println("2. Abastecer água");
            System.out.println("3. Abastecer shampoo");
            System.out.println("4. Verificar nível de água");
            System.out.println("5. Verificar nível de shampoo");
            System.out.println("6. Verificar pet no banho");
            System.out.println("7. Colocar pet");
            System.out.println("8. Retirar pet");
            System.out.println("9. Limpar máquina");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    maquina.darBanho();
                    break;
                case 2:
                    maquina.abastecerAgua();
                    break;
                case 3:
                    maquina.abastecerShampoo();
                    break;
                case 4:
                    maquina.verificarNivelAgua();
                    break;
                case 5:
                    maquina.verificarNivelShampoo();
                    break;
                case 6:
                    maquina.verificarPetNoBanho();
                    break;
                case 7:
                    maquina.colocarPet();
                    break;
                case 8:
                    maquina.retirarPet();
                    break;
                case 9:
                    maquina.limparMaquina();
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