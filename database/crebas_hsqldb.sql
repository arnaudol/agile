/*==============================================================*/
/* DBMS name:      hsqldb 1.7.3.3
/* Created on:     23/02/2005 22:56:48                          */
/*==============================================================*/

/*==============================================================*/
/* Table: BOARD                                                 */
/*==============================================================*/
create table BOARD
(
   ID                             int                            not null IDENTITY PRIMARY KEY,
   PRO_ID                         int                            not null,
   NAME                           varchar(100)                   not null,
   DESCRIPTION                    varchar(255),
   VERSION                        bigint                         not null
);


/*==============================================================*/
/* Index: "PROJECT_HAS_BOARDS_FK"                                            */
/*==============================================================*/
create index PROJECT_HAS_BOARDS_FK on BOARD
(
   PRO_ID
);

/*==============================================================*/
/* Table: COMPANY                                               */
/*==============================================================*/
create table COMPANY
(
   ID                             int                            not null IDENTITY PRIMARY KEY,
   NAME                           varchar(100),
   STREETNUMBER                   varchar(100),
   STREETNAME                     varchar(100),
   POSTALCODE                     varchar(20),
   CITY                           varchar(100),
   COUNTRY                        varchar(50),
   VERSION                        bigint                         not null
);

/*==============================================================*/
/* Table: COUNTRY                                               */
/*==============================================================*/
create table COUNTRY
(
   CODE                           char(2)                        not null PRIMARY KEY,
   NAME                           varchar(50)                    not null,
   primary key (CODE)
);

