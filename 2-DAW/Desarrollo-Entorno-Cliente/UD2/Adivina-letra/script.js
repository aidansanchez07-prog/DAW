let a=false;
do{
let letra=prompt("Introduce una letra: ")
if(letra=="s" || letra=="S"){
    console.log("Has acertado!!!")
    a=true;
}else{
    console.log("Has fallado")

}

}while(a==false);
