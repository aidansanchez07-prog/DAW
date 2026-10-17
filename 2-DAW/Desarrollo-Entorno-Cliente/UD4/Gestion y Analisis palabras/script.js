var a = true;
var array = [];
do {
var palabra = prompt("Ingrese una palabra");
if (palabra == null || palabra == ""){
    a=false;
}
else{
    array.push(palabra);
}
}while(a==true)
    document.write("Las palabras ingresadas son: <br><br>");
for (var i=0; i<array.length; i++){
    document.write(array[i]+"<br>");
}
document.write("<br>El total de palabras ingresadas es: "+array.length);
document.write("<br>La primera palabra es: "+array[0]);
document.write("<br>La última palabra es: "+array[array.length-1]);
let array2=[...array]
array2.sort();
document.write("<br>Las palabras ordenadas alfabéticamente son: <br><br>");
for (var i=0; i<array2.length; i++){
    document.write(array2[i]+"<br>");
}