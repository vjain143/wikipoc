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
-- Table structure for table `smw_prop_stats`
--

DROP TABLE IF EXISTS `smw_prop_stats`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `smw_prop_stats` (
  `p_id` int(8) unsigned DEFAULT NULL,
  `usage_count` int(8) unsigned DEFAULT NULL,
  UNIQUE KEY `p_id` (`p_id`),
  KEY `usage_count` (`usage_count`)
) ENGINE=InnoDB DEFAULT CHARSET=binary;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `smw_prop_stats`
--

LOCK TABLES `smw_prop_stats` WRITE;
/*!40000 ALTER TABLE `smw_prop_stats` DISABLE KEYS */;
INSERT INTO `smw_prop_stats` VALUES (55,0),(60,0),(63,0),(64,0),(65,0),(66,0),(67,0),(71,0),(74,0),(77,0),(78,0),(79,0),(80,0),(82,0),(84,0),(89,0),(90,0),(94,0),(96,0),(97,0),(98,0),(99,0),(101,0),(102,0),(106,0),(107,0),(108,0),(109,0),(112,0),(113,0),(115,0),(180,5),(182,14),(186,5),(191,2),(192,5),(212,1);
/*!40000 ALTER TABLE `smw_prop_stats` ENABLE KEYS */;
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
