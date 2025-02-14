- [1. Composição](#1-composição)
- [2. Injeção de Dependência](#2-injeção-de-dependência)

# 1. Composição

Na composição, utilizamos a herança de uma forma diferente. Em vez de colocar os métodos de "comportamento" diretamente na classe mãe (como no exemplo da classe `Animal`), dividimos esses métodos em várias classes separadas. 

- Após estender a classe mãe na classe filha, criamos um construtor e, dentro dele, instanciamos as classes de "ação".

### Exemplo de Composição

```java
public class Andar {
    void mover() {
        System.out.println("Andando...");
    }
}

public class Animal {
    // A classe Animal não possui mais o método 'andar'
}

public class Cachorro extends Animal {
    Andar andar;

    Cachorro() {
        andar = new Andar(); // Instanciando a classe de ação
    }

    void mover() {
        andar.mover(); // Usando o comportamento da classe 'Andar'
    }
}

```
# 2. Injeção de Dependência

Na Injeção de dependência fazemos que nem a composição, mas criamos um objeto da classe filha. Nesse exemplo seria 'Andar andar;' na classe Cachorro. 

- Depois passaremos esse objeto no construtor da classe filha.
-  Após isso instanciaremos a classe mãe e filha na Main passando o 'Andar' como parâmetro para criação do objeto Cachorro.

### Exemplo de Injeção de Dependência

```java
public class Andar {
    void mover() {
        System.out.println("Andando...");
    }
}

public class Animal {
    
}

public class Cachorro extends Animal {
    Andar andar;

    Cachorro(Andar andar) {
        this.andar = andar; // Injetando a dependência 'Andar' por parâmetro
    }

    void mover() {
        andar.mover(); // Usando o comportamento injetado
    }
}

public class Main {
    public static void main(String[] args) {
        Andar andar = new Andar(); // Criando o objeto de ação
        Cachorro cachorro = new Cachorro(andar); // Injetando a dependência
        cachorro.mover(); // Saída: "Andando..."
    }
}

```
# Por: Caio Navarro - 3º semestre de D.S