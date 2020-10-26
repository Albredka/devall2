"use strict";

/* Demanar a l’usuari un text i un caràcter. Cal que el programa mostri si al text hi apareix entre 2 i 4 vegades el caràcter. */
var text = prompt("Escriu un text: ");
var ch = prompt("Escriu un caracter: ");
var cops = 0;

while (ch.length != 1) {
  ch = prompt("Escriu un caracter: ");
}

for (var i = 0; i < text.length; i++) {
  if (text[i] == ch) {
    cops += 1;
  }
}

if (cops >= 2 && cops <= 4) {
  console.log(cops);
} else {
  console.log("Hi apareix un nombre incorrecte de cops el caracter escrit");
}