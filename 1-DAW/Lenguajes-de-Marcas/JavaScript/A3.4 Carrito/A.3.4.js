const productos = [
    { nombre: "Teclado", descripcion: "Teclado mecánico", unidades: 2, precio: 50 },
    { nombre: "Ratón", descripcion: "Ratón inalámbrico", unidades: 1, precio: 25 },
    { nombre: "Monitor", descripcion: "Monitor 24 pulgadas", unidades: 1, precio: 180 }
];
const contenedorLista = document.getElementById('productos');
const contenedorTotal = document.getElementById('total');
productos.forEach(producto => {
    const subtotal = producto.unidades * producto.precio;
    const divProducto = document.createElement('div');
    divProducto.innerHTML = `
        <h3>Producto: ${producto.nombre}</h3>
        <p>Descripción: ${producto.descripcion}</p>
        <p>Unidades: ${producto.unidades}</p>
        <p>Precio unidad: ${producto.precio}€</p>
        <p><b>Subtotal: ${subtotal}€</b></p>
        
    `;
    if (contenedorLista) {
        contenedorLista.appendChild(divProducto);
    }
});
function calcularTotal(listaProductos) {
    let totalSinIVA = 0;
    const IVA_PORCENTAJE = 0.21;
    listaProductos.forEach(p => {
        totalSinIVA += p.unidades * p.precio;
    });
    const totalConIVA = totalSinIVA + (totalSinIVA * IVA_PORCENTAJE);
    if (contenedorTotal) {
        contenedorTotal.innerHTML = `
            <h2>Resumen de Compra</h2>
            <p>Total neto: ${totalSinIVA.toFixed(2)}€</p>
            <p>IVA (21%): ${(totalSinIVA * IVA_PORCENTAJE).toFixed(2)}€</p>
            <h2>Total final: ${totalConIVA.toFixed(2)}€</h2>
        `;
    }
}
calcularTotal(productos);