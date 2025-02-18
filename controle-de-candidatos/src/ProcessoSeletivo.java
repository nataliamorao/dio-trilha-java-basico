import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.List;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"FELIPE", "JOAO", "MARIA", "ANA", "CARLOS"};
        List<String> candidatosSelecionados = new ArrayList<>();

        for (String candidato : candidatos) {
            if (entrandoEmContato(candidato)) {
                candidatosSelecionados.add(candidato);
            }
        }
        imprimirSelecionados(candidatosSelecionados);
        selecaoCandidatos();
    }

    static boolean entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean atendeu = false;
        do {
            atendeu = atender();
            if (atendeu) {
                System.out.println("Candidato " + candidato + " atendeu na " + tentativasRealizadas + "ª tentativa.");
                return true;
            } else {
                System.out.println("Tentativa " + tentativasRealizadas + ": candidato " + candidato + " não atendeu.");
                tentativasRealizadas++;
            }
        } while (tentativasRealizadas <= 3);

        System.out.println("Candidato " + candidato + " não atendeu após 3 tentativas.");
        return false;
    }

    static boolean atender() {
        // Simula se a pessoa atendeu ou não o telefone
        return new Random().nextBoolean();
    }

    static void imprimirSelecionados(List<String> candidatosSelecionados) {
        System.out.println("Candidatos selecionados:");
        for (int i = 0; i < candidatosSelecionados.size(); i++) {
            System.out.println((i + 1) + ". " + candidatosSelecionados.get(i));
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"FELIPE", "JOAO", "MARIA", "ANA", "CARLOS", "ROBERTO", "LUCAS", "PEDRO", "PAULO", "MARCOS"};

        int candidatosSelecionados = 0;
        int candidatosAnalisados = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAnalisados < candidatos.length) {
            String candidato = candidatos[candidatosAnalisados];
            double salarioPretendido = valorPretendido();

            System.out.println("Candidato: " + candidato + " solicitou este valor " + salarioPretendido);

            // Análise do candidato
            String resultadoAnalise = analisarCandidato(salarioPretendido);
            System.out.println(resultadoAnalise);

            if (resultadoAnalise.contains("selecionado")) {
                candidatosSelecionados++;
            }

            candidatosAnalisados++;

            // Interrompe o loop se já foram selecionados 5 candidatos
            if (candidatosSelecionados == 5) {
                break;
            }
        }

        System.out.println("Foram selecionados " + candidatosSelecionados + " candidatos.");
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    static String analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            return "Ligar para o candidato";
        } else if (salarioBase == salarioPretendido) {
            return "Ligar para oferecer contraproposta";
        } else {
            return "Candidato não selecionado";
        }
    }
}