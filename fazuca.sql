-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1:3307
-- Tiempo de generación: 21-08-2018 a las 16:04:26
-- Versión del servidor: 10.1.10-MariaDB
-- Versión de PHP: 5.5.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `fazuca`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `almacen`
--

CREATE TABLE `almacen` (
  `codigo_Prod` int(10) UNSIGNED NOT NULL,
  `Precio` decimal(4,2) NOT NULL,
  `fecha_de_ingreso` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `stock` int(11) NOT NULL,
  `codigo_de_barras` char(13) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `almacen`
--

INSERT INTO `almacen` (`codigo_Prod`, `Precio`, `fecha_de_ingreso`, `stock`, `codigo_de_barras`) VALUES
(1, '10.00', '2018-08-16 16:43:52', 12, '7501234507543'),
(2, '34.00', '2018-08-16 16:43:52', 20, '7518964532125'),
(3, '40.00', '2018-08-16 16:43:52', 15, '7508964523123'),
(4, '8.50', '2018-08-16 16:43:52', 30, '7507543211234');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `almacen_pedidos`
--

CREATE TABLE `almacen_pedidos` (
  `RFC` char(13) DEFAULT NULL,
  `codigo_Prod` int(10) UNSIGNED DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `almacen_pedidos`
--

INSERT INTO `almacen_pedidos` (`RFC`, `codigo_Prod`) VALUES
('gare990101123', 2),
('varal45610117', 3),
('mgre896529109', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedidos`
--

CREATE TABLE `pedidos` (
  `RFC` char(13) NOT NULL,
  `Nombre_cliente` varchar(25) NOT NULL,
  `apellido_paterno_c` varchar(25) NOT NULL,
  `apellido_materno_c` varchar(25) NOT NULL,
  `Telefono_c` varchar(10) NOT NULL,
  `correo_c` varchar(45) NOT NULL,
  `municipio_c` varchar(30) NOT NULL,
  `calle_c` varchar(50) NOT NULL,
  `colonia_c` varchar(30) NOT NULL,
  `fecha_venta` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `productos` varchar(25) NOT NULL,
  `Cantidad_productos` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pedidos`
--

INSERT INTO `pedidos` (`RFC`, `Nombre_cliente`, `apellido_paterno_c`, `apellido_materno_c`, `Telefono_c`, `correo_c`, `municipio_c`, `calle_c`, `colonia_c`, `fecha_venta`, `productos`, `Cantidad_productos`) VALUES
('12356984loplk', 'luis', 'dominguez', 'omaña', '7751236985', 'carlosdom@gmail.com', 'cuautepec', 'guadalupe ', 'huayapan ', '2018-08-21 13:32:39', 'Crepe', 100),
('12356984loplm', 'pepe', 'dominguez', 'omaña', '7751236985', 'carlosdom@gmail.com', 'cuautepec', 'guadalupe ', 'huayapan ', '2018-08-21 13:41:14', 'Lapiz mirado', 50),
('12356984lopln', 'lupita', 'dominguez', 'omaña', '7751236985', 'carlosdom@gmail.com', 'cuautepec', 'guadalupe ', 'huayapan ', '2018-08-21 13:42:55', 'Papel Bon', 80),
('12356984loplz', 'jose garcia ', 'dominguez', 'omaña', '7751236985', 'carlosdom@gmail.com', 'cuautepec', 'guadalupe ', 'huayapan ', '2018-08-21 13:36:12', 'Corrector de lapiz', 10),
('12356984lopuj', 'carlos', 'dominguez', 'omaña', '7751236985', 'carlosdom@gmail.com', 'cuautepec', 'guadalupe ', 'huayapan ', '2018-08-21 13:30:50', 'Cascaron', 50),
('12356984loQER', 'luis', 'dominguez', 'omaña', '7751236985', 'carlosdom@gmail.com', 'cuautepec', 'guadalupe ', 'huayapan ', '2018-08-21 13:40:19', 'Cascaron', 100),
('124563789jiof', 'angeles', 'gayosso', 'octaviano', '7751235689', 'angeles@gmail.com', 'tulancingo', 'francisco i madero ', 'francisco i madero ', '2018-08-21 13:18:10', 'Papel Bon', 10),
('124563789jiol', 'hos', 'carmona', 'octaviano', '7751235689', 'angeles@gmail.com', 'tulancingo', 'francisco i madero ', 'francisco i madero ', '2018-08-21 13:22:36', 'Papel china', 50),
('GAOA12sder45r', 'Estefania', 'Garcia', 'Resendiz', '5575285876', 'fanny@gmail.com', 'cuautepec', 'Francisco I madero', 'Francisco I madero ', '2018-08-21 13:56:18', 'Papel Bon', 3),
('gare990101123', 'jose', 'garcia', 'hernandez', '7757065981', 'josegare@gmail.com', 'cuautepec', 'francisco i madero', 'la estacion', '2018-07-10 05:00:00', '', 3),
('IHO23SD4TRTGS', 'Ivan', 'Hernandez', 'osornio', '5575285877', 'ivan@gmail.com', 'Santiago', 'Jacaranda', '2 de enero', '2018-08-21 13:53:27', 'Juego Geometrico', 50),
('mgre896529109', 'juan', 'perez', 'lopez', '7711232334', 'juanperez@gmail.com', 'tulancingo', 'heroes de nacozari', 'la joya', '2018-07-09 05:00:00', '', 15),
('varal45610117', 'Uriel', 'Vargas', 'Alvarado', '7751396992', 'urielvargas@gmail.com', 'tulancingo', 'doria', 'san nicolas', '2018-07-06 05:00:00', '', 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `codigo_de_barras` char(13) NOT NULL,
  `nombre_productos` varchar(50) NOT NULL,
  `marca` varchar(40) NOT NULL,
  `contenido` varchar(6) NOT NULL,
  `precio_prov` float NOT NULL,
  `cantidad` int(11) NOT NULL,
  `codigo_p` int(10) UNSIGNED DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`codigo_de_barras`, `nombre_productos`, `marca`, `contenido`, `precio_prov`, `cantidad`, `codigo_p`) VALUES
('7501234507543', 'Libretas profesional', 'Scribe', '100h', 8.5, 50, 1),
('7507543211234', 'adhesivo', 'pritt', '125g', 12, 250, 3),
('7508964523123', 'papel china', 'pinguino', '12pzas', 20, 100, 2),
('7518964532125', 'diurex', 'janel', '30pzas', 25, 200, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedores`
--

CREATE TABLE `proveedores` (
  `codigo_P` int(10) UNSIGNED NOT NULL,
  `nombre_proveedores` varchar(30) NOT NULL,
  `apellido_paterno_p` varchar(25) NOT NULL,
  `apellido_materno_p` varchar(25) NOT NULL,
  `telefono_p` varchar(10) NOT NULL,
  `correo_p` varchar(45) NOT NULL,
  `municipio_p` varchar(30) NOT NULL,
  `calle_p` varchar(50) NOT NULL,
  `colonia_p` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `proveedores`
--

INSERT INTO `proveedores` (`codigo_P`, `nombre_proveedores`, `apellido_paterno_p`, `apellido_materno_p`, `telefono_p`, `correo_p`, `municipio_p`, `calle_p`, `colonia_p`) VALUES
(1, 'Juan', 'Garcia', 'Vargas', '775702354', 'juanito@gva.gmail.com', 'cuautepec', 'francisco i madero', 'la estacion'),
(2, 'Carlos', 'Dominguez', 'Omaña', '7751235689', 'carlosdom@gva.gmail.com', 'cuautepec', 'huayapan', 'guadalupe'),
(3, 'Luisa', 'Alvarado', 'Cenobio', '7712345676', 'luisaalva@gva.gmail.com', 'tulancingo', 'felipe angeles', 'arboledas');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `nombre` varchar(15) NOT NULL,
  `passwd` varchar(15) NOT NULL,
  `RFC` char(13) DEFAULT NULL,
  `correo_electronico` varchar(50) NOT NULL,
  `telefono` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`nombre`, `passwd`, `RFC`, `correo_electronico`, `telefono`) VALUES
('angel', '789654', NULL, 'hchfdfjdcxk@gmail.com', '78945632132'),
('ANGELES', '456328', NULL, '1717110652@utectulancingo.edu.mx', '7751396992'),
('jose garcia', '123456jose', 'gare990101123', '', ''),
('luis', '123', NULL, 'fannygarciar@hotmail.com', '7751276350'),
('pepe', '123456789', NULL, '1717110255@utectulancingo.edu.mx', '7751396992');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `almacen`
--
ALTER TABLE `almacen`
  ADD PRIMARY KEY (`codigo_Prod`),
  ADD KEY `codigo_de_barras` (`codigo_de_barras`);

--
-- Indices de la tabla `almacen_pedidos`
--
ALTER TABLE `almacen_pedidos`
  ADD KEY `RFC` (`RFC`),
  ADD KEY `codigo_Prod` (`codigo_Prod`);

--
-- Indices de la tabla `pedidos`
--
ALTER TABLE `pedidos`
  ADD PRIMARY KEY (`RFC`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`codigo_de_barras`),
  ADD KEY `codigo_p` (`codigo_p`);

--
-- Indices de la tabla `proveedores`
--
ALTER TABLE `proveedores`
  ADD PRIMARY KEY (`codigo_P`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`nombre`),
  ADD KEY `RFC` (`RFC`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `almacen`
--
ALTER TABLE `almacen`
  MODIFY `codigo_Prod` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `proveedores`
--
ALTER TABLE `proveedores`
  MODIFY `codigo_P` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `almacen`
--
ALTER TABLE `almacen`
  ADD CONSTRAINT `almacen_ibfk_1` FOREIGN KEY (`codigo_de_barras`) REFERENCES `productos` (`codigo_de_barras`);

--
-- Filtros para la tabla `almacen_pedidos`
--
ALTER TABLE `almacen_pedidos`
  ADD CONSTRAINT `almacen_pedidos_ibfk_1` FOREIGN KEY (`RFC`) REFERENCES `pedidos` (`RFC`),
  ADD CONSTRAINT `almacen_pedidos_ibfk_2` FOREIGN KEY (`codigo_Prod`) REFERENCES `almacen` (`codigo_Prod`);

--
-- Filtros para la tabla `productos`
--
ALTER TABLE `productos`
  ADD CONSTRAINT `productos_ibfk_1` FOREIGN KEY (`codigo_p`) REFERENCES `proveedores` (`codigo_P`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`RFC`) REFERENCES `pedidos` (`RFC`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
