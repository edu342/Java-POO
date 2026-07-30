# Modelagem e Diagramação de um Componente iPhone

## Sobre o Desafio

Neste desafio, o objetivo é modelar e diagramar um componente do iPhone utilizando os conceitos de Programação Orientada a Objetos (POO).

A proposta é representar, por meio de um diagrama UML, as principais funcionalidades apresentadas durante o lançamento do iPhone em 2007 e, opcionalmente, implementar essa modelagem em Java.

O projeto permite praticar conceitos importantes de abstração, interfaces, implementação de classes e organização de software.

---

# Objetivos

- Modelar um componente do iPhone utilizando UML.
- Identificar responsabilidades e funcionalidades da classe principal.
- Aplicar conceitos de interfaces em Java.
- Implementar uma classe que reúna múltiplos comportamentos.
- Desenvolver uma estrutura orientada a objetos bem organizada.

---

# Contexto

O desafio é baseado na apresentação oficial do primeiro iPhone, realizada por Steve Jobs em 2007.

Durante a apresentação, o dispositivo foi demonstrado como a união de três produtos em um único aparelho:

- Reprodutor musical
- Aparelho telefônico
- Navegador de internet

Cada uma dessas funcionalidades deve ser representada por uma interface, enquanto a classe `iPhone` será responsável por implementar todas elas.

---

# Funcionalidades

## Reprodutor Musical

Métodos:

- `tocar()`
- `pausar()`
- `selecionarMusica(String musica)`

---

## Aparelho Telefônico

Métodos:

- `ligar(String numero)`
- `atender()`
- `iniciarCorreioVoz()`

---

## Navegador na Internet

Métodos:

- `exibirPagina(String url)`
- `adicionarNovaAba()`
- `atualizarPagina()`

---

# Conceitos Praticados

## Abstração

Separação das funcionalidades do iPhone em interfaces independentes.

---

## Interfaces

Criação de contratos para cada funcionalidade do dispositivo.

---

## Implementação

Desenvolvimento da classe `iPhone`, responsável por implementar todas as interfaces.

---

## Polimorfismo

Possibilidade de utilizar um mesmo objeto através de diferentes interfaces.

---

## Organização de Projetos

Separação adequada entre interfaces e classes para facilitar manutenção e reutilização do código.

---

# Estrutura do Projeto

```text
src/
├── iPhone.java
├── ReprodutorMusical.java
├── AparelhoTelefonico.java
└── NavegadorInternet.java
```

---

# Diagrama UML

O projeto deve representar uma estrutura semelhante à seguinte:

- Interface `ReprodutorMusical`
- Interface `AparelhoTelefonico`
- Interface `NavegadorInternet`
- Classe `iPhone` implementando as três interfaces

---

# Implementação

A implementação em Java é opcional, porém recomendada para reforçar os conceitos de Programação Orientada a Objetos.

---

# Habilidades Desenvolvidas

Ao concluir este desafio, você será capaz de:

- Modelar sistemas utilizando UML.
- Criar interfaces em Java.
- Implementar múltiplas interfaces em uma mesma classe.
- Aplicar abstração e polimorfismo.
- Organizar projetos seguindo boas práticas de POO.
- Desenvolver soluções orientadas a objetos de forma estruturada.

---

# Resultado Esperado

Ao final deste desafio, o projeto deverá:

- Possuir um diagrama UML representando a modelagem do iPhone.
- Definir interfaces para cada funcionalidade do dispositivo.
- Implementar a classe `iPhone` utilizando as interfaces criadas.
- Demonstrar uma organização de código alinhada aos princípios da Programação Orientada a Objetos.