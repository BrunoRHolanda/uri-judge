<?php

$distancia = intval(readline());
$consumo = floatval(readline());

printf("%s km/l\n", number_format($distancia/$consumo, 3, ".", ""));
