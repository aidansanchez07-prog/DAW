const catalogo = {
  tienda: "Super Web Store",
  productos: [
    { id: 1, nombre: "Auriculares Bluetooth X200", descripcion: "Auriculares inalámbricos con cancelación parcial de ruido.", precio: 49.99, disponible: true },
    { id: 2, nombre: "Teclado mecánico TKL", descripcion: "Compacto, switches táctiles y retroiluminación RGB.", precio: 79.5, disponible: true },
    { id: 3, nombre: "Ratón ergonómico Pro", descripcion: "Diseño vertical para reducir tensión en la muñeca.", precio: 39.0, disponible: false },
    { id: 4, nombre: "Monitor 24\" 1080p", descripcion: "120Hz, panel IPS y soporte ajustable.", precio: 129.95, disponible: true },
    { id: 5, nombre: "Cable USB-C 2m", descripcion: "Carga rápida y transferencia de datos.", precio: 9.99, disponible: true }
  ],
  ventasMensuales: [120, 150, 95, 180, 160, 200]
};

let orden = "asc";

const header = document.getElementById("header");
const summary = document.getElementById("summary");
const productList = document.getElementById("productList");
const footer = document.getElementById("footer");


function renderHeader() {
  header.innerHTML = `
    <div>
      <h1>${catalogo.tienda}</h1>
      <p>Catálogo dinámico generado desde un objeto literal usando <code>innerHTML</code></p>
    </div>
    <button id="btnOrden">Ordenar por precio: ${orden}</button>
  `;
  
}


function renderResumen() {
  const ventas = catalogo.ventasMensuales;
  const total = ventas.reduce((acc, v) => acc + v, 0);
  const media = total / ventas.length;

  const max = Math.max(...ventas);
  const min = Math.min(...ventas);
  const mesMax = ventas.indexOf(max) + 1;
  const mesMin = ventas.indexOf(min) + 1;

  const sumaPrecios = catalogo.productos.reduce((acc, p) => acc + p.precio, 0);

  summary.innerHTML = `
    <div><strong>Total ventas (últimos 6 meses):</strong><br>${total} unidades</div>
    <div><strong>Media mensual:</strong><br>${media.toFixed(2)} unidades</div>
    <div><strong>Mes con mayor venta:</strong><br>Mes ${mesMax} — ${max} unidades</div>
    <div><strong>Mes con menor venta:</strong><br>Mes ${mesMin} — ${min} unidades</div>
    <div><strong>Suma precios productos:</strong><br>€ ${sumaPrecios.toFixed(2)}</div>
  `;
}

function renderProductos() {
  const lista = [...catalogo.productos].sort((a, b) =>
    orden === "asc" ? a.precio - b.precio : b.precio - a.precio
  );

  productList.innerHTML = lista.map(
      (p) => `
      <article class="card">
        <h3>${p.nombre}</h3>
        <p>${p.descripcion}</p>
        <p class="precio">€ ${p.precio.toFixed(2)}</p>
        <p class="${p.disponible ? "disponible" : "agotado"}">
          ${p.disponible ? "Disponible" : "Agotado"}
        </p>
      </article>`
    ).join("");
}


renderHeader();
renderResumen();
renderProductos();

