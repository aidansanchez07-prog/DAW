var festivalesJSON = `{
    "Festival": "Navar-Pop",
    "Ciudad": "Ablitas",
    "Anno": 2018,
    "Grupos": [
        {
            "nombre": "Love of lesbian",
            "compania": "Warner Music",
            "discos": [
                "Microscopic Movies",
                "Is it Fiction?",
                "Ungravity",
                "Maniobras de escapismo",
                "Cuentos chinos para niños del Japón",
                "1999",
                "La noche eterna. Los días no vividos",
                "El poeta Halley"
            ]
        },
        {
            "nombre": "Izal",
            "compania": "Autoeditado",
            "discos": [
                "Teletransporte",
                "Magia y efectos especiales",
                "Agujeros de gusano",
                "Copacabana",
                "VIVO",
                "Autoterapia"
            ]
        },
        {
            "nombre": "Miss Caffeina",
            "compania": "Warner Music",
            "discos": [
                "Imposibilidad del fenómeno",
                "De polvo y flores",
                "Detroit"
            ]
        }
    ]
}`;
var festival = JSON.parse(festivalesJSON);
var seccion = document.getElementById("festival");

var html = `
    <h1>Festival: ${festival.Festival}</h1>
    Ciudad: ${festival.Ciudad}<br>
    Año: ${festival.Anno}
`;

festival.Grupos.forEach(function (grupo) {
    html += `
        <article>
            <h2>${grupo.nombre}</h2>
            <br>
            Compañía: ${grupo.compania}<br>
            Discografía
            <ul>
                ${grupo.discos.map(disco => `<li>${disco}</li>`).join("")}
            </ul>
        </article>
    `;
});

seccion.innerHTML = html;