Insert into country (code, name) values ('AF','AFGHANISTAN');
Insert into country (code, name) values ('AX','ÅLAND ISLANDS');
Insert into country (code, name) values ('AL','ALBANIA');
Insert into country (code, name) values ('DZ','ALGERIA');
Insert into country (code, name) values ('AS','AMERICAN SAMOA');
Insert into country (code, name) values ('AD','ANDORRA');
Insert into country (code, name) values ('AO','ANGOLA');
Insert into country (code, name) values ('AI','ANGUILLA');
Insert into country (code, name) values ('AQ','ANTARCTICA');
Insert into country (code, name) values ('AG','ANTIGUA AND BARBUDA');
Insert into country (code, name) values ('AR','ARGENTINA');
Insert into country (code, name) values ('AM','ARMENIA');
Insert into country (code, name) values ('AW','ARUBA');
Insert into country (code, name) values ('AU','AUSTRALIA');
Insert into country (code, name) values ('AT','AUSTRIA');
Insert into country (code, name) values ('AZ','AZERBAIJAN');
Insert into country (code, name) values ('BS','BAHAMAS');
Insert into country (code, name) values ('BH','BAHRAIN');
Insert into country (code, name) values ('BD','BANGLADESH');
Insert into country (code, name) values ('BB','BARBADOS');
Insert into country (code, name) values ('BY','BELARUS');
Insert into country (code, name) values ('BE','BELGIUM');
Insert into country (code, name) values ('BZ','BELIZE');
Insert into country (code, name) values ('BJ','BENIN');
Insert into country (code, name) values ('BM','BERMUDA');
Insert into country (code, name) values ('BT','BHUTAN');
Insert into country (code, name) values ('BO','BOLIVIA');
Insert into country (code, name) values ('BA','BOSNIA AND HERZEGOVINA');
Insert into country (code, name) values ('BW','BOTSWANA');
Insert into country (code, name) values ('BV','BOUVET ISLAND');
Insert into country (code, name) values ('BR','BRAZIL');
Insert into country (code, name) values ('IO','BRITISH INDIAN OCEAN TERRITORY');
Insert into country (code, name) values ('BN','BRUNEI DARUSSALAM');
Insert into country (code, name) values ('BG','BULGARIA');
Insert into country (code, name) values ('BF','BURKINA FASO');
Insert into country (code, name) values ('BI','BURUNDI');
Insert into country (code, name) values ('KH','CAMBODIA');
Insert into country (code, name) values ('CM','CAMEROON');
Insert into country (code, name) values ('CA','CANADA');
Insert into country (code, name) values ('CV','CAPE VERDE');
Insert into country (code, name) values ('KY','CAYMAN ISLANDS');
Insert into country (code, name) values ('CF','CENTRAL AFRICAN REPUBLIC');
Insert into country (code, name) values ('TD','CHAD');
Insert into country (code, name) values ('CL','CHILE');
Insert into country (code, name) values ('CN','CHINA');
Insert into country (code, name) values ('CX','CHRISTMAS ISLAND');
Insert into country (code, name) values ('CC','COCOS (KEELING) ISLANDS');
Insert into country (code, name) values ('CO','COLOMBIA');
Insert into country (code, name) values ('KM','COMOROS');
Insert into country (code, name) values ('CG','CONGO');
Insert into country (code, name) values ('CD','CONGO, THE DEMOCRATIC REPUBLIC OF THE');
Insert into country (code, name) values ('CK','COOK ISLANDS');
Insert into country (code, name) values ('CR','COSTA RICA');
Insert into country (code, name) values ('CI','COTE D''IVOIRE');
Insert into country (code, name) values ('HR','CROATIA');
Insert into country (code, name) values ('CU','CUBA');
Insert into country (code, name) values ('CY','CYPRUS');
Insert into country (code, name) values ('CZ','CZECH REPUBLIC');
Insert into country (code, name) values ('DK','DENMARK');
Insert into country (code, name) values ('DJ','DJIBOUTI');
Insert into country (code, name) values ('DM','DOMINICA');
Insert into country (code, name) values ('DO','DOMINICAN REPUBLIC');
Insert into country (code, name) values ('EC','ECUADOR');
Insert into country (code, name) values ('EG','EGYPT');
Insert into country (code, name) values ('SV','EL SALVADOR');
Insert into country (code, name) values ('GQ','EQUATORIAL GUINEA');
Insert into country (code, name) values ('ER','ERITREA');
Insert into country (code, name) values ('EE','ESTONIA');
Insert into country (code, name) values ('ET','ETHIOPIA');
Insert into country (code, name) values ('FK','FALKLAND ISLANDS (MALVINAS)');
Insert into country (code, name) values ('FO','FAROE ISLANDS');
Insert into country (code, name) values ('FJ','FIJI');
Insert into country (code, name) values ('FI','FINLAND');
Insert into country (code, name) values ('FR','FRANCE');
Insert into country (code, name) values ('GF','FRENCH GUIANA');
Insert into country (code, name) values ('PF','FRENCH POLYNESIA');
Insert into country (code, name) values ('TF','FRENCH SOUTHERN TERRITORIES');
Insert into country (code, name) values ('GA','GABON');
Insert into country (code, name) values ('GM','GAMBIA');
Insert into country (code, name) values ('GE','GEORGIA');
Insert into country (code, name) values ('DE','GERMANY');
Insert into country (code, name) values ('GH','GHANA');
Insert into country (code, name) values ('GI','GIBRALTAR');
Insert into country (code, name) values ('GR','GREECE');
Insert into country (code, name) values ('GL','GREENLAND');
Insert into country (code, name) values ('GD','GRENADA');
Insert into country (code, name) values ('GP','GUADELOUPE');
Insert into country (code, name) values ('GU','GUAM');
Insert into country (code, name) values ('GT','GUATEMALA');
Insert into country (code, name) values ('GN','GUINEA');
Insert into country (code, name) values ('GW','GUINEA-BISSAU');
Insert into country (code, name) values ('GY','GUYANA');
Insert into country (code, name) values ('HT','HAITI');
Insert into country (code, name) values ('HM','HEARD ISLAND AND MCDONALD ISLANDS');
Insert into country (code, name) values ('VA','HOLY SEE (VATICAN CITY STATE)');
Insert into country (code, name) values ('HN','HONDURAS');
Insert into country (code, name) values ('HK','HONG KONG');
Insert into country (code, name) values ('HU','HUNGARY');
Insert into country (code, name) values ('IS','ICELAND');
Insert into country (code, name) values ('IN','INDIA');
Insert into country (code, name) values ('ID','INDONESIA');
Insert into country (code, name) values ('IR','IRAN, ISLAMIC REPUBLIC OF');
Insert into country (code, name) values ('IQ','IRAQ');
Insert into country (code, name) values ('IE','IRELAND');
Insert into country (code, name) values ('IL','ISRAEL');
Insert into country (code, name) values ('IT','ITALY');
Insert into country (code, name) values ('JM','JAMAICA');
Insert into country (code, name) values ('JP','JAPAN');
Insert into country (code, name) values ('JO','JORDAN');
Insert into country (code, name) values ('KZ','KAZAKHSTAN');
Insert into country (code, name) values ('KE','KENYA');
Insert into country (code, name) values ('KI','KIRIBATI');
Insert into country (code, name) values ('KP','KOREA, DEMOCRATIC PEOPLE''S REPUBLIC OF');
Insert into country (code, name) values ('KR','KOREA, REPUBLIC OF');
Insert into country (code, name) values ('KW','KUWAIT');
Insert into country (code, name) values ('KG','KYRGYZSTAN');
Insert into country (code, name) values ('LA','LAO PEOPLE''S DEMOCRATIC REPUBLIC');
Insert into country (code, name) values ('LV','LATVIA');
Insert into country (code, name) values ('LB','LEBANON');
Insert into country (code, name) values ('LS','LESOTHO');
Insert into country (code, name) values ('LR','LIBERIA');
Insert into country (code, name) values ('LY','LIBYAN ARAB JAMAHIRIYA');
Insert into country (code, name) values ('LI','LIECHTENSTEIN');
Insert into country (code, name) values ('LT','LITHUANIA');
Insert into country (code, name) values ('LU','LUXEMBOURG');
Insert into country (code, name) values ('MO','MACAO');
Insert into country (code, name) values ('MK','MACEDONIA, THE FORMER YUGOSLAV REPUBLIC OF');
Insert into country (code, name) values ('MG','MADAGASCAR');
Insert into country (code, name) values ('MW','MALAWI');
Insert into country (code, name) values ('MY','MALAYSIA');
Insert into country (code, name) values ('MV','MALDIVES');
Insert into country (code, name) values ('ML','MALI');
Insert into country (code, name) values ('MT','MALTA');
Insert into country (code, name) values ('MH','MARSHALL ISLANDS');
Insert into country (code, name) values ('MQ','MARTINIQUE');
Insert into country (code, name) values ('MR','MAURITANIA');
Insert into country (code, name) values ('MU','MAURITIUS');
Insert into country (code, name) values ('YT','MAYOTTE');
Insert into country (code, name) values ('MX','MEXICO');
Insert into country (code, name) values ('FM','MICRONESIA, FEDERATED STATES OF');
Insert into country (code, name) values ('MD','MOLDOVA, REPUBLIC OF');
Insert into country (code, name) values ('MC','MONACO');
Insert into country (code, name) values ('MN','MONGOLIA');
Insert into country (code, name) values ('MS','MONTSERRAT');
Insert into country (code, name) values ('MA','MOROCCO');
Insert into country (code, name) values ('MZ','MOZAMBIQUE');
Insert into country (code, name) values ('MM','MYANMAR');
Insert into country (code, name) values ('NA','NAMIBIA');
Insert into country (code, name) values ('NR','NAURU');
Insert into country (code, name) values ('NP','NEPAL');
Insert into country (code, name) values ('NL','NETHERLANDS');
Insert into country (code, name) values ('AN','NETHERLANDS ANTILLES');
Insert into country (code, name) values ('NC','NEW CALEDONIA');
Insert into country (code, name) values ('NZ','NEW ZEALAND');
Insert into country (code, name) values ('NI','NICARAGUA');
Insert into country (code, name) values ('NE','NIGER');
Insert into country (code, name) values ('NG','NIGERIA');
Insert into country (code, name) values ('NU','NIUE');
Insert into country (code, name) values ('NF','NORFOLK ISLAND');
Insert into country (code, name) values ('MP','NORTHERN MARIANA ISLANDS');
Insert into country (code, name) values ('NO','NORWAY');
Insert into country (code, name) values ('OM','OMAN');
Insert into country (code, name) values ('PK','PAKISTAN');
Insert into country (code, name) values ('PW','PALAU');
Insert into country (code, name) values ('PS','PALESTINIAN TERRITORY, OCCUPIED');
Insert into country (code, name) values ('PA','PANAMA');
Insert into country (code, name) values ('PG','PAPUA NEW GUINEA');
Insert into country (code, name) values ('PY','PARAGUAY');
Insert into country (code, name) values ('PE','PERU');
Insert into country (code, name) values ('PH','PHILIPPINES');
Insert into country (code, name) values ('PN','PITCAIRN');
Insert into country (code, name) values ('PL','POLAND');
Insert into country (code, name) values ('PT','PORTUGAL');
Insert into country (code, name) values ('PR','PUERTO RICO');
Insert into country (code, name) values ('QA','QATAR');
Insert into country (code, name) values ('RE','REUNION');
Insert into country (code, name) values ('RO','ROMANIA');
Insert into country (code, name) values ('RU','RUSSIAN FEDERATION');
Insert into country (code, name) values ('RW','RWANDA');
Insert into country (code, name) values ('SH','SAINT HELENA');
Insert into country (code, name) values ('KN','SAINT KITTS AND NEVIS');
Insert into country (code, name) values ('LC','SAINT LUCIA');
Insert into country (code, name) values ('PM','SAINT PIERRE AND MIQUELON');
Insert into country (code, name) values ('VC','SAINT VINCENT AND THE GRENADINES');
Insert into country (code, name) values ('WS','SAMOA');
Insert into country (code, name) values ('SM','SAN MARINO');
Insert into country (code, name) values ('ST','SAO TOME AND PRINCIPE');
Insert into country (code, name) values ('SA','SAUDI ARABIA');
Insert into country (code, name) values ('SN','SENEGAL');
Insert into country (code, name) values ('CS','SERBIA AND MONTENEGRO');
Insert into country (code, name) values ('SC','SEYCHELLES');
Insert into country (code, name) values ('SL','SIERRA LEONE');
Insert into country (code, name) values ('SG','SINGAPORE');
Insert into country (code, name) values ('SK','SLOVAKIA');
Insert into country (code, name) values ('SI','SLOVENIA');
Insert into country (code, name) values ('SB','SOLOMON ISLANDS');
Insert into country (code, name) values ('SO','SOMALIA');
Insert into country (code, name) values ('ZA','SOUTH AFRICA');
Insert into country (code, name) values ('GS','SOUTH GEORGIA AND THE SOUTH SANDWICH ISLANDS');
Insert into country (code, name) values ('ES','SPAIN');
Insert into country (code, name) values ('LK','SRI LANKA');
Insert into country (code, name) values ('SD','SUDAN');
Insert into country (code, name) values ('SR','SURINAME');
Insert into country (code, name) values ('SJ','SVALBARD AND JAN MAYEN');
Insert into country (code, name) values ('SZ','SWAZILAND');
Insert into country (code, name) values ('SE','SWEDEN');
Insert into country (code, name) values ('CH','SWITZERLAND');
Insert into country (code, name) values ('SY','SYRIAN ARAB REPUBLIC');
Insert into country (code, name) values ('TW','TAIWAN, PROVINCE OF CHINA');
Insert into country (code, name) values ('TJ','TAJIKISTAN');
Insert into country (code, name) values ('TZ','TANZANIA, UNITED REPUBLIC OF');
Insert into country (code, name) values ('TH','THAILAND');
Insert into country (code, name) values ('TL','TIMOR-LESTE');
Insert into country (code, name) values ('TG','TOGO');
Insert into country (code, name) values ('TK','TOKELAU');
Insert into country (code, name) values ('TO','TONGA');
Insert into country (code, name) values ('TT','TRINIDAD AND TOBAGO');
Insert into country (code, name) values ('TN','TUNISIA');
Insert into country (code, name) values ('TR','TURKEY');
Insert into country (code, name) values ('TM','TURKMENISTAN');
Insert into country (code, name) values ('TC','TURKS AND CAICOS ISLANDS');
Insert into country (code, name) values ('TV','TUVALU');
Insert into country (code, name) values ('UG','UGANDA');
Insert into country (code, name) values ('UA','UKRAINE');
Insert into country (code, name) values ('AE','UNITED ARAB EMIRATES');
Insert into country (code, name) values ('GB','UNITED KINGDOM');
Insert into country (code, name) values ('US','UNITED STATES');
Insert into country (code, name) values ('UM','UNITED STATES MINOR OUTLYING ISLANDS');
Insert into country (code, name) values ('UY','URUGUAY');
Insert into country (code, name) values ('UZ','UZBEKISTAN');
Insert into country (code, name) values ('VU','VANUATU');
Insert into country (code, name) values ('VE','VENEZUELA');
Insert into country (code, name) values ('VN','VIET NAM');
Insert into country (code, name) values ('VG','VIRGIN ISLANDS, BRITISH');
Insert into country (code, name) values ('VI','VIRGIN ISLANDS, U.S.');
Insert into country (code, name) values ('WF','WALLIS AND FUTUNA');
Insert into country (code, name) values ('EH','WESTERN SAHARA');
Insert into country (code, name) values ('YE','YEMEN');
Insert into country (code, name) values ('ZM','ZAMBIA');
Insert into country (code, name) values ('ZW','ZIMBABWE');

