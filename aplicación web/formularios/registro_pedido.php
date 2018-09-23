<!Doctype html>
<html>
    <head>
    <title>Insertar registros PHP con MySQL</title>
    </head>
    <body>
        <?php
            $bd_host = "127.0.0.1";
            $bd_user = "root";
            $bd_pass = "";
            $bd_name = "fazuca";

            $RFC=htmlspecialchars($_POST["RFC"]);
            $nombre=htmlspecialchars($_POST["nombre"]);
            $apellido=htmlspecialchars($_POST["apellido"]);
            $apellido_m=htmlspecialchars($_POST["apellido_m"]);
            $telefono=htmlspecialchars($_POST["telefono"]);
            $correo=htmlspecialchars($_POST["correo"]);
            $municipio=htmlspecialchars($_POST["municipio"]);
            $calle=htmlspecialchars($_POST["calle"]);
            $colonia=htmlspecialchars($_POST["colonia"]);
            $productos=htmlspecialchars($_POST["productos"]);
            $cantidad=(int)$_POST["cantidad"];
        
            $conectar= mysqli_connect($bd_host,$bd_user,$bd_pass,$bd_name,3307);

            if(mysqli_connect_errno())
            {

                printf("ERROR: %U - %S",mysqli_connect_errno(),mysqli_connect_error());
                exit();
            }

            mysqli_set_charset($conectar,"utf8");
            $insertar = "insert into pedidos
            (RFC,Nombre_cliente,apellido_paterno_c,apellido_materno_c,Telefono_c,correo_c,municipio_c,calle_c,colonia_c,productos,Cantidad_productos) 
            values ('$RFC','$nombre','$apellido','$apellido_m','$telefono','$correo','$municipio','$calle','$colonia','$productos',$cantidad) ";
            printf("$insertar");
            if ($resultado = mysqli_query($conectar,$insertar))
            {
                header("location:pedido.html");
            }
            else
            {
                printf("ERROR - Al almacenar en la BD");
            }

            Mysqli_close($conectar);

        ?>
    </body>
    </html>