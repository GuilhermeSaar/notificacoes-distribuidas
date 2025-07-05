# 📬 Plataforma de Notificações Distribuídas

Este projeto é uma **Plataforma de Notificações Distribuídas** com foco em **alta disponibilidade**, **escalabilidade** e **processamento assíncrono**. A proposta é oferecer um sistema robusto capaz de enviar diferentes tipos de notificações (e-mail, SMS, push notification) para usuários de forma confiável, mesmo sob alta carga.

---

## 🚀 Objetivo

Criar uma plataforma genérica e extensível para envio de notificações que possa:

- Enviar múltiplos tipos de notificações (e-mail, SMS, push, etc.)
- Trabalhar de forma assíncrona para suportar alto volume
- Garantir entrega confiável mesmo em caso de falhas temporárias
- Ser facilmente escalável e distribuída

---

## 🛠️ Tecnologias (em definição)

- Java / Spring Boot
- RabbitMQ ou Kafka (mensageria)
- Banco de dados relacional ou NoSQL
- Docker (para orquestração local)

---

## ⚙️ Arquitetura (em construção)

A arquitetura será orientada a microsserviços e baseada em mensageria. A ideia central é desacoplar os produtores e consumidores de notificações, possibilitando o envio paralelo, seguro e eficiente.

### Componentes principais:
- **API Gateway** (entrada de requisições)
- **Service de Enfileiramento** (producer)
- **Workers Assíncronos** (consumer para cada tipo de notificação)
- **Fallbacks e Retry Mechanisms** (garantia de entrega)

---

## 📦 Funcionalidades previstas

- [ ] Envio de notificações via e-mail
- [ ] Envio de SMS
- [ ] Envio de push notifications
- [ ] Registro e histórico de notificações
- [ ] Fila de mensagens assíncrona
- [ ] Mecanismo de reentrega em caso de falha

---

## 🔧 Como executar (em breve)

Instruções de uso e execução local serão adicionadas conforme o desenvolvimento avança.

---


## 👨‍💻 Autor

Projeto criado por **Guilherme Saar** para fins de estudo, prática e demonstração de habilidades com sistemas distribuídos e arquitetura orientada a eventos.
