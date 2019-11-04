# Bubble Sort Algorithm
## English

Bubble Sort is an order-by-change algorithm, which acts by comparing pairs of elements successively and changing them when they are out of order.

In this strategy, the biggest element is "pushed" to the end of the structure being ordered.

It consists of scanning the array from left to right, comparing pairs of consecutive elements and replacing them with those that are out of order.

There is no need to traverse the complete array in all iterations (as shown in the example image below).

### Rabbits and Turtles - Bubble Sort
 - Rabbits: High values are moved to the end of the list quickly;
 - Turtles: Low values are moved to the beginning of the list slowly;

### Time Complexity Analysis - Bubble Sort
 - Best Case?
    - The Array is already sorted (No changes will occur).
      - **Complexity:** O (n) = n
 - Middle case?
      - The Array is not ordered (we do not know for sure how many comparisons will be needed).
          - **Complexity:** O (n) = n^2
  - Worst case?
      - The Array is sorted in reverse (Inverted).
        - **Complexity:** O (n) = n^2

## Example:

Given the initial array: [10, 34, 13, 5, 1, 67], the following image demonstrates the step-by-step steps of Bubble Sort (this image is based on code from project)
- Numbers in red are the current position comparison during the loop.
- The numbers in red with "--" between them means that there was a change of position between the two.
- Blue numbers are numbers that are already sorted and the loop no longer verifies these numbers.

![screenshot](https://user-images.githubusercontent.com/17066350/49020970-c8adc100-f178-11e8-94db-a6ed84f7e05b.png)

- **Array after passing through the algorithm Bubble Sort:** [1, 5, 10, 13, 34, 67]

## References:
 - [DevMedia: Bubble Sort](https://www.devmedia.com.br/entendendo-o-algoritmo-bubble-sort-em-java/24812)
 - [Wikipedia - Português: Bubble Sort](https://pt.wikipedia.org/wiki/Bubble_sort)
 - [Wikipedia - English: Bubble Sort](https://en.wikipedia.org/wiki/Bubble_sort)
 - [GeeksforGeeks: Bubble Sort](https://www.geeksforgeeks.org/bubble-sort/)


## ====================================================

## Português:

Bubble Sort é um algoritmo de ordenação por troca, que atua comparando sucessivamente pares de elementos e mudando-os de posição quando se apresentam fora da ordem desejada.

Nessa estratégia, o maior elemento é "empurrado" para o final da estrutura que está sendo ordenada.

Consiste em efetuar uma varredura no array, da esquerda para a direita, comparando pares de elementos consecutivos e trocando-os de lugar os que estão fora de ordem.

Não existe a necessidade de percorrermos o array completo em todas as iterações(Como mostra a imagem do exemplo a seguir).

### Coelhos e Tartarugas - Bubble Sort
  - Coelhos: Valores altos são movidos para o fim da lista rapidamente;
  - Tartarugas: Valores baixos são movidos para o início da lista vagarosamente;

### Análise de Complexidade de Tempo - Bubble Sort
 - Melhor Caso?
    - O Array já se encontra ordenado(Não irá ocorrer trocas).
      - **Complexidade:** O(n) = n
- Caso Médio?
    - O Array não está ordenado(não sabemos ao certo quantas comparações serão necessárias).
      - **Complexidade:** O(n) = n^2
- Pior Caso?
    - O Array está ordenado ao contrário(Invertido).
      - **Complexidade:** O(n) = n^2

## Exemplo:

Dado o Array inicial: [ 10, 34, 13, 5, 1, 67 ], a imagem a seguir demonstra o passo a passo das etapas do Bubble Sort(esta imagem é com base no código desde projeto)
- Números vermelhos são a comparação atual de posição durante o laço.
- Os números vermelhos com "--" entre eles, significa que houve troca de posição entre ambos.
- Números azuis são números que já estão ordenados e o laço já não verifica mais esses números. 

![screenshot](https://user-images.githubusercontent.com/17066350/49020970-c8adc100-f178-11e8-94db-a6ed84f7e05b.png)

- **Array após ter passado pelo algoritmo Bubble Sort:** [ 1, 5, 10, 13, 34, 67 ]
    
## Referências:
 - [DevMedia: Bubble Sort](https://www.devmedia.com.br/entendendo-o-algoritmo-bubble-sort-em-java/24812)
 - [Wikipedia - Português: Bubble Sort](https://pt.wikipedia.org/wiki/Bubble_sort)
 - [Wikipedia - English: Bubble Sort](https://en.wikipedia.org/wiki/Bubble_sort)
 - [GeeksforGeeks: Bubble Sort](https://www.geeksforgeeks.org/bubble-sort/)
