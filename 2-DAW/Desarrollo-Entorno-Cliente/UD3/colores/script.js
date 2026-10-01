const colores = [
      ["Naranja",  "#F39C12"],
      ["Lima",     "#C0F312"],
      ["Turquesa", "#12F3E5"],
      ["Rosa",     "#F312AF"],
      ["Rojo",     "#F31212"]
    ];

    
    for (let i = 0; i < colores.length; i++) {
     if(i==0){
        document.write("<ul>")
     }
     document.write("<li>"+colores[i][0]+"--->"+colores[i][1]+"</li>")
     if(i==colores.length-1){
        document.write("</ul>")
     }
    }

   