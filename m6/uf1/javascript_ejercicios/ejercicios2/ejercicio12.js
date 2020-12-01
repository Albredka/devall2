
/*
Obtenir la data actual del sistema. A continuació mostrar per pantalla: aquesta data en format llarg (Ex: Avui és DD de MM de YYYY), el nombre de setmanes que han passat de l’any, el percentatge de dies transcorreguts de l’any, el nombre de dies que resten d’any. Obtenir la hora actual del sistema i mostrar el mateix respecte al dia actual: Ara són les: HH:MM:SS, el percentatge de dia que ha transcorregut i el que queda. Representeu el percentatge d’any i de dia transcorregut i que queda amb xifres (Ex. 46.5%).
*/

var data = new Date(); 
var setmanes = 0;
var diaSetmana = 0;
console.log("Avui és " + data.getDate() + " de " + data.getMonth() + " de " + data.getFullYear());

var data_primera = new Date("1/1/2020");

