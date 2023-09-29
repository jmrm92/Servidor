CREATE TABLE `Libros` (`isbn` VARCHAR(255) NOT NULL,`titulo` VARCHAR(255) NOT NULL,`autor` VARCHAR(255) ,`precio` INT NOT NULL ,PRIMARY KEY (`isbn`));

INSERT INTO `Libros` (`isbn`, `titulo`, `autor`,  `tematica`) VALUES ('1ABC', 'Enero', 'Jose',  'Comedia');
INSERT INTO `Libros` (`isbn`, `titulo`, `autor`,  `tematica`) VALUES ('2ABC', 'Febrero', 'Juan', 'Terror');
INSERT INTO `Libros` (`isbn`, `titulo`, `autor`,  `tematica`) VALUES ('3ABC', 'Marzo', 'Maria', 'Drama');
INSERT INTO `Libros` (`isbn`, `titulo`, `autor`,  `tematica`) VALUES ('4ABC', 'Abril', 'Marta', 'Suspense');
INSERT INTO `Libros` (`isbn`, `titulo`, `autor`,  `tematica`) VALUES ('5ABC', 'mayo', 'Pepe', 'Comedia');