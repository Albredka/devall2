"use strict";

/* Demanar a l’usuari dos numeros (a i b) i mostrar el resultat de calcular a**b. Fes-ho mitjançant bucle. */
var num1 = prompt("numero 1: ");
var num2 = prompt("numero 2: ");

for (var i = 0; i < num2; i++) {
  console.log(num1);
  num1 *= num1;
}