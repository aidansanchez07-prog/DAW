document.addEventListener("DOMContentLoaded", function () {
    const formulario = document.getElementById('formulario');
    const mensajeError = document.getElementById('mensajeError');

    formulario.addEventListener('submit', function (evento) {
        evento.preventDefault(); // Previene el envío del formulario para poder validarlo con Javascript

        let nombre = document.getElementById('nombre').value;
        let apellidos = document.getElementById('apellidos').value;
        let correo = document.getElementById('correo').value;
        let descripcion = document.getElementById('descripcion').value;
        let condiciones = document.getElementById('condiciones').checked;
        let sexo=document.querySelector('input[name="sexo"]:checked');
        // Validación de los campos
        if (nombre.trim() === '') {
            mensajeError.innerText = 'El campo nombre no puede estar vacío.';
            return;
        }
        if( apellidos.trim() === '') {
            mensajeError.innerText = 'El campo apellidos no puede estar vacío.';
            return;
        }
        if (descripcion.trim() === '') {
            mensajeError.innerText = 'El campo descripción no puede estar vacío.';
            return;
        }
        if (correo.trim() === '') {
            mensajeError.innerText = 'El campo correo no puede estar vacío.';
            return;
        }

        if (!validarEmail(correo)) {
            mensajeError.innerText = 'El formato del correo no es válido.';
            return;
        }
        if(!sexo){
            mensajeError.innerText = 'Debe seleccionar un sexo.';
            return;
        }
        

        if (!condiciones) {
            mensajeError.innerText = 'Debes aceptar los términos y condiciones.';
            return;
        }

        // Si todo está correcto, se puede proceder a enviar el formulario o hacer alguna otra acción
        mensajeError.innerText = '';
        // alert('Formulario enviado con éxito!');
        formulario.submit(); // Descomentar esta línea para permitir el envío del formulario
    });

    function validarEmail(correo) {
        const re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
        return re.test(String(correo).toLowerCase());
    }
});