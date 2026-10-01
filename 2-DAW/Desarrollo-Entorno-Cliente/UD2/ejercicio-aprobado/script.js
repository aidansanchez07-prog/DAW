let lista = [];

function media() {
   let nota=prompt("Introduce las 3 notas separadas por comas: ");
   lista = nota.split(",");
   let suma = 0;
   for (let i = 0; i < lista.length; i++) {
       suma += parseInt(lista[i]);
   }
   let media = suma / lista.length;
   if (media >= 5) {
       alert("La media es: " + media + " y has aprobado");
   }
   else {
       alert("La media es: " + media + " y has suspendido");
   }
   
}
media();