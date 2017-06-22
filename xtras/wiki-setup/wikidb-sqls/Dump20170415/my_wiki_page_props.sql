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
-- Table structure for table `page_props`
--

DROP TABLE IF EXISTS `page_props`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `page_props` (
  `pp_page` int(11) NOT NULL,
  `pp_propname` varbinary(60) NOT NULL,
  `pp_value` blob NOT NULL,
  UNIQUE KEY `pp_page_propname` (`pp_page`,`pp_propname`),
  UNIQUE KEY `pp_propname_page` (`pp_propname`,`pp_page`)
) ENGINE=InnoDB DEFAULT CHARSET=binary;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `page_props`
--

LOCK TABLES `page_props` WRITE;
/*!40000 ALTER TABLE `page_props` DISABLE KEYS */;
INSERT INTO `page_props` VALUES (1,'smw-semanticdata-status','1'),(69,'smw-semanticdata-status',''),(70,'smw-semanticdata-status',''),(71,'smw-semanticdata-status','1'),(72,'smw-semanticdata-status','1'),(73,'smw-semanticdata-status','1'),(74,'smw-semanticdata-status','1'),(75,'smw-semanticdata-status','1'),(76,'smw-semanticdata-status','1'),(77,'smw-semanticdata-status','1'),(78,'smw-semanticdata-status','1'),(79,'smw-semanticdata-status','1'),(80,'notoc',''),(80,'smw-semanticdata-status','1'),(81,'notoc',''),(81,'smw-semanticdata-status','1'),(82,'notoc',''),(82,'smw-semanticdata-status','1'),(83,'notoc',''),(83,'smw-semanticdata-status','1'),(84,'notoc',''),(84,'smw-semanticdata-status','1'),(85,'smw-semanticdata-status',''),(86,'smw-semanticdata-status','1'),(87,'smw-semanticdata-status',''),(91,'smw-semanticdata-status',''),(92,'smw-semanticdata-status','1'),(93,'smw-semanticdata-status',''),(94,'smw-semanticdata-status','1'),(96,'smw-semanticdata-status',''),(97,'smw-semanticdata-status',''),(98,'smw-semanticdata-status',''),(100,'smw-semanticdata-status',''),(101,'smw-semanticdata-status',''),(102,'smw-semanticdata-status','1'),(103,'smw-semanticdata-status','1'),(104,'smw-semanticdata-status','1'),(105,'smw-semanticdata-status','1'),(106,'smw-semanticdata-status','1'),(107,'smw-semanticdata-status','1'),(108,'smw-semanticdata-status','1'),(109,'smw-semanticdata-status','1'),(110,'smw-semanticdata-status','1'),(111,'smw-semanticdata-status','1'),(112,'smw-semanticdata-status','1');
/*!40000 ALTER TABLE `page_props` ENABLE KEYS */;
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
