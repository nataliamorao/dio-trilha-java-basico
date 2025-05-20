## 🏦 Banco Digital Simples em Java

Este projeto consiste em uma implementação simplificada de um banco digital utilizando os conceitos de **abstração** da Programação Orientada a Objetos (POO) em Java. O objetivo principal é demonstrar como a abstração pode ser aplicada para modelar entidades bancárias de forma clara e organizada, focando no comportamento essencial de cada tipo de conta.

### ✨ Destaques do Projeto

* **Modelagem Abstrata:** Definição de uma classe base `Conta` que serve como um contrato para as operações bancárias comuns, como depositar, sacar, transferir e exibir extrato.

* **Herança:** Criação de classes especializadas (`ContaCorrente` e `ContaPoupanca`) que herdam o comportamento da classe `Conta` e adicionam funcionalidades específicas (como limite de crédito e taxa de juros).

* **Encapsulamento:** Utilização de modificadores de acesso para proteger o estado interno dos objetos e controlar o acesso aos seus dados.

* **Polimorfismo (Implícito):** Embora não explicitamente demonstrado com interfaces neste exemplo simples, a estrutura permite a futura implementação de polimorfismo através de métodos sobrescritos nas classes filhas.

* **Tratamento de Erros Prático:** O projeto aborda e corrige erros comuns de compilação, como métodos não definidos e tipos de argumentos incorretos, demonstrando um processo de depuração passo a passo.

* **Código Limpo e Organizado:** Estrutura de pacotes e comentários para facilitar a compreensão e manutenção do código.

### 🚀 Como Executar

1.  **Pré-requisitos:**

    * Java Development Kit (JDK) instalado em sua máquina (versão 17 ou superior recomendada).

    * Ambiente de Desenvolvimento Integrado (IDE) como Visual Studio Code (com a extensão Java instalada) ou IntelliJ IDEA (opcional).

2.  **Clonar o Repositório (Opcional):**

    \`\`\`

    git clone \[URL\_DO\_SEU\_REPOSITÓRIO\]

    cd banco-digital-java

    \`\`\`

3.  **Compilar e Executar:**

    * **Usando o Terminal (Prompt de Comando):**

        \`\`\`

        javac src/\*.java

        java src/Main

        \`\`\`

    * **Usando o Visual Studio Code:**

        * Abra a pasta do projeto no VS Code.

        * Navegue até o arquivo `Main.java` dentro da pasta `src`.

        * Clique no botão "Run" ou pressione `Ctrl+Shift+D` para depurar e executar o programa.

### 🛠️ Estrutura do Projeto

\`\`\`

banco-digital-java/

├── src/

│   ├──   Banco.java         // (Poderia ser adicionado para gerenciar contas)

│   ├──   Cliente.java       // Classe para representar os clientes

│   ├──   Conta.java         // Classe abstrata base para as contas

│   ├──   ContaCorrente.java // Classe para contas correntes

│   ├──   ContaPoupanca.java // Classe para contas poupança

│   └──   Main.java          // Classe principal para executar o programa

└──   README.md             // Este arquivo

\`\`\`

### 💻 Demonstração do Código

O arquivo `Main.java` demonstra a criação de instâncias de `Cliente`, `ContaCorrente` e `ContaPoupanca`, além de realizar algumas operações bancárias básicas e exibir os extratos das contas.

\`\`\`java

public class Main {

​    public static void main(String\[\] args) {

​        // Criando clientes

​        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00", "Rua A, 1");

​        Cliente cliente2 = new Cliente("Maria Oliveira", "987.654.321-00", "Rua B, 2");

​        // Criando contas

​        ContaCorrente conta1 = new ContaCorrente("001", 1000.0, cliente1, 500.0);

​        ContaPoupanca conta2 = new ContaPoupanca("002", 2000.0, cliente2, 0.05);

​        // Exibindo informações das contas

​        System.out.println("Conta 1: " + conta1.getCliente().getNome());

​        System.out.println("Conta 2: " + conta2.getCliente().getNome());

​        // Realizando operações

​        conta1.depositar(200);

​        conta1.sacar(150);

​        conta1.transferir(300, conta2);

​        conta2.aplicarJuros();

​        // Exibindo extratos

​        System.out.println("\\nExtrato da conta 1:");

​        conta1.extrato();

​        System.out.println("\\nExtrato da conta 2:");

​        conta2.extrato();

​    }

}

\`\`\`

### 💡 Aprendizados e Próximos Passos

Este projeto permitiu a compreensão e aplicação prática dos seguintes conceitos de POO:

* **Abstração:** Foco nas características essenciais de um objeto.

* **Herança:** Reutilização de código e criação de hierarquias de classes.

* **Encapsulamento:** Proteção dos dados internos e controle de acesso.

* **Tratamento de Erros:** Identificação e correção de erros de compilação.

Como próximos passos, podem ser implementadas as seguintes melhorias:

* Criação de uma classe `Banco` para gerenciar múltiplas contas.

* Implementação de interfaces para definir contratos mais claros.

* Adição de tratamento de exceções para cenários de erro.

* Persistência de dados (salvar e carregar informações das contas).

* Implementação de mais funcionalidades bancárias (empréstimos, investimentos, etc.).

* Implementar testes unitários para garantir a robustez do código.

* Adicionar uma interface gráfica para facilitar a interação do usuário.

### 🤝 Contribuição

Sinta-se à vontade para contribuir com este projeto através de pull requests, reportando bugs ou sugerindo novas funcionalidades.

### 📄 Licença

\[Adicionar aqui o tipo de licença, por exemplo: MIT License\]

Feito com ❤️ por \[Seu Nome/Nickname\]