/*==============================================================*/
/* Table: DIRECTORY                                             */
/*==============================================================*/
create table DIRECTORY
(
   ID                             int                            not null IDENTITY PRIMARY KEY,
   NAME                           varchar(100)                   not null,
   DIR_ID                         int,
   DIR_NAME                       varchar(100),
   VERSION                        bigint                         not null
);

/*==============================================================*/
/* Index: PROJECT_HAS_DIRECTORIES_FK                            */
/*==============================================================*/
create index PROJECT_HAS_DIRECTORIES_FK on DIRECTORY
(
   ID
);

/*==============================================================*/
/* Index: DIRECTORY_HAS_DIRECTORIES_FK                          */
/*==============================================================*/
create index DIRECTORY_HAS_DIRECTORIES_FK on DIRECTORY
(
   DIR_ID,
   DIR_NAME
);

/*==============================================================*/
/* Table: DIRECTORY_HAS_DOCUMENTS                               */
/*==============================================================*/
create table DIRECTORY_HAS_DOCUMENTS
(
   DIR_ID                         int                            not null IDENTITY PRIMARY KEY,
   NAME                           varchar(100)                   not null,
   ID                             int                            not null
);

/*==============================================================*/
/* Index: DIRECTORY_HAS_DOCUMENTS_FK                            */
/*==============================================================*/
create index DIRECTORY_HAS_DOCUMENTS_FK on DIRECTORY_HAS_DOCUMENTS
(
   DIR_ID,
   NAME
);

