public class Pessoa {
    private String nome;
    private int anoNascimento;

    public Pessoa(String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public int calcularIdade() {
        int anoAtual = java.time.Year.now().getValue();
        return anoAtual - anoNascimento;
    }

    public void exibirMensagem() {
        int idade = calcularIdade();
        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");
    }
}