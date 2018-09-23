<!Doctype html>
<html>
    <head>
        <title></title>
    </head>
    <body>
        <?php
            try
            {
                $conMySQL = new PDO("mysql:host=localhost; port=3307; dbname=fazuca","root","");
                $conMySQL->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
                $conMySQL->exec("SET CHARACTER SET UTF8");
                $sentenciaSQL ="SELECT * FROM usuario WHERE nombre = :nombre AND passwd= :passw ";
                $sentenciaPrep = $conMySQL->prepare($sentenciaSQL);
                $log=htmlspecialchars(addslashes($_POST["nombre"]));
                $pas=htmlspecialchars(addslashes($_POST["passwd"]));
                $sentenciaPrep->execute(array(":nombre"=>$log,":passw"=>$pas));
                $numRegistros = $sentenciaPrep->rowCount();
                if($numRegistros !=0)
                {
                   
                   header("location:pedido.html");   
                    
                }
                else
                {
                    header("location:sesion.html");   
                }
            }
            catch(Exception $e)
            {
                die("Error:".$e->getMessage());
            }
            finally{ $conMySQL = null;}
            ?>
    </body>
</html>