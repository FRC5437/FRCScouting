package org.frc836.database;

import android.provider.BaseColumns;

/* This file was auto-generated by SQLITEContractGen.py.
 Abandon all hope ye who edit here.*/

public final class FRCScoutingContract {

	public FRCScoutingContract() {};

	public static abstract class CONFIGURATION_LU_Entry implements BaseColumns {
		public static final String TABLE_NAME = "configuration_lu";
		public static final String COLUMN_NAME_ID = "id";
		public static final String COLUMN_NAME_CONFIGURATION_DESC = "configuration_desc";
		public static final String COLUMN_NAME_TIMESTAMP = "timestamp";
		public static final String COLUMN_NAME_INVALID = "invalid";
	}

	public static abstract class EVENT_LU_Entry implements BaseColumns {
		public static final String TABLE_NAME = "event_lu";
		public static final String COLUMN_NAME_ID = "id";
		public static final String COLUMN_NAME_EVENT_NAME = "event_name";
		public static final String COLUMN_NAME_MATCH_URL = "match_url";
		public static final String COLUMN_NAME_TIMESTAMP = "timestamp";
		public static final String COLUMN_NAME_INVALID = "invalid";
	}

	public static abstract class FACT_CYCLE_DATA_Entry implements BaseColumns {
		public static final String TABLE_NAME = "fact_cycle_data";
		public static final String COLUMN_NAME_ID = "id";
		public static final String COLUMN_NAME_EVENT_ID = "event_id";
		public static final String COLUMN_NAME_MATCH_ID = "match_id";
		public static final String COLUMN_NAME_TEAM_ID = "team_id";
		public static final String COLUMN_NAME_CYCLE_NUM = "cycle_num";
		public static final String COLUMN_NAME_NEAR_POSS = "near_poss";
		public static final String COLUMN_NAME_WHITE_POSS = "white_poss";
		public static final String COLUMN_NAME_FAR_POSS = "far_poss";
		public static final String COLUMN_NAME_TRUSS = "truss";
		public static final String COLUMN_NAME_CATCH = "catch";
		public static final String COLUMN_NAME_HIGH = "high";
		public static final String COLUMN_NAME_LOW = "low";
		public static final String COLUMN_NAME_ASSISTS = "assists";
		public static final String COLUMN_NAME_TIMESTAMP = "timestamp";
		public static final String COLUMN_NAME_INVALID = "invalid";
	}

	public static abstract class FACT_MATCH_DATA_Entry implements BaseColumns {
		public static final String TABLE_NAME = "fact_match_data";
		public static final String COLUMN_NAME_ID = "id";
		public static final String COLUMN_NAME_EVENT_ID = "event_id";
		public static final String COLUMN_NAME_MATCH_ID = "match_id";
		public static final String COLUMN_NAME_TEAM_ID = "team_id";
		public static final String COLUMN_NAME_AUTO_HIGH = "auto_high";
		public static final String COLUMN_NAME_AUTO_HIGH_HOT = "auto_high_hot";
		public static final String COLUMN_NAME_AUTO_LOW = "auto_low";
		public static final String COLUMN_NAME_AUTO_LOW_HOT = "auto_low_hot";
		public static final String COLUMN_NAME_HIGH = "high";
		public static final String COLUMN_NAME_LOW = "low";
		public static final String COLUMN_NAME_AUTO_MOBILE = "auto_mobile";
		public static final String COLUMN_NAME_FOUL = "foul";
		public static final String COLUMN_NAME_TECH_FOUL = "tech_foul";
		public static final String COLUMN_NAME_TIP_OVER = "tip_over";
		public static final String COLUMN_NAME_YELLOW_CARD = "yellow_card";
		public static final String COLUMN_NAME_RED_CARD = "red_card";
		public static final String COLUMN_NAME_NOTES = "notes";
		public static final String COLUMN_NAME_TIMESTAMP = "timestamp";
		public static final String COLUMN_NAME_INVALID = "invalid";
	}

	public static abstract class NOTES_OPTIONS_Entry implements BaseColumns {
		public static final String TABLE_NAME = "notes_options";
		public static final String COLUMN_NAME_ID = "id";
		public static final String COLUMN_NAME_OPTION_TEXT = "option_text";
		public static final String COLUMN_NAME_TIMESTAMP = "timestamp";
		public static final String COLUMN_NAME_INVALID = "invalid";
	}

