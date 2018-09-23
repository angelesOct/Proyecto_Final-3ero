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

            $nombre=htmlspecialchars($_POST["txt_user"]);
            $passwd=htmlspecialchars($_POST["txt_pass"]);
            $correo_electronico=htmlspecialchars($_POST["txt_correo"]);
            $telefono=htmlspecialchars($_POST["txt_tel"]);
           

            $conectar= mysqli_connect($bd_host,$bd_user,$bd_pass,$bd_name,3307);

            if(mysqli_connect_errno())
            {

                printf("ERROR: %U - %S",mysqli_connect_errno(),mysqli_connect_error());
                exit();
            }

            mysqli_set_charset($conectar,"utf8");
            $insertar = "insert into usuario(nombre,passwd,correo_electronico,telefono)
            values('$nombre','$passwd','$correo_electronico','$telefono')";

            if ($resultado = mysqli_query($conectar,$insertar))
            {
                header("location:sesion.html");
            }
            else
            {
                printf("ERROR - Al almacenar en la BD");
            }

            Mysqli_close($conectar);

        ?>
    </body>
    </html>