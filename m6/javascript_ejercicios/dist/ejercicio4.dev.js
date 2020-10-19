"use strict";

/* Fes un programa que demani tres números a l’usuari i mostri la mitjana, el major i el menor. */
function mitjana(num1, num2, num3) {
  resultat = (num1 + num2 + num3) / 3;
  return resultat;
}

function major(num1, num2, num3) {
  var resultat;

  if (num1 > num2) {
    resultat = num1 > num3 ? num1 : num3;
  }

  if (num2 > num1) {
    resultat = num2 > num3 ? num2 : num3;
  }

  if (num3 > num1) {
    resultat = num3 > num2 ? num3 : num2;
  }

  return resultat;
}

function menor(num1, num2, num3) {
  var resultat;

  if (num1 > num2) {
    resultat = num1 > num3 ? num3 : num1;
  }

  if (num2 > num1) {
    resultat = num2 > num3 ? num3 : num2;
  }

  if (num3 > num1) {
    resultat = num3 > num2 ? num2 : num3;
  }

  return resultat;
}

function overall() {
  var num1 = prompt("numero 1: ");
  var num2 = prompt("numero 2: ");
  var num3 = prompt("numero 3: ");
  console.log(mitjana(num1, num2, num3));
  console.log(major(num1, num2, num3));
  console.log(menor(num1, num2, num3));
}

overall();