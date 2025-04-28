import model.Paciente;
import model.Medico;
import model.Consulta;
import service.ConsultaService;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Leitura dos dados do paciente
        System.out.print("Digite o nome do paciente: ");
        String nomePaciente = scanner.nextLine();

        System.out.print("Digite o CPF do paciente: ");
        String cpf = scanner.nextLine();

        System.out.print("Digite o telefone do paciente: ");
        String telefonePaciente = scanner.nextLine();

        System.out.print("Digite o email do paciente: ");
        String email = scanner.nextLine();

        // 2. Criação de objeto Paciente
        Paciente paciente = new Paciente(nomePaciente, cpf, telefonePaciente, email);

        // 3. (Opcional) Leitura ou criação estática de um médico
        System.out.print("Digite o nome do médico: ");
        String nomeMedico = scanner.nextLine();

        System.out.print("Digite o CRM do médico: ");
        String crm = scanner.nextLine();

        System.out.print("Digite a especialidade do médico: ");
        String especialidade = scanner.nextLine();

        System.out.print("Digite o telefone do médico: ");
        String telefoneMedico = scanner.nextLine();

        Medico medico = new Medico(nomeMedico, crm, especialidade, telefoneMedico);

        scanner.close();

        // 4. Agendamento e aceitação da consulta
        ConsultaService service = new ConsultaService();
        LocalDateTime dataHora = LocalDateTime.now().plusDays(1).withHour(14).withMinute(0);
        // aqui você pode ler data/hora do scanner também, se quiser
        Consulta consulta = service.agendarConsulta(paciente, medico, dataHora);
        service.aceitarConsulta(consulta);

        // 5. Impressão de todas as saídas
        System.out.println("\n==== RESUMO DA CONSULTA ====");
        System.out.println("Paciente   : " + paciente.getNome() + " (CPF: " + paciente.getCpf() + ")");
        System.out.println("Contato    : " + paciente.getTelefone() + " | " + paciente.getEmail());
        System.out.println("Médico     : " + medico.getNome() + " (CRM: " + medico.getCrm() + ")");
        System.out.println("Especialidade: " + medico.getEspecialidade());
        System.out.println("Data/Hora  : " + consulta.getDataHora());
        System.out.println("Status     : Agendada e confirmada!");
    }
}