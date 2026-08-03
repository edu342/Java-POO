# Sistema Bancário Orientado a Objetos em Java

## Sobre o Projeto

Este projeto foi desenvolvido como parte da trilha **Java Developer** da **DIO (Digital Innovation One)** com o objetivo de aplicar, na prática, os principais conceitos da **Programação Orientada a Objetos (POO)**.

O sistema simula um ambiente bancário simples, permitindo a criação de clientes e contas bancárias, além da realização de operações como depósitos, saques, transferências e emissão de extratos.

A arquitetura do projeto foi construída utilizando **interfaces**, **classes abstratas**, **herança** e **polimorfismo**, seguindo boas práticas de desenvolvimento orientado a objetos.

---

# Objetivos

- Aplicar os quatro pilares da Programação Orientada a Objetos.
- Modelar um sistema bancário utilizando Java.
- Desenvolver uma arquitetura reutilizável e organizada.
- Demonstrar o uso de interfaces e classes abstratas.
- Simular operações financeiras básicas.
- Praticar boas práticas de desenvolvimento orientado a objetos.

---

# Funcionalidades

O sistema permite realizar as seguintes operações:

- Cadastro de clientes.
- Criação de contas correntes.
- Criação de contas poupança.
- Depósito em contas.
- Saque de valores.
- Transferência entre contas.
- Consulta de saldo.
- Emissão de extrato bancário.
- Geração automática do número da conta.

---

# Conceitos Praticados

## Abstração

A classe abstrata `Conta` concentra toda a lógica comum das contas bancárias, servindo como base para outros tipos de conta.

---

## Encapsulamento

Os atributos das classes são protegidos através de modificadores de acesso, permitindo acesso controlado por meio de métodos públicos.

Conceitos utilizados:

- Getters
- Setters
- Métodos protegidos
- Controle de acesso

---

## Herança

As classes `ContaCorrente` e `ContaPoupanca` herdam todas as funcionalidades da classe abstrata `Conta`, reutilizando código e especializando apenas os comportamentos necessários.

---

## Polimorfismo

A interface `InterfaceConta` define um contrato comum para todas as contas, permitindo diferentes implementações compartilharem o mesmo conjunto de operações.

---

# Estrutura do Projeto

```text
Pilares-POO/
│
├── src/
│   ├── Banco.java
│   ├── Cliente.java
│   ├── Main.java
│   │
│   └── contas/
│       ├── InterfaceConta.java
│       ├── Conta.java
│       ├── ContaCorrente.java
│       └── ContaPoupanca.java
│
└── README.md
```

---

# Arquitetura do Sistema

## Banco

Representa a instituição financeira responsável por armazenar e organizar as contas cadastradas.

### Responsabilidades

- Gerenciar contas.
- Armazenar informações da instituição.
- Centralizar os dados do sistema.

---

## Cliente

Representa o titular de uma conta bancária.

### Responsabilidades

- Armazenar os dados do cliente.
- Identificar o proprietário da conta.
- Relacionar clientes às contas bancárias.

---

## InterfaceConta

Define o contrato que todas as contas do sistema devem implementar.

### Operações

- Depositar
- Sacar
- Transferir
- Imprimir extrato

---

## Conta

Classe abstrata responsável por implementar toda a lógica compartilhada entre os diferentes tipos de conta.

### Funcionalidades

- Controle do saldo.
- Depósito.
- Saque.
- Transferência.
- Geração automática da agência.
- Geração automática do número da conta.
- Impressão dos dados do extrato.

---

## ContaCorrente

Especialização da classe `Conta`.

Personaliza a impressão do extrato para identificar contas correntes, reutilizando toda a lógica da classe base.

---

## ContaPoupanca

Especialização da classe `Conta`.

Representa contas poupança e personaliza a exibição do extrato.

---

## Main

Classe responsável por iniciar a aplicação.

Durante a execução são realizados testes das operações disponíveis no sistema, demonstrando a interação entre todas as classes.

---

# Fluxo da Aplicação

1. Criação dos clientes.
2. Criação das contas bancárias.
3. Associação das contas aos clientes.
4. Depósito de valores.
5. Saque de valores.
6. Transferências entre contas.
7. Impressão dos extratos.
8. Encerramento da aplicação.

---

# Diagrama Simplificado

```text
                InterfaceConta
                       ▲
                       │
                  Conta (abstrata)
                  /             \
                 /               \
      ContaCorrente      ContaPoupanca
               ▲               ▲
               └──────┬────────┘
                      │
                   Cliente

Banco
 │
 └── Lista de Contas

Main
 │
 ├── Banco
 ├── Cliente
 ├── ContaCorrente
 └── ContaPoupanca
```

---

# Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos (POO)
- IntelliJ IDEA
- Git
- GitHub

---

# Como Executar

## Pré-requisitos

- Java JDK 17 ou superior

---

## Clone o repositório

```bash
git clone https://github.com/edu342/Java-POO.git
```

---

## Acesse o projeto

```bash
cd Java-POO/Pilares-POO/src
```

---

## Compile os arquivos

```bash
javac Main.java
```

---

## Execute a aplicação

```bash
java Main
```

---

# Habilidades Desenvolvidas

Durante o desenvolvimento deste projeto foram praticados os seguintes conceitos:

- Programação Orientada a Objetos.
- Modelagem de sistemas.
- Interfaces.
- Classes abstratas.
- Encapsulamento.
- Herança.
- Polimorfismo.
- Associação entre objetos.
- Reutilização de código.
- Organização de projetos Java.
- Estruturação de aplicações em camadas.

---

# Aprendizados

Este projeto demonstra como os pilares da Programação Orientada a Objetos trabalham em conjunto para produzir aplicações mais organizadas e reutilizáveis.

Ao longo do desenvolvimento foram reforçados conceitos como:

- Modelagem de entidades.
- Separação de responsabilidades.
- Implementação de contratos através de interfaces.
- Especialização de classes utilizando herança.
- Reutilização de código por meio de classes abstratas.
- Organização da lógica de negócio.

---

# Resultado Esperado

Ao executar a aplicação, o usuário pode visualizar um sistema bancário simples funcionando, com operações financeiras básicas e uma arquitetura baseada nos princípios da Programação Orientada a Objetos.

O projeto demonstra como abstração, encapsulamento, herança e polimorfismo podem ser aplicados para desenvolver aplicações Java mais organizadas, reutilizáveis e fáceis de manter.

---

# Autor

Projeto desenvolvido como parte da formação **Java Developer** da **Digital Innovation One (DIO)**, com foco na aplicação prática dos pilares da **Programação Orientada a Objetos (POO)** em Java.
