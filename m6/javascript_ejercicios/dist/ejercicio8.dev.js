"use strict";

/* Demanar un número a l’usuari que indicarà un nombre de dies. Mostrar per pantalla la conversió d’aquest número a anys, mesos i dies (no cal tenir presents els anys de traspàs). Podeu suposar que tots els mesos tenen 30 dies. */
function anysMesosDies(diesX) {
  var anys = Math.floor(diesX / 365);
  diesX = diesX % 365;
  var mesos = Math.floor(diesX / 30);
  dies = diesX % 30;
  console.log(anys + " - " + mesos + " - " + dies);
}

var diesX = parseInt(prompt());
anysMesosDies(diesX);