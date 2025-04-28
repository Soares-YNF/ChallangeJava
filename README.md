🏥 Projeto Hospital das Clínicas - Chatbot de Agendamento de Telemedicina
📋 Descrição do Projeto
Este projeto simula o fluxo de agendamento de consultas de telemedicina no Hospital das Clínicas.
A aplicação foi desenvolvida em Java e representa a base que pode futuramente se integrar com um chatbot.

O sistema permite:

Cadastro de pacientes.

Cadastro de médicos.

Agendamento de consultas entre pacientes e médicos.

Aceitação/confirmação de consultas.

Exibição de todas as informações no terminal.

🧩 Estrutura do Projeto
css
Copiar
Editar
src/
│
├── model/
│   ├── Paciente.java
│   ├── Medico.java
│   └── Consulta.java
│
├── service/
│   └── ConsultaService.java
│
└── Main.java
model/: Contém as classes de domínio (Paciente, Medico, Consulta).

service/: Contém a classe responsável por gerenciar consultas (ConsultaService).

Main.java: Classe principal que executa o programa.

🛠️ Tecnologias Utilizadas
Java 17 (ou superior)

IntelliJ IDEA (IDE para desenvolvimento)

🚀 Como Executar o Projeto
Clone ou baixe o repositório.

Abra o projeto no IntelliJ IDEA.

Navegue até a classe Main.

Execute o método public static void main(String[] args).

Interaja com o terminal preenchendo os dados solicitados.

📚 Funcionalidades Implementadas
Instanciamento de pacientes e médicos com seus respectivos dados.

Agendamento de consultas com data e hora.

Aceitação (confirmação) da consulta.

Impressão de todas as informações no terminal.

👨‍💻 Integrantes do Projeto
Luiz Henrique Soares de Farias

Luan Correia

Lucas Nunes

🎯 Objetivos do Projeto
Simular o fluxo básico de agendamento de telemedicina.

Treinar o uso de classes, objetos, pacotes e métodos em Java.

Estruturar o sistema para uma futura integração com um chatbot.
