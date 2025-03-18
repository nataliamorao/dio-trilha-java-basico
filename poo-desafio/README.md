# [DIO](www.dio.me) - Trilha Java Básico

## Autores
- [Natalia Morão](https://github.com/nataliamorao)

## POO - Desafio

### Modelagem e Diagramação de um Componente iPhone

Neste desafio, fui responsável por modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

#### Contexto
Com base no vídeo de lançamento do iPhone de 2007 (link abaixo), elaboei a diagramação das classes e interfaces utilizando uma ferramenta UML. Em seguida, implementei as classes e interfaces no formato de arquivos `.java`.

[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)

#### Funcionalidades Modeladas
1. **Reprodutor Musical**
   - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
   - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
   - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

### Objetivo
1. Criar um diagrama UML que represente as funcionalidades descritas acima.
2. Implementar as classes e interfaces correspondentes em Java (Opcional).

### Diagrama UML (Mermaid)
```mermaid
classDiagram
    iPhone <|-- ReprodutorMusical
    iPhone <|-- AparelhoTelefonico
    iPhone <|-- NavegadorInternet

    class ReprodutorMusical{
      +tocar()
      +pausar()
        +String selecionarMusica(String musica)     
    }
    class AparelhoTelefonico{
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }
    class NavegadorInternet{
        exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }
```

### Link do Diagrama


[![](https://mermaid.ink/img/pako:eNplksFugzAMhl8F5dRq7QugXartssOqap12mLi4xAVrwUYmqbZ2ffelQBkILsHOn_-z41xMLhZNanIHTfNMUChUGSfxo10pjMnj73qdvGGtYoMXfQ0N5eDmkk0Niq6Ud3R4FKZc5potnLAAK_rCHpXRZ9yJWvqccul2k-TBSw66WA5xDaEZJ2Jq75W4SJrIz0kYepNFn6_aaNlqu1PXMXte_mXk7aiItN6JQ4UqYzR4ZIvTcih6EOiTqCLJh5zvuxPs7EZGVPymA-kOCuKhi6BuArbU9bqVE2wOsJhWFcDRGe4Wd75ZmdhABWTj3FteZnyJFWYmjb8W9CszGd90EIex_-HcpF4DroxKKEqTHsE1MQq1jZ33j2bI1sCfIv8xWrpNtH9mt-X6B0AzzCY?type=png)](https://mermaid.live/edit#pako:eNplksFugzAMhl8F5dRq7QugXartssOqap12mLi4xAVrwUYmqbZ2ffelQBkILsHOn_-z41xMLhZNanIHTfNMUChUGSfxo10pjMnj73qdvGGtYoMXfQ0N5eDmkk0Niq6Ud3R4FKZc5potnLAAK_rCHpXRZ9yJWvqccul2k-TBSw66WA5xDaEZJ2Jq75W4SJrIz0kYepNFn6_aaNlqu1PXMXte_mXk7aiItN6JQ4UqYzR4ZIvTcih6EOiTqCLJh5zvuxPs7EZGVPymA-kOCuKhi6BuArbU9bqVE2wOsJhWFcDRGe4Wd75ZmdhABWTj3FteZnyJFWYmjb8W9CszGd90EIex_-HcpF4DroxKKEqTHsE1MQq1jZ33j2bI1sCfIv8xWrpNtH9mt-X6B0AzzCY)

![Diagrama](image.png)