/*==============================================================*/
/* Index: DIRECTORY_HAS_DOCUMENTS_FK2                           */
/*==============================================================*/
create index DIRECTORY_HAS_DOCUMENTS_FK2 on DIRECTORY_HAS_DOCUMENTS
(
   ID
);

/*==============================================================*/
/* Table: DOCUMENT                                              */
/*==============================================================*/
create table DOCUMENT
(
   ID                             int                            not null IDENTITY PRIMARY KEY,
   NAME                           varchar(100)                   not null,
   DESCRIPTION                    varchar(255),
   TYPE                           varchar(50)                    not null,
   CONTENT                        LONGVARBINARY                  not null,
   CONTENTVERSION                 varchar(10),
   VERSION                        bigint                         not null
);

/*==============================================================*/
/* Table: IMPUTATION                                            */
/*==============================================================*/
create table IMPUTATION
(
   USERLOGIN                      varchar(10)                    not null,
   DATE                           int                            not null default 0,
   ID                             int                            not null,
   TIMECONSUMED                   double                         not null default 0,
   RAF                            double                         not null default 0,
   VERSION                        bigint                         not null
);

ALTER TABLE IMPUTATION ADD CONSTRAINT PK_IMPUTATION UNIQUE (USERLOGIN, DATE);

/*==============================================================*/
/* Index: TASK_HAS_IMPUTATION_FK                                */
/*==============================================================*/
create index TASK_HAS_IMPUTATION_FK on IMPUTATION
(
   ID
);


