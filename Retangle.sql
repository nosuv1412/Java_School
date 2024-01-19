-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 08, 2023 at 11:31 AM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rectangle`
--
DROP DATABASE IF EXISTS `rectangle`;
CREATE DATABASE IF NOT EXISTS `rectangle` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `rectangle`;

-- --------------------------------------------------------

--
-- Table structure for table `tbrectangle`
--

CREATE TABLE `tbrectangle` (
  `ID` int(11) NOT NULL,
  `color` varchar(10) NOT NULL,
  `filled` tinyint(1) NOT NULL,
  `width` double NOT NULL,
  `length` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbrectangle`
--

INSERT INTO `tbrectangle` (`ID`, `color`, `filled`, `width`, `length`) VALUES
(1, 'yellow', 1, 1, 1),
(2, 'green', 1, 1.3, 1.3),
(3, 'blue', 1, 1.5, 1.5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbrectangle`
--
ALTER TABLE `tbrectangle`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbrectangle`
--
ALTER TABLE `tbrectangle`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
