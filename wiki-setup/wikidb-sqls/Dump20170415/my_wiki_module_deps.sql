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
-- Table structure for table `module_deps`
--

DROP TABLE IF EXISTS `module_deps`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `module_deps` (
  `md_module` varbinary(255) NOT NULL,
  `md_skin` varbinary(32) NOT NULL,
  `md_deps` mediumblob NOT NULL,
  UNIQUE KEY `md_module_skin` (`md_module`,`md_skin`)
) ENGINE=InnoDB DEFAULT CHARSET=binary;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `module_deps`
--

LOCK TABLES `module_deps` WRITE;
/*!40000 ALTER TABLE `module_deps` DISABLE KEYS */;
INSERT INTO `module_deps` VALUES ('ext.jquery.qtip.styles','cologneblue','[\"/var/www/html/mediawiki/extensions/SemanticMediaWiki/res/jquery/#default#VML\"]'),('ext.jquery.qtip.styles','modern','[\"/var/www/html/mediawiki/extensions/SemanticMediaWiki/res/jquery/#default#VML\"]'),('ext.jquery.qtip.styles','monobook','[\"/var/www/html/mediawiki/extensions/SemanticMediaWiki/res/jquery/#default#VML\"]'),('ext.jquery.qtip.styles','vector','[\"/var/www/html/mediawiki/extensions/SemanticMediaWiki/res/jquery/#default#VML\"]'),('mediawiki.icon','vector','[\"/var/www/html/mediawiki/resources/src/mediawiki/mediawiki.icon.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.less/mediawiki.mixins.less\",\"/var/www/html/mediawiki/resources/src/mediawiki/images/arrow-collapsed-ltr.svg\",\"/var/www/html/mediawiki/resources/src/mediawiki/images/arrow-expanded.svg\"]'),('mediawiki.special','vector','[\"/var/www/html/mediawiki/skins/vector/special.less\"]'),('mediawiki.special.preferences','vector','[\"/var/www/html/mediawiki/skins/vector/special.preferences.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.less/mediawiki.mixins.less\",\"/var/www/html/mediawiki/skins/vector/variables.less\",\"/var/www/html/mediawiki/skins/vector/images/preferences/break.png\",\"/var/www/html/mediawiki/skins/vector/images/preferences/fade.png\"]'),('mediawiki.ui','vector','[\"/var/www/html/mediawiki/resources/src/mediawiki.ui/vector.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.ui/components/utilities.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.ui/mixins/utilities.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.ui/components/vector/forms.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.ui/components/default/forms.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.less/mediawiki.mixins.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.ui/mixins/forms.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.ui/settings/colors.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.ui/mixins/type.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.ui/settings/typography.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.ui/components/vector/containers.less\"]'),('mediawiki.ui.button','cologneblue','[\"/var/www/html/mediawiki/resources/src/mediawiki.ui/components/default/buttons.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.less/mediawiki.mixins.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.ui/settings/typography.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.ui/mixins/effects.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.ui/settings/colors.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.ui/mixins/utilities.less\"]'),('mediawiki.ui.button','modern','[\"/var/www/html/mediawiki/resources/src/mediawiki.ui/components/default/buttons.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.less/mediawiki.mixins.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.ui/settings/typography.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.ui/mixins/effects.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.ui/settings/colors.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.ui/mixins/utilities.less\"]'),('mediawiki.ui.button','monobook','[\"/var/www/html/mediawiki/resources/src/mediawiki.ui/components/default/buttons.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.less/mediawiki.mixins.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.ui/settings/typography.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.ui/mixins/effects.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.ui/settings/colors.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.ui/mixins/utilities.less\"]'),('mediawiki.ui.button','vector','[\"/var/www/html/mediawiki/resources/src/mediawiki.ui/components/vector/buttons.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.ui/components/default/buttons.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.less/mediawiki.mixins.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.ui/settings/typography.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.ui/mixins/effects.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.ui/settings/colors.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.ui/mixins/utilities.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.ui/mixins/type.less\"]'),('skins.vector.styles','vector','[\"/var/www/html/mediawiki/skins/vector/screen.less\",\"/var/www/html/mediawiki/skins/vector/variables.less\",\"/var/www/html/mediawiki/skins/vector/components/common.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.less/mediawiki.mixins.less\",\"/var/www/html/mediawiki/skins/vector/components/animations.less\",\"/var/www/html/mediawiki/skins/vector/components/navigation.less\",\"/var/www/html/mediawiki/skins/vector/components/personalMenu.less\",\"/var/www/html/mediawiki/skins/vector/components/collapsibleNav.less\",\"/var/www/html/mediawiki/skins/vector/components/search.less\",\"/var/www/html/mediawiki/skins/vector/components/tabs.less\",\"/var/www/html/mediawiki/skins/vector/components/watchstar.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.less/mediawiki.mixins.rotation.less\",\"/var/www/html/mediawiki/resources/src/mediawiki.less/mediawiki.mixins.animation.less\",\"/var/www/html/mediawiki/skins/vector/components/footer.less\",\"/var/www/html/mediawiki/skins/vector/components/notifications.less\",\"/var/www/html/mediawiki/skins/vector/components/externalLinks.less\",\"/var/www/html/mediawiki/skins/vector/images/bullet-icon.png\",\"/var/www/html/mediawiki/skins/vector/images/user-icon.svg\",\"/var/www/html/mediawiki/skins/vector/images/portal-break.png\",\"/var/www/html/mediawiki/skins/vector/images/arrow-expanded.svg\",\"/var/www/html/mediawiki/skins/vector/images/arrow-collapsed-ltr.svg\",\"/var/www/html/mediawiki/skins/vector/images/search-fade.png\",\"/var/www/html/mediawiki/skins/vector/images/search-ltr.svg\",\"/var/www/html/mediawiki/skins/vector/images/tab-break.png\",\"/var/www/html/mediawiki/skins/vector/images/tab-normal-fade.png\",\"/var/www/html/mediawiki/skins/vector/images/tab-current-fade.png\",\"/var/www/html/mediawiki/skins/vector/images/arrow-down-icon.svg\",\"/var/www/html/mediawiki/skins/vector/images/arrow-down-focus-icon.svg\",\"/var/www/html/mediawiki/skins/vector/images/unwatch-icon.svg\",\"/var/www/html/mediawiki/skins/vector/images/watch-icon.svg\",\"/var/www/html/mediawiki/skins/vector/images/unwatch-icon-hl.svg\",\"/var/www/html/mediawiki/skins/vector/images/watch-icon-hl.svg\",\"/var/www/html/mediawiki/skins/vector/images/watch-icon-loading.svg\",\"/var/www/html/mediawiki/skins/vector/images/external-link-ltr-icon.svg\"]');
/*!40000 ALTER TABLE `module_deps` ENABLE KEYS */;
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
