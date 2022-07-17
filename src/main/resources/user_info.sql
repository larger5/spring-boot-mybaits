CREATE TABLE `user_info` (
  `id` bigint NOT NULL,
  `create_time` datetime(6) DEFAULT NULL,
  `money` decimal(19,2) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;