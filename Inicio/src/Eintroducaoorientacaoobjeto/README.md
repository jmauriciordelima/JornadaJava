Claro, José Maurício!
Agora começaremos um **dos temas mais importantes e profundos da programação em Java**: a **Programação Orientada a
Objetos (POO)**.

---

# 🧭 **Aula 6 – Introdução à Orientação a Objetos (POO – Parte 1)**

> Conceitos fundamentais de **classe, objeto, atributos e métodos**

---

## 🧱 O que é POO?

POO (Programação Orientada a Objetos) é um **modelo de programação** baseado em "objetos", que são **representações de
coisas do mundo real**.

Em vez de só pensar em comandos e variáveis soltas, passamos a **modelar entidades reais**, como:

* um *Carro*
* uma *Pessoa*
* uma *Conta Bancária*

Cada uma dessas entidades tem:

* **atributos** (características)
* **comportamentos** (ações/métodos)

---

## 🧩 Conceitos Fundamentais

### 🔹 **1. Classe**

> Uma **classe** é como uma *forma* ou *molde* para criar objetos.

Exemplo:

```java
public class Pessoa {
    String nome;
    int idade;

    void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}
```

---

### 🔹 **2. Objeto**

> Um **objeto** é uma **instância de uma classe**, ou seja, é algo real criado a partir do molde.

Exemplo:

```java
Pessoa p1 = new Pessoa();  // p1 é um objeto
```

---

### 🔹 **3. Atributos**

> São as **características** de um objeto (variáveis dentro da classe).

Exemplo:

```java
p1.nome ="José Maurício";
p1.idade =36;
```

---

### 🔹 **4. Métodos**

> São as **ações** que o objeto pode realizar (funções dentro da classe).

Exemplo:

```java
p1.apresentar(); // Exibe: Olá, meu nome é José Maurício...
```

---

## 🎯 Exemplo completo

```java
public class Pessoa {
    String nome;
    int idade;

    void apresentar() {
        System.out.println("Olá! Meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}
```

```java
public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "José";
        pessoa1.idade = 36;
        pessoa1.apresentar();
    }
}
```

---

## ✅ Vantagens da POO

* Organização do código em **blocos reutilizáveis**
* Modelagem de sistemas mais próxima do mundo real
* Redução da repetição
* **Facilidade para manutenção e crescimento**

---

## 🚧 Erros comuns de iniciantes

* Achar que `classe` e `objeto` são a mesma coisa
* Esquecer do `new` ao instanciar um objeto
* Tentar acessar métodos de uma classe **sem criar um objeto**

---
