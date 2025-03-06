-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-05-2023 a las 23:55:25
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tiendacarrito`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carrito`
--

CREATE TABLE `carrito` (
  `codigo-usuario` varchar(10) NOT NULL,
  `numero` int(11) NOT NULL,
  `id-producto` varchar(10) NOT NULL,
  `unidades` int(11) NOT NULL,
  `precio-unidad` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `carrito`
--

INSERT INTO `carrito` (`codigo-usuario`, `numero`, `id-producto`, `unidades`, `precio-unidad`) VALUES
('JU333', 1, 'CAF32', 3, '11.00'),
('JU333', 2, 'LE211', 1, '0.00'),
('LU123', 1, 'AZ112', 2, '4.00'),
('MAB22', 1, 'CAF32', 1, '3.50');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `codigo-usuario` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL,
  `NOMBRE` varchar(30) NOT NULL,
  `tarjeta` varchar(20) NOT NULL,
  `puntos` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`codigo-usuario`, `password`, `NOMBRE`, `tarjeta`, `puntos`) VALUES
('JU333', '12345', 'Juan Ola ', '111111', 12),
('LU123', '54321', 'Luisa Broso', '', 0),
('MAB22', '121212', 'Mario Bross', '333333', 2),
('SA888', '343434', 'Sara Toga', '', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `identificador` varchar(10) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `stock` int(11) NOT NULL,
  `precio` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`identificador`, `nombre`, `stock`, `precio`) VALUES
('AZ112', 'azucar', 100, '2.00'),
('CAF32', 'cafe', 8, '3.50'),
('GACO12', 'Galletas', 10, '2.30'),
('LE211', 'Leche', 20, '1.00');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `carrito`
--
ALTER TABLE `carrito`
  ADD PRIMARY KEY (`codigo-usuario`,`numero`),
  ADD KEY `id-producto` (`id-producto`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`codigo-usuario`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`identificador`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `carrito`
--
ALTER TABLE `carrito`
  ADD CONSTRAINT `carrito_ibfk_1` FOREIGN KEY (`id-producto`) REFERENCES `productos` (`identificador`),
  ADD CONSTRAINT `carrito_ibfk_2` FOREIGN KEY (`codigo-usuario`) REFERENCES `clientes` (`codigo-usuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
