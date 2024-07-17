# Dio AI JAVA

```mermaid
classDiagram
  class Usuario {
    -String name
    -Conta account
    -Feature [] features
    -Cartao card
    -Novidade [] news
  }

  class Conta {
    -String number
    -String agency
    -double balance
    -double limit
  }

  class Feature {
    -String icon
    -String description
  }

  class Cartao {
    -String number
    -double limit
  }

  class Novidade {
    -String icon
    -String description
  }

  Usuario *-- Conta
  Usuario *-- Feature
  Usuario *-- Cartao
  Usuario *-- Novidade
