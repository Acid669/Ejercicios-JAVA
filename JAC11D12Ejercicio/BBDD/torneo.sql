-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Nov 23, 2023 at 11:56 AM
-- Server version: 8.0.31
-- PHP Version: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `torneo`
--

-- --------------------------------------------------------

--
-- Table structure for table `equipo`
--

DROP TABLE IF EXISTS `equipo`;
CREATE TABLE IF NOT EXISTS `equipo` (
  `ID` bigint NOT NULL AUTO_INCREMENT,
  `NOMBRE` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `equipo`
--

INSERT INTO `equipo` (`ID`, `NOMBRE`) VALUES
(1, 'Chicago Bulls'),
(2, 'Golden State Warriors'),
(3, 'Miami Heat'),
(4, 'Boston Celtics');

-- --------------------------------------------------------

--
-- Table structure for table `partido`
--

DROP TABLE IF EXISTS `partido`;
CREATE TABLE IF NOT EXISTS `partido` (
  `ID` bigint NOT NULL AUTO_INCREMENT,
  `FECHA` varchar(255) DEFAULT NULL,
  `RESULTADOLOCAL` int DEFAULT NULL,
  `RESULTADOVISITANTE` int DEFAULT NULL,
  `equipo_local_id` bigint DEFAULT NULL,
  `equipo_visitante_id` bigint DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_PARTIDO_equipo_local_id` (`equipo_local_id`),
  KEY `FK_PARTIDO_equipo_visitante_id` (`equipo_visitante_id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `partido`
--

INSERT INTO `partido` (`ID`, `FECHA`, `RESULTADOLOCAL`, `RESULTADOVISITANTE`, `equipo_local_id`, `equipo_visitante_id`) VALUES
(1, '23/02/2023', 98, 94, 1, 2),
(2, '23/02/2023', 105, 123, 3, 4),
(3, '30/02/2023', 102, 98, 1, 3),
(4, '30/02/2023', 102, 135, 2, 4);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
