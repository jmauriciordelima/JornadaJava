
---

## 📘 Aula 1 – Tipos de Dados, Variáveis e Operadores em Java

### 🎯 Objetivo:

Aprender a declarar variáveis, usar tipos primitivos e operadores, dominando os blocos fundamentais de qualquer programa
em Java.

---

## 🧠 Conceitos

### 🔹 1. **Variáveis**

Variáveis são "caixinhas" onde armazenamos valores temporariamente durante a execução do programa.

**Sintaxe**:

```java
tipo nome = valor;
```

Exemplo:

```java
int idade = 25;
```

---

### 🔹 2. **Tipos de Dados Primitivos em Java**

| Tipo      | Tamanho | Exemplo             | Uso                         |
|-----------|---------|---------------------|-----------------------------|
| `byte`    | 8 bits  | `byte b = 10;`      | Pequenos números inteiros   |
| `short`   | 16 bits | `short s = 200;`    | Médios números inteiros     |
| `int`     | 32 bits | `int i = 1000;`     | Números inteiros comuns     |
| `long`    | 64 bits | `long l = 10000L;`  | Números inteiros longos     |
| `float`   | 32 bits | `float f = 5.5f;`   | Números com ponto flutuante |
| `double`  | 64 bits | `double d = 5.5;`   | Ponto flutuante (preciso)   |
| `char`    | 16 bits | `char c = 'A';`     | Um único caractere          |
| `boolean` | 1 bit   | `boolean b = true;` | Verdadeiro/Falso            |

---

### 🔹 3. **Operadores**

#### ➕ Aritméticos

```java
+ - * / %
```

Exemplo:

```java
int soma = 10 + 5;
```

#### 🧮 Atribuição

```java
= += -= *= /= %=
```

#### 🔍 Relacionais (retornam booleano)

```java
== != >  < >= <=
```

#### 🧠 Lógicos

```java
&& || !
```

---

### 💻 Exemplo Prático

```java
public class Aula2Exemplo {
    public static void main(String[] args) {
        int idade = 30;
        double altura = 1.75;
        boolean maiorDeIdade = idade >= 18;

        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("É maior de idade? " + maiorDeIdade);
    }
}
```

---

## ✅ Boas Práticas

* Use nomes de variáveis significativos: `idade`, `salarioMensal`, `nomeCliente`.
* Prefira `int` e `double` para a maioria dos casos.
* Sempre inicialize variáveis (em Java 8, não inicializar gera erro de compilação).
* Em Java 11+ você pode usar `var`, mas use com cautela:

```java
var nome = "José"; // tipo inferido como String
```

---

## 🔄 Versão Java Comparada

**Java 8**:

```java
int numero = 10;
```

**Java 11+ (com `var`)**:

```java
var numero = 10; // ainda é int, inferido pelo compilador
```

---

## 📖 Parábola – O Sábio e os Tijolos

> Um mestre chamou seu aprendiz e lhe deu uma pilha de tijolos. Pediu que ele construísse uma parede. O aprendiz
> empilhou aleatoriamente e a parede caiu. O mestre então ensinou: “Cada tijolo tem seu lugar e propósito. Quando você os
> entende, pode construir algo firme.”

**Moral**: Tipos e variáveis são os tijolos da programação. Conhecê-los e usá-los corretamente garante que sua base seja
forte e estável.

---