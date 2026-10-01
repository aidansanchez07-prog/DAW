const MAX = 100;
const numeros = [];

for (let i = 0; i < 100; i++) {
  numeros[i] = Math.floor(Math.random() * MAX);
}

document.write("<ol>");
for (let i = 0; i < numeros.length; i++) {
  if(numeros[i] % 2 == 0){
    document.write("<li>"+numeros[i]+"</li>")
  }
  }
document.write("</ol>");

/*
document.write("<ol>");
numeros.forEach(function (numero) {
  if (numero % 2 == 0) {
    document.write("<li>" + numero + "</li>");
  }
});
document.write("</ol>");
*/