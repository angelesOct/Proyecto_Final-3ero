<!Doctype html>
<html>
    <head>
        <title>Zona VIP</title>
    </head>
    <body>
        <?php
            session_start();
            session_destroy();
            
            header("Location:sesion.html");
    ?>
    </body>
</html>