/*==============================================================*/
/* Table: ITERATION                                             */
/*==============================================================*/
create table ITERATION
(
   ID                             int                            not null IDENTITY PRIMARY KEY,
   REL_ID                         int,
   PRO_ID                         int                            not null,
   START                          date                           not null,
   END                            date                           not null,
   VERSION                        bigint                         not null,
   primary key (ID)
);

/*==============================================================*/
/* Index: ITERATION_IS_IN_RELEASE_FK                            */
/*==============================================================*/
create index ITERATION_IS_IN_RELEASE_FK on ITERATION
(
   REL_ID
);

/*==============================================================*/
/* Index: ITERATION_FOR_A_PROJECT_FK                            */
/*==============================================================*/
create index ITERATION_FOR_A_PROJECT_FK on ITERATION
(
   PRO_ID
);


/*==============================================================*/
/* Table: MEMBER                                                */
/*==============================================================*/
create table MEMBER
(
   PMU_ID                         int                            not null,
   ID                             int                            not null
);

ALTER TABLE MEMBER ADD CONSTRAINT PK_MEMBER UNIQUE (PMU_ID, ID);

/*==============================================================*/
/* Index: MEMBER_FK                                             */
/*==============================================================*/
create index MEMBER_FK on MEMBER
(
   PMU_ID
);

