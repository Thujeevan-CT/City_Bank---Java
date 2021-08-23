-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 04, 2021 at 12:26 PM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.4.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `city_bank`
--

-- --------------------------------------------------------

--
-- Table structure for table `admindb`
--

CREATE TABLE `admindb` (
  `id` int(11) NOT NULL,
  `user` varchar(50) NOT NULL,
  `password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admindb`
--

INSERT INTO `admindb` (`id`, `user`, `password`) VALUES
(1, 'manager', '@admin');

-- --------------------------------------------------------

--
-- Table structure for table `cashierdb`
--

CREATE TABLE `cashierdb` (
  `id` int(11) NOT NULL,
  `username` varchar(40) NOT NULL,
  `password` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cashierdb`
--

INSERT INTO `cashierdb` (`id`, `username`, `password`) VALUES
(1, 'raj', 'user1'),
(2, 'Karan', 'user2'),
(3, 'Vinsan', 'user3'),
(4, 'Raju', 'user4'),
(5, 'USER NAME', 'Password'),
(6, 'kevin', 'user5'),
(7, 'raja', 'user6'),
(8, 'varnan', 'user7'),
(10, 'ravi', 'user1');

-- --------------------------------------------------------

--
-- Table structure for table `customersdb`
--

CREATE TABLE `customersdb` (
  `accountnumber` int(255) NOT NULL,
  `fullname` varchar(100) NOT NULL,
  `age` int(10) NOT NULL,
  `address` varchar(150) NOT NULL,
  `nic` varchar(20) NOT NULL,
  `gender` enum('Male','Female','Other','') NOT NULL,
  `email` varchar(45) NOT NULL,
  `phonenumber` int(13) NOT NULL,
  `accounttype` enum('Regular Savings Account','Super Saver Account','Power Bonus Account','Personal Foreign Currency Accounts','Children''s Savings Account','Senior Citizens Account','Women''s Savings Account') NOT NULL,
  `depositamount` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customersdb`
--

INSERT INTO `customersdb` (`accountnumber`, `fullname`, `age`, `address`, `nic`, `gender`, `email`, `phonenumber`, `accounttype`, `depositamount`) VALUES
(25100000, 'Rasaratnam Ananya', 21, 'Inuvil, Jaffna.', '200024921490', 'Female', 'Ananya28@mail.com', 763830134, 'Regular Savings Account', 115000),
(25100001, 'Kanakaratnam kesavan', 29, 'Kondavil, Jaffna.', '1991738498V', 'Male', 'kesavan@mail.com', 774748343, 'Regular Savings Account', 50000),
(25100002, 'Thaya Rajeevan', 23, 'Chulipuram, Jaffna.', '1999385992V', 'Male', 'Rajeevan@mail.com', 763544785, 'Super Saver Account', 50000),
(25100003, 'Yogaratnam Sivanujan', 25, 'kokuvi, Jaffna.', '1994384958V', 'Male', 'Sivanujan@mail.com', 764365356, 'Super Saver Account', 300000),
(25100004, 'Sivakanthan Banujan', 22, 'kokuvil, Jaffna.', '200043560982', 'Male', 'Banujan@mail.com', 784567761, 'Power Bonus Account', 472000),
(25100005, 'Kangaratnam Vithusha', 25, 'Urumpirai, Jaffna.', '1994534357V', 'Female', 'Vithusha@mail.com', 753457344, 'Women\'s Savings Account', 80000),
(25100006, 'Yogaraj Anandhan', 27, 'Manipay, Jaffna.', '1993384739V', 'Male', 'Anandhan@mail.com', 774356731, 'Personal Foreign Currency Accounts', 45000),
(25100007, 'Gnakaran Tharsika', 24, 'Kilinochchi.', '1994394393V', 'Female', 'Tharsika@mail.com', 775564512, 'Super Saver Account', 55000),
(25100008, 'Rajasingam Kesavan', 26, 'Colombo', '1994453576V', 'Male', 'Kesavan@mail.com', 762343434, 'Regular Savings Account', 55000),
(25100009, 'Yogratnam Sanjeevan', 24, 'Jaffna', '20013456789', 'Male', 'Sanjeevan@mail.com', 763453452, 'Regular Savings Account', 45000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admindb`
--
ALTER TABLE `admindb`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `cashierdb`
--
ALTER TABLE `cashierdb`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indexes for table `customersdb`
--
ALTER TABLE `customersdb`
  ADD PRIMARY KEY (`accountnumber`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admindb`
--
ALTER TABLE `admindb`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `cashierdb`
--
ALTER TABLE `cashierdb`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `customersdb`
--
ALTER TABLE `customersdb`
  MODIFY `accountnumber` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25100010;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
