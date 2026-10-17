<?php
    echo "<html>";
    echo "<head></head>";
    echo "<body>";
    $productos=[
        "p1"=>[
            "nombre"=>"hamburguesa",
            "precio"=>10,
            "iva"=>1
        ],
        "p2"=>[
            "nombre"=>"pizza",
            "precio"=>15,
            "iva"=>2
        ],
        "p3"=>[
            "nombre"=>"ensalada",
            "precio"=>8,
            "iva"=>3
        ],
        "p4"=>[
            "nombre"=>"refresco",
            "precio"=>2,
            "iva"=>1
        ],
        "p5"=>[
            "nombre"=>"pastel",
            "precio"=>5,
            "iva"=>4
        ],
        "p6"=>[
            "nombre"=>"helado",
            "precio"=>3,
            "iva"=>2
        ],
        "p7"=>[
            "nombre"=>"café",
            "precio"=>2,
            "iva"=>1
        ],
        "p8"=>[
            "nombre"=>"té",
            "precio"=>1,
            "iva"=>3
        ],
        "p9"=>[
            "nombre"=>"agua",
            "precio"=>1,
            "iva"=>4
        ],
        "p10"=>[
            "nombre"=>"jugo",
            "precio"=>3,
            "iva"=>1
        ]
    ];
    $iva=[
        1=> 0,
        2=>0.04,
        3=>0.10,
        4=>0.21,
        
    ];
    for($i= 0; $i<count($productos); $i++){
        $producto = $productos["p".($i+1)];
        $precioFinal = $producto["precio"] * (1 + $iva[$producto["iva"]]);
        echo "<p>El producto {$producto['nombre']} tiene un precio inicial de {$producto['precio']}€, un tipo de IVA del {$iva[$producto['iva']]} % y un precio final de {$precioFinal}€.</p>";
    }
    echo "</body>";
    echo "</html>";
?>