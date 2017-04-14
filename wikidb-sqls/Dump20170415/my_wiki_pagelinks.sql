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
-- Table structure for table `pagelinks`
--

DROP TABLE IF EXISTS `pagelinks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pagelinks` (
  `pl_from` int(10) unsigned NOT NULL DEFAULT '0',
  `pl_namespace` int(11) NOT NULL DEFAULT '0',
  `pl_title` varbinary(255) NOT NULL DEFAULT '',
  UNIQUE KEY `pl_from` (`pl_from`,`pl_namespace`,`pl_title`),
  UNIQUE KEY `pl_namespace` (`pl_namespace`,`pl_title`,`pl_from`)
) ENGINE=InnoDB DEFAULT CHARSET=binary;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pagelinks`
--

LOCK TABLES `pagelinks` WRITE;
/*!40000 ALTER TABLE `pagelinks` DISABLE KEYS */;
INSERT INTO `pagelinks` VALUES (1,0,'Whata_Link_Here_Direct_Invoke'),(1,0,'Whats_Link_Here_Poc'),(70,0,'W:Special:Whatlinkshere/John_Smith'),(72,0,'Maps_examples'),(72,0,'Semantic_Maps'),(72,0,'Semantic_Maps_examples/Compound_queries'),(72,0,'Semantic_Maps_examples/Customizing_query_maps'),(72,0,'Semantic_Maps_examples/Distance_query'),(72,0,'Semantic_Maps_examples/Force_show_display'),(72,0,'Semantic_Maps_examples/KML_queries'),(72,0,'Semantic_Maps_examples/Mapping_service_(queries)'),(72,0,'Semantic_Maps_examples/Query_by_category'),(72,0,'Semantic_Maps_examples/Query_by_property'),(72,0,'Semantic_Maps_examples/Query_on_category_and_property'),(72,0,'Semantic_Maps_examples/Querying_with_additional_properties'),(72,0,'Semantic_Maps_examples/Using_templates_(queries)'),(72,106,'Location'),(73,12,'Semantic_Result_Formats'),(73,13,'Semantic_Result_Formats'),(74,0,'Maps'),(74,0,'Maps_examples/Coordinates'),(74,0,'Maps_examples/Distance'),(74,0,'Maps_examples/Finddestination'),(74,0,'Maps_examples/Geocode'),(74,0,'Maps_examples/Geodistance'),(74,0,'Maps_examples/Google_Maps_KML'),(74,0,'Maps_examples/Google_Maps_POI'),(74,0,'Maps_examples/Google_Maps_auto_open_info_windows'),(74,0,'Maps_examples/Google_Maps_controls'),(74,0,'Maps_examples/Google_Maps_direct_link'),(74,0,'Maps_examples/Google_Maps_fusion_tables'),(74,0,'Maps_examples/Google_Maps_ground_overlays'),(74,0,'Maps_examples/Google_Maps_inline_label'),(74,0,'Maps_examples/Google_Maps_layer_map'),(74,0,'Maps_examples/Google_Maps_marker_clustering'),(74,0,'Maps_examples/Google_Maps_marker_icons'),(74,0,'Maps_examples/Google_Maps_marker_title_and_description'),(74,0,'Maps_examples/Google_Maps_polygons_on_hover'),(74,0,'Maps_examples/Google_Maps_searchmarkers'),(74,0,'Maps_examples/Google_Maps_shapes'),(74,0,'Maps_examples/Google_Maps_small_map'),(74,0,'Maps_examples/Google_Maps_tag_and_autoinfowindows'),(74,0,'Maps_examples/Google_Maps_type_control_styles'),(74,0,'Maps_examples/Google_Maps_visited_icon'),(74,0,'Maps_examples/Google_Maps_zoom_control_styles'),(74,0,'Maps_examples/Map_properties'),(74,0,'Maps_examples/OpenLayers_Maps_controls'),(74,0,'Maps_examples/OpenLayers_custom_base_layers'),(74,0,'Maps_examples/OpenLayers_direct_link'),(74,0,'Maps_examples/OpenLayers_polygons_on_hover'),(74,0,'Maps_examples/OpenLayers_searchmarkers'),(74,0,'Maps_examples/OpenLayers_shapes'),(74,0,'Maps_examples/OpenLayers_visited_icon'),(74,0,'Maps_examples/Point_specific_data'),(74,0,'Maps_examples/Using_templates'),(74,0,'Semantic_Maps'),(77,12,'Portal'),(77,13,'Portal'),(80,0,'Inline_queries_offer_many_different_parameters_to_control_printout_statements._This_help_page_demonstrates_the_usage_of_the_different_\'\'\'options_to_the_link_parameter\'\'\'.'),(80,0,'Semantic_MediaWiki'),(80,12,'Inline_queries'),(81,0,'Meta:Help:Parser_function'),(81,0,'Semantic_MediaWiki'),(81,12,'Administrator_manual'),(81,12,'Custom_units'),(81,12,'Displaying_information'),(81,12,'Properties_and_types'),(81,12,'RDF_export'),(81,12,'Reuse'),(81,12,'Selecting_pages'),(81,12,'Semantic_Web'),(81,12,'Semantic_templates'),(81,12,'Service_links'),(81,12,'Special:Browse'),(81,12,'Введение_в_Semantic_MediaWiki'),(81,12,'Внешние_инструменты'),(81,12,'Встраиваемые_запросы'),(81,12,'Выборка_страниц'),(81,12,'Единицы_измерения'),(81,12,'Импорт_словарей'),(81,12,'Интерфейсы_навигации'),(81,12,'Концепты'),(81,12,'Логический_вывод'),(81,12,'Обратные_свойства'),(81,12,'Отображение_информации'),(81,12,'Редактирование'),(81,12,'Руководство_администратора'),(81,12,'Руководство_пользователя'),(81,12,'Свойства_и_типы'),(81,12,'Семантическая_паутина'),(81,12,'Семантические_шаблоны'),(81,12,'Семантический_поиск'),(81,12,'Сервисные_ссылки'),(81,12,'Служебная:Ask'),(81,12,'Служебная:Навигация'),(81,12,'Специальные_свойства'),(81,12,'Строгие_компараторы'),(81,12,'Форматы_вывода'),(81,12,'Экспорт_RDF'),(82,0,'Example_that_shows_how_to_join_data_from_two_pages_into_one_table'),(82,0,'Semantic_MediaWiki'),(82,10,'PKaValueTemplate'),(82,10,'PKaValueTemplateHeader'),(82,10,'TableFooter'),(82,12,'Join_data_from_two_pages_into_one_table'),(83,0,'SMW_2.2'),(83,0,'Semantic_MediaWiki'),(83,10,'SetToUseTemplateForAskQuery'),(83,12,'Inline_queries'),(83,12,'Setting_values'),(84,0,'Pellentesque_augue'),(84,0,'Semantic_MediaWiki'),(84,0,'Vestibulum'),(84,0,'Vivamus'),(86,12,'Portal'),(86,13,'Portal'),(92,0,'Semantic_MediaWiki'),(94,0,'Semantic_MediaWiki'),(94,12,'Administrator_manual'),(94,12,'Custom_units'),(94,12,'Properties_and_types'),(94,12,'RDF_export'),(94,12,'Reuse'),(94,12,'Semantic_Web'),(94,12,'Semantic_templates'),(94,12,'Service_links'),(94,12,'Special:Browse'),(94,12,'Введение_в_Semantic_MediaWiki'),(94,12,'Внешние_инструменты'),(94,12,'Встраиваемые_запросы'),(94,12,'Выборка_страниц'),(94,12,'Единицы_измерения'),(94,12,'Импорт_словарей'),(94,12,'Интерфейсы_навигации'),(94,12,'Концепты'),(94,12,'Логический_вывод'),(94,12,'Обратные_свойства'),(94,12,'Отображение_информации'),(94,12,'Редактирование'),(94,12,'Руководство_администратора'),(94,12,'Руководство_пользователя'),(94,12,'Свойства_и_типы'),(94,12,'Семантическая_паутина'),(94,12,'Семантические_шаблоны'),(94,12,'Семантический_поиск'),(94,12,'Сервисные_ссылки'),(94,12,'Служебная:Ask'),(94,12,'Служебная:Навигация'),(94,12,'Специальные_свойства'),(94,12,'Строгие_компараторы'),(94,12,'Форматы_вывода'),(94,12,'Экспорт_RDF'),(96,10,'TableFooter'),(97,14,'Chemical_component'),(98,14,'Chemical_component');
/*!40000 ALTER TABLE `pagelinks` ENABLE KEYS */;
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
