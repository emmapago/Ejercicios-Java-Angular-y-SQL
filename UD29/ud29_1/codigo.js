var num = 36000;
var array = new Array;
function array() {
    for (i = 0; i <= 10; i++) {
        array[i] = 0;
    }
}
function lanzarDados(int) {
    let res = 0;
    for (i = num; i > 0; i--) {
        res = dado1() + dado2();
        array[res - 2]++;
    }
}
function dados() {
    let res = Math.random() * 6 + 1;
    return Math.floor(res);
}
function resultado() {
    for (i = 0; i <= 10; i++) {
        console.log("Número de " + (i + 2) + " que han salido: " + array[i]);
    }
}
alert(lanzamiento());