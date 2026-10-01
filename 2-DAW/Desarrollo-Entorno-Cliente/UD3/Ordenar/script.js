const numeros = new Array();
for (let i = 0; i < 15; i++) {
    let a=false;
do{
    numeros[i] = parseInt(prompt(`Introduce un número ${i + 1} :`));
    if (isNaN(numeros[i])) {
        alert("El valor introducido no es un número. Por favor, introduce un número válido.");
        a=false;
    }else {
        a=true;
    }
}while(a==false)
}
numeros.sort((a, b) => a - b);
document.write("Números ordenados de menor a mayor:<br>");
let posicion;
let menor;
function mostrarMenor(array) {
    for (let i = 0; i < array.length; i++) {
        if (i === 0) {
            posicion=i;
            menor=array[i];
        }
        else {
            if (array[i] < menor) {
                menor=array[i];
                posicion=i;
            }
        }
    }
    document.write("El menor número es " + menor + " y está en la posición " + (posicion+1) + "<br>");
}
mostrarMenor(numeros);