/*==============================================================*/
/* Index: MEMBER_FK2                                            */
/*==============================================================*/
create index MEMBER_FK2 on MEMBER
(
   ID
);

/*==============================================================*/
/* Table: MESSAGE                                               */
/*==============================================================*/
create table MESSAGE
(
   ID                             int                            not null IDENTITY PRIMARY KEY,
   PMU_ID                         int                            not null,
   BOA_ID                         int                            not null,
   TITLE                          varchar(255),
   CONTENT                        varchar                           not null,
   POSTEDDATE                     datetime                       not null,
   VERSION                        bigint                         not null
);

/*==============================================================*/
/* Index: MESSAGE_POSTED_BY_FK                                  */
/*==============================================================*/
create index MESSAGE_POSTED_BY_FK on MESSAGE
(
   PMU_ID
);

/*==============================================================*/
/* Index: BOARD_HAS_MESSAGES_FK                                 */
/*==============================================================*/
create index BOARD_HAS_MESSAGES_FK on MESSAGE
(
   BOA_ID
);

/*==============================================================*/
/* Table: PMUSER                                                */
/*==============================================================*/
create table PMUSER
(
   ID                             int                            not null IDENTITY PRIMARY KEY,
   COM_ID                         int,
   LOGIN                          varchar(10)                    not null,
   PWD                            varchar(10)                    not null,
   FIRSTNAME                      varchar(100),
   LASTNAME                       varchar(100),
   EMAIL                          varchar(50)                    not null,
   VERSION                        bigint                         not null
);

 insert into pmuser(login, pwd, firstname, lastname, email, version) 
 values ('administrateur', 'password', 'Robert', 'Mitchum', 'rm@worldcompany', 1);
/*==============================================================*/
/* Index: USER_WORK_FOR_A_COMPANY_FK                            */
/*==============================================================*/
create index USER_WORK_FOR_A_COMPANY_FK on PMUSER
(
   COM_ID
);

/*==============================================================*/
/* Table: PROJECT                                               */
/*==============================================================*/
create table PROJECT
(
   ID                             int                            not null IDENTITY PRIMARY KEY,
   PRO_ID                         int,
   CODE                           varchar(10)                    not null,
   NAME                           varchar(100)                   not null,
   VERSION                        bigint                         not null,
   primary key (ID)
);

/*==============================================================*/
/* Index: PROJECT__HAS_SUB_PROJECTS_FK                          */
/*==============================================================*/
create index PROJECT__HAS_SUB_PROJECTS_FK on PROJECT
(
   PRO_ID
);

/*==============================================================*/
/* Index: PROJECT_HAS_FORUM_FK                                  */
/*==============================================================*/
create index PROJECT_HAS_FORUM_FK on PROJECT
(
   PRO_ID
);

/*==============================================================*/
/* Table: RELEASE                                               */
/*==============================================================*/
create table RELEASE
(
   ID                             int                            not null IDENTITY PRIMARY KEY,
   PRO_ID                         int                            not null,
   NUMBER                         varchar(50)                    not null,
   DATE                           date                           not null,
   VERSION                        bigint                         not null,
   primary key (ID)
);

/*==============================================================*/
/* Index: RELEASE_FOR_A_PROJECT_FK                              */
/*==============================================================*/
create index RELEASE_FOR_A_PROJECT_FK on RELEASE
(
   PRO_ID
);

/*==============================================================*/
/* Table: STORY                                                 */
/*==============================================================*/
create table STORY
(
   ID                             int                            not null IDENTITY PRIMARY KEY,
   ITE_ID                         int,
   PRO_ID                         int                            not null,
   SHORTDESCRIPTION               varchar(100),
   DESCRIPTION                    varchar(255),
   ESTIMATE                       int,
   VERSION                        bigint                         not null,
   primary key (ID)
);

/*==============================================================*/
/* Index: STORY_FOR_A_PROJECT_FK                                */
/*==============================================================*/
create index STORY_FOR_A_PROJECT_FK on STORY
(
   PRO_ID
);

/*==============================================================*/
/* Index: STORY_IS_IN_ITERATION_FK                              */
/*==============================================================*/
create index STORY_IS_IN_ITERATION_FK on STORY
(
   ITE_ID
);

