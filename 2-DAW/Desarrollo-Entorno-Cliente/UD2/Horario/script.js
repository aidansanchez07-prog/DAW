let dia=prompt("Introduce un día de la semana con la letra inicial: ")
switch(dia.toUpperCase()){
    case "L":
        alert("Hoy es lunes, horario 1-2");
        break;
    case "M":
        alert("Hoy es martes, horario 3-4");
        break;
    case "X":
        alert("Hoy es miércoles, horario 5-6");
        break;
    case "J":
        alert("Hoy es jueves, horario 7-8");
        break;
    case "V":
        alert("Hoy es viernes, horario 9-10");
        break;
    case "S":
        alert("Hoy es sábado, horario 11-12");
        break;
    case "D":
        alert("Hoy es domingo, horario 13-14");
        break;
    default:
        alert("Introduce un día válido");
}