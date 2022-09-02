CREATE TABLE `USER_TB` (
                           `idx` bigint(20) NOT NULL AUTO_INCREMENT,
                           `activated` bit(1) NOT NULL,
                           `created_at` datetime DEFAULT NULL,
                           `email` varchar(45) NOT NULL,
                           `fcm_token` varchar(255) DEFAULT NULL,
                           `nickname` varchar(45) NOT NULL,
                           `oauth` varchar(45) NOT NULL,
                           `password` varchar(255) NOT NULL,
                           `profile_image` varchar(255) DEFAULT NULL,
                           `refresh_token` varchar(255) DEFAULT NULL,
                           `auth_fk` varchar(255) DEFAULT NULL,
                           PRIMARY KEY (`idx`),
                           UNIQUE KEY `UK_58uw38qfl42ljv56adwfvep38` (`email`),
                           UNIQUE KEY `UK_65998n47vwuv50u2igiw5yvn0` (`fcm_token`),
                           UNIQUE KEY `UK_nhwpoecera4mblseijf0u08` (`refresh_token`),
                           KEY `FK29vepa5is295e3sirkeb6ay5f` (`auth_fk`),
                           CONSTRAINT `FK29vepa5is295e3sirkeb6ay5f` FOREIGN KEY (`auth_fk`) REFERENCES `AUTH_TB` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
