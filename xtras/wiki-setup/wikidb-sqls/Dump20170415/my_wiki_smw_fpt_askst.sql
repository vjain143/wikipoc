CREATE DATABASE  IF NOT EXISTS `my_wiki` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `my_wiki`;
-- MySQL dump 10.13  Distrib 5.5.53, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: my_wiki
-- ------------------------------------------------------
-- Server version	5.5.53-0ubuntu0.14.04.1

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
-- Table structure for table `smw_fpt_askst`
--

DROP TABLE IF EXISTS `smw_fpt_askst`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `smw_fpt_askst` (
  `s_id` int(8) unsigned NOT NULL,
  `o_blob` mediumblob,
  `o_hash` varbinary(255) DEFAULT NULL,
  KEY `s_id` (`s_id`),
  KEY `o_hash` (`o_hash`)
) ENGINE=InnoDB DEFAULT CHARSET=binary;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `smw_fpt_askst`
--

LOCK TABLES `smw_fpt_askst` WRITE;
/*!40000 ALTER TABLE `smw_fpt_askst` DISABLE KEYS */;
INSERT INTO `smw_fpt_askst` VALUES (142,NULL,'[[Has image collection::Result formats]]'),(144,NULL,'[[Has example::Maps]] [[Uses service::Meta]]'),(145,NULL,'[[Has example::Maps]] [[Uses service::Openlayers]]'),(146,NULL,'[[Has example::Maps]] [[Uses service::Openlayers]]'),(147,NULL,'[[Has example::Maps]] [[Uses service::Googlemaps]]'),(148,NULL,'[[Has example::Maps]] [[Uses service::Googlemaps]]'),(156,NULL,'[[Category:City]] [[Located in::+]]'),(159,NULL,'[[Has pKa value::+]]'),(188,NULL,'[[Has keyword::Set parser]]'),(189,NULL,'[[Has keyword::Template usage]]'),(190,NULL,'[[Has keyword::+]]'),(199,NULL,'[[Has keyword::Table output]]'),(200,NULL,'[[Has keyword::Template query]]'),(201,NULL,'[[Has keyword::Template format]]'),(205,NULL,'[[Has keyword::Inline queries]]'),(206,NULL,'[[Has keyword::Table output]]'),(214,NULL,'[[Has keyword::Set parser]]'),(215,NULL,'[[Has keyword::Template usage]]'),(216,NULL,'[[Has keyword::+]]'),(217,NULL,'[[Has keyword::In-text annotation]]');
/*!40000 ALTER TABLE `smw_fpt_askst` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-04-15  0:34:27