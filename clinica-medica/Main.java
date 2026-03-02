import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        // Cenário Válido
        System.out.println("=== CENÁRIO VÁLIDO ===");
        try {
            Medico medico = new Medico(1, "Dr. Miranda", "12345", "Dermatologista");
            Paciente paciente = new Paciente(1, "Lara", "111.111.111-11",
                    LocalDate.of(2006, 2, 7));

            Consulta consulta = new Consulta(medico, paciente,
                    LocalDateTime.now().plusDays(1));

            consulta.registrarComparecimento();

            Exame exame = new Exame("Exame de Sangue", 5, paciente);

            HistoricoClinico historico = new HistoricoClinico(paciente);
            historico.adicionarRegistro("Paciente apresentou melhora.");

            System.out.println("Consulta criada com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Cenário Inválido
        System.out.println("\n=== CENÁRIO INVÁLIDO ===");
        try {
            new Consulta(
                    new Medico(2, "Dr. Fernandes", "54321", "Ortopedia"),
                    new Paciente(2, "João", "222.222.222-22",
                            LocalDate.of(1985, 3, 20)),

                    // Consulta marcada no passado
                    LocalDateTime.now().minusDays(1));
        } catch (Exception e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }

        try {
            // Prazo igual a zero
            new Exame("Raio-X", 0,
                    new Paciente(3, "Pedro", "333.333.333-33",
                            LocalDate.of(2000, 1, 1)));
        } catch (Exception e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }

        try {
            Paciente paciente = new Paciente(4, "Lucas", "444.444.444-44",
                    LocalDate.of(1995, 7, 15));
            HistoricoClinico historico = new HistoricoClinico(paciente);
            
            // Histórico com texto vazio
            historico.adicionarRegistro("");
        } catch (Exception e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }

        // Caso de borda
        System.out.println("\n=== CASO DE BORDA ===");
        try {
            Medico medico = new Medico(5, "Dr. Edge", "99999", "Clínico");
            Paciente paciente = new Paciente(5, "Borda", "555.555.555-55",
                    LocalDate.of(1999, 9, 9));

            Consulta consultaBorda = new Consulta(medico, paciente,
                    LocalDateTime.now().plusSeconds(1));

            Exame exameBorda = new Exame("Ultrassom", 1, paciente);

            System.out.println("Caso de borda executado com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro no caso de borda: " + e.getMessage());
        }
    }
}