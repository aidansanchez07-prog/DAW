let array1=[12,12,12,14]
let array2=[11,11,13,15]
let array3=["i","]","kk","I"]
let array4=[]
array4=array1.concat(array2).concat(array3)
let conjunto=new Set(array4)
for(let element of conjunto){
    document.write(element + " ");
}
