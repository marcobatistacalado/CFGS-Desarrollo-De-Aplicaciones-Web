<?php
$lindices=array(3,5,7);
$lindices[]=9;
//print_r($lindices);
for ($i=0;$i<count($lindices);$i++)
    echo "  $lindices[$i] ";

$lclaves=array(
    "123"=>"Yandry",
    "124"=>"Ana",
    "125"=>"Miguel"
) ;   
echo "<br>";
//print_r($lclaves);
//echo $lclaves['125'];

foreach($lclaves as $clave=>$valor){
    echo "Número_Mat: $clave";
    echo "<br>Nombre: $valor";
    echo"<hr>";
}
echo "<hr><br>";
foreach($lclaves as $valor)
    echo "$valor<br>";


$clases=array(
    "DAW1"=>array("110"=>"Pepito", "111"=>"Juanito", "113"=>"Anita"),
    "DAW2"=>array("123"=>"Yandry","124"=>"Ana"),
    "ASIR1"=>array("134"=>"Bea","135"=>"Laura")
);
echo "<hr>";
foreach($clases as $clave=>$valor){
    echo "<br>$clave<br>";
    foreach($valor as $c=>$v)
        echo "$c - $v  ";

}
?>