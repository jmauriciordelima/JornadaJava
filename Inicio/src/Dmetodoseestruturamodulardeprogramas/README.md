---

# 🧱 Aula 5 – Métodos e Estrutura Modular de Programas

---

## 🎯 Objetivo da Aula

* Criar métodos reutilizáveis
* Organizar o código em partes lógicas
* Reduzir repetição e aumentar a legibilidade
* Entender **parâmetros**, **retornos** e **boas práticas**

---

## 🔹 O que é um Método?

> Um **método** é um bloco de código que executa uma tarefa específica.
> Ele pode receber **valores** (parâmetros) e pode **retornar** um resultado.

---

## 🧩 Sintaxe Básica:

```java
tipoDeRetorno nomeDoMetodo(parametros) {
    // corpo do método
    return valor;
}
```

---

### 🔧 Exemplo simples:

```java
public class Matematica {

    public static void main(String[] args) {
        int resultado = somar(5, 3);
        System.out.println("Soma: " + resultado);
    }

    static int somar(int a, int b) {
        return a + b;
    }
}
```

---

## 📦 Parâmetros e Retorno

### ✅ Sem retorno (void):

```java
static void saudacao(String nome) {
    System.out.println("Olá, " + nome + "!");
}
```

### ✅ Com retorno:

```java
static double calcularIMC(double peso, double altura) {
    return peso / (altura * altura);
}
```

---

## 🔂 Reutilização

> Métodos ajudam a evitar **repetição**. Você escreve uma vez, usa várias.

---

## 🚀 Boas Práticas com Métodos

* Use **verbos** no nome do método (ex: `calcularArea()`, `buscarCliente()`).
* Mantenha métodos **curtos e claros** (1 responsabilidade).
* Prefira nomes de parâmetros **significativos**.
* **Evite variáveis globais desnecessárias**.

---

## 🧪 Exercícios da Aula 5

---

### ⚪ Exercício 1 – Nível Fácil

Crie um método `saudacao(String nome)` que receba o nome de uma pessoa e imprima uma saudação.

---

### 🟡 Exercício 2 – Nível Intermediário

Crie um método `media(double n1, double n2, double n3)` que retorne a média de 3 números.

---

### 🟠 Exercício 3 – Nível Intermediário

Crie um método que receba um número inteiro e verifique se ele é **par ou ímpar**. Retorne a mensagem correspondente.

---

### 🔴 Exercício 4 – Nível Desafio

Crie um programa com um **menu interativo** (como o da aula anterior), mas modularizado com métodos:

Opções:

1. Cadastrar produto
2. Remover produto
3. Listar produtos
4. Sair

Cada funcionalidade deve ser um **método separado**. Use `ArrayList` para armazenar os produtos.

---

## ✨ Dica Profissional

> Em projetos reais, **organizar bem os métodos** é o que diferencia um código iniciante de um código profissional.
> Métodos curtos, bem nomeados e reutilizáveis são a base de todo sistema limpo.

---

## 📖 Parábola – O Sábio e as Ferramentas Separadas

> Um aprendiz usava uma única faca para cortar pão, carne e madeira.
> O mestre o observava, e disse:
> – Divida suas ferramentas. A faca do pão não serve à madeira.
> O aprendiz obedeceu e percebeu: o trabalho ficou mais leve e rápido.

**Moral:** Quando dividimos o trabalho (como em métodos), o código fica mais limpo, mais rápido e mais fácil de manter.

---

## ✅ Pronto para praticar?

Se quiser, posso revisar seus exercícios ou montar a base dos métodos para você preencher.

Deseja que eu monte os esqueletos dos exercícios para facilitar a prática?
