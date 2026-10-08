# Projeto Paranormal - Text Adventure em Kotlin

O **Projeto Paranormal** é um jogo de ficção interativa via terminal (*Text Adventure*) desenvolvido em Kotlin.
No jogo, o jogador assume o papel de um **Investigador Paranormal** que explora uma mansão mal-assombrada utilizando ferramentas de caça-fantasmas para coletar pistas e identificar manifestações sobrenaturais.


## 📋 Descrição do Projeto

O objetivo do investigador é avançar pelas salas da mansão utilizando o **Leitor EMF** e o **Termômetro** para registrar anomalias no ambiente. 

Com base nas leituras dos equipamentos, o sistema utiliza lógica combinada para deduzir o nível de perigo e o tipo de aparição sobrenatural.

### Regras de Negócio e Mecânicas
* Leitor EMF: Avalia o campo magnético/energético da sala.
* Termômetro: Avalia as variações de temperatura à medida que o jogador avança entre os cômodos.
* Lógica Combinada: Quando a leitura registra **Temperatura < 0°C** e **EMF ≥ 5**, uma aparição ou manifestação paranormal confirmada é detectada.
* Progressão de Salas: Cada nova sala avançada altera dinamicamente as condições ambientais (incremento no número da sala e variação térmica).
* 
#### 🛠️ Conceitos de Programação Aplicados

Este projeto foi desenvolvido aplicando os seguintes conceitos fundamentais da linguagem Kotlin e de lógica de programação:

1. Laços de Repetição (`while` / `for`):** Utilizados no controle de varredura do ambiente e na repetição das salas do jogo.
2. Estruturas Condicionais (`if` / `else` / `when`):** Empregadas na tomada de decisões do jogador e na lógica combinada para verificação de aparições.
3. Interpolação de Strings (`$variavel`):** Usada na exibição dinâmica dos dados do investigador, números de salas e leituras dos aparelhos.
4. Modularização e Pacotes (`package` e `import`):** Divisão do código em arquivos separados para organização de escopo (`executavel`, `introducao`, etc.).
5. Tratamento de Entradas: Leitura interativa via teclado com `readln()` e `readlnOrNull()`.


Este foi um projeto coordenado pelo Prof. Emerson Domingos da matéria de Mobile Coding, do curso Ciência da Computação na Instituição UniNorte (Centro Universitario do Norte)
