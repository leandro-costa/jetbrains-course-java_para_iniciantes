### Operadores booleanos
***
De acordo com a lógica booleana, toda afirmação é binária: `true` ou `false`.

Declarações compostas também são de natureza binária.O operador usado para ingressar em duas declarações determina o valor booleano da instrução como um todo.

As tabelas a seguir resumem os operadores booleanos:

**NÃO**

A veracidade da declaração é revertida.

| NÃO | Declaração | Resultado |
|---|--------|-------|
| ! | `true`  | `false` |
| ! | `false` | `true` |

**E**

Se duas declarações forem unidas usando `e`, a instrução composta será verdadeira apenas se as duas partes forem verdadeiras.

| Declaração 1 | E | Declaração 2 | Resultado |
|-------------|----|-------------|--------|
| `true `       | && | `true`        | `true`   |
| `true `       | && | `false `      |` false ` |
| `false `      | && | `true `       | `false`  |
| `false  `     | && | `false `      | `false`  |


**OU**

Se duas instruções forem unidas usando `ou`, a instrução composta será verdadeira se alguma parte for verdadeira.

| Declaração 1 | OU            | Declaração 2 | Resultado |
|-------------|---------------|-------------|--------|
| `true`        | &#124;&#124; | `true`        | `true`   |
| `true`        | &#124;&#124;  | `false `      | `true `  |
| `false`       | &#124;&#124;  | `true   `     | `true  ` |
| `false`       | &#124;&#124;  | `false   `    | `false ` |

O código exemplifica o uso de operadores booleanos.