var valores = [true, 5, false, "hola", "adios", 2];

alert(valores[3]>valores[4]); // Determina cual de los 2 elementos de texto es mayor //

// Determina los operadores necesarios para obtener un resultado true y otro false //
alert(valores[0] && valores[2]);
alert(valores[0] && valores[0]);
alert(valores[2] && valores[2]);
alert(valores[0] || valores[2]);
alert(valores[0] || valores[0]);
alert(valores[2] || valores[2]);

// Determina el resultado de las 5 operaciones realizadas con los 2 elementos numéricos //
alert(valores[1]+valores[5]); // Suma //
alert(valores[1]-valores[5]); // Resta //
alert(valores[5]-valores[1]); // Resta //
alert(valores[1]*valores[5]); // Multiplicación //
alert(valores[1]/valores[5]); // División //
alert(valores[5]/valores[1]); // División //