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
-- Table structure for table `smw_object_ids`
--

DROP TABLE IF EXISTS `smw_object_ids`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `smw_object_ids` (
  `smw_id` int(8) unsigned NOT NULL AUTO_INCREMENT,
  `smw_namespace` int(11) NOT NULL,
  `smw_title` varbinary(255) NOT NULL,
  `smw_iw` varbinary(32) NOT NULL,
  `smw_subobject` varbinary(255) NOT NULL,
  `smw_sortkey` varbinary(255) NOT NULL,
  `smw_proptable_hash` mediumblob,
  PRIMARY KEY (`smw_id`),
  KEY `smw_id` (`smw_id`,`smw_sortkey`),
  KEY `smw_iw` (`smw_iw`),
  KEY `smw_title` (`smw_title`,`smw_namespace`,`smw_iw`,`smw_subobject`),
  KEY `smw_sortkey` (`smw_sortkey`)
) ENGINE=InnoDB AUTO_INCREMENT=229 DEFAULT CHARSET=binary;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `smw_object_ids`
--

LOCK TABLES `smw_object_ids` WRITE;
/*!40000 ALTER TABLE `smw_object_ids` DISABLE KEYS */;
INSERT INTO `smw_object_ids` VALUES (1,102,'_TYPE','','','Has type',NULL),(2,102,'_URI','','','Equivalent URI',NULL),(4,102,'_INST',':smw-intprop','','',NULL),(7,102,'_UNIT','','','Display units',NULL),(8,102,'_IMPO','','','Imported from',NULL),(12,102,'_CONV','','','Corresponds to',NULL),(13,102,'_SERV','','','Provides service',NULL),(14,102,'_PVAL','','','Allows value',NULL),(15,102,'_REDI',':smw-intprop','','',NULL),(17,102,'_SUBP','','','Subproperty of',NULL),(18,102,'_SUBC','','','Subcategory of',NULL),(19,102,'_CONC',':smw-intprop','','',NULL),(22,102,'_ERRP','','','Has improper value for',NULL),(28,102,'_LIST','','','Has fields',NULL),(29,102,'_MDAT','','','Modification date',NULL),(30,102,'_CDAT','','','Creation date',NULL),(31,102,'_NEWP','','','Is a new page',NULL),(32,102,'_LEDT','','','Last editor is',NULL),(33,102,'_ASK','','','Has query',NULL),(34,102,'_ASKST','','','Query string',NULL),(35,102,'_ASKFO','','','Query format',NULL),(36,102,'_ASKSI','','','Query size',NULL),(37,102,'_ASKDE','','','Query depth',NULL),(50,0,'',':smw-border','','',NULL),(51,0,'Test',':smw-delete','','Test','a:0:{}'),(52,14,'Test',':smw-delete','','Test','a:0:{}'),(53,10,'Test',':smw-delete','','Test',NULL),(54,106,'Test',':smw-delete','','Test',NULL),(55,102,'Test_Name_Property',':smw-delete','','Test Name Property','a:0:{}'),(56,0,'Test_02',':smw-delete','','Test 02','a:0:{}'),(57,0,'Test_03',':smw-delete','','Test 03','a:0:{}'),(58,0,'Main_Page','','','Main Page','a:1:{s:12:\"smw_fpt_mdat\";s:32:\"e0361ef26f1620c192b65303d8415d6a\";}'),(59,10,'Workshop',':smw-delete','','Workshop',NULL),(60,102,'WorkshopObjectives',':smw-delete','','WorkshopObjectives','a:0:{}'),(61,106,'Workshop',':smw-delete','','Workshop',NULL),(62,14,'Workshop',':smw-delete','','Workshop','a:0:{}'),(63,102,'WorkShopParticipants',':smw-delete','','WorkShopParticipants','a:0:{}'),(64,102,'WorkshopName',':smw-delete','','WorkshopName','a:0:{}'),(65,102,'WorkshopStartDate',':smw-delete','','WorkshopStartDate','a:0:{}'),(66,102,'WorkshopReferences',':smw-delete','','WorkshopReferences','a:0:{}'),(67,102,'WorkshopStakeholders',':smw-delete','','WorkshopStakeholders','a:0:{}'),(68,0,'Workshop-Test01',':smw-delete','','Workshop-Test01','a:0:{}'),(69,14,'Workshop_Manifest',':smw-delete','','Workshop Manifest','a:0:{}'),(70,14,'Hidden_categories',':smw-delete','','Hidden categories','a:0:{}'),(71,102,'WorkshopParticipants',':smw-delete','','WorkshopParticipants','a:0:{}'),(72,0,'WikiPoc',':smw-delete','','WikiPoc','a:0:{}'),(73,0,'Smw_Demo_(Workshop)',':smw-delete','','Smw Demo (Workshop)','a:0:{}'),(74,102,'WorkShopParticipants','','','WorkShopParticipants',NULL),(75,0,'Andy','','','Andy',NULL),(76,10,'WorkshopAction',':smw-delete','','WorkshopAction',NULL),(77,102,'WorkshopActionOwner',':smw-delete','','WorkshopActionOwner','a:0:{}'),(78,102,'WorkshopActionDescription',':smw-delete','','WorkshopActionDescription','a:0:{}'),(79,102,'WorkshopActionStatus',':smw-delete','','WorkshopActionStatus','a:0:{}'),(80,102,'WorkshopActionWorkshop',':smw-delete','','WorkshopActionWorkshop','a:0:{}'),(81,14,'WorkshopAction',':smw-delete','','WorkshopAction','a:0:{}'),(82,102,'WorkshopActionTargetDate',':smw-delete','','WorkshopActionTargetDate','a:0:{}'),(83,106,'WorkshopAction',':smw-delete','','WorkshopAction',NULL),(84,102,'WorkshopActionTitle',':smw-delete','','WorkshopActionTitle','a:0:{}'),(85,0,'Wiki_demo_(Workshop)',':smw-delete','','Wiki demo (Workshop)','a:0:{}'),(86,0,'Sam','','','Sam',NULL),(87,14,'Workshop_Action',':smw-delete','','Workshop Action','a:0:{}'),(88,10,'WorkshopAgenda',':smw-delete','','WorkshopAgenda',NULL),(89,102,'WorkshopAgendaExpactedOutcome',':smw-delete','','WorkshopAgendaExpactedOutcome','a:0:{}'),(90,102,'WorkshopAgendaWorkshop',':smw-delete','','WorkshopAgendaWorkshop','a:0:{}'),(91,10,'WorkshopAgendaSuggestion',':smw-delete','','WorkshopAgendaSuggestion',NULL),(92,14,'Workshop_Agenda_Suggestion',':smw-delete','','Workshop Agenda Suggestion','a:0:{}'),(93,14,'Workshop_Agenda',':smw-delete','','Workshop Agenda','a:0:{}'),(94,102,'WorkshopAgendaSuggestionDescriptionField',':smw-delete','','WorkshopAgendaSuggestionDescriptionField','a:0:{}'),(95,106,'WorkshopAgenda',':smw-delete','','WorkshopAgenda',NULL),(96,102,'WorkshopAgendaSuggestionTitleField',':smw-delete','','WorkshopAgendaSuggestionTitleField','a:0:{}'),(97,102,'WorkshopAgendaFrom',':smw-delete','','WorkshopAgendaFrom','a:0:{}'),(98,102,'WorkshopAgendaTitle',':smw-delete','','WorkshopAgendaTitle','a:0:{}'),(99,102,'WorkshopAgendaDescription',':smw-delete','','WorkshopAgendaDescription','a:0:{}'),(100,106,'WorkshopAgendaSuggestion',':smw-delete','','WorkshopAgendaSuggestion',NULL),(101,102,'WorkshopAgendaTo',':smw-delete','','WorkshopAgendaTo','a:0:{}'),(102,102,'WorkshopAgendaExpectedOutcome',':smw-delete','','WorkshopAgendaExpectedOutcome','a:0:{}'),(103,10,'WorkshopScenario',':smw-delete','','WorkshopScenario',NULL),(104,106,'WorkshopScenario',':smw-delete','','WorkshopScenario',NULL),(105,10,'WorkshopScenarioQuestion',':smw-delete','','WorkshopScenarioQuestion',NULL),(106,102,'WorkshopScenarioWorkshop',':smw-delete','','WorkshopScenarioWorkshop','a:0:{}'),(107,102,'WorkshopScenarioQuestionRoles',':smw-delete','','WorkshopScenarioQuestionRoles','a:0:{}'),(108,102,'WorkshopScenarioTitle',':smw-delete','','WorkshopScenarioTitle','a:0:{}'),(109,102,'WorkshopScenarioQuestionRelatedScenario',':smw-delete','','WorkshopScenarioQuestionRelatedScenario','a:0:{}'),(110,14,'Workshop_Scenario',':smw-delete','','Workshop Scenario','a:0:{}'),(111,14,'Workshop_Scenario_Question',':smw-delete','','Workshop Scenario Question','a:0:{}'),(112,102,'WorkshopScenarioQuestionDescription',':smw-delete','','WorkshopScenarioQuestionDescription','a:0:{}'),(113,102,'WorkshopScenarioReferences',':smw-delete','','WorkshopScenarioReferences','a:0:{}'),(114,106,'WorkshopScenarioQuestion',':smw-delete','','WorkshopScenarioQuestion',NULL),(115,102,'WorkshopScenarioDescription',':smw-delete','','WorkshopScenarioDescription','a:0:{}'),(116,10,'WorkshopScenarioQuestionsDisplay',':smw-delete','','WorkshopScenarioQuestionsDisplay',NULL),(117,0,'Blockchain_(Workshop)',':smw-delete','','Blockchain (Workshop)','a:0:{}'),(118,0,'Whats_Link_Here_Poc',':smw-delete','','Whats Link Here Poc','a:0:{}'),(119,0,'Whata_Link_Here_Direct_Invoke',':smw-delete','','Whata Link Here Direct Invoke','a:0:{}'),(120,0,'What_is_bit_coin',':smw-delete','','What is bit coin','a:0:{}'),(121,0,'BitCoin,_How_it_works',':smw-delete','','BitCoin, How it works','a:0:{}'),(122,0,'Blockchain_(Workshop)',':smw-delete','_QUERY15725e27343b9f64b6d6ae7e0bcdc9ee','Blockchain (Workshop)','a:0:{}'),(123,0,'Wiki_demo_(Workshop)',':smw-delete','_QUERY94335d1d2795106dafc02bdc2d4161da','Wiki demo (Workshop)','a:0:{}'),(124,0,'Smw_Demo_(Workshop)',':smw-delete','_QUERY9adeda70722918a01b09492ba0675f6d','Smw Demo (Workshop)','a:0:{}'),(125,0,'Wiki_demo_(Workshop)',':smw-delete','_QUERYe0996b0a7dd909c637df4db5962e367f','Wiki demo (Workshop)','a:0:{}'),(126,0,'Blockchain_(Workshop)',':smw-delete','_QUERY7c0c7e941b9fa48d5fd216bc62309063','Blockchain (Workshop)','a:0:{}'),(127,0,'Smw_Demo_(Workshop)',':smw-delete','_QUERY4b5a6fc097ace1f821cd7fe75f543e8b','Smw Demo (Workshop)','a:0:{}'),(128,0,'Smw_Demo_(Workshop)',':smw-delete','_QUERY6a10fea807578c0b97e9678adb4608ea','Smw Demo (Workshop)','a:0:{}'),(129,0,'Wiki_demo_(Workshop)',':smw-delete','_QUERYc46eec19bd3c39d662d4091eb035775e','Wiki demo (Workshop)','a:0:{}'),(130,0,'Blockchain_(Workshop)',':smw-delete','_QUERY03e08a5be058d2cf43581cb9fecfd795','Blockchain (Workshop)','a:0:{}'),(131,0,'Vivek_Jain','','','Vivek Jain',NULL),(132,0,'Blockchain_(Workshop)',':smw-delete','_QUERY03e08a5be058d2cf43581cb9fecfd795','Blockchain (Workshop)','a:0:{}'),(133,0,'Blockchain_(Workshop)',':smw-delete','_QUERY15725e27343b9f64b6d6ae7e0bcdc9ee','Blockchain (Workshop)','a:0:{}'),(134,0,'Blockchain_(Workshop)',':smw-delete','_QUERY7c0c7e941b9fa48d5fd216bc62309063','Blockchain (Workshop)','a:0:{}'),(135,0,'Whata_Link_Here_Direct_Invoke','','','Whata Link Here Direct Invoke','a:1:{s:12:\"smw_fpt_mdat\";s:32:\"8f6ed32fbba4dd8fdf4345965a47ac78\";}'),(136,0,'Whats_Link_Here_Poc','','','Whats Link Here Poc','a:1:{s:12:\"smw_fpt_mdat\";s:32:\"e22a0003b4df944ad361ae9b94ade0e5\";}'),(137,14,'Samples','','','Samples','a:2:{s:12:\"smw_fpt_subc\";s:32:\"cc411a608cd7885d6603819aa41291a4\";s:12:\"smw_fpt_mdat\";s:32:\"500c269dd62d161281bd6ae8f138edc7\";}'),(138,14,'Semantic_MediaWiki_documentation','','','Semantic MediaWiki documentation',NULL),(139,14,'Examples','','','Examples',NULL),(140,14,'Semantic_Maps_examples','','','Semantic Maps examples','a:2:{s:12:\"smw_fpt_subc\";s:32:\"2749259b771a3188d62bc7a828a6ba96\";s:12:\"smw_fpt_mdat\";s:32:\"b0092695bdd6740937251fdfeba2c57d\";}'),(141,14,'Semantic_Result_Formats_examples','','','Semantic Result Formats examples','a:3:{s:11:\"smw_fpt_ask\";s:32:\"bf5f2b134b66df03d1d5919583b882d7\";s:12:\"smw_fpt_subc\";s:32:\"46026a4d0a7670cf268989f66bd991fb\";s:12:\"smw_fpt_mdat\";s:32:\"d84d1466228b34a1c1802b02e60e9a10\";}'),(142,14,'Semantic_Result_Formats_examples','','_QUERYde0f9891670f93e532eae600b77b58e0','Semantic Result Formats examples','a:4:{s:13:\"smw_fpt_askde\";s:32:\"dc9f1c20727defee184e8552384f826b\";s:13:\"smw_fpt_asksi\";s:32:\"859c39a268d4e8d6f1b6a8e4ff94d3c8\";s:13:\"smw_fpt_askfo\";s:32:\"c0e9e9b004f913d0bd7c545a04ba5749\";s:13:\"smw_fpt_askst\";s:32:\"bd31ce9aba7184efe01599e76231f9a1\";}'),(143,14,'Maps_examples','','','Maps examples','a:3:{s:11:\"smw_fpt_ask\";s:32:\"2e151315488a59f12c1d4291f19c4ff1\";s:12:\"smw_fpt_subc\";s:32:\"8b6f00dfd3be52908096accb28754b48\";s:12:\"smw_fpt_mdat\";s:32:\"ceb5c29bc28d73dde38ed187cc35f9b9\";}'),(144,14,'Maps_examples','','_QUERY61ce26c38144dbfb9295b0ddb4ce7159','Maps examples','a:4:{s:13:\"smw_fpt_askde\";s:32:\"dba5eae2e8e8b80ec8d8ba4c18fda7c7\";s:13:\"smw_fpt_asksi\";s:32:\"cdbcd9a68287292e02d348f3175ba8aa\";s:13:\"smw_fpt_askfo\";s:32:\"474ab25d28357d37652bfda9c5bd5617\";s:13:\"smw_fpt_askst\";s:32:\"d433f3018d0b471c8490ddffb4d311a4\";}'),(145,14,'Maps_examples','','_QUERYe4b16b53da3528a1b2115ca87ff2d748','Maps examples','a:4:{s:13:\"smw_fpt_askde\";s:32:\"db2ef5f8bcf5be9cecf5edb3fb2fc623\";s:13:\"smw_fpt_asksi\";s:32:\"212a9f5aad54463955c2e653137c4a3a\";s:13:\"smw_fpt_askfo\";s:32:\"e6a37e3bd1b9177cfc985936c6ef2322\";s:13:\"smw_fpt_askst\";s:32:\"3db7baf94ce31b99960a3af4584cff3e\";}'),(146,14,'Maps_examples','','_QUERYa065f48eb666e9da6c29c342870a1c15','Maps examples','a:4:{s:13:\"smw_fpt_askde\";s:32:\"bbb7a3845f428ae709f9691f2a1fb090\";s:13:\"smw_fpt_asksi\";s:32:\"e6c8f0bee2fe8eab1dfc0ddc55bcb507\";s:13:\"smw_fpt_askfo\";s:32:\"e1c52454e3ce1fe1268b409ae84ccc11\";s:13:\"smw_fpt_askst\";s:32:\"aa6912a8a10fed3553c0440593812b47\";}'),(147,14,'Maps_examples','','_QUERY064db26232cf17c924d2820287344fb0','Maps examples','a:4:{s:13:\"smw_fpt_askde\";s:32:\"221f23b1237623d65adad2c04dd97fef\";s:13:\"smw_fpt_asksi\";s:32:\"d33141d49fa1c13d43b7dbc9b3c13649\";s:13:\"smw_fpt_askfo\";s:32:\"0536c4b929edae312bb49f4a86c2ea0e\";s:13:\"smw_fpt_askst\";s:32:\"5b8a0966bbe8d03207df9e5105e7e0d7\";}'),(148,14,'Maps_examples','','_QUERY26d1f7d853fe598374edf485f20fbbc5','Maps examples','a:4:{s:13:\"smw_fpt_askde\";s:32:\"991f61a27d3b88fb2e224c59f71bf20e\";s:13:\"smw_fpt_asksi\";s:32:\"2d6a6bed3769d7d1a4ea99871908d663\";s:13:\"smw_fpt_askfo\";s:32:\"d2d117f7f26037204add55e56b90a859\";s:13:\"smw_fpt_askst\";s:32:\"274f22160b643d74083304a849315c0e\";}'),(149,14,'Maps','','','Maps',NULL),(150,14,'Semantic_Forms_examples','','','Semantic Forms examples','a:2:{s:12:\"smw_fpt_subc\";s:32:\"e42d4b2f6bc280da092388194932a5e6\";s:12:\"smw_fpt_mdat\";s:32:\"de2150bb78c217e921274d0c0e47abac\";}'),(151,14,'Parserhook_examples','','','Parserhook examples','a:2:{s:12:\"smw_fpt_subc\";s:32:\"bb34cd1ab85eb70d07c94dfaede6d7ae\";s:12:\"smw_fpt_mdat\";s:32:\"b6a8d2fe6f63b5eea2c34ca3ae050ed8\";}'),(152,14,'Best_practices','','','Best practices','a:2:{s:12:\"smw_fpt_subc\";s:32:\"182425484d2743e44625f30c88f8d2bd\";s:12:\"smw_fpt_mdat\";s:32:\"20979356ecad00f39c21cc54c11504a5\";}'),(153,14,'Example_data','','','Example data','a:2:{s:12:\"smw_fpt_subc\";s:32:\"d3a3c247493e3207bd065855b01413ea\";s:12:\"smw_fpt_mdat\";s:32:\"b63d2ddd8dadd23c955b398555f074db\";}'),(154,14,'Template_examples','','','Template examples','a:2:{s:12:\"smw_fpt_subc\";s:32:\"16359191426980616df857a30f5132c8\";s:12:\"smw_fpt_mdat\";s:32:\"70a1bdf7e9ebbe7e94d9e69ed26920a0\";}'),(155,0,'Examples/Different_link_parameter_options','','','Examples/Different link parameter options','a:4:{s:15:\"smw_di_wikipage\";s:32:\"3a8d9df6416a59ad40cd328d0c7c4b71\";s:11:\"smw_fpt_ask\";s:32:\"f58aeee5d5aa43545539e9a800e8be4e\";s:12:\"smw_fpt_inst\";s:32:\"c4f672fa2c7aa9e198dc596e8e956c67\";s:12:\"smw_fpt_mdat\";s:32:\"6e2d1c37815bbdcd72081e3a56bc0254\";}'),(156,0,'Examples/Different_link_parameter_options','','_QUERY82fd5686e9bbc020c2f82261a6fc12ed','Examples/Different link parameter options','a:4:{s:13:\"smw_fpt_askde\";s:32:\"c7ba09feb1b8ba525ff34663e1489483\";s:13:\"smw_fpt_asksi\";s:32:\"0e0404bb349f42c98bcbd8c7ac0ca301\";s:13:\"smw_fpt_askfo\";s:32:\"3c9776b24ad308cae47b4b892c0415a5\";s:13:\"smw_fpt_askst\";s:32:\"61d565a492b773649bd3e09057b8153d\";}'),(157,2,'Yury_Katkov/test_page_for_newtocru','','','Yury Katkov/test page for newtocru','a:3:{s:15:\"smw_di_wikipage\";s:32:\"e65cd97802dfe21324d7aa2eb204eb38\";s:12:\"smw_fpt_inst\";s:32:\"e735d06fc46dfd629e84f9bad6800ae3\";s:12:\"smw_fpt_mdat\";s:32:\"8dacfc9c89b385e3f98e998dd0182ea2\";}'),(158,0,'Examples/Join_data_from_two_pages_into_one_table','','','Examples/Join data from two pages into one table','a:4:{s:15:\"smw_di_wikipage\";s:32:\"c1e55f107ec4e24fd6f904b9a69d0525\";s:11:\"smw_fpt_ask\";s:32:\"493acf5ff69df89d02a1354b64fe7bba\";s:12:\"smw_fpt_inst\";s:32:\"624417fb0c92bafb127227d58456ec57\";s:12:\"smw_fpt_mdat\";s:32:\"8187b229ff6f90d174ac3c1b413e96ab\";}'),(159,0,'Examples/Join_data_from_two_pages_into_one_table','','_QUERY27cc6888e421f4814db57ad61e9cf3c7','Examples/Join data from two pages into one table','a:4:{s:13:\"smw_fpt_askde\";s:32:\"395b22a267b321f187e01b113153e43c\";s:13:\"smw_fpt_asksi\";s:32:\"395b22a267b321f187e01b113153e43c\";s:13:\"smw_fpt_askfo\";s:32:\"fc38bf04abd75c12ac89ad91e296c85a\";s:13:\"smw_fpt_askst\";s:32:\"1dd612fa7a5c120d267038b0b3362e83\";}'),(160,0,'Examples/Parser/Set_using_a_template_parameter','','','Examples/Parser/Set using a template parameter','a:4:{s:15:\"smw_di_wikipage\";s:32:\"8285834930c9100cf0a321ef683f5d6b\";s:11:\"smw_fpt_ask\";s:32:\"0b2752f3e822e5ec74425138b6608990\";s:12:\"smw_fpt_inst\";s:32:\"122ee612961ca4e197d83eb428ff51ac\";s:12:\"smw_fpt_mdat\";s:32:\"bec8b8c65dedd5155dc40f105cf3a7ff\";}'),(161,0,'Examples/Parser/Text_that_includes_other_annotations','','','Examples/Parser/Text that includes other annotations','a:4:{s:15:\"smw_di_wikipage\";s:32:\"dd0c170eb58ca1ab5147b3e1c640a118\";s:11:\"smw_fpt_ask\";s:32:\"1bcd22fd87ecfca0df52e294c11a872a\";s:12:\"smw_fpt_inst\";s:32:\"27283fdc4839b8bc2ed6640d2a2e303f\";s:12:\"smw_fpt_mdat\";s:32:\"4a743caf8a1d6513ff91cc7a6a567fd8\";}'),(162,10,'HIDE_CAT_PREFIX','','','HIDE CAT PREFIX',NULL),(163,10,'Demo/Help','','','Demo/Help',NULL),(164,10,'·','','','·',NULL),(165,10,'Foot','','','Foot',NULL),(166,10,'Maps_examples_body','','','Maps examples body',NULL),(167,10,'Maps_examples_head','','','Maps examples head',NULL),(168,10,'TOC','','','TOC',NULL),(169,10,'Example','','','Example',NULL),(170,10,'LinkToAskQueryFromSetParserParameters','','','LinkToAskQueryFromSetParserParameters',NULL),(171,10,'SMW_user_TOC_(ru)','','','SMW user TOC (ru)',NULL),(172,10,'TOC-level','','','TOC-level',NULL),(173,10,'Footer','','','Footer',NULL),(174,10,'PKaValueTemplate','','','PKaValueTemplate',NULL),(175,10,'PKaValueTemplateHeader','','','PKaValueTemplateHeader',NULL),(176,10,'TableFooter','','','TableFooter',NULL),(177,10,'InTextAnnotationDescriptionExample','','','InTextAnnotationDescriptionExample',NULL),(178,10,'SetValue','','','SetValue',NULL),(179,14,'Pages_with_broken_file_links','','','Pages with broken file links',NULL),(180,102,'Covers_extension','','','Covers extension',NULL),(181,0,'Semantic_MediaWiki','','','Semantic MediaWiki',NULL),(182,102,'Has_keyword','','','Has keyword',NULL),(183,0,'Set_parser','','','Set parser',NULL),(184,0,'Template_usage','','','Template usage',NULL),(185,0,'Examples/Parser/Set_using_a_template_parameter',':smw-delete','set','Examples/Parser/Set using a template parameter',NULL),(186,102,'Setting_language','','','Setting language',NULL),(187,0,'En','','','En',NULL),(188,0,'Examples/Parser/Set_using_a_template_parameter','','_QUERY37b9461291410445648681b62d02612a','Examples/Parser/Set using a template parameter','a:4:{s:13:\"smw_fpt_askde\";s:32:\"1ba76fadd6cdfc5fe0c2965b133645ae\";s:13:\"smw_fpt_asksi\";s:32:\"3e26ffef8052a49d83ebd256682d6607\";s:13:\"smw_fpt_askfo\";s:32:\"5a40e8bd584afd9abdf35ad8a15f2c94\";s:13:\"smw_fpt_askst\";s:32:\"4329fb75329bdefe1073069bf6f370a8\";}'),(189,0,'Examples/Parser/Set_using_a_template_parameter','','_QUERY4fb1e19e56149a99187571878c318e67','Examples/Parser/Set using a template parameter','a:4:{s:13:\"smw_fpt_askde\";s:32:\"18c001ca8a7fdf523590f74e8df416db\";s:13:\"smw_fpt_asksi\";s:32:\"715e3c853fa31c2a04e89b6a61396139\";s:13:\"smw_fpt_askfo\";s:32:\"2d94497f974af4b122e5a12244e25ba0\";s:13:\"smw_fpt_askst\";s:32:\"a7935448f178d8b62c8a8874d7c97ae7\";}'),(190,0,'Examples/Parser/Set_using_a_template_parameter','','_QUERY4ec787fa537f408932ca54c84670b524','Examples/Parser/Set using a template parameter','a:4:{s:13:\"smw_fpt_askde\";s:32:\"1b0a02e9813fdb36d7847b58194a7d2d\";s:13:\"smw_fpt_asksi\";s:32:\"1b0a02e9813fdb36d7847b58194a7d2d\";s:13:\"smw_fpt_askfo\";s:32:\"8089619c9bb61fbaee13fbee3145bc47\";s:13:\"smw_fpt_askst\";s:32:\"128d4abdc2f2dd9e92f03de3ff330bc2\";}'),(191,102,'Has_description','','','Has description',NULL),(192,102,'__sbl_parentpage','','','Has parent page',NULL),(193,0,'Parser_examples','','','Parser examples',NULL),(194,0,'Examples','','','Examples',NULL),(195,0,'Example_that_shows_how_to_join_data_from_two_pages_into_one_table','','','Example that shows how to join data from two pages into one table',NULL),(196,0,'Table_output','','','Table output',NULL),(197,0,'Template_query','','','Template query',NULL),(198,0,'Template_format','','','Template format',NULL),(199,0,'Examples/Join_data_from_two_pages_into_one_table','','_QUERYf545e80ed9a71158f0b20abd54ffe234','Examples/Join data from two pages into one table','a:4:{s:13:\"smw_fpt_askde\";s:32:\"c07e9809f814a286375d024dac982e57\";s:13:\"smw_fpt_asksi\";s:32:\"c6105df148c91a64d61901d70a6ed056\";s:13:\"smw_fpt_askfo\";s:32:\"f21f2fca4bfdcedacd5886ff62bbecfb\";s:13:\"smw_fpt_askst\";s:32:\"2c167b6208b0b4f40c7849f684fa869d\";}'),(200,0,'Examples/Join_data_from_two_pages_into_one_table','','_QUERYba9a0dd7cd7af85a137995acdb9b1b0e','Examples/Join data from two pages into one table','a:4:{s:13:\"smw_fpt_askde\";s:32:\"be3a7d3202ebcf42351e33675b03b4df\";s:13:\"smw_fpt_asksi\";s:32:\"0595c5534d88cd36a0311cad9f28f897\";s:13:\"smw_fpt_askfo\";s:32:\"3dd7a50fd7d18d3b3fec1d595e342239\";s:13:\"smw_fpt_askst\";s:32:\"9effa66b2d6fd62cb52cd5a2685703c5\";}'),(201,0,'Examples/Join_data_from_two_pages_into_one_table','','_QUERY1b4058b9027c336e246d2fed52629319','Examples/Join data from two pages into one table','a:4:{s:13:\"smw_fpt_askde\";s:32:\"c2b441de2fde5428ce5cc76df8035b58\";s:13:\"smw_fpt_asksi\";s:32:\"4f21ca329c614171679197f332c31f30\";s:13:\"smw_fpt_askfo\";s:32:\"b3f373677ab96c3bacbe8bbdd697caac\";s:13:\"smw_fpt_askst\";s:32:\"367259314d6da9b86c95526a013271e2\";}'),(202,0,'Query_examples','','','Query examples',NULL),(203,0,'Inline_queries_offer_many_different_parameters_to_control_printout_statements._This_help_page_demonstrates_the_usage_of_the_different_\'\'\'options_to_the_link_parameter\'\'\'.','','','Inline queries offer many different parameters to control printout statements. This help page demonstrates the usage of the different \'\'\'options to the link parameter\'\'\'.',NULL),(204,0,'Inline_queries','','','Inline queries',NULL),(205,0,'Examples/Different_link_parameter_options','','_QUERYfe497f7e2200e2dbf2949c7dcab755d4','Examples/Different link parameter options','a:4:{s:13:\"smw_fpt_askde\";s:32:\"7df2d236b1a78543d5c18bf52c6f5edd\";s:13:\"smw_fpt_asksi\";s:32:\"998106e0beb50f3d49c53e8574830d12\";s:13:\"smw_fpt_askfo\";s:32:\"ef48eb5a24a24b8db01668fa71306fe5\";s:13:\"smw_fpt_askst\";s:32:\"1c779ca14d83c8c267dd638b7e81f27f\";}'),(206,0,'Examples/Different_link_parameter_options','','_QUERYf545e80ed9a71158f0b20abd54ffe234','Examples/Different link parameter options','a:4:{s:13:\"smw_fpt_askde\";s:32:\"984e25b2b4af77b6bcb5e38d9f785f76\";s:13:\"smw_fpt_asksi\";s:32:\"5c20931c40f7540a14820b8726cea813\";s:13:\"smw_fpt_askfo\";s:32:\"e116d251dbd45f63756505f960fcc1e8\";s:13:\"smw_fpt_askst\";s:32:\"b75258516631a45bdad27a70bc58a974\";}'),(207,0,'Queries','','','Queries',NULL),(208,0,'Examples/Parser/Text_that_includes_other_annotations',':smw-delete','set','Examples/Parser/Text that includes other annotations',NULL),(209,0,'In-text_annotation','','','In-text annotation',NULL),(210,0,'Vestibulum','','','Vestibulum',NULL),(211,0,'Vivamus','','','Vivamus',NULL),(212,102,'Has_page_link_to','','','Has page link to',NULL),(213,0,'Pellentesque_augue','','','Pellentesque augue',NULL),(214,0,'Examples/Parser/Text_that_includes_other_annotations','','_QUERY37b9461291410445648681b62d02612a','Examples/Parser/Text that includes other annotations','a:4:{s:13:\"smw_fpt_askde\";s:32:\"795b26bec6ff471c85ef45d7ad2a0828\";s:13:\"smw_fpt_asksi\";s:32:\"4fb35cf753e15d9c3b4390cb7f8f9399\";s:13:\"smw_fpt_askfo\";s:32:\"4fb490b4f92ebfead94c9e520749b78e\";s:13:\"smw_fpt_askst\";s:32:\"132e4d40af9a4f6f2a0b6d0e920a040b\";}'),(215,0,'Examples/Parser/Text_that_includes_other_annotations','','_QUERY4fb1e19e56149a99187571878c318e67','Examples/Parser/Text that includes other annotations','a:4:{s:13:\"smw_fpt_askde\";s:32:\"fb1076258f052aa3878efcdd6188139f\";s:13:\"smw_fpt_asksi\";s:32:\"609f88e35bd35991bf0ff528bc495e5c\";s:13:\"smw_fpt_askfo\";s:32:\"014c0e872030269809d3f028a0dd2f2f\";s:13:\"smw_fpt_askst\";s:32:\"7a479fc81988de4e12969d6275ad348b\";}'),(216,0,'Examples/Parser/Text_that_includes_other_annotations','','_QUERY4ec787fa537f408932ca54c84670b524','Examples/Parser/Text that includes other annotations','a:4:{s:13:\"smw_fpt_askde\";s:32:\"942945205e3fc49fe72cd927d81f7eb3\";s:13:\"smw_fpt_asksi\";s:32:\"942945205e3fc49fe72cd927d81f7eb3\";s:13:\"smw_fpt_askfo\";s:32:\"d5034e139c197b8915b0a33132bf602d\";s:13:\"smw_fpt_askst\";s:32:\"7711453d026ea2149d1617d80c9653c5\";}'),(217,0,'Examples/Parser/Text_that_includes_other_annotations','','_QUERY12be5c3b17759234c93effd9f248a964','Examples/Parser/Text that includes other annotations','a:4:{s:13:\"smw_fpt_askde\";s:32:\"fc71df83c26c29fdd50799662b985453\";s:13:\"smw_fpt_asksi\";s:32:\"cc25281f877058def387149c626a836a\";s:13:\"smw_fpt_askfo\";s:32:\"7e5af7380d1e4813931aae826bc1750e\";s:13:\"smw_fpt_askst\";s:32:\"f8c1595e23fa6a53b3931a54ecb733f8\";}'),(218,14,'Test_01_breadcrumb','','','Test 01 breadcrumb','a:1:{s:12:\"smw_fpt_mdat\";s:32:\"596c1a9f982ab8722680aa25a7edf843\";}'),(219,14,'Test_021_breadcrumb','','','Test 021 breadcrumb','a:2:{s:12:\"smw_fpt_subc\";s:32:\"91c02e2acb14a8c20bb0a67ac153d5aa\";s:12:\"smw_fpt_mdat\";s:32:\"184b6019e1521e8ccca239fc053757a0\";}'),(220,14,'Test_022_breadcrumb','','','Test 022 breadcrumb','a:2:{s:12:\"smw_fpt_subc\";s:32:\"6fed14041e7c4073df04e50297e419e5\";s:12:\"smw_fpt_mdat\";s:32:\"8a9c44e8ab9912c594b02cb7efc698e6\";}'),(221,14,'Test_031_breadcrumb','','','Test 031 breadcrumb','a:2:{s:12:\"smw_fpt_subc\";s:32:\"da5d9607845e219104d806f6fd50dbb4\";s:12:\"smw_fpt_mdat\";s:32:\"45ef3939a03c9bc1df3edaba8188b2a5\";}'),(222,14,'Test_032_breadcrumb','','','Test 032 breadcrumb','a:2:{s:12:\"smw_fpt_subc\";s:32:\"3a24858bc4f67032d196ecf1b6acb3c4\";s:12:\"smw_fpt_mdat\";s:32:\"4ef0fcc25fd6540affb133a72bfc4537\";}'),(223,14,'Test_033_breadcrumb','','','Test 033 breadcrumb','a:2:{s:12:\"smw_fpt_subc\";s:32:\"d1f2ad9603a9f16f7224d876ace2318f\";s:12:\"smw_fpt_mdat\";s:32:\"78e1d3fca78da521ea0e547bef8dfb30\";}'),(224,14,'Test_044_breadcrumb','','','Test 044 breadcrumb','a:2:{s:12:\"smw_fpt_subc\";s:32:\"463be56e539d039646b692fa8613cc62\";s:12:\"smw_fpt_mdat\";s:32:\"34772a65d3388e6e546af39011fbf499\";}'),(225,14,'Test_041_breadcrumb','','','Test 041 breadcrumb','a:2:{s:12:\"smw_fpt_subc\";s:32:\"a0e1cd944a21608814a1c931d0dc10b5\";s:12:\"smw_fpt_mdat\";s:32:\"e00f67b44e52f94424486d103dc92a81\";}'),(226,14,'Test_047_breadcrumb','','','Test 047 breadcrumb','a:2:{s:12:\"smw_fpt_subc\";s:32:\"ab28c6456ec7adb0453bedb1893ff47a\";s:12:\"smw_fpt_mdat\";s:32:\"c32874ae6b2121ec5508743bb5a35600\";}'),(227,14,'Test_034_breadcrumb','','','Test 034 breadcrumb','a:2:{s:12:\"smw_fpt_subc\";s:32:\"932ff9272b53fc893330bba15d22f333\";s:12:\"smw_fpt_mdat\";s:32:\"58c054d09255618b5cfb6b0e77e8bfb3\";}'),(228,14,'Test_042_breadcrumb','','','Test 042 breadcrumb','a:2:{s:12:\"smw_fpt_subc\";s:32:\"fff2ca24ece71433407f4a5bfc8ed12a\";s:12:\"smw_fpt_mdat\";s:32:\"f28f6926cb166d27774eb9e89ecea7ef\";}');
/*!40000 ALTER TABLE `smw_object_ids` ENABLE KEYS */;
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