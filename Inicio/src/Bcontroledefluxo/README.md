Chegamos à **Aula 3**, e agora daremos um grande passo rumo ao **domínio da lógica de programação**. O conteúdo de hoje
é **fundamental** para tomada de decisões e repetição de tarefas — pilares para qualquer linguagem de programação.

---

# 🧭 Aula 3 – Controle de Fluxo em Java

### `if`, `else`, `else if`, `switch`, `while`, `for`, `do-while`

---

## 🎯 Objetivo da Aula

* Tomar decisões com base em condições (`if`, `else`)
* Criar fluxos com várias alternativas (`else if`, `switch`)
* Repetir blocos de código com laços (`while`, `for`, `do-while`)

---

## 🔹 1. Estruturas Condicionais

### `if`, `else`, `else if`

```java
int idade = 20;

if(idade< 18){
        System.out.

println("Menor de idade");
}else if(idade< 60){
        System.out.

println("Adulto");
}else{
        System.out.

println("Idoso");
}
```

> 🧠 Use `if` para verificar uma condição.
> Use `else if` para alternativas.
> Use `else` para o caso "padrão" (quando nenhuma condição anterior é verdadeira).

---

### `switch`

Quando você tem **múltiplos valores fixos para comparar**, o `switch` é ideal:

```java
int dia = 3;

switch(dia){
        case 1:
        System.out.

println("Domingo");
        break;
                case 2:
                System.out.

println("Segunda");
        break;
                case 3:
                System.out.

println("Terça");
        break;
default:
        System.out.

println("Dia inválido");
}
```

> 🛠️ `break` evita que ele continue executando os próximos `case`s.
> `default` funciona como um `else`.

---

## 🔁 2. Estruturas de Repetição

### `while` (verifica antes de executar)

```java
int contador = 0;

while(contador< 5){
        System.out.

println("Contando: "+contador);

contador++;
        }
```

---

### `do-while` (executa pelo menos uma vez)

```java
int numero = 0;

do{
        System.out.

println("Número: "+numero);

numero++;
        }while(numero< 3);
```

---

### `for` (estrutura completa: início, condição, incremento)

```java
for(int i = 0;
i< 5;i++){
        System.out.

println("i = "+i);
}
```