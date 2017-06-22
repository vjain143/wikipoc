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
-- Table structure for table `msg_resource`
--

DROP TABLE IF EXISTS `msg_resource`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `msg_resource` (
  `mr_resource` varbinary(255) NOT NULL,
  `mr_lang` varbinary(32) NOT NULL,
  `mr_blob` mediumblob NOT NULL,
  `mr_timestamp` binary(14) NOT NULL,
  UNIQUE KEY `mr_resource_lang` (`mr_resource`,`mr_lang`)
) ENGINE=InnoDB DEFAULT CHARSET=binary;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `msg_resource`
--

LOCK TABLES `msg_resource` WRITE;
/*!40000 ALTER TABLE `msg_resource` DISABLE KEYS */;
INSERT INTO `msg_resource` VALUES ('ext.jquery.async','en','{}','20170406070442'),('ext.jquery.qtip','en','{}','20170406070438'),('ext.jquery.qtip.styles','en','{}','20170406070438'),('ext.semanticbreadcrumblinks','en','{}','20170406070438'),('ext.smw','en','{}','20170406070442'),('ext.smw.style','en','{}','20170406070438'),('ext.smw.tooltip','en','{\"smw-ui-tooltip-title-event\":\"Event\",\"smw-ui-tooltip-title-info\":\"Information\",\"smw-ui-tooltip-title-parameter\":\"Parameter\",\"smw-ui-tooltip-title-property\":\"Property\",\"smw-ui-tooltip-title-quantity\":\"Quantity\",\"smw-ui-tooltip-title-service\":\"Service links\",\"smw-ui-tooltip-title-warning\":\"Error\"}','20170406070442'),('ext.smw.tooltip.styles','en','{}','20170406070438'),('ext.smw.tooltips','en','{}','20170406070442'),('jquery.checkboxShiftClick','en','{}','20170406070438'),('jquery.client','en','{}','20170406070438'),('jquery.cookie','en','{}','20170406070438'),('jquery.hidpi','en','{}','20170406070438'),('jquery.highlightText','en','{}','20170406070438'),('jquery.makeCollapsible','en','{\"collapsible-collapse\":\"Collapse\",\"collapsible-expand\":\"Expand\"}','20170406070438'),('jquery.mw-jump','en','{}','20170406070438'),('jquery.mwExtension','en','{}','20170406070438'),('jquery.placeholder','en','{}','20170406070438'),('jquery.suggestions','en','{}','20170406070438'),('jquery.tabIndex','en','{}','20170406070438'),('jquery.throttle-debounce','en','{}','20170406070438'),('mediawiki.action.view.postEdit','en','{\"postedit-confirmation\":\"Your edit was saved.\"}','20170406070442'),('mediawiki.api','en','{}','20170406070438'),('mediawiki.api.watch','en','{}','20170414225008'),('mediawiki.cldr','en','{}','20170406070442'),('mediawiki.hidpi','en','{}','20170406070438'),('mediawiki.htmlform','en','{\"htmlform-chosen-placeholder\":\"Select an option\"}','20170414225643'),('mediawiki.jqueryMsg','en','{}','20170406070442'),('mediawiki.language','en','{}','20170406070442'),('mediawiki.language.data','en','{}','20170406070442'),('mediawiki.language.init','en','{}','20170406070442'),('mediawiki.legacy.ajax','en','{}','20170406070438'),('mediawiki.legacy.wikibits','en','{}','20170406070438'),('mediawiki.libs.pluralruleparser','en','{}','20170406070442'),('mediawiki.notify','en','{}','20170406070438'),('mediawiki.page.ready','en','{}','20170406070438'),('mediawiki.page.startup','en','{}','20170406070438'),('mediawiki.page.watch.ajax','en','{\"tooltip-ca-unwatch\":\"Remove this page from your watchlist\",\"tooltip-ca-watch\":\"Add this page to your watchlist\",\"unwatch\":\"Unwatch\",\"unwatching\":\"Unwatching...\",\"watch\":\"Watch\",\"watcherrortext\":\"An error occurred while changing your watchlist settings for \\\"$1\\\".\",\"watching\":\"Watching...\"}','20170414225008'),('mediawiki.searchSuggest','en','{\"searchsuggest-containing\":\"containing...\",\"searchsuggest-search\":\"Search\"}','20170406070438'),('mediawiki.special.preferences','en','{\"prefs-tabs-navigation-hint\":\"Tip: You can use the left and right arrow keys to navigate between the tabs in the tabs list.\"}','20170414225643'),('mediawiki.special.userlogin.common.js','en','{\"createacct-captcha\":\"Security check\",\"createacct-imgcaptcha-ph\":\"Enter the text you see above\"}','20170414224958'),('mediawiki.toc','en','{\"hidetoc\":\"hide\",\"showtoc\":\"show\"}','20170406070438'),('mediawiki.user','en','{}','20170406070438'),('mediawiki.util','en','{}','20170406070438'),('skins.vector.collapsibleNav','en','{\"vector-collapsiblenav-more\":\"\\u003Cvector-collapsiblenav-more\\u003E\"}','20170406070438'),('skins.vector.js','en','{}','20170406070438'),('user.options','en','{}','20170406070438'),('user.tokens','en','{}','20170406070438');
/*!40000 ALTER TABLE `msg_resource` ENABLE KEYS */;
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
