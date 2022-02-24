<?php
class CedulasIterator implements Iterator
{
    private $position = 0;
    private $array = [
        100,
        50,
        20,
        10,
        5,
        2,
        1,
    ];

    public function __construct() {
        $this->position = 0;
    }

    public function current()
    {
        return $this->array[$this->position];
    }

    public function next()
    {
        ++$this->position;;
    }

    public function key()
    {
        return $this->position;
    }

    public function valid()
    {
        return isset($this->array[$this->position]);
    }

    public function rewind()
    {
        $this->position = 0;
    }
}

$valor = intval(readline());

printf("%d\n", $valor);

$cedulasCount = [
    100 => 0,
    50 => 0,
    20 => 0,
    10 => 0,
    5 => 0,
    2 => 0,
    1 => 0,
];

$cedulaIterator = new CedulasIterator();

$cedulaIterator->rewind();

$cedula = $cedulaIterator->current();

while ($cedulaIterator->valid()) {
    $cedula = $cedulaIterator->current();
    $count  = intval($valor / $cedula);

    if ( $count != 0) {
        $valor -= $cedula * $count;
        $cedulasCount[$cedula] = $count;
    } else {
        $cedulaIterator->next();
    }
}

foreach ($cedulasCount as $cedula => $count) {
    printf("%d nota(s) de R$ %d,00\n", $count, $cedula);
}
