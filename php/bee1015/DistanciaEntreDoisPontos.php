<?php

$p1 = [];
$p2 = [];

$line1 = readline();
$line2 = readline();

$line1 = explode(" ", $line1);
$line2 = explode(" ", $line2);

$p1["x"] = floatval($line1[0]);
$p1["y"] = floatval($line1[1]);

$p2["x"] = floatval($line2[0]);
$p2["y"] = floatval($line2[1]);

$distancia = sqrt(pow($p2["x"] - $p1["x"], 2) + pow($p2["y"] - $p1["y"], 2));

printf("%s\n", number_format($distancia, 4, ".", ""));

