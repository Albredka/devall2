
/* Fes un programa que demani tres números a l’usuari i mostri la mitjana, el major i el menor */


function mitjana(num1, num2, num3){
    var resultat = 0;
    resultat = (num1 + num2 + num3) / 3;

    return resultat;
}

function major (num1, num2, num3){
    if (num1 > num2 && num1 > num3){
        return num1;
    }
    if (num2 > num3 && num2 > num1){
        return num2;
    }
    if (num3 > num2 && num3 > num1){
        return num3;
    }
}

function menor (num1, num2, num3){
    if (num1 < num2 && num1 < num3){
        return num1;
    }
    if (num2 < num3 && num2 < num1){
        return num2;
    }
    if (num3 < num2 && num3 < num1){
        return num3;
    }
}

function all(){
    var num1 = parseInt(prompt());
    var num2 = parseInt(prompt());
    var num3 = parseInt(prompt());

    console.log(mitjana(num1, num2, num3));
    console.log(major(num1, num2, num3));
    console.log(menor(num1, num2, num3));
}

all();