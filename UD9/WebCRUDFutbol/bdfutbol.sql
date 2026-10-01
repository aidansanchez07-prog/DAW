CREATE DATABASE IF NOT EXISTS `bdfutbol` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `bdfutbol`;

DROP TABLE IF EXISTS `futbolista`;
DROP TABLE IF EXISTS `equipo`;

CREATE TABLE `equipo` (
  `idequipo` int NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `descripcion` varchar(45) NOT NULL,
  PRIMARY KEY (`idequipo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `futbolista` (
  `idfutbolista` int NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `goles` int NOT NULL,
  `sueldo` double NOT NULL,
  `idequipo` int DEFAULT NULL,
  PRIMARY KEY (`idfutbolista`),
  KEY `idequipo_idx` (`idequipo`),
  CONSTRAINT `fk_idequipo` FOREIGN KEY (`idequipo`) REFERENCES `equipo` (`idequipo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
