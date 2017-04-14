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
-- Table structure for table `categorylinks`
--

DROP TABLE IF EXISTS `categorylinks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `categorylinks` (
  `cl_from` int(10) unsigned NOT NULL DEFAULT '0',
  `cl_to` varbinary(255) NOT NULL DEFAULT '',
  `cl_sortkey` varbinary(230) NOT NULL DEFAULT '',
  `cl_sortkey_prefix` varbinary(255) NOT NULL DEFAULT '',
  `cl_timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `cl_collation` varbinary(32) NOT NULL DEFAULT '',
  `cl_type` enum('page','subcat','file') NOT NULL DEFAULT 'page',
  UNIQUE KEY `cl_from` (`cl_from`,`cl_to`),
  KEY `cl_sortkey` (`cl_to`,`cl_type`,`cl_sortkey`,`cl_from`),
  KEY `cl_timestamp` (`cl_to`,`cl_timestamp`),
  KEY `cl_collation` (`cl_collation`)
) ENGINE=InnoDB DEFAULT CHARSET=binary;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorylinks`
--

LOCK TABLES `categorylinks` WRITE;
/*!40000 ALTER TABLE `categorylinks` DISABLE KEYS */;
INSERT INTO `categorylinks` VALUES (71,'Examples','SAMPLES','','2016-06-07 18:25:14','uppercase','subcat'),(71,'Semantic_MediaWiki_documentation','SAMPLES','','2016-06-07 18:25:14','uppercase','subcat'),(72,'Examples','SEMANTIC MAPS EXAMPLES','','2016-06-07 18:25:14','uppercase','subcat'),(73,'Examples','SEMANTIC RESULT FORMATS EXAMPLES','','2016-06-07 18:25:14','uppercase','subcat'),(73,'Pages_with_broken_file_links','SEMANTIC RESULT FORMATS EXAMPLES','','2016-06-07 18:25:35','uppercase','subcat'),(74,'Examples','MAPS EXAMPLES','','2016-06-07 18:25:14','uppercase','subcat'),(74,'Maps','MAPS EXAMPLES','','2016-06-07 18:25:14','uppercase','subcat'),(75,'Examples','SEMANTIC FORMS EXAMPLES','','2016-06-07 18:25:14','uppercase','subcat'),(76,'Examples','PARSERHOOK EXAMPLES','','2016-06-07 18:25:14','uppercase','subcat'),(77,'Examples','BEST PRACTICES','','2016-06-07 18:25:14','uppercase','subcat'),(77,'Pages_with_broken_file_links','BEST PRACTICES','','2016-06-07 18:26:48','uppercase','subcat'),(78,'Examples','EXAMPLE DATA','','2016-06-07 18:25:14','uppercase','subcat'),(79,'Examples','TEMPLATE EXAMPLES','','2016-06-07 18:25:14','uppercase','subcat'),(80,'Examples','EXAMPLES/DIFFERENT LINK PARAMETER OPTIONS','','2016-06-07 18:25:14','uppercase','page'),(81,'Examples','YURY KATKOV/TEST PAGE FOR NEWTOCRU','','2016-06-07 18:25:43','uppercase','page'),(82,'Examples','EXAMPLES/JOIN DATA FROM TWO PAGES INTO ONE TABLE','','2016-06-07 18:25:52','uppercase','page'),(83,'Examples','EXAMPLES/PARSER/SET USING A TEMPLATE PARAMETER','','2016-06-07 18:25:40','uppercase','page'),(83,'Parserhook_examples','EXAMPLES/PARSER/SET USING A TEMPLATE PARAMETER','','2016-06-07 18:25:14','uppercase','page'),(84,'Examples','EXAMPLES/PARSER/TEXT THAT INCLUDES OTHER ANNOTATIONS','','2016-06-07 18:26:27','uppercase','page'),(86,'Pages_with_broken_file_links','DEMO/HELP','','2016-06-07 18:25:15','uppercase','page'),(94,'Info_templates','SMW USER TOC (RU)','','2016-06-07 18:25:15','uppercase','page'),(103,'Test_01_breadcrumb','TEST 021 BREADCRUMB','','2016-06-08 13:57:48','uppercase','subcat'),(104,'Test_01_breadcrumb','TEST 022 BREADCRUMB','','2016-06-08 13:58:31','uppercase','subcat'),(105,'Test_021_breadcrumb','TEST 031 BREADCRUMB','','2016-06-08 13:59:26','uppercase','subcat'),(106,'Test_022_breadcrumb','TEST 032 BREADCRUMB','','2016-06-08 14:00:32','uppercase','subcat'),(107,'Test_021_breadcrumb','TEST 033 BREADCRUMB','','2016-06-08 14:01:48','uppercase','subcat'),(108,'Test_031_breadcrumb','TEST 044 BREADCRUMB','','2016-06-08 14:03:01','uppercase','subcat'),(109,'Test_031_breadcrumb','TEST 041 BREADCRUMB','','2016-06-08 14:03:34','uppercase','subcat'),(110,'Test_01_breadcrumb','TEST 047 BREADCRUMB','','2016-06-08 14:18:37','uppercase','subcat'),(110,'Test_032_breadcrumb','TEST 047 BREADCRUMB','','2016-06-08 14:05:06','uppercase','subcat'),(111,'Test_022_breadcrumb','TEST 034 BREADCRUMB','','2016-06-08 14:06:10','uppercase','subcat'),(112,'Test_032_breadcrumb','TEST 042 BREADCRUMB','','2016-06-08 14:15:49','uppercase','subcat');
/*!40000 ALTER TABLE `categorylinks` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-04-15  0:34:28
