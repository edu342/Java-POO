#  Desafio Prático: Fundamentos de Programação Orientada a Objetos (POO) em Java

##  Sobre o Projeto

Este repositório reúne um conjunto de exercícios e desafios práticos desenvolvidos para consolidar os principais conceitos de **Programação Orientada a Objetos (POO)** em **Java**.

Ao longo dos desafios, são explorados conceitos fundamentais da linguagem, como:

- Criação de classes e objetos;
- Encapsulamento;
- Construtores;
- Palavra-chave `this`;
- Métodos **Getters** e **Setters**;
- Modificadores de acesso;
- Validação de regras de negócio;
- Boas práticas de desenvolvimento seguindo as convenções do Java.

Além da implementação das funcionalidades, os exercícios também estimulam a identificação e correção de problemas comuns de código, aproximando o estudo de situações encontradas no ambiente profissional.

---

#  Objetivos

- Praticar os fundamentos de Programação Orientada a Objetos.
- Aplicar encapsulamento corretamente.
- Desenvolver classes reutilizáveis.
- Implementar validações de regras de negócio.
- Corrigir falhas de implementação e problemas de segurança relacionados ao acesso aos atributos.
- Escrever código limpo e organizado.

---

#  Conceitos Praticados

##  Abstração e Classes

Criação de classes que representam entidades do mundo real utilizando atributos e métodos.

---

##  Encapsulamento

Proteção do estado interno dos objetos utilizando atributos privados (`private`) e disponibilizando acesso controlado através de métodos públicos.

---

##  Construtores e a Palavra-chave `this`

Inicialização correta dos objetos e diferenciação entre atributos da classe e parâmetros do construtor.

---

##  Getters e Setters

Implementação de métodos de leitura e escrita com validações internas para impedir estados inválidos.

---

##  Validação de Regras de Negócio

Aplicação de condicionais para garantir integridade dos dados, impedindo situações como:

- saldo negativo;
- preço negativo;
- estoque negativo;
- operações inválidas.

---

# Estrutura dos Exercícios

| Desafio | Tema | Tipo | Status |
|----------|------|------|--------|
| 01 | Sistema de Conta Bancária | Desenvolvimento do zero |  Concluído |
| 02 | Gestão de Estoque de Produtos | Refatoração e Correção de Bugs |  Em andamento |
| 03 | Sistema de Alunos e Média | Complementação de Lógica |  Pendente |

---

#  Desafios

##  Desafio 01 — Sistema de Conta Bancária

Desenvolvimento completo de uma classe `ContaBancaria`, implementando operações básicas de movimentação financeira com encapsulamento.

### Conceitos aplicados

- Encapsulamento
- Atributos privados
- Construtores
- `this`
- Getters
- Métodos de depósito
- Métodos de saque
- Validação de saldo
- Regras de negócio

---

##  Desafio 02 — Gestão de Produtos

Refatoração de uma classe `Produto`, corrigindo problemas de implementação e aplicando boas práticas de POO.

### Objetivos

- Corrigir atributos públicos indevidos.
- Corrigir o uso incorreto da palavra-chave `this`.
- Implementar Getters e Setters.
- Validar preço e estoque.
- Evitar estados inconsistentes do objeto.

### Foco do desafio

- Debug de código
- Encapsulamento
- Refatoração
- Segurança de código

---

##  Desafio 03 — Sistema de Avaliação de Alunos

Implementação da lógica de uma classe `Aluno`, responsável por calcular médias e determinar a situação final do estudante.

### Conceitos previstos

- Encapsulamento
- Métodos
- Cálculo de média
- Estruturas condicionais
- Regras de aprovação

---

#  Como Executar

## Pré-requisitos

- Java JDK 17 ou superior

---

## Clone o repositório

```bash
git clone https://github.com/seu-usuario/desafios-poo-java.git
```

---

## Acesse a pasta do projeto

```bash
cd desafios-poo-java/src
```

---

## Compile uma classe

Exemplo:

```bash
javac Produto.java
```

---

## Execute

```bash
java Produto
```

---

#  Tecnologias Utilizadas

- Java 17+
- Programação Orientada a Objetos (POO)
- Git
- GitHub

---


```

---

#  Objetivo de Aprendizagem

Este repositório faz parte da minha jornada de estudos em **Java** e **Programação Orientada a Objetos**, servindo como registro da evolução prática na aplicação dos principais conceitos da linguagem.

Cada desafio busca aproximar os exercícios de cenários reais encontrados no desenvolvimento de software, reforçando boas práticas de modelagem, organização e manutenção de código.

