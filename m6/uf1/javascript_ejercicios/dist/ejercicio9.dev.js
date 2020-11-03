"use strict";

/* Crear una aplicació que permeti realitzar la conversió entre temperatures de  ºC a ºF  i de ºF a ºC, d’acord amb la següent fórmula: 
            ºF = (9.0/5.0)* (ºC)+32.  */
function CaF(c) {
  var f = 0;
  f = 9 / 5 * c + 32;
  return f;
}