/*==============================================================*/
/* Table: TASK                                                  */
/*==============================================================*/
create table TASK
(
   ID                             int                            not null IDENTITY PRIMARY KEY,
   PMU_ID                         int                            ,
   SHORTDESCRIPTION               varchar(100)                   not null,
   IDEALDAY                       int                            default 0,
   VERSION                        bigint                         not null,
   primary key (ID)
);

/*==============================================================*/
/* Index: TASK_IS_ASSIGNED_TO_DEVELOPPER_FK                     */
/*==============================================================*/
create index TASK_IS_ASSIGNED_TO_DEVELOPPER_FK on TASK
(
   PMU_ID
);

/*==============================================================*/
/* Index: STORY_HAS_TASKS_FK                                    */
/*==============================================================*/
create index STORY_HAS_TASKS_FK on TASK
(
   STO_ID
);

alter table BOARD add constraint FK_PROJECT_HAS_BOARDS foreign key (PRO_ID)
      references PROJECT (ID) on delete restrict on update restrict;

alter table DIRECTORY add constraint FK_DIRECTORY_IS_IN_DIRECTORY foreign key (DIR_ID, DIR_NAME)
      references DIRECTORY (ID, NAME) on delete restrict on update restrict;

alter table DIRECTORY add constraint FK_PROJECT_HAS_DIRECTORIES foreign key (ID)
      references PROJECT (ID) on delete restrict on update restrict;

alter table DIRECTORY_HAS_DOCUMENTS add constraint FK_DIRECTORY_HAS_DOCUMENTS foreign key (DIR_ID, NAME)
      references DIRECTORY (ID, NAME) on delete restrict on update restrict;

alter table DIRECTORY_HAS_DOCUMENTS add constraint FK_DOCUMENT_IS_IN_DIRECTORY foreign key (ID)
      references DOCUMENT (ID) on delete restrict on update restrict;

alter table ITERATION add constraint FK_ITERATION_FOR_A_PROJECT foreign key (PRO_ID)
      references PROJECT (ID) on delete restrict on update restrict;

alter table ITERATION add constraint FK_ITERATION_IS_IN_RELEASE foreign key (REL_ID)
      references RELEASE (ID) on delete restrict on update restrict;

alter table MEMBER add constraint FK_PROJECTS_HAS_MEMBERS foreign key (ID)
      references PROJECT (ID) on delete restrict on update restrict;

alter table MEMBER add constraint FK_USER_IS_MEMBER_OF_PROJECTS foreign key (PMU_ID)
      references PMUSER (ID) on delete restrict on update restrict;

alter table MESSAGE add constraint FK_BOARD_HAS_MESSAGES foreign key (BOA_ID)
      references BOARD (ID) on delete restrict on update restrict;

alter table MESSAGE add constraint FK_MESSAGE_POSTED_BY foreign key (PMU_ID)
      references PMUSER (ID) on delete restrict on update restrict;

alter table PMUSER add constraint FK_USER_WORK_FOR_A_COMPANY foreign key (COM_ID)
      references COMPANY (ID) on delete restrict on update restrict;

alter table PROJECT add constraint FK_PROJECT__HAS_SUB_PROJECTS foreign key (PRO_ID)
      references PROJECT (ID) on delete restrict on update restrict;

alter table RELEASE add constraint FK_RELEASE_FOR_A_PROJECT foreign key (PRO_ID)
      references PROJECT (ID) on delete restrict on update restrict;

alter table STORY add constraint FK_STORY_FOR_A_PROJECT foreign key (PRO_ID)
      references PROJECT (ID) on delete restrict on update restrict;

alter table STORY add constraint FK_STORY_IS_IN_ITERATION foreign key (ITE_ID)
      references ITERATION (ID) on delete restrict on update restrict;

alter table TASK add constraint FK_STORY_HAS_TASKS foreign key (STO_ID)
      references STORY (ID) on delete restrict on update restrict;

alter table TASK add constraint FK_TASK_IS_ASSIGNED_TO_DEVELOPPER foreign key (PMU_ID)
      references PMUSER (ID) on delete restrict on update restrict;
      
      
/*==============================================================*/
/* Table: STORY_HAS_TASKS                               */
/*==============================================================*/
create table STORY_HAS_TASKS
(
   ID                             int                            not null,
   STO_ID                         int                            not null
);
