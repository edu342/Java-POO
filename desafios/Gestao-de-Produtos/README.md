#  Desafio 02: Gestão de Produtos (Refatoração & Encapsulamento)

## Sobre o Desafio

Este desafio consiste em identificar e corrigir falhas de implementação em uma classe Java (`Produto.java`), aplicando os princípios da **Programação Orientada a Objetos (POO)**.

O foco está na refatoração do código, melhorando o encapsulamento, corrigindo problemas no construtor e implementando validações para impedir estados inválidos da aplicação, como preços ou quantidades em estoque negativas.

---

#  Objetivos

- Aplicar corretamente o encapsulamento.
- Corrigir erros de atribuição utilizando a palavra-chave `this`.
- Implementar métodos acessores (Getters).
- Criar validações para proteger os atributos da classe.
- Aplicar regras de negócio para manter a consistência dos dados.

---

#  Conceitos Praticados

##  Encapsulamento

Alteração da visibilidade dos atributos de `public` para `private`, protegendo o estado interno do objeto.

---

##  Palavra-chave `this`

Correção do construtor utilizando `this` para diferenciar atributos da classe dos parâmetros recebidos.

---

##  Métodos Getters

Implementação de métodos responsáveis pela leitura controlada dos atributos da classe.

---

##  Validação em Setters

Criação de validações para impedir a atribuição de valores inválidos aos atributos.

---

#  Requisitos do Desafio

##  Encapsulamento

Todos os atributos da classe devem ser privados (`private`).

```java
private String nome;
private double preco;
private int quantidadeStock;
```

---

##  Construtor

Corrigir a inicialização dos atributos utilizando a palavra-chave `this`.

```java
this.nome = nome;
this.preco = preco;
this.quantidadeStock = quantidadeStock;
```

---

##  Métodos Getters

Implementar os métodos:

- `getNome()`
- `getPreco()`
- `getQuantidadeStock()`

---

##  Regras de Negócio

###  Atualização de Preço

O método `setPreco(double preco)` deve aceitar apenas valores maiores que zero.

```java
preco > 0
```

---

###  Entrada de Estoque

O método `adicionarStock(int quantidade)` deve adicionar apenas quantidades maiores que zero.

```java
quantidade > 0
```

---

#  Comportamento Esperado

| Cenário | Entrada | Ação do Sistema | Resultado |
|----------|----------|-----------------|-----------|
| Criação do Produto | `"Teclado", 250.0, 10` | Executa o construtor | Objeto criado corretamente |
| Atualização de Preço | `299.90` | Atualiza o atributo `preco` | Preço alterado |
| Tentativa de Preço Inválido | `-50.0` | Bloqueia a alteração | Mantém o valor anterior |
| Entrada de Estoque | `5` | Soma ao estoque atual | Estoque passa de **10** para **15** |

---

#  Estrutura do Projeto

```text
src/
└── Produto.java
```

**Produto.java**

- Modelo da classe `Produto`
- Implementação dos métodos
- Método `main()` utilizado para testes da aplicação

---

# Habilidades Desenvolvidas

Ao concluir este desafio, você será capaz de:

-  Aplicar encapsulamento corretamente.
-  Utilizar construtores de forma adequada.
-  Implementar Getters e Setters.
-  Validar entradas antes de modificar atributos.
-  Refatorar código seguindo boas práticas de POO.
-  Proteger objetos contra estados inconsistentes.

---

#  Resultado Esperado

Ao final deste desafio, a classe `Produto` deverá:

- Possuir todos os atributos encapsulados.
- Utilizar corretamente a palavra-chave `this`.
- Disponibilizar métodos Getters para leitura dos atributos.
- Validar preços antes da atualização.
- Permitir apenas entradas positivas no estoque.
- Garantir a integridade dos dados durante toda a execução da aplicação.
