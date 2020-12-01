"use strict";

/* Demanar a l’usuari un text i una posició (per exemple, “hola”, 3). Mostrar el resultat de eliminar el caràcter a la posició indicada (a l’exemple, “hoa”)*/
var text = prompt();
var pos = prompt();
var p1 = text.substr(0, pos - 1);
console.log(p1);
var p2 = text.substr(pos, text.length);
console.log(p2);
var textFinal = "";
textFinal = textFinal.concat(p1, p2);
console.log(textFinal);