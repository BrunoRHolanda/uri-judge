<?php

$dt = intval(readline());
$vm = intval(readline());
$ds = $vm * $dt;

printf("%s\n", number_format($ds/12, 3, ".", ""));
