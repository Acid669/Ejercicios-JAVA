# Ejercicio Nº 2: Desafío del código Morse

**Dificultad del ejercicio ⭐⭐⭐⭐⭐ ¿Te animas a resolverlo?**

El sistema Morse permite cifrar cada grafema del alfabeto como una secuencia de "puntos" y "rayas" o “líneas”. Por ejemplo, la letra S se cifra como · · ·, la letra T se cifra como − y el número 7 se cifra como · · - - -

El código Morse no hace diferencia entre mayúsculas y minúsculas, sin embargo sus conversiones comúnmente se presentan en letras en mayúscula (por convención). Al redactar el mensaje un código Morse, se utiliza un solo espacio para separar los códigos de grafemas y se emplean 3 espacios para separar palabras.

En base a esto, realizar una API que sea capaz de descifrar SOLO PALABRAS (no frases) de nuestro alfabeto a código morse. Para ello, el sistema deberá tener en cuenta la siguiente tabla de valores de conversión:

Letras:

| Caracter | Código Morse |
|----------|--------------|
| A        | · -          |
| B        | - · · ·      |
| C        | - · - ·      |
| D        | - · ·        |
| E        | ·            |
| F        | · · - ·      |
| G        | - - ·        |
| H        | · · · ·      |
| I        | · ·          |
| J        | · - - -      |
| K        | - · -        |
| L        | · - · ·      |
| M        | - -          |
| N        | - ·          |
| O        | - - -        |
| P        | · - - ·      |
| Q        | - - · -      |
| R        | · - ·        |
| S        | · · ·        |
| T        | -            |
| U        | · · -        |
| V        | · · · -      |
| W        | · - -        |
| X        | - · · -      |
| Y        | - · - -      |
| Z        | - - · ·      |

Números:

| Caracter | Código Morse |
|----------|--------------|
| 0        | - - - - -    |
| 1        | · - - - -    |
| 2        | · · - - -    |
| 3        | · · · - -    |
| 4        | · · · · -    |
| 5        | · · · · ·    |
| 6        | - · · · ·    |
| 7        | - - · · ·    |
| 8        | - - - · ·    |
| 9        | - - - - ·    |

Ejemplos de conversiones:

| Palabra     | Código Morse                                     |
|-------------|--------------------------------------------------|
| código      | -.-. --- --.. .. -.. ---                        |
| bootcamp    | -... --- --- - / .-.-.- -.-. .- -- .--. -- .--. |
| java        | .--- .- ...- .-                                  |

**Ejercicio Nº 3: Palabras Morse - Extra (Opcional)**

Como desafío extra y OPCIONAL (no obligatorio) te proponemos que logres que tu ejercicio anterior sea capaz de, además de traducir palabras en código morse, sea capaz de traducir frases completas.

Recuerda que en el código Morse la separación de palabras se realiza mediante 3 espacios en blanco.

⭐ ¿Te animas a resolverlo?