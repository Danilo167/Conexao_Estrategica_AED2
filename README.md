<div align = "center">
<h1>Conexao_Estrategica_AED2</h1>
</div>
<br>
<h3>
> Trabalho da primeira unidade de AED2 sobre programação dinâmica, valendo 4 pontos, em grupo. 
<br>
> Desafios: modelar um algoritmo usando programação dinâmica e implementar ele. 
<br>
> Equipe: Daniel Gonçalves da Silva, Danilo Scheidt Caxias do Rêgo e Reginaldo de Araújo Ferreira Filho.
</h3>  
<br>
<div align = "center">
<h1>Descrição do Problema</h1>
</div>
<p>&nbsp; &nbsp; Ada está jogando um jogo de puzzle em um tabuleiro. Cada casa do tabuleiro tem um custo associado. Lendo os custos da esquerda para a direita percebe-se um padrão. Começando pela primeira linha temos um padrão com os M primeiros inteiros em ordem crescente: 1, 2, 3, ..., M, 1, 2, 3, ..., M, .... Nesse padão M é o maior custo de uma casa.
<br>
&nbsp; &nbsp; No jogo, Ada precisa comprar uma casa por linha até formar um caminho que conecte o topo do tabuleiro a base dele. A primeira casa a ser comprada deve ser na primeira linha, a segunda casa na segunda linha e assim por diante.
&nbsp; &nbsp; Dado  um tabuleiro, sua tarefa é descobrir o custo do caminho mais barato que liga o topo a sua base. </p>
<h3>Especificação da Entrada:</h3>
&nbsp; &nbsp; A primeira linha da entrada contém um inteiro positivo, R. Ele indica o número de linhas do tabuleiro. A segunda linha contém outro inteiro positivo, C, indicando o número de colunas do tabuleiro. A terceira linha tem um inteiro, M, onde M <= 100.000, que é o maior custo de uma casa.
<h3>Especificação da Saída:</h3>
&nbsp; &nbsp; A saída é o número P, o menor custo de um caminho que liga o topo à base do tabuleiro.
<br>
<h3>Exemplo de Entrada:</h3>
<b>
3
<br>
5
<br>
7
<br>
</b>
<h3>Exemplo de Saída:</h3>
<b>6</b>
