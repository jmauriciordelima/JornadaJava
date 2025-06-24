# 🎯 **Aula 4 — Arrays e Coleções (Vetores, Matrizes e Listas)**

Vamos subir mais um degrau na sua jornada! 🚀

---

# 🔹 **O que é um Array?**

* **Array** (ou vetor) é uma estrutura de dados que armazena **um conjunto de elementos do mesmo tipo**.
* Ele tem **tamanho fixo**, definido no momento da criação.
* A posição dos elementos é acessada por um **índice**, começando do **0**.

### 🔧 **Sintaxe básica:**

```java
// Criando um array de 5 números inteiros
int[] numeros = new int[5];

// Atribuindo valores
numeros[0]=10;
numeros[1]=20;
numeros[2]=30;

// Acessando valores
        System.out.

println(numeros[1]); // Saída: 20
```

---

# 🔹 **Percorrendo um Array:**

```java
int[] numeros = {10, 20, 30, 40, 50};

for(
int i = 0;
i<numeros.length;i++){
        System.out.

println(numeros[i]);
}
```

---

# 🔹 **O que é uma Matriz? (Array Bidimensional)**

* É um array de arrays.
* Imagina uma **tabela** (linhas e colunas).

### 🔧 **Exemplo básico:**

```java
int[][] matriz = new int[2][3]; // 2 linhas, 3 colunas

// Preenchendo
matriz[0][0]=1;
matriz[0][1]=2;
matriz[0][2]=3;
matriz[1][0]=4;
matriz[1][1]=5;
matriz[1][2]=6;

// Exibindo
        for(
int i = 0;
i< 2;i++){
        for(
int j = 0;
j< 3;j++){
        System.out.

print(matriz[i][j]+" ");
            }System.out.

println();
        }
```

---

# 🔹 **ArrayList – Coleções mais flexíveis**

* Diferente do Array, o `ArrayList` **não tem tamanho fixo**.
* Pode crescer e diminuir dinamicamente.

### 🔧 **Exemplo de uso:**

```java
import java.util.ArrayList;

public class ListaExemplo {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();

        // Adicionando elementos
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Uva");

        // Acessando
        System.out.println(frutas.get(1)); // Saída: Banana

        // Removendo
        frutas.remove("Maçã");

        // Percorrendo
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
```

---

# 🔥 **Melhores Práticas:**

* Dê nomes claros aos arrays/listas, que representem o conteúdo.
* Sempre valide o tamanho antes de acessar posições, para evitar `ArrayIndexOutOfBoundsException`.
* Prefira coleções (`ArrayList`, `List`) quando não souber quantos elementos haverá.

---

# 📜 **Parábola – O Sábio e os Potes de Pedras**

> Um professor entrou na sala com um grande pote de vidro. Encheu-o de pedras grandes e perguntou aos alunos:
> – O pote está cheio?
> Eles responderam: – Sim!
> Então ele pegou cascalhos e colocou entre as pedras, balançando o pote. Perguntou novamente:
> – E agora? Está cheio?
> – Sim, disseram.
> Ele então pegou areia e colocou no pote, preenchendo os espaços menores. Perguntou:
> – Agora?
> Todos disseram: – Sim!
> Por fim, pegou água e derramou, enchendo todos os vazios restantes.
> Então concluiu:
> – A lição é que se você não colocar as pedras grandes primeiro, nunca conseguirá colocá-las depois.

**Moral:** As pedras grandes são as coisas importantes — seus estudos, sua saúde, sua família. Coloque-as primeiro.
Depois, os detalhes se ajeitam.

---