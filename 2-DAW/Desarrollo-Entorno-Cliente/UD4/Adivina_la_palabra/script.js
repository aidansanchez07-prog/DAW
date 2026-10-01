const palabraSecreta = "manteca";

function adivina(...letras) {
    let resultado = "";

    for (let i = 0; i < palabraSecreta.length; i++) {
        if (letras.includes(palabraSecreta[i])) {
            resultado += palabraSecreta[i];
        } else {
            resultado += "-";
        }
    }

    console.log(resultado);
}

let entrada = prompt("Introduce las letras separadas por comas:");
let letrasUsuario = entrada.split(',');
adivina(...letrasUsuario);