# Questão 1
**Primeira Afirmação**
**Resposta: verdadeira.**

As subclasses não herdam os construtores da superclasse,
pois construtores não são membros herdáveis.
Em vez disso, o construtor da superclasse é invocado pelo construtor da subclasse por meio de `super(...)`,
que deve ser a primeira instrução. Se a superclasse não tiver construtor sem parâmetros,
a chamada `super(...)` deve ser explícita, passando os argumentos que ela exige.

**Segunda Afirmação**
**Resposta: Falsa.**

O relacionamento "tem um" não é implementado via herança,
e sim via **agregação/composição**, em que uma classe possui um atributo do tipo de outra classe.
Já o relacionamento "é um" é que é implementado via herança,
ou seja, uma extensão de outra classe.

**Cachorro é um Animal:** `class Cachorro extends Animal`
**Carro tem um Motor:** `class Carro { private Motor motor; }`

**Terceira Afirmação**
**Resposta Falsa**

A afirmação é falsa. Quando a subclasse redefine um método da superclasse com a mesma assinatura,
diz-se que ela sobrescreve (override) o método, e não que o sobrecarrega.
A sobrecarga (overload) ocorre quando métodos têm o mesmo nome mas assinaturas diferentes,
o que pode acontecer tanto na superclasse quanto na subclasse,
pois são métodos distintos.

# Questão 2

**`protected`**
   - **Vantagens:** código da subclasse mais simples, com acesso direto aos atributos e menos getters e setters.
   - **Desvantagens:** quebra o encapsulamento,cria dependência da implementação interna (mudanças na superclasse podem quebrar as subclasses), 
       permite contornar validações e deixar o objeto inválido,e em Java dá acesso a classes do mesmo pacote.
  
**`private`**
  - **Vantagens:** preserva o encapsulamento, permite mudar a implementação sem afetar as subclasses e deixa a superclasse validar e controlar o acesso.
  - **Desvantagens:** exige mais código (getters e setters).
 

  - **Conclusão:** `private` é mais seguro e fácil de manter; `protected` é mais prático, mas gera acoplamento. 
    O ideal é usar atributos `private` e expor às subclasses apenas métodos `protected`.

# Questao 3

**Resposta:**

Ao criar um objeto de uma subclasse, os construtores executam em cadeia, de cima para baixo: o da subclasse chama o da superclasse com `super(...)`,
e assim sucessivamente até `Object`, e o corpo de cada um só executa depois que o da superclasse termina.
A chamada é obrigatória porque o objeto contém a parte herdada da superclasse,
que precisa ser inicializada antes da parte da subclasse, e a subclasse não acessa os atributos `private` da superclasse.
Ela deve ser a primeira instrução do construtor e pode ser implícita (super() inserido pelo compilador) ou explícita,
sendo obrigatoriamente explícita quando a superclasse não tem construtor sem parâmetros.



Dois exercícios feitos com **classes abstratas, polimorfismo e sobrescrita**.

## Questão 4: Formas de pagamento

- **Pagamento:** classe abstrata que define o método de processar um pagamento.
- **CartaoCredito:** soma uma taxa de 3% ao valor.
- **Boleto:** soma uma taxa fixa de R$ 3,50 ao valor.
- **Pix:** aplica um desconto de 5% sobre o valor.
- **Main:** guarda os três tipos em um array de `Pagamento` e processa cada um com a mesma chamada.

## Questão 5: Personagens de combate

- **Personagem:** classe abstrata que define o método de atacar.
- **Guerreiro:** ataca com a espada, causando dano fixo.
- **Mago:** lança bola de fogo enquanto tiver mana; sem mana, ataca com o cajado.
- **Arqueiro:** dispara flechas enquanto tiver munição; sem flechas, ataca com a adaga.
- **Main:** guarda os três personagens em um array de `Personagem` e simula um turno de combate contra um dragão.