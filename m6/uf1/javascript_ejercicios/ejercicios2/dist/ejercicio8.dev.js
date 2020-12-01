"use strict";

/* Obtenir un número sencer a l’atzar entre 1 i 100. L’objectiu és que l’usuari l’adivini. A continuació, demanar a l’usuari que introdueixi un número. Si és major o menor que l’objectiu s’indicarà i es tornarà a demanar que introdueixi un altre número. Quan l’usuari adivini el número, per pantalla apareixerà un missatge de felicitació que indicarà el número d’intents que ha necessitat per solucionar-ho. Si l’usuari introdueix el número 0, aleshores no es demanarà cap altre número i per pantalla apareixerà un missatge tipus Game Over. Si l’usuari introdueix qualsevol altra cosa que no sigui un número, es tornarà a demanar però s’afegirà 1 als intents necessaris.

 */
var cont = 0;
var game = true;
var num_usr = parseInt(prompt("Introdueix un numero"));
var num = Math.floor(Math.random() * 100) + 1;

while (num_usr != num) {
  if (num_usr == 0) {
    game = false;
    break;
  }

  var miss = num_usr > num ? "Es major" : "Es menor";
  num_usr = parseInt(prompt("Introdueix un nou numero"));
  cont += 1;
}

if (game == true) {
  console.log("Felicitats. Els intents han sigut: " + cont);
} else {
  console.log("Game Over");
}