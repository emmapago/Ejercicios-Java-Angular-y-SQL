// Array de letras //
var letras = ["T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E", "T"]

// Almacenar número de DNI indicado por usuario //
var numero = prompt("Introduce el número de DNI: ");

// Almacenar letra de DNI que se ha indicado //
var letra = prompt("Introduce la letra de DNI: ");
letra = letra.toUpperCase();

// Condición para comprobar si el número es menor que 0 o mayor que 99999999 //
if (numero < 0 || numero > 99999999) {
    alert("El número introducido no es correcto");
} else {
    var calcular = letras[numero % 23]; // Se calcula la letra que le corresponde //
    if (calcular != letra) {
        alert("El número de DNI o la letra no son correctos"); // Aparece el mensaje si no son correctos los datos introducidos //
    } else {
        alert("DNI y letra correcto"); // Aparece el mensaje si son correctos los datos introducidos //
    }
}