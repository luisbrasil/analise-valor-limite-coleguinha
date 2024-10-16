# Relatório de Testes em Caixa Preta

## Introdução

Os teste escritos nesse repositório consistem em uma atividade realizada em sala de aula da disciplina de Teste de Software.
A ideia é que o arquivo .jar testado foi desenvolvido por outro aluno e aqui devem ser implementando os testes de Caixa Preta com base na Análise de Valor Limite.
A análise limite consiste em testar cada faixa da lógica de negócio de modo a inserir 3 inputs pra cada limite dessa faixa: um inferior, um igual e um superior, sendo o inferior e superior o mais próximo possível do limite em si.

## Análise de Valor Limite

# Análise de Valor Limite - SimuladorCashBack

Esta tabela contém os cenários de teste de valor limite para a função `calculaCashBack`, considerando diferentes faixas de valores e níveis de cashback (Bronze, Prata e Ouro).

| **Cenário**                                      | **Valor** | **Nível**  | **Cashback Esperado** |
|--------------------------------------------------|-----------|------------|-----------------------|
| Limite Inferior até 100 (Bronze)                  | 99.99     | Bronze     | 4.99                  |
| Limite Inferior até 100 (Prata)                   | 99.99     | Prata      | 9.99                  |
| Limite Inferior até 100 (Ouro)                    | 99.99     | Ouro       | 14.99                 |
| Limite até 100 (Bronze)                           | 100.00    | Bronze     | 5.0                   |
| Limite até 100 (Prata)                            | 100.00    | Prata      | 10.0                  |
| Limite até 100 (Ouro)                             | 100.00    | Ouro       | 15.0                  |
| Limite Superior acima de 100 (Bronze)             | 100.01    | Bronze     | 10.0                  |
| Limite Superior acima de 100 (Prata)              | 100.01    | Prata      | 15.0                  |
| Limite Superior acima de 100 (Ouro)               | 100.01    | Ouro       | 20.0                  |
| Limite Inferior acima de 100 até 500 (Bronze)     | 100.02    | Bronze     | 10.0                  |
| Limite Inferior acima de 100 até 500 (Prata)      | 100.02    | Prata      | 15.0                  |
| Limite Inferior acima de 100 até 500 (Ouro)       | 100.02    | Ouro       | 20.0                  |
| Limite Superior abaixo de 500 (Bronze)            | 499.99    | Bronze     | 49.99                 |
| Limite Superior abaixo de 500 (Prata)             | 499.99    | Prata      | 74.99                 |
| Limite Superior abaixo de 500 (Ouro)              | 499.99    | Ouro       | 99.99                 |
| Limite de cima de 100 a 500 (Bronze)              | 500.00    | Bronze     | 50.0                  |
| Limite de cima de 100 a 500 (Prata)               | 500.00    | Prata      | 75.0                  |
| Limite de cima de 100 a 500 (Ouro)                | 500.00    | Ouro       | 100.0                 |
| Limite Superior acima de 500 (Bronze)             | 500.10    | Bronze     | 75.01                 |
| Limite Superior acima de 500 (Prata)              | 500.10    | Prata      | 100.02                |
| Limite Superior acima de 500 (Ouro)               | 500.10    | Ouro       | 125.02                |

## Execução dos Testes

Os testes foram rodados no VSCode, todos eles passaram 

Results:
Tests run: 21, Failures: 0, Errors: 0, Skipped: 0

Os resultados foram exatamente os esperados nos casos de testes projetados na análise do Valor Limite

| **Cenário**                                      | **Valor** | **Nível**  | **Cashback Esperado** | **Cashback Calculado** | **Resultado** |
|--------------------------------------------------|-----------|------------|-----------------------|-----------------------|---------------|
| Limite Inferior até 100 (Bronze)                  | 99.99     | Bronze     | 4.99                  | 4.99                  | Aprovado      |
| Limite Inferior até 100 (Prata)                   | 99.99     | Prata      | 9.99                  | 9.99                  | Aprovado      |
| Limite Inferior até 100 (Ouro)                    | 99.99     | Ouro       | 14.99                 | 14.99                 | Aprovado      |
| Limite até 100 (Bronze)                           | 100.00    | Bronze     | 5.0                   | 5.0                   | Aprovado      |
| Limite até 100 (Prata)                            | 100.00    | Prata      | 10.0                  | 10.0                  | Aprovado      |
| Limite até 100 (Ouro)                             | 100.00    | Ouro       | 15.0                  | 15.0                  | Aprovado      |
| Limite Superior acima de 100 (Bronze)             | 100.01    | Bronze     | 10.0                  | 10.0                  | Aprovado      |
| Limite Superior acima de 100 (Prata)              | 100.01    | Prata      | 15.0                  | 15.0                  | Aprovado      |
| Limite Superior acima de 100 (Ouro)               | 100.01    | Ouro       | 20.0                  | 20.0                  | Aprovado      |
| Limite Inferior acima de 100 até 500 (Bronze)     | 100.02    | Bronze     | 10.0                  | 10.0                  | Aprovado      |
| Limite Inferior acima de 100 até 500 (Prata)      | 100.02    | Prata      | 15.0                  | 15.0                  | Aprovado      |
| Limite Inferior acima de 100 até 500 (Ouro)       | 100.02    | Ouro       | 20.0                  | 20.0                  | Aprovado      |
| Limite Superior abaixo de 500 (Bronze)            | 499.99    | Bronze     | 49.99                 | 49.99                 | Aprovado      |
| Limite Superior abaixo de 500 (Prata)             | 499.99    | Prata      | 74.99                 | 74.99                 | Aprovado      |
| Limite Superior abaixo de 500 (Ouro)              | 499.99    | Ouro       | 99.99                 | 99.99                 | Aprovado      |
| Limite de cima de 100 a 500 (Bronze)              | 500.00    | Bronze     | 50.0                  | 50.0                  | Aprovado      |
| Limite de cima de 100 a 500 (Prata)               | 500.00    | Prata      | 75.0                  | 75.0                  | Aprovado      |
| Limite de cima de 100 a 500 (Ouro)                | 500.00    | Ouro       | 100.0                 | 100.0                 | Aprovado      |
| Limite Superior acima de 500 (Bronze)             | 500.10    | Bronze     | 75.01                 | 75.01                 | Aprovado      |
| Limite Superior acima de 500 (Prata)              | 500.10    | Prata      | 100.02                | 100.02                | Aprovado      |
| Limite Superior acima de 500 (Ouro)               | 500.10    | Ouro       | 125.02                | 125.02                | Aprovado      |

O problema encontrado foi o de que todos os testes passaram, sendo que na atividade na implementação da função a ser testada deveria ter sido incluído um erro proposital 

## Conclusão

Conclui-se que a aplicação testada passou com sucesso na Análise de Valor Limite, sendo assim um indício positivo de robustez da própria
