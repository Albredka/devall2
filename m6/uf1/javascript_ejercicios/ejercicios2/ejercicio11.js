/*
Códigos de barras (extret del concurs programame 2012)

En el lejano 1952, tres norteamericanos patentaron lo que terminó llamándose código de barras. Consiste en una técnica para representar números (y, en menos ocasiones, letras) mediante una serie de líneas verticales paralelas, con diferentes grosores y separaciones entre ellas. Si bien el primer uso sirvió para identificar de manera automática los vagones de un ferrocarril, hoy los códigos de barras se utilizan en infinidad de lugares, siendo la catalogación de productos la más habitual.
La manera concreta de codificar mediante barras los números y las letras puede ser muy variada, lo que ha llevado a la aparición de diferentes estándares. De todos ellos, el EAN (European Article Number) resulta ser el más extendido. De este, hay principalmente dos formatos, que se diferencian en el ancho. Existe así el llamado EAN-8, que codifica 8 números, y el EAN-13, que, naturalmente, codifica 13.

El último dígito del código se utiliza para detección de errores, y se calcula a partir de los demás. Para eso:
Empezando por la derecha (sin contar el dígito de control que se está calculando), se suman los dígitos individuales, multiplicados por un factor:
Los dígitos en posiciones impares (empezando a contar por la derecha saltándonos el de control) se multiplican por 3.
Los dígitos en posiciones pares se multiplican por 1.
Por ejemplo, para el código EAN-8 de la figura la operación a realizar es:

2 * 3 + 5 * 1 + 9 * 3 + 3 * 1 + 8 * 3 + 5 * 1 + 6 * 3 = 88

2593856

El dígito de comprobación es el número que hay que sumar al resultado anterior para llegar a un valor múltiplo de 10. En el ejemplo de EAN-8, para llegar al múltiplo de 10 más cercano por encima del número 88 hay que sumar 2 (y llegar al 90). Ten en cuenta que si la suma resulta ser ya múltiplo de 10, el dígito de control será 0.

En EAN-13, los primeros dígitos se usan además para identificar al país. A continuación se indica una tabla (parcial) de esos códigos de país.

Código
País


Código
País
0
EEUU
539
Irlanda
380
Bulgaria
560
Portugal
50
Inglaterra
70
Noruega

Crear un programa que pida al usuario un código de barras. Si el número de dígitos es inferior a 8, se asumirá que es un código EAN-8; si es superior a 8 pero inferior a 13, se asumirá EAN-13. En ambos casos, se completarán el resto de dígitos colocando ceros a la izquierda.
El programa deberá indicar si el código de barras es correcto o no lo es, y además, si se trata de EAN-13 indicará el país al que pertenece el código. 
Así por ejemplo:
65839522 🡪Correcto
65839521 🡪 Incorrecto
5029365779425 🡪Correcto (Inglaterra)
5129365779425 🡪 Incorrecto


*/

function getlength(number) {
    return number.toString().length;
}

function numeroControl(numero){
    
    var numero_final = 0;
    var num = 0;
    var longitud = getlength(numero);
    longitud = parseInt(longitud);

    // 7 cifras
    if (longitud == 7){

        for(let i = longitud; i > 0; i--){
            console.log(i);
            if(i%2==0){
                var num = numero[i-1];
                num = parseInt(num) * 1;
                
            } else{
                var num = numero[i-1];
                num = parseInt(num) * 3;
 
            }
            numero_final += num;
        }
        return numero_final;
    }
    
}

function codigoDeBarras(codigo){
    var control = numeroControl(codigo);

    if(control%10==0){
        control = 0;
        return control;
    } else {
        control += 10 - control % 10; 
    }

    codigo += control;
    return codigo;
}

console.log(codigoDeBarras("2593856"));
