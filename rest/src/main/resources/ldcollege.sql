CREATE TABLE `ldcollege`.`ld_home_work` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_id` INT NOT NULL,
  `class_id` INT NOT NULL,
  `lession_id` INT NOT NULL,
  `homework_file_path` VARCHAR(100) NOT NULL,
  `homework_name` VARCHAR(50) NOT NULL,
  `create_date` DATE NULL,
  `correct_flag` INT NULL,
  `star_count` INT NULL,
  `negative_count` INT NULL,
  `best_flag` INT NULL,
  PRIMARY KEY (`id`));