	public static abstract class ROBOT_LU_Entry implements BaseColumns {
		public static final String TABLE_NAME = "robot_lu";
		public static final String COLUMN_NAME_ID = "id";
		public static final String COLUMN_NAME_TEAM_ID = "team_id";
		public static final String COLUMN_NAME_ROBOT_PHOTO = "robot_photo";
		public static final String COLUMN_NAME_TIMESTAMP = "timestamp";
		public static final String COLUMN_NAME_INVALID = "invalid";
	}

	public static abstract class SCOUT_PIT_DATA_Entry implements BaseColumns {
		public static final String TABLE_NAME = "scout_pit_data";
		public static final String COLUMN_NAME_ID = "id";
		public static final String COLUMN_NAME_TEAM_ID = "team_id";
		public static final String COLUMN_NAME_CONFIGURATION_ID = "configuration_id";
		public static final String COLUMN_NAME_WHEEL_TYPE_ID = "wheel_type_id";
		public static final String COLUMN_NAME_WHEEL_BASE_ID = "wheel_base_id";
		public static final String COLUMN_NAME_AUTONOMOUS_MODE = "autonomous_mode";
		public static final String COLUMN_NAME_AUTO_HIGH = "auto_high";
		public static final String COLUMN_NAME_AUTO_LOW = "auto_low";
		public static final String COLUMN_NAME_AUTO_HOT = "auto_hot";
		public static final String COLUMN_NAME_AUTO_MOBILE = "auto_mobile";
		public static final String COLUMN_NAME_AUTO_GOALIE = "auto_goalie";
		public static final String COLUMN_NAME_TRUSS = "truss";
		public static final String COLUMN_NAME_CATCH = "catch";
		public static final String COLUMN_NAME_ACTIVE_CONTROL = "active_control";
		public static final String COLUMN_NAME_LAUNCH_BALL = "launch_ball";
		public static final String COLUMN_NAME_SCORE_HIGH = "score_high";
		public static final String COLUMN_NAME_SCORE_LOW = "score_low";
		public static final String COLUMN_NAME_MAX_HEIGHT = "max_height";
		public static final String COLUMN_NAME_SCOUT_COMMENTS = "scout_comments";
		public static final String COLUMN_NAME_TIMESTAMP = "timestamp";
		public static final String COLUMN_NAME_INVALID = "invalid";
	}

	public static abstract class WHEEL_BASE_LU_Entry implements BaseColumns {
		public static final String TABLE_NAME = "wheel_base_lu";
		public static final String COLUMN_NAME_ID = "id";
		public static final String COLUMN_NAME_WHEEL_BASE_DESC = "wheel_base_desc";
		public static final String COLUMN_NAME_TIMESTAMP = "timestamp";
		public static final String COLUMN_NAME_INVALID = "invalid";
	}

	public static abstract class WHEEL_TYPE_LU_Entry implements BaseColumns {
		public static final String TABLE_NAME = "wheel_type_lu";
		public static final String COLUMN_NAME_ID = "id";
		public static final String COLUMN_NAME_WHEEL_TYPE_DESC = "wheel_type_desc";
		public static final String COLUMN_NAME_TIMESTAMP = "timestamp";
		public static final String COLUMN_NAME_INVALID = "invalid";
	}


