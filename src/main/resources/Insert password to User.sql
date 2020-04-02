ALTER TABLE `ishop`.`users`
ADD COLUMN `password` VARCHAR(45) NOT NULL AFTER `role`;
