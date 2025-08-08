<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h2>Ejemplo uso variables</h2>
    <hr>
    <?php
    $nombre="Rosa";
    $apellido="Rodríguez";
    $edad=34;

    echo '<h5>Estoy probando la funcion echo</h5>';
    echo "siguo probando<br>";
    echo 'Nombre: ' . $nombre;
    echo "<br>Nombre: $nombre";
    echo "<br>";
    echo "<br>".__FILE__;
    var_dump($edad);
    
  //  define ("RUTA","C:\");
  //  if defined("RUTA")

    
    ?>
</body>
</html>