const masVocales = (cadena1, cadena2) => {
  const contarVocales = (cadena) => {
    let contador = 0;
    for (const letra of cadena.toLowerCase()) {
      if ("aeiouáéíóúü".includes(letra)) contador++;
    }
    return contador;
  };

  const vocales1 = contarVocales(cadena1);
  const vocales2 = contarVocales(cadena2);

  if (vocales1 > vocales2) {
    console.log(`"${cadena1}" tiene más vocales (${vocales1} frente a ${vocales2})`);
  } else if (vocales2 > vocales1) {
    console.log(`"${cadena2}" tiene más vocales (${vocales2} frente a ${vocales1})`);
  } else {
    console.log(`Ambas cadenas tienen las mismas vocales (${vocales1})`);
  }
};

masVocales("murciélago", "casa");   
masVocales("hola", "mundo");       