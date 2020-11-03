"use strict";

/* Calcular els primers 20 números de la sèrie de Fibonacci, tenint present que a1=1, a2=1 y que an=an-1+an-2. */
var numero1 = 0;
var swap = 1;

for (var i = 0; i < 21; i++) {
  console.log(numero1);

  if (i == 0) {
    console.log(swap);
    numero1 = numero1 + swap;
  } else {
    numero1 = numero1 + swap;
    var _ref = [swap, numero1];
    numero1 = _ref[0];
    swap = _ref[1];
    _ref;
  }
}