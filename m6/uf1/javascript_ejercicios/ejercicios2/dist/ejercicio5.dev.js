"use strict";

/* Demanar un text a l’usuari. A continuació per pantalla mostrar el mateix text en majúscules, en minúscules, la longitud total, el nombre de paraules que té, el nombre de vocals que conté (en majúscules o minúscules) i, a continuació, el text introduït per l’usuari que s’anirà repetint línia per línia però de forma que cada línia tingui un caràcter menys que l’anterior (en concret la primera lletra anirà desapareixent).
Pista: toLocaleUpperCase, toLocaleLowerCase, length, substring, match...
 */
var text = prompt();
var vocals = "";
var textMajuscules = text.toUpperCase();
console.log(textMajuscules);
var textMinuscules = text.toLowerCase();
console.log(textMinuscules);
var textLongitud = text.length;
console.log(textLongitud);

function comptaParaules(str) {
  return str.split(" ").length;
}

console.log(comptaParaules(text));
vocals = text.match(/[aeiouAEIOU]/g);
vocals = vocals.length;
console.log(vocals);

for (var i = 0; i < text.length; i++) {
  var textFinal = text.substr(i, text.length);
  console.log(textFinal);
}