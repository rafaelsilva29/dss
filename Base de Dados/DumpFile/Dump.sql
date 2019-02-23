CREATE DATABASE  IF NOT EXISTS `configuraFacil_DB` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `configuraFacil_DB`;
-- MySQL dump 10.13  Distrib 8.0.13, for macos10.14 (x86_64)
--
-- Host: 127.0.0.1    Database: configuraFacil_DB
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Admin`
--

DROP TABLE IF EXISTS `Admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Admin` (
  `idAdmin` int(11) NOT NULL AUTO_INCREMENT,
  `Email` varchar(45) DEFAULT NULL,
  `Username` varchar(45) NOT NULL,
  PRIMARY KEY (`idAdmin`,`Username`),
  KEY `fk_Admin_Users1_idx` (`Username`),
  CONSTRAINT `fk_Admin_Users1` FOREIGN KEY (`Username`) REFERENCES `users` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Admin`
--

LOCK TABLES `Admin` WRITE;
/*!40000 ALTER TABLE `Admin` DISABLE KEYS */;
INSERT INTO `Admin` VALUES (3,'ruicosta@gmail.com','Rui'),(4,'admin@gmail.com','admin');
/*!40000 ALTER TABLE `Admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Car`
--

DROP TABLE IF EXISTS `Car`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Car` (
  `idCar` int(11) NOT NULL AUTO_INCREMENT,
  `Brand` varchar(45) NOT NULL,
  `Model` varchar(45) NOT NULL,
  PRIMARY KEY (`idCar`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Car`
--

LOCK TABLES `Car` WRITE;
/*!40000 ALTER TABLE `Car` DISABLE KEYS */;
/*!40000 ALTER TABLE `Car` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Client`
--

DROP TABLE IF EXISTS `Client`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Client` (
  `NIF` varchar(45) NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Address` varchar(45) NOT NULL,
  `Phone` varchar(45) NOT NULL,
  PRIMARY KEY (`NIF`),
  UNIQUE KEY `NIF_UNIQUE` (`NIF`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Client`
--

LOCK TABLES `Client` WRITE;
/*!40000 ALTER TABLE `Client` DISABLE KEYS */;
INSERT INTO `Client` VALUES ('104334851','Nicolau Mister Natalicio','Polo Norte','963219875'),('104374851','Lucas Salvador Rocha','Aveiro','912318746'),('225367297','Joao Miguel Palmeira','Palmeira','912897656'),('260858575','Ruca Frederico Costa','Algarve','932134565'),('260859575','Alfredo Rodolfo Costa','Porto','932187456'),('275712192','Jose Ramos','Braga','961234565'),('291111300','Miguel Tiago Martins','Lisboa','912345432'),('298257513','Rafael Machado Silva','Chaves','923456754');
/*!40000 ALTER TABLE `Client` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CompCar`
--

DROP TABLE IF EXISTS `CompCar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `CompCar` (
  `idComponent` int(11) NOT NULL,
  `idCar` int(11) NOT NULL,
  PRIMARY KEY (`idComponent`,`idCar`),
  KEY `fk_Component_has_Car_Car1_idx` (`idCar`),
  KEY `fk_Component_has_Car_Component1_idx` (`idComponent`),
  CONSTRAINT `fk_Component_has_Car_Car1` FOREIGN KEY (`idCar`) REFERENCES `car` (`idcar`),
  CONSTRAINT `fk_Component_has_Car_Component1` FOREIGN KEY (`idComponent`) REFERENCES `component` (`idcomponent`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CompCar`
--

LOCK TABLES `CompCar` WRITE;
/*!40000 ALTER TABLE `CompCar` DISABLE KEYS */;
/*!40000 ALTER TABLE `CompCar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Component`
--

DROP TABLE IF EXISTS `Component`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Component` (
  `idComponent` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) NOT NULL,
  `Price` double NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Description` text NOT NULL,
  `Type` int(11) NOT NULL,
  `Compatibility` varchar(45) NOT NULL,
  PRIMARY KEY (`idComponent`)
) ENGINE=InnoDB AUTO_INCREMENT=189 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Component`
--

LOCK TABLES `Component` WRITE;
/*!40000 ALTER TABLE `Component` DISABLE KEYS */;
INSERT INTO `Component` VALUES (1,'BBS Super RS',500,10,'17\'',1,'BMW'),(2,'BBS FL',450,10,'16\'',1,'Mini'),(3,'BBS SV',700,10,'19\'',1,'RollsRoyce'),(4,'BSS GS',600,10,'14\'',1,'BMW'),(5,'BSS GT',900,10,'20\'',1,'Mini'),(6,'BSS HH',675,10,'13\'',1,'RollsRoyce'),(7,'BSS GS2',659,10,'14\'',1,'BMW'),(8,'BSS GTT',1900,10,'20\'',1,'Mini'),(9,'BSS HHUltra',675,10,'15\'',1,'RollsRoyce'),(10,'BSS GSuper',640,10,'14\'',1,'BMW'),(11,'BSS GTuga',3000,10,'19\'',1,'Mini'),(12,'BSS HOH',570,10,'12\'',1,'RollsRoyce'),(13,'BSS RH',565,10,'14\'',1,'RollsRoyce'),(14,'BSS RHR',670,10,'11\'',1,'RollsRoyce'),(15,'BSS RoHaR',1070,10,'22\'',1,'BMW'),(16,'3500cc petrol',3700,10,'Turbo, 350HP',2,'BMW'),(17,'1600cc diesel',1600,10,'Turbo, 110',2,'Mini'),(18,'5000cc petrol',7000,10,'Turbo, 500HP',2,'RollsRoyce'),(19,'200cc petrol',2000,10,'Turbo, 50HP',2,'BMW'),(20,'2000cc petrol',4099,10,'Turbo, 350',2,'Mini'),(21,'3500cc petrol',2700,10,'Turbo, 720HP',2,'RollsRoyce'),(22,'230cc petrol',2300,10,'Turbo, 50PP',2,'BMW'),(23,'2000cc diesel',4500,10,'Turbo, 350L',2,'Mini'),(24,'3500cc petrol',2500,10,'Turbo, 420HP',2,'RollsRoyce'),(25,'3500cc diesel',3300,10,'Turbo, 500HP2',2,'BMW'),(26,'400cc diesel',7000,10,'Turbo, 3003',2,'Mini'),(27,'2700cc diesel',2300,10,'Turbo, 750HP',2,'RollsRoyce'),(28,'Pioneer FH',200,10,'LCD, Bluetooth',3,'BMW'),(29,'Pioneer DEH',100,10,'Bluetooth',3,'Mini'),(30,'Pioneer SPH',500,10,'LCD, CarPlay, Bluetooth',3,'RollsRoyce'),(31,'Pioneer FuHma',230,10,'Bluetooth',3,'BMW'),(32,'Pioneer SPDV1',300,10,'Bluetooth',3,'Mini'),(33,'Pioneer HLO',250,10,'Bluetooth',3,'RollsRoyce'),(34,'Pioneer FuHV2',330,10,'LCD, Bluetooth',3,'BMW'),(35,'Pioneer SPDNV2',400,10,'LCD, Bluetooth',3,'Mini'),(36,'Pioneer HLO2',350,10,'LCD, Bluetooth',3,'RollsRoyce'),(37,'Pioneer FuHV3',430,10,'LCD, CarPlay, Bluetooth',3,'BMW'),(38,'Pioneer SPaDa',500,10,'LCD, CarPlay, Bluetooth',3,'Mini'),(39,'Pioneer HiLO2',450,10,'LCD, CarPlay, Bluetooth',3,'RollsRoyce'),(40,'Comfort Seats',600,10,'Leather with red stitching',4,'BMW'),(41,'Casual Seats',500,10,'Fabric with grey stitching',4,'BMW'),(42,'Economic Seats',250,10,'Fabric with grey stitching',4,'BMW'),(43,'Sport Seats',500,10,'Fabric with grey stitching',4,'BMW'),(44,'Luxury Seats',800,10,'Alcantara with handmade white stitching',4,'BMW'),(45,'Comfort Seats',650,10,'Leather with red stitching',4,'Mini'),(46,'Casual Seats',550,10,'Fabric with grey stitching',4,'Mini'),(47,'Economic Seats',250,10,'Fabric with grey stitching',4,'Mini'),(48,'Sport Seats',500,10,'Fabric with grey stitching',4,'Mini'),(49,'Luxury Seats',900,10,'Alcantara with handmade yellow stitching',4,'Mini'),(50,'Racing Seats',800,10,'Alcantara with handmade yellow stitching and driving confort',4,'Mini'),(51,'Movie Seats',1000,10,'Casual seats with ejection pack instaled',4,'Mini'),(52,'Comfort Seats',500,10,'Leather with red stitching',4,'RollsRoyce'),(53,'Casual Seats',400,10,'Fabric with grey stitching',4,'RollsRoyce'),(54,'Economic Seats',250,10,'Fabric with grey stitching',4,'RoolsRoyce'),(55,'Sport Seats',700,10,'Fabric with grey stitching',4,'RoolsRoyce'),(56,'Luxury Seats',1500,10,'Alcantara with handmade white stitching',4,'RollsRoyce'),(57,'Luxury Premium Edition Seats',2500,10,'Alcantara with handmade gold stitching',4,'RollsRoyce'),(58,'Garmin zumo',400,10,'10m accuracy',5,'BMW'),(59,'Garmin drive 51',200,10,'20m accuracy',5,'Mini'),(60,'Garmin GPSMAP',700,10,'2m accuracy',5,'RollsRoyce'),(61,'Garmin zumo BMW Edition',420,10,'10m accuracy',5,'BMW'),(62,'RoadHelper 200',250,10,'20m accuracy',5,'BMW'),(63,'Garmin T233',100,10,'2m accuracy',5,'BMW'),(64,'Garmin zumo Mini Edition',450,10,'10m accuracy',5,'Mini'),(65,'Nuevo Camino',300,10,'20m accuracy',5,'Mini'),(66,'Mini Motorsport GPS',900,10,'2m accuracy',5,'Mini'),(67,'Garmin zumo RollsRoyce Edition',410,10,'10m accuracy',5,'RollsRoyce'),(68,'Mountain track 03',150,10,'20m accuracy',5,'RollsRoyce'),(69,'TomTom Roadmap',600,10,'2m accuracy',5,'RollsRoyce'),(70,'China Wonder',100,10,'50m accuracy',5,'RollsRoyce'),(71,'360 degree Sensors',400,10,'Sensors around all car',6,'BMW'),(72,'Back Sensors',200,10,'Sensors on the rear part of the car',6,'BMW'),(73,'Full Sensors',1000,10,'Sensors and cameras around all car ',6,'BMW'),(74,'360 degree Sensors',430,10,'Sensors around all car',6,'Mini'),(75,'Back Sensors',200,10,'Sensors on the rear part of the car',6,'Mini'),(76,'Full Sensors',1200,10,'Sensors and cameras around all car ',6,'Mini'),(77,'360 degree Sensors',399.99,10,'Sensors around all car',6,'RollsRoyce'),(78,'Back Sensors',200,10,'Sensors on the rear part of the car',6,'RollsRoyce'),(79,'Full Sensors',1000,10,'Sensors and cameras around all car ',6,'RollsRoyce'),(80,'Sport Suspension',1500,10,'Stiff suspension for better handling',7,'BMW'),(81,'Comfort Suspension',1000,10,'Soft suspension to smooth your ride',7,'BMW'),(82,'Economic Suspension',700,10,'Soft suspension to smooth your ride',7,'BMW'),(83,'Moon Suspension',1500,10,'Soft suspension with hidraulic system',7,'BMW'),(84,'Sport Suspension',1500,10,'Stiff suspension for better handling',7,'Mini'),(85,'Comfort Suspension',1000,10,'Soft suspension to smooth your ride',7,'Mini'),(86,'Economic Suspension',700,10,'Soft suspension to smooth your ride',7,'Mini'),(87,'Moon Suspension',1500,10,'Soft suspension with hidraulic system',7,'Mini'),(88,'Sport Suspension',1700,10,'Stiff suspension for better handling',7,'RollsRoyce'),(89,'Economic Suspension',1000,10,'Soft suspension to smooth your ride',7,'RollsRoyce'),(90,'Comfort Suspension',1500,10,'Soft suspension to smooth your ride',7,'RollsRoyce'),(91,'Moon Suspension',2500,10,'Soft suspension with hidraulic system',7,'RollsRoyce'),(92,'Dakar Suspension',1300,10,'Stiff suspensionadaptable to the environment',7,'RollsRoyce'),(93,'Cheap Suspension',1500,10,'suspension indicated for older models',7,'RollsRoyce'),(94,'Sideral Black',1200,10,'Glossy finish',8,'BMW'),(95,'Red and white',1000,10,'Glossy finish',8,'BMW'),(96,'Gold',2000,10,'Glossy finish',8,'BMW'),(97,'Coper',1500,10,'Glossy finish',8,'BMW'),(98,'Arcade Green',600,10,'Retro style',8,'BMW'),(99,'Executive Silver',1700,10,'Luxury finish',8,'BMW'),(100,'Black',1700,10,'Luxury finish',8,'BMW'),(101,'Sideral Black',1300,10,'Glossy finish',8,'Mini'),(102,'Imperial Purple',1600,10,'Glossy finish',8,'Mini'),(103,'Dark Red',1100,10,'Glossy finish',8,'Mini'),(104,'Brown',1200,10,'Matte finish',8,'Mini'),(105,'Dark Green',1200,10,'Glossy finish',8,'Mini'),(106,'Red and white',700,10,'Retro style',8,'Mini'),(107,'Orange and Black',700,10,'Retro style',8,'Mini'),(108,'Arcade Green',600,10,'Retro style',8,'Mini'),(109,'Executive Silver',1700,10,'Luxury finish',8,'Mini'),(110,'Black',1700,10,'Luxury finish',8,'Mini'),(111,'Sideral Black',1200,10,'Glossy finish',8,'RollsRoyce'),(112,'Red adn white',700,10,'Retro style',8,'RollsRoyce'),(113,'Executive Silver',1700,10,'Luxury finish',8,'RollsRoyce'),(114,'LGBT Pride',6969,10,'Luxury finish, with velvet aplications',8,'RollsRoyce'),(115,'Executive Silver',1700,10,'Luxury finish',8,'RollsRoyce'),(116,'Black',1700,10,'Luxury finish',8,'RollsRoyce'),(117,'Bose Hi-Fi',700,10,'High fidelity audio',9,'BMW'),(118,'Bose Bass',700,10,'Bass boosted',9,'BMW'),(119,'Bose Full System',1400,10,'Surround sound for a great experience',9,'BMW'),(120,'JBL BMW Sound',800,10,'High fidelity audio',9,'BMW'),(121,'JBL Bass T-System',900,10,'Bass boosted',9,'BMW'),(122,'Beats Full System BMW',5000,10,'Surround sound for a regular experience',9,'BMW'),(123,'Bose Hi-Fi',700,10,'High fidelity audio',9,'Mini'),(124,'Bose Bass',700,10,'Bass boosted',9,'Mini'),(125,'Bose Full System',1400,10,'Surround sound for a great experience',9,'Mini'),(126,'Sony Surround System',1300,10,'Surround sound for an excelent experience',9,'Mini'),(127,'Sony Full System',1600,10,'Surround sound for a great experience and excelent bass notes',9,'Mini'),(128,'Beats Full System Mini',5000,10,'Surround sound for a regular experience',9,'Mini'),(129,'Bose Hi-Fi',1700,10,'High fidelity audio',9,'RollsRoyce'),(130,'Bose Bass',700,10,'Bass boosted',9,'RollsRoyce'),(131,'Bose Full System',3400,10,'Surround sound for a great experience',9,'RollsRoyce'),(132,'Beats Dre System',1300,10,'Great music system',9,'Mini'),(133,'Beats Full 8D System',4000,10,'Surround sound for a regular experience',9,'Mini'),(134,'White leds',400,10,'High glow',10,'BMW'),(135,'Yellow leds',200,10,'Ready for every situation',10,'BMW'),(136,'Impact lights',700,10,'Adaptative lights',10,'BMW'),(137,'Experimental lights',900,10,'Solar Powered lights, with light sensors enabling auto turning on/off',10,'BMW'),(138,'White leds',400,10,'High glow',10,'Mini'),(139,'Yellow leds',200,10,'Ready for every situation',10,'Mini'),(140,'Impact lights',800,10,'Adaptative lights',10,'Mini'),(141,'Experimental lights',900,10,'Solar Powered lights, with light sensors enabling auto turning on/off',10,'Mini'),(142,'White leds',400,10,'High glow',10,'RollsRoyce'),(143,'Yellow leds',200,10,'Ready for every situation',10,'RollsRoyce'),(144,'Experimental lights',1000,10,'Solar Powered lights, with light sensors enabling auto turning on/off',10,'RollsRoyce'),(145,'Impact lights',700,10,'Adaptative lights',10,'RollsRoyce'),(146,'Ultra',200,20,'Smoke car Window 70%',11,'BMW'),(147,'Medium',150,20,'Smoke car Window 60%',11,'BMW'),(148,'Low',100,20,'Smoke car Window 50%',11,'BMW'),(149,'Ultra',225,20,'Smoke car Window 70%',11,'Mini'),(150,'Medium',170,20,'Smoke car Window 60%',11,'Mini'),(151,'Low',150,20,'Smoke car Window 50%',11,'Mini'),(152,'Ultra',800,20,'Smoke car Window 70%',11,'RollsRoyce'),(153,'Medium',500,20,'Smoke car Window 60%',11,'RollsRoyce'),(154,'Low',300,20,'Smoke car Window 50%',11,'RollsRoyce'),(155,'M Performance Eletronic',2500,20,'Steering wheel for best performace',12,'BMW'),(156,'M Comfort Eletronic',1000,20,'Steering wheel for best confort',12,'BMW'),(157,'M Economic Eletronic',500,20,'Steering wheel for economic choice',12,'BMW'),(158,'III Alcantara',999,20,'Leather Steering Wheel',12,'BMW'),(159,'M Performance Eletronic',2250,20,'Steering wheel for best performace',12,'Mini'),(160,'M Comfort Eletronic',1500,20,'Steering wheel for best confort',12,'Mini'),(161,'M Economic Eletronic',750,20,'Steering wheel for economic choice',12,'Mini'),(162,'III Alcantara',999,20,'Leather Steering Wheel',12,'Mini'),(163,'M Performance Eletronic',7000,20,'Steering wheel for best performace',12,'RollsRoyce'),(164,'M Comfort Eletronic',5000,20,'Steering wheel for best confort',12,'RollsRoyce'),(165,'M Economic Eletronic',3000,20,'Steering wheel for economic choice',12,'RollsRoyce'),(166,'III Alcantara',999,20,'Leather Steering Wheel',12,'RollsRoyce'),(167,'Eletronic',4000,20,'Eletronic Sliding roof',13,'BMW'),(168,'Manual',1000,20,'Eletronic Sliding roof',13,'BMW'),(169,'Eletronic',4500,20,'Eletronic Sliding roof',13,'Mini'),(170,'Eletronic',6000,20,'Eletronic Sliding roof',13,'RollsRoyce'),(171,'Dual Rear Seat Entertainment',1500,20,'DVD screens',14,'BMW'),(172,'Rear Seat Entertainment',1000,20,'DVD screens',14,'BMW'),(173,'Dual Rear Seat Entertainment',1700,20,'DVD screens',14,'Mini'),(174,'Rear Seat Entertainment',1100,20,'DVD screens',14,'Mini'),(175,'Dual Rear Seat Entertainment',3000,20,'DVD screens',14,'RollsRoyce'),(176,'Rear Seat Entertainment',2000,20,'DVD screens',14,'RollsRoyce'),(177,'All Weather Mats',180,20,'Floor Mats ',15,'BMW'),(178,'All Weather Rubber Mats',140,20,'Floor Mats',15,'BMW'),(179,'Carpeted Floor Mats',190,20,'Floor Mats',15,'BMW'),(180,'All Season Mats',130,20,'Floor Mats',15,'BMW'),(181,'All Weather Mats',180,20,'Floor Mats ',15,'Mini'),(182,'All Weather Rubber Mats',140,20,'Floor Mats',15,'Mini'),(183,'Carpeted Floor Mats',190,20,'Floor Mats',15,'Mini'),(184,'All Season Mats',130,20,'Floor Mats',15,'Mini'),(185,'All Weather Mats',180,20,'Floor Mats ',15,'RollsRoyce'),(186,'All Weather Rubber Mats',180,20,'Floor Mats',15,'RollsRoyce'),(187,'Carpeted Floor Mats',290,20,'Floor Mats',15,'RollsRoyce'),(188,'All Season Mats',230,20,'Floor Mats',15,'RollsRoyce');
/*!40000 ALTER TABLE `Component` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CompPackage`
--

DROP TABLE IF EXISTS `CompPackage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `CompPackage` (
  `idComponent` int(11) NOT NULL,
  `idPackage` int(11) NOT NULL,
  PRIMARY KEY (`idComponent`,`idPackage`),
  KEY `fk_Component_has_Package_Package1_idx` (`idPackage`),
  KEY `fk_Component_has_Package_Component1_idx` (`idComponent`),
  CONSTRAINT `fk_Component_has_Package_Component1` FOREIGN KEY (`idComponent`) REFERENCES `component` (`idcomponent`),
  CONSTRAINT `fk_Component_has_Package_Package1` FOREIGN KEY (`idPackage`) REFERENCES `package` (`idpackage`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CompPackage`
--

LOCK TABLES `CompPackage` WRITE;
/*!40000 ALTER TABLE `CompPackage` DISABLE KEYS */;
INSERT INTO `CompPackage` VALUES (7,1),(16,1),(37,1),(43,1),(80,1),(155,1),(1,2),(19,2),(28,2),(42,2),(82,2),(157,2),(7,3),(22,3),(31,3),(40,3),(83,3),(156,3),(11,4),(23,4),(38,4),(50,4),(159,4),(2,5),(17,5),(29,5),(47,5),(86,5),(161,5),(5,6),(20,6),(35,6),(49,6),(85,6),(160,6),(3,7),(18,7),(30,7),(56,7),(88,7),(163,7),(13,8),(27,8),(33,8),(53,8),(89,8),(165,8),(9,9),(24,9),(36,9),(56,9),(90,9),(164,9);
/*!40000 ALTER TABLE `CompPackage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Employee`
--

DROP TABLE IF EXISTS `Employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Employee` (
  `idEmployee` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Phone` varchar(45) NOT NULL,
  `Address` varchar(45) NOT NULL,
  `NIB` varchar(45) NOT NULL,
  `NIF` varchar(45) NOT NULL,
  `SS` varchar(45) DEFAULT NULL,
  `Username` varchar(45) NOT NULL,
  PRIMARY KEY (`idEmployee`,`Username`),
  KEY `fk_Employee_Users1_idx` (`Username`),
  CONSTRAINT `fk_Employee_Users1` FOREIGN KEY (`Username`) REFERENCES `users` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Employee`
--

LOCK TABLES `Employee` WRITE;
/*!40000 ALTER TABLE `Employee` DISABLE KEYS */;
INSERT INTO `Employee` VALUES (1,'Gonçalo Costeira','costeira234@gmail.com','934784637','Braga','65748391865437','3456786543','343565657454','Gonçalo'),(2,'Pedro Terra Sousa','terrasousa@gmail.com','963274857','Vila Verde','90876567843342','3434545433','34345544554','Pedro'),(3,'Daniel Vieira','vieradaniel@gmail.com','932344544','Barcelos','43345354556432','34556434342','34643332343','Daniel'),(4,'Gonçalo Costeira','costeira234@gmail.com','934784637','Braga','65748391865437','3456786543','343565657454','Gonçalo'),(5,'Pedro Terra Sousa','terrasousa@gmail.com','963274857','Vila Verde','90876567843342','3434545433','34345544554','Pedro');
/*!40000 ALTER TABLE `Employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Order`
--

DROP TABLE IF EXISTS `Order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Order` (
  `idOrder` int(11) NOT NULL AUTO_INCREMENT,
  `Date` date NOT NULL,
  `Price` double NOT NULL,
  `Status` varchar(45) NOT NULL,
  `Description` text,
  `Seller_Username` varchar(45) NOT NULL,
  `Client_NIF` varchar(45) NOT NULL,
  `idCar` int(11) NOT NULL,
  PRIMARY KEY (`idOrder`,`idCar`),
  KEY `fk_Order_Car1_idx` (`idCar`),
  KEY `fk_Order_Seller1_idx` (`Seller_Username`),
  KEY `fk_Order_Client1_idx` (`Client_NIF`),
  CONSTRAINT `fk_Order_Car1` FOREIGN KEY (`idCar`) REFERENCES `car` (`idcar`),
  CONSTRAINT `fk_Order_Client1` FOREIGN KEY (`Client_NIF`) REFERENCES `client` (`nif`),
  CONSTRAINT `fk_Order_Seller1` FOREIGN KEY (`Seller_Username`) REFERENCES `seller` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Order`
--

LOCK TABLES `Order` WRITE;
/*!40000 ALTER TABLE `Order` DISABLE KEYS */;
/*!40000 ALTER TABLE `Order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Package`
--

DROP TABLE IF EXISTS `Package`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Package` (
  `idPackage` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) NOT NULL,
  `Description` varchar(45) NOT NULL,
  `Price` double NOT NULL,
  `Compatibility` varchar(45) NOT NULL,
  PRIMARY KEY (`idPackage`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Package`
--

LOCK TABLES `Package` WRITE;
/*!40000 ALTER TABLE `Package` DISABLE KEYS */;
INSERT INTO `Package` VALUES (1,'SportPack','Sport Package for BMW',8360.1,'BMW'),(2,'EconomicPack','Economic Pack for BMW',3735,'BMW'),(3,'ComfortPack','Comfort Package for BMW',5660.1,'BMW'),(4,'SportPack','Sport Package for Mini',9945,'Mini'),(5,'EconomicPack','Economic Package for Mini',3465,'Mini'),(6,'ComfortPack','Comfort Package for Mini',7919.1,'Mini'),(7,'SportPack','Sport Package for RollsRoyce',16560,'RollsRoyce'),(8,'EconomicPack','Economic Package for RollsRoyce',6763.5,'RollsRoyce'),(9,'ComfortPack','Comfort Package for RollsRoyce',10372.5,'RollsRoyce');
/*!40000 ALTER TABLE `Package` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PackageCar`
--

DROP TABLE IF EXISTS `PackageCar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `PackageCar` (
  `idPackage` int(11) NOT NULL,
  `idCar` int(11) NOT NULL,
  PRIMARY KEY (`idPackage`,`idCar`),
  KEY `fk_Package_has_Car_Car1_idx` (`idCar`),
  KEY `fk_Package_has_Car_Package1_idx` (`idPackage`),
  CONSTRAINT `fk_Package_has_Car_Car1` FOREIGN KEY (`idCar`) REFERENCES `car` (`idcar`),
  CONSTRAINT `fk_Package_has_Car_Package1` FOREIGN KEY (`idPackage`) REFERENCES `package` (`idpackage`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PackageCar`
--

LOCK TABLES `PackageCar` WRITE;
/*!40000 ALTER TABLE `PackageCar` DISABLE KEYS */;
/*!40000 ALTER TABLE `PackageCar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Seller`
--

DROP TABLE IF EXISTS `Seller`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Seller` (
  `idSeller` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Phone` varchar(45) NOT NULL,
  `Address` varchar(45) NOT NULL,
  `NIB` varchar(45) NOT NULL,
  `NIF` varchar(45) NOT NULL,
  `SS` varchar(45) DEFAULT NULL,
  `Username` varchar(45) NOT NULL,
  PRIMARY KEY (`idSeller`,`Username`),
  KEY `fk_Seller_Users1_idx` (`Username`),
  CONSTRAINT `fk_Seller_Users1` FOREIGN KEY (`Username`) REFERENCES `users` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Seller`
--

LOCK TABLES `Seller` WRITE;
/*!40000 ALTER TABLE `Seller` DISABLE KEYS */;
INSERT INTO `Seller` VALUES (1,'Rafael Machado Silva','silvarafael029@gmail.com','912321323','Chaves','00323424234234','2133243243','342343422342','Rafael'),(2,'Jose Ramos','joseramos@gmail.com','932134264','Braga','34534523435435','2323884343','235435554355','Jose'),(3,'Joao Miguel Palmeira','joaopalmeira@gmail.com','923123234','Braga','43242394234234','2342355423','345465645656','Joao');
/*!40000 ALTER TABLE `Seller` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Users`
--

DROP TABLE IF EXISTS `Users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Users` (
  `Username` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `Permission` int(11) NOT NULL,
  PRIMARY KEY (`Username`),
  UNIQUE KEY `Username_UNIQUE` (`Username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Users`
--

LOCK TABLES `Users` WRITE;
/*!40000 ALTER TABLE `Users` DISABLE KEYS */;
INSERT INTO `Users` VALUES ('admin','admin',3),('Daniel','vieira',2),('Gonçalo','costeira',2),('Joao','palmeira',1),('Jose','ramos',1),('Pedro','terra',2),('Rafael','silva',1),('Rui','costa',3);
/*!40000 ALTER TABLE `Users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-01-05 22:55:49
