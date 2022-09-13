

DROP DATABASE IF EXISTS `banque`;
CREATE DATABASE `banque`;

USE `banque`;

DROP TABLE IF EXISTS `compte`;
CREATE TABLE `compte`(

    `id` BIGINT PRIMARY KEY AUTO_INCREMENT,
    `name` TEXT NOT NULL ,
    `solde` BIGINT NOT NULL

);


DROP TABLE IF EXISTS `transaction`;
CREATE TABLE `transaction`(

    `id` INTEGER PRIMARY KEY AUTO_INCREMENT,
    `title` TEXT NOT NULL ,
    `montant` BIGINT NOT NULL ,
    `compte_id` BIGINT NOT NULL

);


ALTER TABLE `transaction` ADD CONSTRAINT Fk_transaction_compte FOREIGN KEY (compte_id) REFERENCES `compte` (id);