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
-- Table structure for table `page`
--

DROP TABLE IF EXISTS `page`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `page` (
  `page_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `page_namespace` int(11) NOT NULL,
  `page_title` varbinary(255) NOT NULL,
  `page_restrictions` tinyblob NOT NULL,
  `page_counter` bigint(20) unsigned NOT NULL DEFAULT '0',
  `page_is_redirect` tinyint(3) unsigned NOT NULL DEFAULT '0',
  `page_is_new` tinyint(3) unsigned NOT NULL DEFAULT '0',
  `page_random` double unsigned NOT NULL,
  `page_touched` binary(14) NOT NULL DEFAULT '\0\0\0\0\0\0\0\0\0\0\0\0\0\0',
  `page_links_updated` varbinary(14) DEFAULT NULL,
  `page_latest` int(10) unsigned NOT NULL,
  `page_len` int(10) unsigned NOT NULL,
  `page_content_model` varbinary(32) DEFAULT NULL,
  PRIMARY KEY (`page_id`),
  UNIQUE KEY `name_title` (`page_namespace`,`page_title`),
  KEY `page_random` (`page_random`),
  KEY `page_len` (`page_len`),
  KEY `page_redirect_namespace_len` (`page_is_redirect`,`page_namespace`,`page_len`)
) ENGINE=InnoDB AUTO_INCREMENT=113 DEFAULT CHARSET=binary;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `page`
--

LOCK TABLES `page` WRITE;
/*!40000 ALTER TABLE `page` DISABLE KEYS */;
INSERT INTO `page` VALUES (1,0,'Main_Page','',90,0,0,0.009322070867,'20160607193124','20160607193124',240,887,'wikitext'),(69,0,'Whata_Link_Here_Direct_Invoke','',2,0,1,0.978050765403,'20160607192238','20160607192238',146,30,'wikitext'),(70,0,'Whats_Link_Here_Poc','',3,0,1,0.059102561197,'20160607192247','19691231235959',143,163,'wikitext'),(71,14,'Samples','',2,0,0,0.202282157352,'20160607192514','20160607192514',172,67,'wikitext'),(72,14,'Semantic_Maps_examples','',0,0,0,0.941194229888,'20160607192532','20160607192532',174,1157,'wikitext'),(73,14,'Semantic_Result_Formats_examples','',2,0,0,0.365777151782,'20160607192535','20160607192535',176,276,'wikitext'),(74,14,'Maps_examples','',2,0,0,0.478283860226,'20160607192618','20160607192618',178,4469,'wikitext'),(75,14,'Semantic_Forms_examples','',2,0,0,0.423449322687,'20160607192514','20160607192514',180,21,'wikitext'),(76,14,'Parserhook_examples','',2,0,0,0.019741203597,'20160607192704','20160607192704',182,47,'wikitext'),(77,14,'Best_practices','',4,0,0,0.267580077058,'20160607192648','20160607192648',184,35,'wikitext'),(78,14,'Example_data','',1,0,0,0.865288496817,'20160607192514','20160607192514',186,21,'wikitext'),(79,14,'Template_examples','',0,0,0,0.570944009222,'20160607192514','20160607192514',188,21,'wikitext'),(80,0,'Examples/Different_link_parameter_options','',1,0,0,0.852442443069,'20160607192618','20160607192618',190,1803,'wikitext'),(81,2,'Yury_Katkov/test_page_for_newtocru','',0,0,0,0.017231863411,'20160607192543','20160607192543',192,2768,'wikitext'),(82,0,'Examples/Join_data_from_two_pages_into_one_table','',1,0,0,0.868622234149,'20160607192552','20160607192552',194,750,'wikitext'),(83,0,'Examples/Parser/Set_using_a_template_parameter','',1,0,0,0.55195891253,'20160607192704','20160607192540',196,908,'wikitext'),(84,0,'Examples/Parser/Text_that_includes_other_annotations','',0,0,0,0.595990444132,'20160607192627','20160607192627',198,1094,'wikitext'),(85,10,'HIDE_CAT_PREFIX','',0,0,0,0.527516548573,'20160607192515','20160607192515',200,233,'wikitext'),(86,10,'Demo/Help','',2,0,0,0.656844856547,'20160607192650','20160607192650',202,1074,'wikitext'),(87,10,'·','',0,0,0,0.074310764939,'20160607192515','20160607192515',204,69,'wikitext'),(88,10,'Foot','',0,0,0,0.280243931138,'20160607192515','20160607192515',206,31,'wikitext'),(89,10,'Maps_examples_body','',0,0,0,0.723731190197,'20160607192515','20160607192515',208,77,'wikitext'),(90,10,'Maps_examples_head','',0,0,0,0.470219547276,'20160607192515','20160607192515',210,100,'wikitext'),(91,10,'TOC','',0,0,0,0.93044002166,'20160607192515','20160607192515',212,353,'wikitext'),(92,10,'Example','',0,0,0,0.127738016419,'20160607192515','20160607192515',214,3418,'wikitext'),(93,10,'LinkToAskQueryFromSetParserParameters','',0,0,0,0.62523089907,'20160607192515','20160607192515',216,242,'wikitext'),(94,10,'SMW_user_TOC_(ru)','',0,0,0,0.674854992898,'20160607192557','20160607192557',218,3713,'wikitext'),(95,10,'TOC-level','',0,0,0,0.696031864711,'20160607192515','20160607192515',220,245,'wikitext'),(96,10,'Footer','',0,1,0,0.529527873072,'20160607192515','20160607192515',222,34,'wikitext'),(97,10,'PKaValueTemplate','',0,0,0,0.740044509335,'20160607192515','20160607192515',224,249,'wikitext'),(98,10,'PKaValueTemplateHeader','',0,0,0,0.671563283815,'20160607192515','20160607192515',226,183,'wikitext'),(99,10,'TableFooter','',0,0,0,0.536707585656,'20160607192515','20160607192515',228,31,'wikitext'),(100,10,'InTextAnnotationDescriptionExample','',0,0,0,0.607911662222,'20160607192515','20160607192515',230,188,'wikitext'),(101,10,'SetValue','',0,0,0,0.807420813839,'20160607192515','20160607192515',232,153,'wikitext'),(102,14,'Test_01_breadcrumb','',10,0,1,0.514247424567,'20160608151837','20160608145635',241,40,'wikitext'),(103,14,'Test_021_breadcrumb','',8,0,1,0.53726225217,'20160608150148','20160608145748',242,31,'wikitext'),(104,14,'Test_022_breadcrumb','',6,0,1,0.538729708998,'20160608150610','20160608145831',243,31,'wikitext'),(105,14,'Test_031_breadcrumb','',7,0,1,0.443745210476,'20160608150334','20160608145926',244,32,'wikitext'),(106,14,'Test_032_breadcrumb','',7,0,0,0.256296871347,'20160608151549','20160608150032',246,32,'wikitext'),(107,14,'Test_033_breadcrumb','',5,0,0,0.094233077843,'20160608150148','20160608150148',248,32,'wikitext'),(108,14,'Test_044_breadcrumb','',4,0,1,0.358656513139,'20160608150301','20160608150301',249,32,'wikitext'),(109,14,'Test_041_breadcrumb','',4,0,1,0.656125861874,'20160608150334','20160608150334',250,32,'wikitext'),(110,14,'Test_047_breadcrumb','',8,0,0,0.341584749513,'20160608151837','20160608151837',255,64,'wikitext'),(111,14,'Test_034_breadcrumb','',1,0,1,0.006062642948,'20160608150610','20160608150610',252,32,'wikitext'),(112,14,'Test_042_breadcrumb','',2,0,1,0.122095708514,'20160608151549','20160608151549',253,32,'wikitext');
/*!40000 ALTER TABLE `page` ENABLE KEYS */;
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
