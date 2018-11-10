CREATE DATABASE  IF NOT EXISTS `corpodocente` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `corpodocente`;
-- MySQL dump 10.13  Distrib 5.7.24, for Linux (x86_64)
--
-- Host: localhost    Database: corpodocente
-- ------------------------------------------------------
-- Server version	5.7.24-0ubuntu0.18.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `descricao`
--

DROP TABLE IF EXISTS `descricao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `descricao` (
  `idatividade` int(11) NOT NULL AUTO_INCREMENT,
  `tipodeorientacao` varchar(45) NOT NULL,
  `nomedoartigo` varchar(45) NOT NULL,
  `descricaocoordenacao` varchar(200) NOT NULL,
  `codigoDisciplina` int(11) NOT NULL,
  PRIMARY KEY (`idatividade`),
  KEY `fk_descricao_Disciplina_idx` (`codigoDisciplina`),
  CONSTRAINT `fk_descricao_Disciplina` FOREIGN KEY (`codigoDisciplina`) REFERENCES `disciplinas` (`iddisciplina`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `descricao`
--

LOCK TABLES `descricao` WRITE;
/*!40000 ALTER TABLE `descricao` DISABLE KEYS */;
INSERT INTO `descricao` VALUES (1,'Alunos de Graduação - TCC','te','t',1);
/*!40000 ALTER TABLE `descricao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `disciplinas`
--

DROP TABLE IF EXISTS `disciplinas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `disciplinas` (
  `iddisciplina` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `siape` int(11) NOT NULL,
  PRIMARY KEY (`iddisciplina`),
  KEY `fk_disciplinas_docente_idx` (`siape`),
  CONSTRAINT `fk_disciplinas_docente` FOREIGN KEY (`siape`) REFERENCES `docente` (`id_siape`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `disciplinas`
--

LOCK TABLES `disciplinas` WRITE;
/*!40000 ALTER TABLE `disciplinas` DISABLE KEYS */;
INSERT INTO `disciplinas` VALUES (1,'Algoritmos e Estruturas de Dados I',1);
/*!40000 ALTER TABLE `disciplinas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `docente`
--

DROP TABLE IF EXISTS `docente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `docente` (
  `id_siape` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `sexo` varchar(10) NOT NULL,
  `email` varchar(50) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `endereco` varchar(50) NOT NULL,
  PRIMARY KEY (`id_siape`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `docente`
--

LOCK TABLES `docente` WRITE;
/*!40000 ALTER TABLE `docente` DISABLE KEYS */;
INSERT INTO `docente` VALUES (1,'Gago','Feminino','gago@gmail.com','(92)3919-3912','Rua Gaguinha');
/*!40000 ALTER TABLE `docente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `idusuario` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(50) NOT NULL,
  `senha` varchar(45) NOT NULL,
  PRIMARY KEY (`idusuario`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'icomp','123');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-10 17:28:46
