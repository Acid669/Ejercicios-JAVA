# Ejercicio Nº 1: Conversor de Unidades de Longitud

Crea una API que pueda convertir de centímetros a metros. Para utilizarla, envía la cantidad de centímetros como parámetro mediante una solicitud GET, y la API responderá con su equivalente en metros.

Por ejemplo, si el parámetro es 163, la API deberá devolver 1,63. Además, considera agregar mensajes instructivos para que la respuesta sea más atractiva, como por ejemplo: "El equivalente a 163 cm es de 1,63 metros".

Recuerda seguir las mejores prácticas de diseño de API y proporcionar mensajes claros en las respuestas.

# Ejercicio Nº 2: Desafío del código Morse


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

