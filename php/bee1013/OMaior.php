<?php

function maior ($a, $b)
{
    return (1.0/2) * ($a + $b + abs($a - $b));
}

$r = 0;
$inputs = explode(" ", readline());

foreach ($inputs as $v) {
    $r = maior($r, $v);
}

printf("%d eh o maior\n", $r);
