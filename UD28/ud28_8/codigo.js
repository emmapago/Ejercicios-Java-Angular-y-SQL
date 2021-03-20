var numero = prompt("Introduce un número entero");

var resultado = numPar(numero);
alert("El número "+numero+" es: "+resultado);

function numPar(numero) {
  if(numero % 2 == 0) {
    return "par";
  }
  else {
    return "impar";
  }
}