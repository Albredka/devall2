"use strict";

/* Nochevieja (Extret del concurs programame)
Ramón se pasa el día de Nochevieja contando los minutos que faltan para que de las uvas. ¿Puedes ayudarle?

Crea un programa que pida al usuario una hora en formato 24horas separadas por dos puntos (es decir desde 00:00 hasta 23:59), y muestre como salida el número de minutos que faltan hasta la medianoche. Si el usuario indica que son las 00:00 entonces la salida será “Feliz Año Nuevo”

Ejemplo:     23:45 🡪 15
        21:30 🡪 150
        00:01 🡪 1439
Pista: split
*/
var hora_total = prompt("Introdueix la hora: ");
hora_total = hora_total.split(":");

if (hora_total[0] == 12 && hora_total[1] == 0) {
  console.log("Feliz Año Nuevo");
} else {
  var hora = hora_total[0];
  var minuts = parseInt(hora_total[1]);
  minuts += parseInt(hora) * 60;
  console.log(minuts);
  var falta = 24 * 60 - minuts;
  console.log(falta);
}