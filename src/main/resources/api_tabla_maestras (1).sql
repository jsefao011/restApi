-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-06-2018 a las 17:33:40
-- Versión del servidor: 10.1.28-MariaDB
-- Versión de PHP: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `api_tabla_maestras`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `api_tm_departamento`
--

CREATE TABLE `api_tm_departamento` (
  `p_tm_departamento` int(11) NOT NULL,
  `no_departamento` varchar(45) DEFAULT NULL,
  `es_departamento` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `api_tm_departamento`
--

INSERT INTO `api_tm_departamento` (`p_tm_departamento`, `no_departamento`, `es_departamento`) VALUES
(1, 'Pasco', '1'),
(2, '', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `api_tm_distrito`
--

CREATE TABLE `api_tm_distrito` (
  `p_tm_distrito` int(11) NOT NULL,
  `no_distrito` varchar(45) DEFAULT NULL,
  `es_distrito` char(1) DEFAULT NULL,
  `f_tm_provincia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `api_tm_distrito`
--

INSERT INTO `api_tm_distrito` (`p_tm_distrito`, `no_distrito`, `es_distrito`, `f_tm_provincia`) VALUES
(1, 'Oxapmapa', '1', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `api_tm_estado_civil`
--

CREATE TABLE `api_tm_estado_civil` (
  `p_estado_civil` int(11) NOT NULL,
  `no_estado_civil` varchar(45) DEFAULT NULL,
  `es_estado_civil` char(1) DEFAULT NULL,
  `nom_estado_civil` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `api_tm_estado_civil`
--

INSERT INTO `api_tm_estado_civil` (`p_estado_civil`, `no_estado_civil`, `es_estado_civil`, `nom_estado_civil`) VALUES
(1, 'Casado', '1', NULL),
(2, 'Soltero', '1', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `api_tm_nivel_academico`
--

CREATE TABLE `api_tm_nivel_academico` (
  `p_tm_nivel_academico` int(11) NOT NULL,
  `no_nivel_academico` varchar(45) DEFAULT NULL,
  `es_nivel_academico` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `api_tm_nivel_academico`
--

INSERT INTO `api_tm_nivel_academico` (`p_tm_nivel_academico`, `no_nivel_academico`, `es_nivel_academico`) VALUES
(1, 'Secundaria', '1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `api_tm_nivel_academico_copy1`
--

CREATE TABLE `api_tm_nivel_academico_copy1` (
  `p_tm_nivel_academico` int(11) NOT NULL,
  `no_nivel_academico` varchar(45) DEFAULT NULL,
  `es_nivel_academico` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `api_tm_persona`
--

CREATE TABLE `api_tm_persona` (
  `p_tm_persona` int(11) NOT NULL,
  `no_persona` varchar(45) DEFAULT NULL,
  `ap_mat_persona` varchar(45) DEFAULT NULL,
  `ap_pat_persona` varchar(45) DEFAULT NULL,
  `di_persona` varchar(45) DEFAULT NULL,
  `tlf_persona` varchar(45) DEFAULT NULL,
  `fe_nacimiento_persona` datetime DEFAULT NULL,
  `dni_documento` varchar(8) DEFAULT NULL,
  `cne_documento` varchar(12) DEFAULT NULL,
  `ruc_documento` varchar(11) DEFAULT NULL,
  `pst_documento` varchar(12) DEFAULT NULL,
  `ptn_documento` varchar(15) DEFAULT NULL,
  `ot_documento` varchar(15) DEFAULT NULL,
  `f_tm_sexo` int(11) DEFAULT NULL,
  `f_tm_estado_civil` int(11) DEFAULT NULL,
  `f_tm_religion` int(11) DEFAULT NULL,
  `f_tm_nivel_academico` int(11) DEFAULT NULL,
  `f_tm_distrito` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `api_tm_persona`
--

INSERT INTO `api_tm_persona` (`p_tm_persona`, `no_persona`, `ap_mat_persona`, `ap_pat_persona`, `di_persona`, `tlf_persona`, `fe_nacimiento_persona`, `dni_documento`, `cne_documento`, `ruc_documento`, `pst_documento`, `ptn_documento`, `ot_documento`, `f_tm_sexo`, `f_tm_estado_civil`, `f_tm_religion`, `f_tm_nivel_academico`, `f_tm_distrito`) VALUES
(1, 'JOse', 'Orezano', 'Arias', '124124', '982173981', '1995-03-24 13:12:17', '71254809', NULL, NULL, NULL, NULL, NULL, 1, 2, 1, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `api_tm_provincia`
--

CREATE TABLE `api_tm_provincia` (
  `p_tm_provincia` int(11) NOT NULL,
  `no_provincia` varchar(45) DEFAULT NULL,
  `es_provincia` char(1) DEFAULT NULL,
  `f_tm_departamento` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `api_tm_provincia`
--

INSERT INTO `api_tm_provincia` (`p_tm_provincia`, `no_provincia`, `es_provincia`, `f_tm_departamento`) VALUES
(2, 'Oxapampa', '1', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `api_tm_religion`
--

CREATE TABLE `api_tm_religion` (
  `p_tm_religion` int(11) NOT NULL,
  `no_religion` varchar(45) DEFAULT NULL,
  `es_religion` char(1) DEFAULT NULL,
  `nom_religion` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `api_tm_religion`
--

INSERT INTO `api_tm_religion` (`p_tm_religion`, `no_religion`, `es_religion`, `nom_religion`) VALUES
(1, 'Adventista', '1', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `api_tm_sexo`
--

CREATE TABLE `api_tm_sexo` (
  `p_sexo` int(11) NOT NULL,
  `no_sexo` varchar(45) DEFAULT NULL,
  `es_sexo` char(1) DEFAULT NULL,
  `nom_sexo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `api_tm_sexo`
--

INSERT INTO `api_tm_sexo` (`p_sexo`, `no_sexo`, `es_sexo`, `nom_sexo`) VALUES
(1, 'Masculino', '1', NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `api_tm_departamento`
--
ALTER TABLE `api_tm_departamento`
  ADD PRIMARY KEY (`p_tm_departamento`);

--
-- Indices de la tabla `api_tm_distrito`
--
ALTER TABLE `api_tm_distrito`
  ADD PRIMARY KEY (`p_tm_distrito`),
  ADD KEY `fk_tm_distrito_tm_provincia1_idx` (`f_tm_provincia`);

--
-- Indices de la tabla `api_tm_estado_civil`
--
ALTER TABLE `api_tm_estado_civil`
  ADD PRIMARY KEY (`p_estado_civil`);

--
-- Indices de la tabla `api_tm_nivel_academico`
--
ALTER TABLE `api_tm_nivel_academico`
  ADD PRIMARY KEY (`p_tm_nivel_academico`);

--
-- Indices de la tabla `api_tm_nivel_academico_copy1`
--
ALTER TABLE `api_tm_nivel_academico_copy1`
  ADD PRIMARY KEY (`p_tm_nivel_academico`);

--
-- Indices de la tabla `api_tm_persona`
--
ALTER TABLE `api_tm_persona`
  ADD PRIMARY KEY (`p_tm_persona`),
  ADD KEY `fk_TM_PERSONA_TM_SEXO_idx` (`f_tm_sexo`),
  ADD KEY `fk_tm_persona_tm_estado_civil1_idx` (`f_tm_estado_civil`),
  ADD KEY `fk_tm_persona_tm_religion1_idx` (`f_tm_religion`),
  ADD KEY `fk_tm_persona_tm_nivel_academico1_idx` (`f_tm_nivel_academico`),
  ADD KEY `fk_tm_persona_tm_distrito1_idx` (`f_tm_distrito`);

--
-- Indices de la tabla `api_tm_provincia`
--
ALTER TABLE `api_tm_provincia`
  ADD PRIMARY KEY (`p_tm_provincia`),
  ADD KEY `fk_tm_provincia_tm_departamento1_idx` (`f_tm_departamento`);

--
-- Indices de la tabla `api_tm_religion`
--
ALTER TABLE `api_tm_religion`
  ADD PRIMARY KEY (`p_tm_religion`);

--
-- Indices de la tabla `api_tm_sexo`
--
ALTER TABLE `api_tm_sexo`
  ADD PRIMARY KEY (`p_sexo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `api_tm_departamento`
--
ALTER TABLE `api_tm_departamento`
  MODIFY `p_tm_departamento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `api_tm_distrito`
--
ALTER TABLE `api_tm_distrito`
  MODIFY `p_tm_distrito` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `api_tm_estado_civil`
--
ALTER TABLE `api_tm_estado_civil`
  MODIFY `p_estado_civil` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `api_tm_nivel_academico`
--
ALTER TABLE `api_tm_nivel_academico`
  MODIFY `p_tm_nivel_academico` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `api_tm_nivel_academico_copy1`
--
ALTER TABLE `api_tm_nivel_academico_copy1`
  MODIFY `p_tm_nivel_academico` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `api_tm_persona`
--
ALTER TABLE `api_tm_persona`
  MODIFY `p_tm_persona` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `api_tm_provincia`
--
ALTER TABLE `api_tm_provincia`
  MODIFY `p_tm_provincia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `api_tm_religion`
--
ALTER TABLE `api_tm_religion`
  MODIFY `p_tm_religion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `api_tm_sexo`
--
ALTER TABLE `api_tm_sexo`
  MODIFY `p_sexo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `api_tm_distrito`
--
ALTER TABLE `api_tm_distrito`
  ADD CONSTRAINT `fk_tm_distrito_tm_provincia1` FOREIGN KEY (`f_tm_provincia`) REFERENCES `api_tm_provincia` (`p_tm_provincia`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `api_tm_persona`
--
ALTER TABLE `api_tm_persona`
  ADD CONSTRAINT `fk_TM_PERSONA_TM_SEXO` FOREIGN KEY (`f_tm_sexo`) REFERENCES `api_tm_sexo` (`p_sexo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tm_persona_tm_distrito1` FOREIGN KEY (`f_tm_distrito`) REFERENCES `api_tm_distrito` (`p_tm_distrito`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tm_persona_tm_estado_civil1` FOREIGN KEY (`f_tm_estado_civil`) REFERENCES `api_tm_estado_civil` (`p_estado_civil`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tm_persona_tm_nivel_academico1` FOREIGN KEY (`f_tm_nivel_academico`) REFERENCES `api_tm_nivel_academico` (`p_tm_nivel_academico`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tm_persona_tm_religion1` FOREIGN KEY (`f_tm_religion`) REFERENCES `api_tm_religion` (`p_tm_religion`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `api_tm_provincia`
--
ALTER TABLE `api_tm_provincia`
  ADD CONSTRAINT `fk_tm_provincia_tm_departamento1` FOREIGN KEY (`f_tm_departamento`) REFERENCES `api_tm_departamento` (`p_tm_departamento`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
