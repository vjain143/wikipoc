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
-- Table structure for table `watchlist`
--

DROP TABLE IF EXISTS `watchlist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `watchlist` (
  `wl_user` int(10) unsigned NOT NULL,
  `wl_namespace` int(11) NOT NULL DEFAULT '0',
  `wl_title` varbinary(255) NOT NULL DEFAULT '',
  `wl_notificationtimestamp` varbinary(14) DEFAULT NULL,
  UNIQUE KEY `wl_user` (`wl_user`,`wl_namespace`,`wl_title`),
  KEY `namespace_title` (`wl_namespace`,`wl_title`)
) ENGINE=InnoDB DEFAULT CHARSET=binary;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `watchlist`
--

LOCK TABLES `watchlist` WRITE;
/*!40000 ALTER TABLE `watchlist` DISABLE KEYS */;
INSERT INTO `watchlist` VALUES (1,0,'BitCoin,_How_it_works',NULL),(1,0,'Blockchain_(Workshop)',NULL),(1,0,'Main_Page',NULL),(1,0,'Smw_Demo_(Workshop)',NULL),(1,0,'Test',NULL),(1,0,'Test_02',NULL),(1,0,'Test_03',NULL),(1,0,'What_is_bit_coin',NULL),(1,0,'Whata_Link_Here_Direct_Invoke',NULL),(1,0,'Whats_Link_Here_Poc',NULL),(1,0,'WikiPoc',NULL),(1,0,'Wiki_demo_(Workshop)',NULL),(1,0,'Workshop-Test01',NULL),(1,1,'BitCoin,_How_it_works',NULL),(1,1,'Blockchain_(Workshop)',NULL),(1,1,'Main_Page',NULL),(1,1,'Smw_Demo_(Workshop)',NULL),(1,1,'Test',NULL),(1,1,'Test_02',NULL),(1,1,'Test_03',NULL),(1,1,'What_is_bit_coin',NULL),(1,1,'Whata_Link_Here_Direct_Invoke',NULL),(1,1,'Whats_Link_Here_Poc',NULL),(1,1,'WikiPoc',NULL),(1,1,'Wiki_demo_(Workshop)',NULL),(1,1,'Workshop-Test01',NULL),(1,10,'Workshop',NULL),(1,10,'WorkshopAction',NULL),(1,10,'WorkshopAgenda',NULL),(1,10,'WorkshopAgendaSuggestion',NULL),(1,10,'WorkshopScenario',NULL),(1,10,'WorkshopScenarioQuestion',NULL),(1,10,'WorkshopScenarioQuestionsDisplay',NULL),(1,11,'Workshop',NULL),(1,11,'WorkshopAction',NULL),(1,11,'WorkshopAgenda',NULL),(1,11,'WorkshopAgendaSuggestion',NULL),(1,11,'WorkshopScenario',NULL),(1,11,'WorkshopScenarioQuestion',NULL),(1,11,'WorkshopScenarioQuestionsDisplay',NULL),(1,14,'Hidden_categories',NULL),(1,14,'Test_021_breadcrumb',NULL),(1,14,'Test_022_breadcrumb',NULL),(1,14,'Test_031_breadcrumb',NULL),(1,14,'Test_032_breadcrumb',NULL),(1,14,'Test_033_breadcrumb',NULL),(1,14,'Test_034_breadcrumb',NULL),(1,14,'Test_041_breadcrumb',NULL),(1,14,'Test_042_breadcrumb',NULL),(1,14,'Test_044_breadcrumb',NULL),(1,14,'Test_047_breadcrumb',NULL),(1,14,'Workshop',NULL),(1,14,'Workshop_Action',NULL),(1,14,'Workshop_Agenda',NULL),(1,14,'Workshop_Agenda_Suggestion',NULL),(1,14,'Workshop_Manifest',NULL),(1,14,'Workshop_Scenario',NULL),(1,14,'Workshop_Scenario_Question',NULL),(1,15,'Hidden_categories',NULL),(1,15,'Test_021_breadcrumb',NULL),(1,15,'Test_022_breadcrumb',NULL),(1,15,'Test_031_breadcrumb',NULL),(1,15,'Test_032_breadcrumb',NULL),(1,15,'Test_033_breadcrumb',NULL),(1,15,'Test_034_breadcrumb',NULL),(1,15,'Test_041_breadcrumb',NULL),(1,15,'Test_042_breadcrumb',NULL),(1,15,'Test_044_breadcrumb',NULL),(1,15,'Test_047_breadcrumb',NULL),(1,15,'Workshop',NULL),(1,15,'Workshop_Action',NULL),(1,15,'Workshop_Agenda',NULL),(1,15,'Workshop_Agenda_Suggestion',NULL),(1,15,'Workshop_Manifest',NULL),(1,15,'Workshop_Scenario',NULL),(1,15,'Workshop_Scenario_Question',NULL),(1,102,'WorkshopActionDescription',NULL),(1,102,'WorkshopActionOwner',NULL),(1,102,'WorkshopActionStatus',NULL),(1,102,'WorkshopActionTargetDate',NULL),(1,102,'WorkshopActionWorkshop',NULL),(1,102,'WorkshopAgendaExpectedOutcome',NULL),(1,102,'WorkshopAgendaSuggestionDescriptionField',NULL),(1,102,'WorkshopAgendaSuggestionTitleField',NULL),(1,102,'WorkshopAgendaWorkshop',NULL),(1,102,'WorkshopName',NULL),(1,102,'WorkshopObjectives',NULL),(1,102,'WorkshopParticipants',NULL),(1,102,'WorkshopReferences',NULL),(1,102,'WorkshopScenarioDescription',NULL),(1,102,'WorkshopScenarioQuestionDescription',NULL),(1,102,'WorkshopScenarioQuestionRelatedScenario',NULL),(1,102,'WorkshopScenarioQuestionRoles',NULL),(1,102,'WorkshopScenarioReferences',NULL),(1,102,'WorkshopScenarioTitle',NULL),(1,102,'WorkshopScenarioWorkshop',NULL),(1,102,'WorkshopStakeholders',NULL),(1,102,'WorkshopStartDate',NULL),(1,103,'WorkshopActionDescription',NULL),(1,103,'WorkshopActionOwner',NULL),(1,103,'WorkshopActionStatus',NULL),(1,103,'WorkshopActionTargetDate',NULL),(1,103,'WorkshopActionWorkshop',NULL),(1,103,'WorkshopAgendaExpectedOutcome',NULL),(1,103,'WorkshopAgendaSuggestionDescriptionField',NULL),(1,103,'WorkshopAgendaSuggestionTitleField',NULL),(1,103,'WorkshopAgendaWorkshop',NULL),(1,103,'WorkshopName',NULL),(1,103,'WorkshopObjectives',NULL),(1,103,'WorkshopParticipants',NULL),(1,103,'WorkshopReferences',NULL),(1,103,'WorkshopScenarioDescription',NULL),(1,103,'WorkshopScenarioQuestionDescription',NULL),(1,103,'WorkshopScenarioQuestionRelatedScenario',NULL),(1,103,'WorkshopScenarioQuestionRoles',NULL),(1,103,'WorkshopScenarioReferences',NULL),(1,103,'WorkshopScenarioTitle',NULL),(1,103,'WorkshopScenarioWorkshop',NULL),(1,103,'WorkshopStakeholders',NULL),(1,103,'WorkshopStartDate',NULL),(1,106,'Test',NULL),(1,106,'Workshop',NULL),(1,106,'WorkshopAction',NULL),(1,106,'WorkshopAgenda',NULL),(1,106,'WorkshopAgendaSuggestion',NULL),(1,106,'WorkshopScenario',NULL),(1,106,'WorkshopScenarioQuestion',NULL),(1,107,'Test',NULL),(1,107,'Workshop',NULL),(1,107,'WorkshopAction',NULL),(1,107,'WorkshopAgenda',NULL),(1,107,'WorkshopAgendaSuggestion',NULL),(1,107,'WorkshopScenario',NULL),(1,107,'WorkshopScenarioQuestion',NULL);
/*!40000 ALTER TABLE `watchlist` ENABLE KEYS */;
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
