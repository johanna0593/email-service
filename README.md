# Email Service

Microserviço responsável por enviar emails no projeto Blog Pessoal.

## Funcionalidades

- Envio de emails usando Spring Boot e JavaMailSender
- Configuração segura com variáveis de ambiente
- Integração com outros microserviços do projeto

## Tecnologias

- Java 21
- Spring Boot 3.5.7
- H2 Database (para testes)
- Maven

## Como rodar

1. Configurar variáveis de ambiente (`spring.mail.username`, `spring.mail.password`, etc.)
2. Executar o projeto:
```bash
mvn spring-boot:run
