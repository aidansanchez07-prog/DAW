const palabras = ["casa", "árbol", "camión", "ordenador", "música", "perro"];
const tildes = ['á', 'é', 'í', 'ó', 'ú'];

function tieneTilde(palabra) {
    let resultado = false;
    for (let i = 0; i < palabra.length; i++) {
        if (tildes.includes(palabra[i])) {
            resultado = true;
        }
    }
    return resultado;
}

function sinTildes(array) {
    return array.filter(palabra => !tieneTilde(palabra));
}

const filtradas = sinTildes(palabras);

console.log(filtradas);  
console.log(palabras);   