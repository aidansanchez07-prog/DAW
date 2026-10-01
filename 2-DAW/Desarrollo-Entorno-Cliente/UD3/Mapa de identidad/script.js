const personas = new Map();
personas.set("11111111A", "Ana");
personas.set("22222222B", "Luis");
personas.set("33333333C", "María");
personas.set("44444444D", "Carlos");
personas.set("55555555E", "Laura");
personas.set("66666666F", "Javier");
personas.set("77777777G", "Sofía");
personas.set("88888888H", "Diego");
personas.set("99999999I", "Elena");
personas.set("00000000J", "Pablo");
function mostrarPersonas(mapa) {
    document.write("Lista de personas:<br>");
    mapa.forEach((nombre, dni) => {
        document.write(`<br>DNI: ${dni} - Nombre: ${nombre}<br>`);
    });
}
mostrarPersonas(personas);
const claves = Array.from(personas.keys());
const terceraClave = claves[2];
personas.set(terceraClave, "Juan");
    document.write("<br>Personas actualizada:<br>");
mostrarPersonas(personas);