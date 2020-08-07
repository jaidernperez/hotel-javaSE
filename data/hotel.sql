/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     22/06/2020 7:54:55 p. m.                     */
/*==============================================================*/

DROP DATABASE IF EXISTS db_hotel;
CREATE DATABASE IF NOT EXISTS db_hotel character set UTF8mb4 collate utf8mb4_bin;
USE db_hotel;

/*==============================================================*/
/* Table: CLIENTE                                               */
/*==============================================================*/
create table CLIENTE
(
   ID_CLIENTE           int auto_increment not null,
   NOMBRES              varchar(50) not null,
   APELLIDOS            varchar(50) not null,
   CEDULA               varchar(15) not null,
   CORREO               varchar(50) not null,
   TELEFONO             varchar(20),
   primary key (ID_CLIENTE)
);

/*==============================================================*/
/* Table: ESTADO_HABITACION                                     */
/*==============================================================*/
create table ESTADO_HABITACION
(
   ID_ESTADO            int auto_increment not null,
   NOMBRE               varchar(50) not null,
   primary key (ID_ESTADO)
);

/*==============================================================*/
/* Table: HABITACION                                            */
/*==============================================================*/
create table HABITACION
(
   ID_HABITACION        int auto_increment not null,
   ID_PISO              int not null,
   ID_TIPO              int not null,
   ID_ESTADO            int not null,
   PRECIO               float(8,2) not null,
   NOMBRE               varchar(50) not null,
   primary key (ID_HABITACION)
);

/*==============================================================*/
/* Table: INGRESO                                               */
/*==============================================================*/
create table INGRESO
(
   ID_CLIENTE           int not null,
   USUARIO              varchar(50) not null,
   CLAVE                varchar(64) not null,
   primary key (ID_CLIENTE)
);

/*==============================================================*/
/* Table: PISO                                                  */
/*==============================================================*/
create table PISO
(
   ID_PISO              int auto_increment not null,
   NOMBRE               varchar(50) not null,
   primary key (ID_PISO)
);

/*==============================================================*/
/* Table: RESERVA                                               */
/*==============================================================*/
create table RESERVA
(
   ID_RESERVA           int auto_increment not null,
   ID_HABITACION        int not null,
   ID_CLIENTE           int not null,
   FECHA_INICIO         date not null,
   FECHA_SALIDA         date,
   ESTADO               smallint not null,
   primary key (ID_RESERVA)
);

/*==============================================================*/
/* Table: TIPO_HABITACION                                       */
/*==============================================================*/
create table TIPO_HABITACION
(
   ID_TIPO              int auto_increment not null,
   NOMBRE               varchar(50) not null,
   primary key (ID_TIPO)
);

alter table HABITACION add constraint FK_REFERENCE_1 foreign key (ID_PISO)
      references PISO (ID_PISO) on delete restrict on update restrict;

alter table HABITACION add constraint FK_REFERENCE_2 foreign key (ID_TIPO)
      references TIPO_HABITACION (ID_TIPO) on delete restrict on update restrict;

alter table HABITACION add constraint FK_REFERENCE_3 foreign key (ID_ESTADO)
      references ESTADO_HABITACION (ID_ESTADO) on delete restrict on update restrict;

alter table INGRESO add constraint FK_REFERENCE_6 foreign key (ID_CLIENTE)
      references CLIENTE (ID_CLIENTE) on delete restrict on update restrict;

alter table RESERVA add constraint FK_REFERENCE_4 foreign key (ID_HABITACION)
      references HABITACION (ID_HABITACION) on delete restrict on update restrict;

alter table RESERVA add constraint FK_REFERENCE_5 foreign key (ID_CLIENTE)
      references CLIENTE (ID_CLIENTE) on delete restrict on update restrict;

/*==============================================================*/
/* INSERTS                                                      */
/*==============================================================*/

-- Table PISO
insert into PISO (NOMBRE) values ('Primer piso');
insert into PISO (NOMBRE) values ('Segundo piso');
insert into PISO (NOMBRE) values ('Tercer piso');
insert into PISO (NOMBRE) values ('Cuarto piso');
insert into PISO (NOMBRE) values ('Planta baja');

-- Table TIPO_HABITACION
insert into  TIPO_HABITACION(NOMBRE) values ('Sencilla');
insert into  TIPO_HABITACION(NOMBRE) values ('Doble');
insert into  TIPO_HABITACION(NOMBRE) values ('Familiar');
insert into  TIPO_HABITACION(NOMBRE) values ('Lujo');

-- Table ESTADO_HABITACION
insert into ESTADO_HABITACION (NOMBRE) values ('Disponible');
insert into ESTADO_HABITACION (NOMBRE) values ('Ocupada');
insert into ESTADO_HABITACION (NOMBRE) values ('Mantenimiento');

-- Table HABITACION
insert into HABITACION (ID_PISO, ID_TIPO, ID_ESTADO, PRECIO, NOMBRE)
values (1, 2, 1, 150000, '101');
insert into HABITACION (ID_PISO, ID_TIPO, ID_ESTADO, PRECIO, NOMBRE)
values (1, 1, 2, 70000, '102');
insert into HABITACION (ID_PISO, ID_TIPO, ID_ESTADO, PRECIO, NOMBRE)
values (1, 3, 1, 200000, '103');
insert into HABITACION (ID_PISO, ID_TIPO, ID_ESTADO, PRECIO, NOMBRE)
values (1, 4, 3, 300000, '101');

-- Table CLIENTE
insert into CLIENTE (NOMBRES, APELLIDOS, CEDULA, CORREO, TELEFONO)
values ('Juan', 'Alfonso',1005698462, 'juan39@gmail.com', 3114789261);
insert into CLIENTE (NOMBRES, APELLIDOS, CEDULA, CORREO, TELEFONO)
values ('Martha', 'Camargo',1005698462, 'martha674@hotmail.com', 3004289318);
insert into CLIENTE (NOMBRES, APELLIDOS, CEDULA, CORREO, TELEFONO)
values ('Juliana', 'Rios',2351247, 'juliana400@outlook.com', 3124526831);

-- Table RESERVA
insert into RESERVA (ID_HABITACION, ID_CLIENTE, FECHA_INICIO, FECHA_SALIDA, ESTADO)
values (2,1,'2020-07-25', null, 1);
insert into RESERVA (ID_HABITACION, ID_CLIENTE, FECHA_INICIO, FECHA_SALIDA, ESTADO)
values (4,3,'2020-07-30', '2020-08-10', 2);
