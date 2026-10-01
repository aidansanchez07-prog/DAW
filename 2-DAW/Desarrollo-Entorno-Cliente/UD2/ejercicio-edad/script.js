let nombre=prompt("Introduce tu nombre: ")
let edad=prompt("Introduce tu edad: ")
edad = parseInt(edad);
if(isNaN(edad) || edad<0){
    alert("Introduce un número válido")
}else{
let rol;
if(edad<=12){
    rol="niño"
}else if(edad>12 && edad<18){
    rol="adolescente"
}else if(edad>=18 && edad<=64){
    rol="Trabajador"
}else if(edad>=65){
    rol="Jubilado"
}
console.log("Hola "+nombre+" tu edad es "+edad+" y por tanto eres "+rol)
}