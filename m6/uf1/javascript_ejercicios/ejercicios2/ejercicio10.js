/* Como conseguir que la funcion matcvh ponga solo los elementos en el array si estan las 5 vocales en la palabra, sino, que no introduzca */


var palabra = prompt();
palabra = palabra.matchAll(/[aeiou]/g)

console.log(palabra);

if(palabra.length >= 5){
    console.log("Es una paraula pentavolica");
} else{
    console.log("No es una paraula pentavolica");
}