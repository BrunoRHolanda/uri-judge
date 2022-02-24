<?php

$timestamp = intval(readline());

$timestamp = floatval($timestamp / 3600);
$horas = intval($timestamp);
$timestamp = floatval(($timestamp - $horas) * 60);
$minutos = intval($timestamp);
$timestamp = floatval(($timestamp - $minutos) * 60);
$segundos = number_format($timestamp);

printf("%d:%d:%s\n", $horas, $minutos, $segundos);
