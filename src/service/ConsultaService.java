package service;

import model.Consulta;
import model.Paciente;
import model.Medico;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ConsultaService {
    private List<Consulta> consultas = new ArrayList<>();

    //Metodo para agendar a consulta do paciente

    public Consulta agendarConsulta(Paciente paciente, Medico medico, LocalDateTime dataHora){
        Consulta consulta = new Consulta(paciente,medico,dataHora);
        consultas.add(consulta);
        return consulta;
    }

    //metodo para aceitar uma consulta

    public void aceitarConsulta(Consulta consulta){
        System.out.println("Consulta agendada com " + consulta.getMedico().getNome()+ "para" +consulta.getDataHora());
    }

}
