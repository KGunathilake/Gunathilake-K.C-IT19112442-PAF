-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 15, 2022 at 06:53 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 7.4.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `paf`
--

-- --------------------------------------------------------

--
-- Table structure for table `connectionrequests`
--

CREATE TABLE `connectionrequests` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `nic` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `street` varchar(255) NOT NULL,
  `postalCode` int(11) NOT NULL,
  `city` varchar(255) NOT NULL,
  `contact` int(11) NOT NULL,
  `message` text NOT NULL,
  `district` varchar(255) NOT NULL,
  `contype` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `connectionrequests`
--

INSERT INTO `connectionrequests` (`id`, `name`, `nic`, `email`, `street`, `postalCode`, `city`, `contact`, `message`, `district`, `contype`, `status`) VALUES
(350628, 'aBC', '89476389v', 'abC%40gmail.com', 'abcdef', 47856, 'city', 93768268, 'AAAAAAAAAAA+AAAAAAAAAAAAAAAcccccccccccccccccccc', 'district', 'Business', 'Complete');

-- --------------------------------------------------------

--
-- Table structure for table `help`
--

CREATE TABLE `help` (
  `id` int(11) NOT NULL,
  `clientName` varchar(255) NOT NULL,
  `nic` varchar(255) NOT NULL,
  `acNumber` int(11) NOT NULL,
  `address` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `contact` int(11) NOT NULL,
  `message` varchar(255) NOT NULL,
  `type` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `help`
--

INSERT INTO `help` (`id`, `clientName`, `nic`, `acNumber`, `address`, `email`, `contact`, `message`, `type`, `status`) VALUES
(2, 'Kavindya', 'sdsd', 123456, 'No  480,sdfd', 'example@gmail.com', 767592100, 'thak for connect', 'Help', 'completed');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `connectionrequests`
--
ALTER TABLE `connectionrequests`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `help`
--
ALTER TABLE `help`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `connectionrequests`
--
ALTER TABLE `connectionrequests`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1711229522;

--
-- AUTO_INCREMENT for table `help`
--
ALTER TABLE `help`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