	public static final String SQL_CREATE_ENTRIES = 		"-- phpMyAdmin SQL Dump\n" + 
		"-- version 4.0.8\n" + 
		"-- http://www.phpmyadmin.net\n" + 
		"--\n" + 
		"-- Host: localhost\n" + 
		"-- Generation Time: Feb 04, 2014 at 06:53 PM\n" + 
		"-- Server version: 5.1.72-cll\n" + 
		"-- PHP Version: 5.3.17\n" + 
		"\n" + 
		"SET SQL_MODE = \"NO_AUTO_VALUE_ON_ZERO\";\n" + 
		"SET time_zone = \"+00:00\";\n" + 
		"\n" + 
		"\n" + 
		"/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;\n" + 
		"/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;\n" + 
		"/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;\n" + 
		"/*!40101 SET NAMES utf8 */;\n" + 
		"\n" + 
		"--\n" + 
		"-- Database: `rbees_scouting`\n" + 
		"--\n" + 
		"\n" + 
		"-- --------------------------------------------------------\n" + 
		"\n" + 
		"--\n" + 
		"-- Table structure for table `configuration_lu`\n" + 
		"--\n" + 
		"\n" + 
		"CREATE TABLE IF NOT EXISTS `configuration_lu` (\n" + 
		"  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,\n" + 
		"  `configuration_desc` text COLLATE latin1_general_cs NOT NULL,\n" + 
		"  `timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,\n" + 
		"  `invalid` tinyint(1) unsigned NOT NULL DEFAULT '0',\n" + 
		"  PRIMARY KEY (`id`),\n" + 
		"  KEY `timestamp` (`timestamp`)\n" + 
		") ENGINE=MyISAM  DEFAULT CHARSET=latin1 COLLATE=latin1_general_cs AUTO_INCREMENT=8 ;\n" + 
		"\n" + 
		"--\n" + 
		"-- Dumping data for table `configuration_lu`\n" + 
		"--\n" + 
		"\n" + 
		"INSERT INTO `configuration_lu` (`id`, `configuration_desc`, `timestamp`, `invalid`) VALUES\n" + 
		"(1, 'Wide', '2014-01-25 15:18:38', 0),\n" + 
		"(2, 'Long', '2014-01-25 15:18:38', 0),\n" + 
		"(3, 'Square', '2014-01-25 15:18:38', 0),\n" + 
		"(4, 'Round', '2014-01-25 15:18:38', 0),\n" + 
		"(5, 'Hex', '2014-01-25 15:18:38', 0),\n" + 
		"(6, 'Triangle', '2014-01-25 15:18:38', 0),\n" + 
		"(7, 'Other', '2014-01-25 15:18:38', 0);\n" + 
		"\n" + 
		"-- --------------------------------------------------------\n" + 
		"\n" + 
		"--\n" + 
		"-- Table structure for table `event_lu`\n" + 
		"--\n" + 
		"\n" + 
		"CREATE TABLE IF NOT EXISTS `event_lu` (\n" + 
		"  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,\n" + 
		"  `event_name` varchar(70) COLLATE latin1_general_cs NOT NULL,\n" + 
		"  `match_url` text COLLATE latin1_general_cs NOT NULL,\n" + 
		"  `timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,\n" + 
		"  `invalid` tinyint(1) unsigned NOT NULL DEFAULT '0',\n" + 
		"  PRIMARY KEY (`id`),\n" + 
		"  UNIQUE KEY `event_name` (`event_name`),\n" + 
		"  KEY `timestamp` (`timestamp`)\n" + 
		") ENGINE=MyISAM  DEFAULT CHARSET=latin1 COLLATE=latin1_general_cs AUTO_INCREMENT=103 ;\n" + 
		"\n" + 
		"--\n" + 
		"-- Dumping data for table `event_lu`\n" + 
		"--\n" + 
		"\n" + 
		"INSERT INTO `event_lu` (`id`, `event_name`, `match_url`, `timestamp`, `invalid`) VALUES\n" + 
		"(1, 'Central Illinois Regional', 'http://www2.usfirst.org/2014comp/Events/ILIL/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(2, 'Palmetto Regional', 'http://www2.usfirst.org/2014comp/Events/SCMB/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(3, 'Alamo Regional', 'http://www2.usfirst.org/2014comp/Events/TXSA/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(4, 'Greater Toronto West Regional', 'http://www2.usfirst.org/2014comp/Events/ONTO2/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(5, 'Inland Empire Regional', 'http://www2.usfirst.org/2014comp/Events/CASB/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(6, 'Israel Regional', 'http://www2.usfirst.org/2014comp/Events/ISTA/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(7, 'Greater Toronto East Regional', 'http://www2.usfirst.org/2014comp/Events/ONTO/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(8, 'Arkansas Regional', 'http://www2.usfirst.org/2014comp/Events/ARFA/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(9, 'San Diego Regional', 'http://www2.usfirst.org/2014comp/Events/CASD/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(10, 'Crossroads Regional', 'http://www2.usfirst.org/2014comp/Events/INTH/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(11, 'Lake Superior Regional', 'http://www2.usfirst.org/2014comp/Events/MNDU/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(12, 'Northern Lights Regional', 'http://www2.usfirst.org/2014comp/Events/MNDU2/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(13, 'Hub City Regional', 'http://www2.usfirst.org/2014comp/Events/TXLU/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(14, 'Central Valley Regional', 'http://www2.usfirst.org/2014comp/Events/CAMA/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(15, 'Mexico City Regional', 'http://www2.usfirst.org/2014comp/Events/MXMC/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(16, 'Sacramento Regional', 'http://www2.usfirst.org/2014comp/Events/CASA/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(17, 'Orlando Regional', 'http://www2.usfirst.org/2014comp/Events/FLOR/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(18, 'Greater Kansas City Regional', 'http://www2.usfirst.org/2014comp/Events/MOKC/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(19, 'St. Louis Regional', 'http://www2.usfirst.org/2014comp/Events/MOSL/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(20, 'North Carolina Regional', 'http://www2.usfirst.org/2014comp/Events/NCRE/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(21, 'New York Tech Valley Regional', 'http://www2.usfirst.org/2014comp/Events/NYTR/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(22, 'Dallas Regional', 'http://www2.usfirst.org/2014comp/Events/TXDA/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(23, 'Utah Regional', 'http://www2.usfirst.org/2014comp/Events/UTWV/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(24, 'Waterloo Regional', 'http://www2.usfirst.org/2014comp/Events/ONWA/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(25, 'Festival de Robotique FRC a Montreal Regional', 'http://www2.usfirst.org/2014comp/Events/QCMO/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(26, 'Arizona Regional', 'http://www2.usfirst.org/2014comp/Events/AZCH/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(27, 'Los Angeles Regional', 'http://www2.usfirst.org/2014comp/Events/CALB/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(28, 'Boilermaker Regional', 'http://www2.usfirst.org/2014comp/Events/INWL/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(29, 'Buckeye Regional', 'http://www2.usfirst.org/2014comp/Events/OHCL/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(30, 'Virginia Regional', 'http://www2.usfirst.org/2014comp/Events/VARI/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(31, 'Wisconsin Regional', 'http://www2.usfirst.org/2014comp/Events/WIMI/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(32, 'North Bay Regional', 'http://www2.usfirst.org/2014comp/Events/ONNB/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(33, 'Peachtree Regional', 'http://www2.usfirst.org/2014comp/Events/GADU/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(34, 'Hawaii Regional', 'http://www2.usfirst.org/2014comp/Events/HIHO/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(35, 'Minnesota North Star Regional', 'http://www2.usfirst.org/2014comp/Events/MNMI2/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(36, 'Minnesota 1000 Lakes Regional', 'http://www2.usfirst.org/2014comp/Events/MNMI/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(37, 'SBPLI Long Island Regional', 'http://www2.usfirst.org/2014comp/Events/NYLI/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(38, 'Finger Lakes Regional', 'http://www2.usfirst.org/2014comp/Events/NYRO/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(39, 'Queen City Regional', 'http://www2.usfirst.org/2014comp/Events/OHCI/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(40, 'Oklahoma Regional', 'http://www2.usfirst.org/2014comp/Events/OKOK/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(41, 'Greater Pittsburgh Regional', 'http://www2.usfirst.org/2014comp/Events/PAPI/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(42, 'Smoky Mountains Regional', 'http://www2.usfirst.org/2014comp/Events/TNKN/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(43, 'Greater DC Regional', 'http://www2.usfirst.org/2014comp/Events/DCWA/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(44, 'Western Canada Regional', 'http://www2.usfirst.org/2014comp/Events/ABCA/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(45, 'Windsor Essex Great Lakes Regional', 'http://www2.usfirst.org/2014comp/Events/ONWI/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(46, 'Silicon Valley Regional', 'http://www2.usfirst.org/2014comp/Events/CASJ/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(47, 'Colorado Regional', 'http://www2.usfirst.org/2014comp/Events/CODE/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(48, 'South Florida Regional', 'http://www2.usfirst.org/2014comp/Events/FLFO/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(49, 'Midwest Regional', 'http://www2.usfirst.org/2014comp/Events/ILCH/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(50, 'Bayou Regional', 'http://www2.usfirst.org/2014comp/Events/LAKE/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(51, 'Chesapeake Regional', 'http://www2.usfirst.org/2014comp/Events/MDBA/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(52, 'Las Vegas Regional', 'http://www2.usfirst.org/2014comp/Events/NVLV/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(53, 'New York City Regional', 'http://www2.usfirst.org/2014comp/Events/NYNY/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(54, 'Lone Star Regional', 'http://www2.usfirst.org/2014comp/Events/TXHO/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(55, 'Michigan FRC State Championship', 'http://www2.usfirst.org/2014comp/Events/MICMP/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(56, 'Mid-Atlantic Robotics FRC Region Championship', 'http://www2.usfirst.org/2014comp/Events/MRCMP/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(57, 'New England FRC Region Championship', 'http://www2.usfirst.org/2014comp/Events/NECMP/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(58, 'Autodesk PNW FRC Championship', 'http://www2.usfirst.org/2014comp/Events/PNCMP/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(59, 'Center Line FIRST Robotics District Competition', 'http://www2.usfirst.org/2014comp/Events/MICEN/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(60, 'Southfield FIRST Robotics District Competition', 'http://www2.usfirst.org/2014comp/Events/MISOU/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(61, 'Kettering University FIRST Robotics District Competition', 'http://www2.usfirst.org/2014comp/Events/MIKET/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(62, 'Gull Lake FIRST Robotics District Competition', 'http://www2.usfirst.org/2014comp/Events/MIGUL/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(63, 'Escanaba FIRST Robotics District Competition', 'http://www2.usfirst.org/2014comp/Events/MIESC/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(64, 'Howell FIRST Robotics District Competition', 'http://www2.usfirst.org/2014comp/Events/MIHOW/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(65, 'West Michigan FIRST Robotics District Competition', 'http://www2.usfirst.org/2014comp/Events/MIWMI/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(66, 'Great Lakes Bay Region FIRST Robotics District Competition', 'http://www2.usfirst.org/2014comp/Events/MIMID/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(67, 'Traverse City FIRST Robotics District Competition', 'http://www2.usfirst.org/2014comp/Events/MITVC/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(68, 'Livonia FIRST Robotics District Competition', 'http://www2.usfirst.org/2014comp/Events/MILIV/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(69, 'St. Joseph FIRST Robotics District Competition', 'http://www2.usfirst.org/2014comp/Events/MISJO/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(70, 'Waterford FIRST Robotics District Competition', 'http://www2.usfirst.org/2014comp/Events/MIWAT/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(71, 'Lansing FIRST Robotics District Competition', 'http://www2.usfirst.org/2014comp/Events/MILAN/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(72, 'Bedford FIRST Robotics District Competition', 'http://www2.usfirst.org/2014comp/Events/MIBED/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(73, 'Troy FIRST Robotics District Competition', 'http://www2.usfirst.org/2014comp/Events/MITRY/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(74, 'MAR FIRST Robotics Mt. Olive District Competition', 'http://www2.usfirst.org/2014comp/Events/NJFLA/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(75, 'MAR FIRST Robotics Hatboro-Horsham District Competition', 'http://www2.usfirst.org/2014comp/Events/PAHAT/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(76, 'MAR FIRST Robotics Springside Chestnut Hill District Competition', 'http://www2.usfirst.org/2014comp/Events/PAPHI/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(77, 'MAR FIRST Robotics Cliffton District Competition', 'http://www2.usfirst.org/2014comp/Events/NJCLI/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(78, 'MAR FIRST Robotics Lenape-Seneca District Competition', 'http://www2.usfirst.org/2014comp/Events/NJTAB/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(79, 'MAR FIRST Robotics Bridgewater-Raritan District Competition', 'http://www2.usfirst.org/2014comp/Events/NJBRI/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(80, 'Granite State District Event', 'http://www2.usfirst.org/2014comp/Events/NHNAS/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(81, 'UNH District Event', 'http://www2.usfirst.org/2014comp/Events/NHDUR/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(82, 'Groton District Event', 'http://www2.usfirst.org/2014comp/Events/CTGRO/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(83, 'WPI District Event', 'http://www2.usfirst.org/2014comp/Events/NAWOR/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(84, 'Rhode Island District Event', 'http://www2.usfirst.org/2014comp/Events/RISMI/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(85, 'Southington District Event', 'http://www2.usfirst.org/2014comp/Events/CTSOU/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(86, 'Northeastern University District Event', 'http://www2.usfirst.org/2014comp/Events/MABOS/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(87, 'Hartford District Event', 'http://www2.usfirst.org/2014comp/Events/CTHAR/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(88, 'Pinetree District Event', 'http://www2.usfirst.org/2014comp/Events/MELEW/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(89, 'PNW FIRST Robotics Auburn Mountainview District Event', 'http://www2.usfirst.org/2014comp/Events/WAAMV/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(90, 'PNW FIRST Robotics Oregon City District Event', 'http://www2.usfirst.org/2014comp/Events/ORORE/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(91, 'PNW FIRST Robotics Glacier Peak District Event', 'http://www2.usfirst.org/2014comp/Events/WASNO/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(92, 'PNW FIRST Robotics Eastern Washington University District Event', 'http://www2.usfirst.org/2014comp/Events/WACHE/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(93, 'PNW FIRST Robotics Mt. Vernon District Event', 'http://www2.usfirst.org/2014comp/Events/WAMOU/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(94, 'PNW FIRST Robotics Wilsonville District Event', 'http://www2.usfirst.org/2014comp/Events/ORWIL/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(95, 'PNW FIRST Robotics Shorewood District Event', 'http://www2.usfirst.org/2014comp/Events/WASHO/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(96, 'PNW FIRST Robotics Auburn District Event', 'http://www2.usfirst.org/2014comp/Events/WAAHS/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(97, 'PNW FIRST Robotics Central Washington University District Event', 'http://www2.usfirst.org/2014comp/Events/WAELO/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(98, 'PNW FIRST Robotics Oregon State University District Event', 'http://www2.usfirst.org/2014comp/Events/OROSU/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(99, 'Championship - Archimedes', 'http://www2.usfirst.org/2014comp/Events/Archimedes/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(100, 'Championship - Curie', 'http://www2.usfirst.org/2014comp/Events/Curie/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(101, 'Championship - Galileo', 'http://www2.usfirst.org/2014comp/Events/Galileo/ScheduleQual.html', '2014-01-25 15:19:51', 0),\n" + 
		"(102, 'Championship - Newton', 'http://www2.usfirst.org/2014comp/Events/Newton/ScheduleQual.html', '2014-01-25 15:19:51', 0);\n" + 
		"\n" + 
		"-- --------------------------------------------------------\n" + 
		"\n" + 
		"--\n" + 
		"-- Table structure for table `fact_cycle_data`\n" + 
		"--\n" + 
		"\n" + 
		"CREATE TABLE IF NOT EXISTS `fact_cycle_data` (\n" + 
		"  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,\n" + 
		"  `event_id` int(5) unsigned NOT NULL,\n" + 
		"  `match_id` int(3) unsigned NOT NULL,\n" + 
		"  `team_id` int(5) unsigned NOT NULL,\n" + 
		"  `cycle_num` int(3) unsigned NOT NULL,\n" + 
		"  `near_poss` tinyint(1) unsigned NOT NULL,\n" + 
		"  `white_poss` tinyint(1) unsigned NOT NULL,\n" + 
		"  `far_poss` tinyint(1) unsigned NOT NULL,\n" + 
		"  `truss` tinyint(1) unsigned NOT NULL,\n" + 
		"  `catch` tinyint(1) unsigned NOT NULL,\n" + 
		"  `high` tinyint(1) unsigned NOT NULL,\n" + 
		"  `low` tinyint(1) unsigned NOT NULL,\n" + 
		"  `assists` int(3) unsigned NOT NULL,\n" + 
		"  `timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,\n" + 
		"  `invalid` tinyint(1) unsigned NOT NULL DEFAULT '0',\n" + 
		"  PRIMARY KEY (`id`),\n" + 
		"  KEY `event_id` (`event_id`,`match_id`,`team_id`,`cycle_num`),\n" + 
		"  KEY `timestamp` (`timestamp`)\n" + 
		") ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_cs AUTO_INCREMENT=1 ;\n" + 
		"\n" + 
		"-- --------------------------------------------------------\n" + 
		"\n" + 
		"--\n" + 
		"-- Table structure for table `fact_match_data`\n" + 
		"--\n" + 
		"\n" + 
		"CREATE TABLE IF NOT EXISTS `fact_match_data` (\n" + 
		"  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,\n" + 
		"  `event_id` int(5) unsigned NOT NULL,\n" + 
		"  `match_id` int(3) unsigned NOT NULL,\n" + 
		"  `team_id` int(5) unsigned NOT NULL,\n" + 
		"  `auto_high` int(1) unsigned NOT NULL,\n" + 
		"  `auto_high_hot` int(1) unsigned NOT NULL,\n" + 
		"  `auto_low` int(1) unsigned NOT NULL,\n" + 
		"  `auto_low_hot` int(1) unsigned NOT NULL,\n" + 
		"  `high` int(1) unsigned NOT NULL,\n" + 
		"  `low` int(1) unsigned NOT NULL,\n" + 
		"  `auto_mobile` tinyint(1) unsigned NOT NULL,\n" + 
		"  `foul` tinyint(1) unsigned NOT NULL,\n" + 
		"  `tech_foul` tinyint(1) unsigned NOT NULL,\n" + 
		"  `tip_over` tinyint(1) unsigned NOT NULL,\n" + 
		"  `yellow_card` tinyint(1) unsigned NOT NULL,\n" + 
		"  `red_card` tinyint(1) unsigned NOT NULL,\n" + 
		"  `notes` varchar(1024) COLLATE latin1_general_cs NOT NULL,\n" + 
		"  `timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,\n" + 
		"  `invalid` tinyint(1) unsigned NOT NULL DEFAULT '0',\n" + 
		"  PRIMARY KEY (`id`),\n" + 
		"  KEY `event_id` (`event_id`,`match_id`,`team_id`),\n" + 
		"  KEY `timestamp` (`timestamp`)\n" + 
		") ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_cs AUTO_INCREMENT=1 ;\n" + 
		"\n" + 
		"-- --------------------------------------------------------\n" + 
		"\n" + 
		"--\n" + 
		"-- Table structure for table `notes_options`\n" + 
		"--\n" + 
		"\n" + 
		"CREATE TABLE IF NOT EXISTS `notes_options` (\n" + 
		"  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,\n" + 
		"  `option_text` text COLLATE latin1_general_cs NOT NULL,\n" + 
		"  `timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,\n" + 
		"  `invalid` tinyint(1) unsigned NOT NULL DEFAULT '0',\n" + 
		"  PRIMARY KEY (`id`),\n" + 
		"  KEY `timestamp` (`timestamp`)\n" + 
		") ENGINE=MyISAM  DEFAULT CHARSET=latin1 COLLATE=latin1_general_cs AUTO_INCREMENT=5 ;\n" + 
		"\n" + 
		"--\n" + 
		"-- Dumping data for table `notes_options`\n" + 
		"--\n" + 
		"\n" + 
		"INSERT INTO `notes_options` (`id`, `option_text`, `timestamp`, `invalid`) VALUES\n" + 
		"(1, 'No Show', '2014-01-25 15:21:36', 0),\n" + 
		"(2, 'Non-functional', '2014-01-25 15:21:36', 0),\n" + 
		"(3, 'Defender', '2014-01-25 15:21:36', 0),\n" + 
		"(4, 'Catcher', '2014-01-25 15:21:36', 0);\n" + 
		"\n" + 
		"-- --------------------------------------------------------\n" + 
		"\n" + 
		"--\n" + 
		"-- Table structure for table `robot_lu`\n" + 
		"--\n" + 
		"\n" + 
		"CREATE TABLE IF NOT EXISTS `robot_lu` (\n" + 
		"  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,\n" + 
		"  `team_id` int(5) unsigned NOT NULL,\n" + 
		"  `robot_photo` text COLLATE latin1_general_cs NOT NULL,\n" + 
		"  `timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,\n" + 
		"  `invalid` tinyint(1) unsigned NOT NULL DEFAULT '0',\n" + 
		"  PRIMARY KEY (`id`),\n" + 
		"  KEY `team_id` (`team_id`),\n" + 
		"  KEY `timestamp` (`timestamp`)\n" + 
		") ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_cs AUTO_INCREMENT=1 ;\n" + 
		"\n" + 
		"-- --------------------------------------------------------\n" + 
		"\n" + 
		"--\n" + 
		"-- Table structure for table `scout_pit_data`\n" + 
		"--\n" + 
		"\n" + 
		"CREATE TABLE IF NOT EXISTS `scout_pit_data` (\n" + 
		"  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,\n" + 
		"  `team_id` int(10) unsigned NOT NULL,\n" + 
		"  `configuration_id` int(10) unsigned NOT NULL,\n" + 
		"  `wheel_type_id` int(10) unsigned NOT NULL,\n" + 
		"  `wheel_base_id` int(10) unsigned NOT NULL,\n" + 
		"  `autonomous_mode` tinyint(1) NOT NULL,\n" + 
		"  `auto_high` tinyint(1) unsigned NOT NULL,\n" + 
		"  `auto_low` tinyint(1) unsigned NOT NULL,\n" + 
		"  `auto_hot` tinyint(1) unsigned NOT NULL,\n" + 
		"  `auto_mobile` tinyint(1) unsigned NOT NULL,\n" + 
		"  `auto_goalie` tinyint(1) unsigned NOT NULL,\n" + 
		"  `truss` tinyint(1) unsigned NOT NULL,\n" + 
		"  `catch` tinyint(1) unsigned NOT NULL,\n" + 
		"  `active_control` tinyint(1) unsigned NOT NULL,\n" + 
		"  `launch_ball` tinyint(1) unsigned NOT NULL,\n" + 
		"  `score_high` tinyint(1) NOT NULL,\n" + 
		"  `score_low` tinyint(1) NOT NULL,\n" + 
		"  `max_height` int(10) unsigned NOT NULL,\n" + 
		"  `scout_comments` text COLLATE latin1_general_cs NOT NULL,\n" + 
		"  `timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,\n" + 
		"  `invalid` tinyint(1) unsigned NOT NULL DEFAULT '0',\n" + 
		"  PRIMARY KEY (`id`),\n" + 
		"  KEY `timestamp` (`timestamp`)\n" + 
		") ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_cs AUTO_INCREMENT=1 ;\n" + 
		"\n" + 
		"-- --------------------------------------------------------\n" + 
		"\n" + 
		"--\n" + 
		"-- Table structure for table `wheel_base_lu`\n" + 
		"--\n" + 
		"\n" + 
		"CREATE TABLE IF NOT EXISTS `wheel_base_lu` (\n" + 
		"  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,\n" + 
		"  `wheel_base_desc` text COLLATE latin1_general_cs NOT NULL,\n" + 
		"  `timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,\n" + 
		"  `invalid` tinyint(1) unsigned NOT NULL DEFAULT '0',\n" + 
		"  PRIMARY KEY (`id`),\n" + 
		"  KEY `timestamp` (`timestamp`)\n" + 
		") ENGINE=MyISAM  DEFAULT CHARSET=latin1 COLLATE=latin1_general_cs AUTO_INCREMENT=9 ;\n" + 
		"\n" + 
		"--\n" + 
		"-- Dumping data for table `wheel_base_lu`\n" + 
		"--\n" + 
		"\n" + 
		"INSERT INTO `wheel_base_lu` (`id`, `wheel_base_desc`, `timestamp`, `invalid`) VALUES\n" + 
		"(1, '2 Wheel Drive', '2014-01-25 15:23:47', 0),\n" + 
		"(2, '4 Wheel Drive', '2014-01-25 15:23:47', 0),\n" + 
		"(3, '6 Wheel Drive', '2014-01-25 15:23:47', 0),\n" + 
		"(5, 'Crab Drive', '2014-01-25 15:23:47', 0),\n" + 
		"(6, 'Swerve Drive', '2014-01-25 15:23:47', 0),\n" + 
		"(7, 'Tank Drive', '2014-01-25 15:23:47', 0),\n" + 
		"(8, 'Other', '2014-01-25 15:23:47', 0),\n" + 
		"(4, '8 Wheel Drive (or more)', '2014-01-25 15:23:47', 0);\n" + 
		"\n" + 
		"-- --------------------------------------------------------\n" + 
		"\n" + 
		"--\n" + 
		"-- Table structure for table `wheel_type_lu`\n" + 
		"--\n" + 
		"\n" + 
		"CREATE TABLE IF NOT EXISTS `wheel_type_lu` (\n" + 
		"  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,\n" + 
		"  `wheel_type_desc` text COLLATE latin1_general_cs NOT NULL,\n" + 
		"  `timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,\n" + 
		"  `invalid` tinyint(1) unsigned NOT NULL DEFAULT '0',\n" + 
		"  PRIMARY KEY (`id`),\n" + 
		"  KEY `timestamp` (`timestamp`)\n" + 
		") ENGINE=MyISAM  DEFAULT CHARSET=latin1 COLLATE=latin1_general_cs AUTO_INCREMENT=11 ;\n" + 
		"\n" + 
		"--\n" + 
		"-- Dumping data for table `wheel_type_lu`\n" + 
		"--\n" + 
		"\n" + 
		"INSERT INTO `wheel_type_lu` (`id`, `wheel_type_desc`, `timestamp`, `invalid`) VALUES\n" + 
		"(1, 'Kit Wheels', '2014-01-25 15:25:39', 0),\n" + 
		"(2, 'IFI', '2014-01-25 15:25:39', 0),\n" + 
		"(3, 'Omni', '2014-01-25 15:25:39', 0),\n" + 
		"(4, 'Mecanum', '2014-01-25 15:25:39', 0),\n" + 
		"(5, 'Nylon', '2014-01-25 15:25:39', 0),\n" + 
		"(6, 'Rubber', '2014-01-25 15:25:39', 0),\n" + 
		"(7, 'Tank Tread', '2014-01-25 15:25:39', 0),\n" + 
		"(8, 'Swerve', '2014-01-25 15:25:39', 0),\n" + 
		"(9, 'Custom', '2014-01-25 15:25:39', 0),\n" + 
		"(10, 'Pneumatic', '2014-01-25 15:25:39', 0);\n" + 
		"\n" + 
		"/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;\n" + 
		"/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;\n" + 
		"/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;";

	public static final String SQL_DELETE_ENTRIES = 
		"DROP TABLE IF EXISTS 'configuration_lu'\n" +
		"DROP TABLE IF EXISTS 'event_lu'\n" +
		"DROP TABLE IF EXISTS 'fact_cycle_data'\n" +
		"DROP TABLE IF EXISTS 'fact_match_data'\n" +
		"DROP TABLE IF EXISTS 'notes_options'\n" +
		"DROP TABLE IF EXISTS 'robot_lu'\n" +
		"DROP TABLE IF EXISTS 'scout_pit_data'\n" +
		"DROP TABLE IF EXISTS 'wheel_base_lu'\n" +
		"DROP TABLE IF EXISTS 'wheel_type_lu'";

}
