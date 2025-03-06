$(document).ready(function(){
    // Deshabilitar el botón "AVANZAR" cuando se hace clic en "TRAER TXT"
    $("#uno").prop("disabled", true);  // Desactivamos el botón AVANZAR
    
    // Realizar la petición Ajax para cargar pokemon.txt
    $.ajax({
        url: "pokemon.txt",   // La URL del archivo a cargar
        type: "GET",          // Tipo de solicitud: GET
        success: function(data) {
            // Si la carga es exitosa, mostrar el contenido de pokemon.txt en el div principal
            $("#principal").html(data);
        },
        error: function(xhr, status, error) {
            // En caso de error, mostramos un mensaje de error en el div principal
            $("#principal").html("Error al cargar pokemon.txt: " + error);
        },
        complete: function() {
            // Cuando se termine la solicitud, habilitamos nuevamente el botón "AVANZAR"
            $("#uno").prop("disabled", false);
        }
    });
});