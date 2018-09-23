-- phpMyAdmin SQL Dump
-- version 4.8.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3307
-- Tiempo de generación: 21-08-2018 a las 04:03:42
-- Versión del servidor: 10.1.33-MariaDB
-- Versión de PHP: 7.1.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
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
(1, '8.00', '2018-08-16 22:28:09', 30, '7501234507543'),
(2, '20.00', '2018-08-16 22:28:09', 20, '7518964532125'),
(3, '16.00', '2018-08-16 22:28:09', 200, '7508964523123'),
(4, '3.50', '2018-08-16 22:28:09', 30, '7507543211234'),
(5, '12.00', '2018-08-17 00:55:26', 80, '7507543211523'),
(6, '16.00', '2018-08-17 01:12:59', 30, '7521035789410'),
(7, '16.00', '2018-08-17 06:19:10', 100, '7521035789415'),
(8, '12.00', '2018-08-21 00:30:29', 20, '7502314789654'),
(9, '12.00', '2018-08-21 01:41:04', 50, '4512367894563');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `almacen_pedidos`
--

CREATE TABLE `almacen_pedidos` (
  `ID` int(11) NOT NULL,
  `RFC` char(13) DEFAULT NULL,
  `codigo_Prod` int(10) UNSIGNED DEFAULT NULL,
  `nombre` varchar(20) NOT NULL,
  `cantidad` float DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `Total` int(11) NOT NULL,
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `almacen_pedidos`
--

INSERT INTO `almacen_pedidos` (`ID`, `RFC`, `codigo_Prod`, `nombre`, `cantidad`, `precio`, `Total`, `fecha`) VALUES
(1, 'gare990101123', 2, 'Goma', 5, 10, 50, '2018-08-17 08:05:15'),
(2, 'varal45610117', 3, 'Sacapuntas', 3, 10, 30, '2018-08-17 08:05:15'),
(3, 'mgre896529109', 1, 'Lapiz', 5, 10, 50, '2018-08-17 08:05:15');

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
  `fecha_venta` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `nombre_producto` varchar(20) NOT NULL,
  `Cantidad_productos` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pedidos`
--

INSERT INTO `pedidos` (`RFC`, `Nombre_cliente`, `apellido_paterno_c`, `apellido_materno_c`, `Telefono_c`, `correo_c`, `municipio_c`, `calle_c`, `colonia_c`, `fecha_venta`, `nombre_producto`, `Cantidad_productos`) VALUES
('gare990101123', 'jose', 'garcia', 'hernandez', '7757065981', 'josegare@gmail.com', 'cuautepec', 'francisco i madero', 'la estacion', '2018-07-10 05:00:00', 'libreta profesional ', 3),
('mgre896529109', 'juan', 'perez', 'lopez', '7711232334', 'juanperez@gmail.com', 'tulancingo', 'heroes de nacozari', 'la joya', '2018-07-09 05:00:00', 'Goma pelikan', 15),
('varal45610117', 'Uriel', 'Vargas', 'Alvarado', '7751396992', 'urielvargas@gmail.com', 'tulancingo', 'doria', 'san nicolas', '2018-07-06 05:00:00', 'sacapuntas', 10);

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
('4512367894563', 'Tijeras', 'Barrilito', '10', 12, 50, NULL),
('7501234507543', 'Resistol', 'chrash', '7ml', 8, 50, 1),
('7502314789654', 'colores', 'Blanca Nieves', '14pzas', 12, 20, NULL),
('7507543211234', 'Regla', 'Baco', '1pza', 3.5, 100, 3),
('7507543211523', 'colores', 'Mapita', '12pzas', 12, 50, NULL),
('7508964523123', 'lapicero', 'paper Mate', '6pzas', 16, 0, 2),
('7518964532125', 'Goma', 'Pelikan', '5pzas', 20, 0, 2),
('7521035789410', 'lapicero', 'Bic', '5pzas', 16, 20, NULL),
('7521035789415', 'corrector lapiz', 'Bic', '5pzas', 16, 0, NULL);

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
(2, 'charly', 'Dominguez', 'Omaña', '7751235689', 'carlosdom@gva.gmail.com', 'cuautepec', 'huayapan', 'guadalupe'),
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
('jose garcia', '123456jose', 'gare990101123', '', ''),
('mary', 'hola', NULL, 'annggii199@gmail.com', '77575833454');

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
  ADD PRIMARY KEY (`ID`),
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
  MODIFY `codigo_Prod` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `almacen_pedidos`
--
ALTER TABLE `almacen_pedidos`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

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
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
