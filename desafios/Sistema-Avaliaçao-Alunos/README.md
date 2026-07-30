#  Desafio 03: Sistema de Avaliação de Alunos

##  Sobre o Desafio

Este desafio tem como objetivo desenvolver uma classe em Java (`Aluno.java`) aplicando os principais conceitos da **Programação Orientada a Objetos (POO)**.

O sistema simula o gerenciamento das notas de um aluno, permitindo registrar duas avaliações, calcular a média final e verificar se o estudante foi aprovado ou reprovado conforme as regras de negócio estabelecidas.

---

#  Objetivos

- Desenvolver uma classe utilizando os princípios da POO.
- Aplicar encapsulamento para proteger os dados da classe.
- Implementar construtores para inicialização dos objetos.
- Validar as notas informadas pelo usuário.
- Criar métodos responsáveis pelo cálculo da média e verificação da aprovação.
- Utilizar Getters para acesso seguro aos atributos.

---

#  Conceitos Praticados

##  Encapsulamento

Proteção dos atributos da classe utilizando o modificador de acesso `private`.

---

##  Construtores

Inicialização dos dados obrigatórios do aluno (`nome` e `matricula`) e definição dos valores padrão para as notas.

---

##  Validação de Dados

Implementação de validações nos métodos **Setters**, garantindo que as notas permaneçam dentro do intervalo permitido.

**Intervalo válido:**

```text
0.0 até 10.0
```

---

##  Métodos de Negócio

Criação de métodos responsáveis por executar as regras do sistema.

- `calcularMedia()`
- `isAprovado()`

---

##  Getters

Implementação de métodos para leitura controlada dos atributos da classe.

---

#  Regras de Negócio

| Regra | Descrição |
|--------|-----------|
| Atribuição de Notas | As notas devem estar entre **0.0** e **10.0**. Valores fora desse intervalo são ignorados. |
| Cálculo da Média | A média é calculada pela fórmula **(nota1 + nota2) / 2.0**. |
| Critério de Aprovação | O aluno é considerado aprovado quando a média for **maior ou igual a 7.0**. |

---

#  Fórmula da Média

```text
(nota1 + nota2) / 2.0
```

---

#  Exemplo de Execução

```text
=== Teste do Desafio 3: Aluno ===

Aluno: Maria Silva
Matrícula: 2024001

Nota 1: 8.5
Nota 2: 6.5

Média: 7.5

Aprovado: true
```

---

#  Estrutura do Projeto

```text
src/
└── Aluno.java
```

**Aluno.java**

- Modelo da classe `Aluno`
- Implementação dos atributos e métodos
- Método `main()` utilizado para testes da aplicação

---

#  Habilidades Desenvolvidas

Ao concluir este desafio, você será capaz de:

-  Criar classes orientadas a objetos.
-  Aplicar encapsulamento corretamente.
-  Implementar construtores.
-  Criar métodos de negócio.
-  Validar dados antes de armazená-los.
-  Calcular médias utilizando métodos.
-  Implementar regras de aprovação.
-  Desenvolver código limpo e organizado seguindo boas práticas de Java.

---

#  Resultado Esperado

Ao final deste desafio, a classe `Aluno` deverá:

- Possuir todos os atributos encapsulados.
- Inicializar corretamente seus dados através do construtor.
- Validar as notas informadas.
- Calcular corretamente a média do aluno.
- Informar se o aluno foi aprovado ou reprovado.
- Garantir a integridade dos dados durante toda a execução da aplicação.