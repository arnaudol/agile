/*==============================================================*/
/* Table: BOARD                                                 */
/*==============================================================*
create table BOARD
(
   ID                             int                            not null AUTO_INCREMENT,
   PRO_ID                         int                            not null,
   NAME                           varchar(100)                   not null,
   DESCRIPTION                    varchar(255),
   VERSION                        bigint                         not null,
   primary key (ID)
)
type = InnoDB;

/*==============================================================*/
/* Index: "PROJECT_HAS_BOARDS_FK"                               */
/*==============================================================*
create index PROJECT_HAS_BOARDS_FK on BOARD
(
   PRO_ID
);

/*==============================================================*/
/* Table: BUSINESSVALUE                                         */
/*==============================================================*/
create table BUSINESSVALUE
(
   ID                             int                            not null,
   DESCRIPTION                    varchar(100)                   not null,
   primary key (ID)
)
type = InnoDB;

insert into BUSINESSVALUE (id, description) values (1,'HIGH');
insert into BUSINESSVALUE (id, description) values (2,'MEDIUM');
insert into BUSINESSVALUE (id, description) values (3,'LOW');

/*==============================================================*/
/* Table: CHARGE                                                */
/*==============================================================*/
create table CHARGE
(
   ID                             int                            not null AUTO_INCREMENT,
   TAS_ID                         int                            not null,
   PMU_ID                         int                            not null,
   DAY                            date                           not null,
   TIMEUSED                       decimal(5,2)                   not null,
   DAYSNEEDEDTOFINISH             decimal(5,2)                   not null,
   VERSION                        bigint                         not null,
   primary key (ID)
)
type = InnoDB;

/*==============================================================*/
/* Index: CHARGE_FOR_A_TASK_FK                                  */
/*==============================================================*/
create index CHARGE_FOR_A_TASK_FK on CHARGE
(
   TAS_ID
);

/*==============================================================*/
/* Index: USER_FOR_A_TASK_FK                                    */
/*==============================================================*/
create index USER_FOR_A_TASK_FK on CHARGE
(
   PMU_ID
);

/*==============================================================*/
/* Table: COMPANY                                               */
/*==============================================================*/
create table COMPANY
(
   ID                             int                            not null AUTO_INCREMENT,
   NAME                           varchar(100),
   STREETNUMBER                   varchar(10),
   STREETNAME                     varchar(100),
   POSTALCODE                     varchar(20),
   CITY                           varchar(100),
   COUNTRY                        varchar(50),
   VERSION                        bigint                         not null,
   primary key (ID)
)
comment = "MySQL table"
type = InnoDB;

/*==============================================================*/
/* Table: COUNTRY                                               */
/*==============================================================*/
create table COUNTRY
(
   CODE                           char(2)                        not null,
   NAME                           varchar(50)                    not null,
   primary key (CODE)
)
type = MYISAM;

insert into COUNTRY (code, name) values ('AF','AFGHANISTAN');
insert into COUNTRY (code, name) values ('AX','LAND ISLANDS');
insert into COUNTRY (code, name) values ('AL','ALBANIA');
insert into COUNTRY (code, name) values ('DZ','ALGERIA');
insert into COUNTRY (code, name) values ('AS','AMERICAN SAMOA');
insert into COUNTRY (code, name) values ('AD','ANDORRA');
insert into COUNTRY (code, name) values ('AO','ANGOLA');
insert into COUNTRY (code, name) values ('AI','ANGUILLA');
insert into COUNTRY (code, name) values ('AQ','ANTARCTICA');
insert into COUNTRY (code, name) values ('AG','ANTIGUA AND BARBUDA');
insert into COUNTRY (code, name) values ('AR','ARGENTINA');
insert into COUNTRY (code, name) values ('AM','ARMENIA');
insert into COUNTRY (code, name) values ('AW','ARUBA');
insert into COUNTRY (code, name) values ('AU','AUSTRALIA');
insert into COUNTRY (code, name) values ('AT','AUSTRIA');
insert into COUNTRY (code, name) values ('AZ','AZERBAIJAN');
insert into COUNTRY (code, name) values ('BS','BAHAMAS');
insert into COUNTRY (code, name) values ('BH','BAHRAIN');
insert into COUNTRY (code, name) values ('BD','BANGLADESH');
insert into COUNTRY (code, name) values ('BB','BARBADOS');
insert into COUNTRY (code, name) values ('BY','BELARUS');
insert into COUNTRY (code, name) values ('BE','BELGIUM');
insert into COUNTRY (code, name) values ('BZ','BELIZE');
insert into COUNTRY (code, name) values ('BJ','BENIN');
insert into COUNTRY (code, name) values ('BM','BERMUDA');
insert into COUNTRY (code, name) values ('BT','BHUTAN');
insert into COUNTRY (code, name) values ('BO','BOLIVIA');
insert into COUNTRY (code, name) values ('BA','BOSNIA AND HERZEGOVINA');
insert into COUNTRY (code, name) values ('BW','BOTSWANA');
insert into COUNTRY (code, name) values ('BV','BOUVET ISLAND');
insert into COUNTRY (code, name) values ('BR','BRAZIL');
insert into COUNTRY (code, name) values ('IO','BRITISH INDIAN OCEAN TERRITORY');
insert into COUNTRY (code, name) values ('BN','BRUNEI DARUSSALAM');
insert into COUNTRY (code, name) values ('BG','BULGARIA');
insert into COUNTRY (code, name) values ('BF','BURKINA FASO');
insert into COUNTRY (code, name) values ('BI','BURUNDI');
insert into COUNTRY (code, name) values ('KH','CAMBODIA');
insert into COUNTRY (code, name) values ('CM','CAMEROON');
insert into COUNTRY (code, name) values ('CA','CANADA');
insert into COUNTRY (code, name) values ('CV','CAPE VERDE');
insert into COUNTRY (code, name) values ('KY','CAYMAN ISLANDS');
insert into COUNTRY (code, name) values ('CF','CENTRAL AFRICAN REPUBLIC');
insert into COUNTRY (code, name) values ('TD','CHAD');
insert into COUNTRY (code, name) values ('CL','CHILE');
insert into COUNTRY (code, name) values ('CN','CHINA');
insert into COUNTRY (code, name) values ('CX','CHRISTMAS ISLAND');
insert into COUNTRY (code, name) values ('CC','COCOS (KEELING) ISLANDS');
insert into COUNTRY (code, name) values ('CO','COLOMBIA');
insert into COUNTRY (code, name) values ('KM','COMOROS');
insert into COUNTRY (code, name) values ('CG','CONGO');
insert into COUNTRY (code, name) values ('CD','CONGO, THE DEMOCRATIC REPUBLIC OF THE');
insert into COUNTRY (code, name) values ('CK','COOK ISLANDS');
insert into COUNTRY (code, name) values ('CR','COSTA RICA');
insert into COUNTRY (code, name) values ('CI','COTE D''IVOIRE');
insert into COUNTRY (code, name) values ('HR','CROATIA');
insert into COUNTRY (code, name) values ('CU','CUBA');
insert into COUNTRY (code, name) values ('CY','CYPRUS');
insert into COUNTRY (code, name) values ('CZ','CZECH REPUBLIC');
insert into COUNTRY (code, name) values ('DK','DENMARK');
insert into COUNTRY (code, name) values ('DJ','DJIBOUTI');
insert into COUNTRY (code, name) values ('DM','DOMINICA');
insert into COUNTRY (code, name) values ('DO','DOMINICAN REPUBLIC');
insert into COUNTRY (code, name) values ('EC','ECUADOR');
insert into COUNTRY (code, name) values ('EG','EGYPT');
insert into COUNTRY (code, name) values ('SV','EL SALVADOR');
insert into COUNTRY (code, name) values ('GQ','EQUATORIAL GUINEA');
insert into COUNTRY (code, name) values ('ER','ERITREA');
insert into COUNTRY (code, name) values ('EE','ESTONIA');
insert into COUNTRY (code, name) values ('ET','ETHIOPIA');
insert into COUNTRY (code, name) values ('FK','FALKLAND ISLANDS (MALVINAS)');
insert into COUNTRY (code, name) values ('FO','FAROE ISLANDS');
insert into COUNTRY (code, name) values ('FJ','FIJI');
insert into COUNTRY (code, name) values ('FI','FINLAND');
insert into COUNTRY (code, name) values ('FR','FRANCE');
insert into COUNTRY (code, name) values ('GF','FRENCH GUIANA');
insert into COUNTRY (code, name) values ('PF','FRENCH POLYNESIA');
insert into COUNTRY (code, name) values ('TF','FRENCH SOUTHERN TERRITORIES');
insert into COUNTRY (code, name) values ('GA','GABON');
insert into COUNTRY (code, name) values ('GM','GAMBIA');
insert into COUNTRY (code, name) values ('GE','GEORGIA');
insert into COUNTRY (code, name) values ('DE','GERMANY');
insert into COUNTRY (code, name) values ('GH','GHANA');
insert into COUNTRY (code, name) values ('GI','GIBRALTAR');
insert into COUNTRY (code, name) values ('GR','GREECE');
insert into COUNTRY (code, name) values ('GL','GREENLAND');
insert into COUNTRY (code, name) values ('GD','GRENADA');
insert into COUNTRY (code, name) values ('GP','GUADELOUPE');
insert into COUNTRY (code, name) values ('GU','GUAM');
insert into COUNTRY (code, name) values ('GT','GUATEMALA');
insert into COUNTRY (code, name) values ('GN','GUINEA');
insert into COUNTRY (code, name) values ('GW','GUINEA-BISSAU');
insert into COUNTRY (code, name) values ('GY','GUYANA');
insert into COUNTRY (code, name) values ('HT','HAITI');
insert into COUNTRY (code, name) values ('HM','HEARD ISLAND AND MCDONALD ISLANDS');
insert into COUNTRY (code, name) values ('VA','HOLY SEE (VATICAN CITY STATE)');
insert into COUNTRY (code, name) values ('HN','HONDURAS');
insert into COUNTRY (code, name) values ('HK','HONG KONG');
insert into COUNTRY (code, name) values ('HU','HUNGARY');
insert into COUNTRY (code, name) values ('IS','ICELAND');
insert into COUNTRY (code, name) values ('IN','INDIA');
insert into COUNTRY (code, name) values ('ID','INDONESIA');
insert into COUNTRY (code, name) values ('IR','IRAN, ISLAMIC REPUBLIC OF');
insert into COUNTRY (code, name) values ('IQ','IRAQ');
insert into COUNTRY (code, name) values ('IE','IRELAND');
insert into COUNTRY (code, name) values ('IL','ISRAEL');
insert into COUNTRY (code, name) values ('IT','ITALY');
insert into COUNTRY (code, name) values ('JM','JAMAICA');
insert into COUNTRY (code, name) values ('JP','JAPAN');
insert into COUNTRY (code, name) values ('JO','JORDAN');
insert into COUNTRY (code, name) values ('KZ','KAZAKHSTAN');
insert into COUNTRY (code, name) values ('KE','KENYA');
insert into COUNTRY (code, name) values ('KI','KIRIBATI');
insert into COUNTRY (code, name) values ('KP','KOREA, DEMOCRATIC PEOPLE''S REPUBLIC OF');
insert into COUNTRY (code, name) values ('KR','KOREA, REPUBLIC OF');
insert into COUNTRY (code, name) values ('KW','KUWAIT');
insert into COUNTRY (code, name) values ('KG','KYRGYZSTAN');
insert into COUNTRY (code, name) values ('LA','LAO PEOPLE''S DEMOCRATIC REPUBLIC');
insert into COUNTRY (code, name) values ('LV','LATVIA');
insert into COUNTRY (code, name) values ('LB','LEBANON');
insert into COUNTRY (code, name) values ('LS','LESOTHO');
insert into COUNTRY (code, name) values ('LR','LIBERIA');
insert into COUNTRY (code, name) values ('LY','LIBYAN ARAB JAMAHIRIYA');
insert into COUNTRY (code, name) values ('LI','LIECHTENSTEIN');
insert into COUNTRY (code, name) values ('LT','LITHUANIA');
insert into COUNTRY (code, name) values ('LU','LUXEMBOURG');
insert into COUNTRY (code, name) values ('MO','MACAO');
insert into COUNTRY (code, name) values ('MK','MACEDONIA, THE FORMER YUGOSLAV REPUBLIC OF');
insert into COUNTRY (code, name) values ('MG','MADAGASCAR');
insert into COUNTRY (code, name) values ('MW','MALAWI');
insert into COUNTRY (code, name) values ('MY','MALAYSIA');
insert into COUNTRY (code, name) values ('MV','MALDIVES');
insert into COUNTRY (code, name) values ('ML','MALI');
insert into COUNTRY (code, name) values ('MT','MALTA');
insert into COUNTRY (code, name) values ('MH','MARSHALL ISLANDS');
insert into COUNTRY (code, name) values ('MQ','MARTINIQUE');
insert into COUNTRY (code, name) values ('MR','MAURITANIA');
insert into COUNTRY (code, name) values ('MU','MAURITIUS');
insert into COUNTRY (code, name) values ('YT','MAYOTTE');
insert into COUNTRY (code, name) values ('MX','MEXICO');
insert into COUNTRY (code, name) values ('FM','MICRONESIA, FEDERATED STATES OF');
insert into COUNTRY (code, name) values ('MD','MOLDOVA, REPUBLIC OF');
insert into COUNTRY (code, name) values ('MC','MONACO');
insert into COUNTRY (code, name) values ('MN','MONGOLIA');
insert into COUNTRY (code, name) values ('MS','MONTSERRAT');
insert into COUNTRY (code, name) values ('MA','MOROCCO');
insert into COUNTRY (code, name) values ('MZ','MOZAMBIQUE');
insert into COUNTRY (code, name) values ('MM','MYANMAR');
insert into COUNTRY (code, name) values ('NA','NAMIBIA');
insert into COUNTRY (code, name) values ('NR','NAURU');
insert into COUNTRY (code, name) values ('NP','NEPAL');
insert into COUNTRY (code, name) values ('NL','NETHERLANDS');
insert into COUNTRY (code, name) values ('AN','NETHERLANDS ANTILLES');
insert into COUNTRY (code, name) values ('NC','NEW CALEDONIA');
insert into COUNTRY (code, name) values ('NZ','NEW ZEALAND');
insert into COUNTRY (code, name) values ('NI','NICARAGUA');
insert into COUNTRY (code, name) values ('NE','NIGER');
insert into COUNTRY (code, name) values ('NG','NIGERIA');
insert into COUNTRY (code, name) values ('NU','NIUE');
insert into COUNTRY (code, name) values ('NF','NORFOLK ISLAND');
insert into COUNTRY (code, name) values ('MP','NORTHERN MARIANA ISLANDS');
insert into COUNTRY (code, name) values ('NO','NORWAY');
insert into COUNTRY (code, name) values ('OM','OMAN');
insert into COUNTRY (code, name) values ('PK','PAKISTAN');
insert into COUNTRY (code, name) values ('PW','PALAU');
insert into COUNTRY (code, name) values ('PS','PALESTINIAN TERRITORY, OCCUPIED');
insert into COUNTRY (code, name) values ('PA','PANAMA');
insert into COUNTRY (code, name) values ('PG','PAPUA NEW GUINEA');
insert into COUNTRY (code, name) values ('PY','PARAGUAY');
insert into COUNTRY (code, name) values ('PE','PERU');
insert into COUNTRY (code, name) values ('PH','PHILIPPINES');
insert into COUNTRY (code, name) values ('PN','PITCAIRN');
insert into COUNTRY (code, name) values ('PL','POLAND');
insert into COUNTRY (code, name) values ('PT','PORTUGAL');
insert into COUNTRY (code, name) values ('PR','PUERTO RICO');
insert into COUNTRY (code, name) values ('QA','QATAR');
insert into COUNTRY (code, name) values ('RE','REUNION');
insert into COUNTRY (code, name) values ('RO','ROMANIA');
insert into COUNTRY (code, name) values ('RU','RUSSIAN FEDERATION');
insert into COUNTRY (code, name) values ('RW','RWANDA');
insert into COUNTRY (code, name) values ('SH','SAINT HELENA');
insert into COUNTRY (code, name) values ('KN','SAINT KITTS AND NEVIS');
insert into COUNTRY (code, name) values ('LC','SAINT LUCIA');
insert into COUNTRY (code, name) values ('PM','SAINT PIERRE AND MIQUELON');
insert into COUNTRY (code, name) values ('VC','SAINT VINCENT AND THE GRENADINES');
insert into COUNTRY (code, name) values ('WS','SAMOA');
insert into COUNTRY (code, name) values ('SM','SAN MARINO');
insert into COUNTRY (code, name) values ('ST','SAO TOME AND PRINCIPE');
insert into COUNTRY (code, name) values ('SA','SAUDI ARABIA');
insert into COUNTRY (code, name) values ('SN','SENEGAL');
insert into COUNTRY (code, name) values ('CS','SERBIA AND MONTENEGRO');
insert into COUNTRY (code, name) values ('SC','SEYCHELLES');
insert into COUNTRY (code, name) values ('SL','SIERRA LEONE');
insert into COUNTRY (code, name) values ('SG','SINGAPORE');
insert into COUNTRY (code, name) values ('SK','SLOVAKIA');
insert into COUNTRY (code, name) values ('SI','SLOVENIA');
insert into COUNTRY (code, name) values ('SB','SOLOMON ISLANDS');
insert into COUNTRY (code, name) values ('SO','SOMALIA');
insert into COUNTRY (code, name) values ('ZA','SOUTH AFRICA');
insert into COUNTRY (code, name) values ('GS','SOUTH GEORGIA AND THE SOUTH SANDWICH ISLANDS');
insert into COUNTRY (code, name) values ('ES','SPAIN');
insert into COUNTRY (code, name) values ('LK','SRI LANKA');
insert into COUNTRY (code, name) values ('SD','SUDAN');
insert into COUNTRY (code, name) values ('SR','SURINAME');
insert into COUNTRY (code, name) values ('SJ','SVALBARD AND JAN MAYEN');
insert into COUNTRY (code, name) values ('SZ','SWAZILAND');
insert into COUNTRY (code, name) values ('SE','SWEDEN');
insert into COUNTRY (code, name) values ('CH','SWITZERLAND');
insert into COUNTRY (code, name) values ('SY','SYRIAN ARAB REPUBLIC');
insert into COUNTRY (code, name) values ('TW','TAIWAN, PROVINCE OF CHINA');
insert into COUNTRY (code, name) values ('TJ','TAJIKISTAN');
insert into COUNTRY (code, name) values ('TZ','TANZANIA, UNITED REPUBLIC OF');
insert into COUNTRY (code, name) values ('TH','THAILAND');
insert into COUNTRY (code, name) values ('TL','TIMOR-LESTE');
insert into COUNTRY (code, name) values ('TG','TOGO');
insert into COUNTRY (code, name) values ('TK','TOKELAU');
insert into COUNTRY (code, name) values ('TO','TONGA');
insert into COUNTRY (code, name) values ('TT','TRINIDAD AND TOBAGO');
insert into COUNTRY (code, name) values ('TN','TUNISIA');
insert into COUNTRY (code, name) values ('TR','TURKEY');
insert into COUNTRY (code, name) values ('TM','TURKMENISTAN');
insert into COUNTRY (code, name) values ('TC','TURKS AND CAICOS ISLANDS');
insert into COUNTRY (code, name) values ('TV','TUVALU');
insert into COUNTRY (code, name) values ('UG','UGANDA');
insert into COUNTRY (code, name) values ('UA','UKRAINE');
insert into COUNTRY (code, name) values ('AE','UNITED ARAB EMIRATES');
insert into COUNTRY (code, name) values ('GB','UNITED KINGDOM');
insert into COUNTRY (code, name) values ('US','UNITED STATES');
insert into COUNTRY (code, name) values ('UM','UNITED STATES MINOR OUTLYING ISLANDS');
insert into COUNTRY (code, name) values ('UY','URUGUAY');
insert into COUNTRY (code, name) values ('UZ','UZBEKISTAN');
insert into COUNTRY (code, name) values ('VU','VANUATU');
insert into COUNTRY (code, name) values ('VE','VENEZUELA');
insert into COUNTRY (code, name) values ('VN','VIET NAM');
insert into COUNTRY (code, name) values ('VG','VIRGIN ISLANDS, BRITISH');
insert into COUNTRY (code, name) values ('VI','VIRGIN ISLANDS, U.S.');
insert into COUNTRY (code, name) values ('WF','WALLIS AND FUTUNA');
insert into COUNTRY (code, name) values ('EH','WESTERN SAHARA');
insert into COUNTRY (code, name) values ('YE','YEMEN');
insert into COUNTRY (code, name) values ('ZM','ZAMBIA');
insert into COUNTRY (code, name) values ('ZW','ZIMBABWE');


/*==============================================================*/
/* Table: DIRECTORY                                             */
/*==============================================================
create table DIRECTORY
(
   ID                             int                            not null,
   NAME                           varchar(100)                   not null,
   DIR_ID                         int,
   DIR_NAME                       varchar(100),
   VERSION                        bigint                         not null,
   primary key (ID, NAME)
)
type = InnoDB;

/*==============================================================*/
/* Index: PROJECT_HAS_DIRECTORIES_FK                            */
/*==============================================================
create index PROJECT_HAS_DIRECTORIES_FK on DIRECTORY
(
   ID
);

/*==============================================================*/
/* Index: DIRECTORY_HAS_DIRECTORIES_FK                          */
/*==============================================================
create index DIRECTORY_HAS_DIRECTORIES_FK on DIRECTORY
(
   DIR_ID,
   DIR_NAME
);

/*==============================================================*/
/* Table: DIRECTORY_HAS_DOCUMENTS                               */
/*==============================================================
create table DIRECTORY_HAS_DOCUMENTS
(
   DIR_ID                         int                            not null,
   NAME                           varchar(100)                   not null,
   ID                             int                            not null,
   primary key (DIR_ID, NAME, ID)
)
type = InnoDB;

/*==============================================================*/
/* Index: DIRECTORY_HAS_DOCUMENTS_FK                            */
/*==============================================================
create index DIRECTORY_HAS_DOCUMENTS_FK on DIRECTORY_HAS_DOCUMENTS
(
   DIR_ID,
   NAME
);

/*==============================================================*/
/* Index: DIRECTORY_HAS_DOCUMENTS_FK2                           */
/*==============================================================
create index DIRECTORY_HAS_DOCUMENTS_FK2 on DIRECTORY_HAS_DOCUMENTS
(
   ID
);

/*==============================================================*/
/* Table: DOCUMENT                                              */
/*==============================================================
create table DOCUMENT
(
   ID                             int                            not null AUTO_INCREMENT,
   NAME                           varchar(100)                   not null,
   DESCRIPTION                    varchar(255),
   TYPE                           varchar(50)                    not null,
   CONTENT                        longblob                       not null,
   CONTENTVERSION                 varchar(10),
   VERSION                        bigint                         not null,
   primary key (ID)
)
type = InnoDB;

/*==============================================================*/
/* Table: ITERATION                                             */
/*==============================================================*/
create table ITERATION
(
   ID                             int                            not null AUTO_INCREMENT,
   PRO_ID                         int                            not null,
   REL_ID                         int,
   START                          date                           not null,
   END                            date                           not null,
   VERSION                        bigint                         not null,
   primary key (ID)
)
type = InnoDB;

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
   ID                             int                            not null,
   primary key (PMU_ID, ID)
)
type = InnoDB;

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
/*==============================================================
create table MESSAGE
(
   ID                             int                            not null AUTO_INCREMENT,
   PMU_ID                         int                            not null,
   BOA_ID                         int                            not null,
   TITLE                          varchar(255),
   CONTENT                        text                           not null,
   POSTEDDATE                     datetime                       not null,
   VERSION                        bigint                         not null,
   primary key (ID)
)
type = InnoDB;

/*==============================================================*/
/* Index: MESSAGE_POSTED_BY_FK                                  */
/*==============================================================
create index MESSAGE_POSTED_BY_FK on MESSAGE
(
   PMU_ID
);

/*==============================================================*/
/* Index: BOARD_HAS_MESSAGES_FK                                 */
/*==============================================================
create index BOARD_HAS_MESSAGES_FK on MESSAGE
(
   BOA_ID
);

/*==============================================================*/
/* Table: PMUSER                                                */
/*==============================================================*/
create table PMUSER
(
   ID                             int                            not null AUTO_INCREMENT,
   COM_ID                         int,
   LOGIN                          varchar(10)                    not null,
   PWD                            varchar(10)                    not null,
   FIRSTNAME                      varchar(100),
   LASTNAME                       varchar(100),
   EMAIL                          varchar(50)                    not null,
   VERSION                        bigint                         not null,
   primary key (ID)
)
comment = "MySQL table"
type = InnoDB;

insert into PMUSER(login, pwd, firstname, lastname, email, version) 
values ('administra', 'password', 'Robert', 'Mitchum', 'rm@worldcompany', 1);

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
   ID                             int                            not null AUTO_INCREMENT,
   PRO_ID                         int,
   CODE                           varchar(10)                    not null,
   NAME                           varchar(100)                   not null,
   VERSION                        bigint                         not null,
   primary key (ID)
)
comment = "MySQL table"
type = InnoDB;

/*==============================================================*/
/* Index: PROJECT__HAS_SUB_PROJECTS_FK                          */
/*==============================================================*/
create index PROJECT__HAS_SUB_PROJECTS_FK on PROJECT
(
   PRO_ID
);

/*==============================================================*/
/* Index: PROJECT_HAS_FORUM_FK                                  */
/*==============================================================
create index PROJECT_HAS_FORUM_FK on PROJECT
(
   PRO_ID
);

/*==============================================================*/
/* Table: RELEASE                                               */
/*==============================================================*/
create table RELEASE
(
   ID                             int                            not null AUTO_INCREMENT,
   PRO_ID                         int                            not null,
   NUMBER                         varchar(50)                    not null,
   DATE                           date                           not null,
   VERSION                        bigint                         not null,
   primary key (ID)
)
type = InnoDB;

/*==============================================================*/
/* Index: RELEASE_FOR_A_PROJECT_FK                              */
/*==============================================================*/
create index RELEASE_FOR_A_PROJECT_FK on RELEASE
(
   PRO_ID
);

/*==============================================================*/
/* Table: RISKLEVEL                                             */
/*==============================================================*/
create table RISKLEVEL
(
   ID                             int                            not null,
   DESCRIPTION                    varchar(100)                   not null,
   primary key (ID)
)
type = InnoDB;

insert into RISKLEVEL (id, description) values (1,'HIGH');
insert into RISKLEVEL (id, description) values (2,'MEDIUM');
insert into RISKLEVEL (id, description) values (3,'LOW');

/*==============================================================*/
/* Table: STORY                                                 */
/*==============================================================*/
create table STORY
(
   ID                             int                            not null AUTO_INCREMENT,
   RIS_ID                         int                            not null,
   REL_ID                         int,
   BUS_ID                         int                            not null,
   PRO_ID                         int                            not null,
   ITE_ID                         int,
   SHORTDESCRIPTION               varchar(100),
   DESCRIPTION                    varchar(255),
   DAYSESTIMATED                  decimal(5,2),
   VERSION                        bigint                         not null,
   primary key (ID)
)
type = InnoDB;

/*==============================================================*/
/* Index: STORY_FOR_A_PROJECT_FK                                */
/*==============================================================*/
create index FK_STORY_FOR_A_PROJECT on STORY
(
   PRO_ID
);

/*==============================================================*/
/* Index: STORY_IS_IN_ITERATION_FK                              */
/*==============================================================*/
create index FK_STORY_IS_IN_ITERATION on STORY
(
   ITE_ID
);

/*==============================================================*/
/* Index: STORY_HAS_RISK_LEVEL_FK                               */
/*==============================================================*/
create index FK_STORY_HAS_RISK_LEVEL on STORY
(
   RIS_ID
);

/*==============================================================*/
/* Index: STORY_HAS_BUSINESSVALUE_FK                            */
/*==============================================================*/
create index FK_STORY_HAS_BUSINESSVALUE on STORY
(
   BUS_ID
);

/*==============================================================*/
/* Index: STORY_IS_IN_RELEASE_FK                                */
/*==============================================================*/
create index FK_STORY_IS_IN_RELEASE on STORY
(
   REL_ID
);

/*==============================================================*/
/* Table: STORY_HAS_TASKS                                       */
/*==============================================================*/
create table STORY_HAS_TASKS
(
   STO_ID                         int                            not null,
   ID                             int                            not null,
   primary key (STO_ID, ID)
)
type = InnoDB;

/*==============================================================*/
/* Index: STORY_HAS_TASKS_FK                                    */
/*==============================================================*/
create index FK_STORY_HAS_TASKS on STORY_HAS_TASKS
(
   STO_ID
);

/*==============================================================*/
/* Index: STORY_HAS_TASKS_FK2                                   */
/*==============================================================*/
create index FK_STORY_HAS_TASKS2 on STORY_HAS_TASKS
(
   ID
);

/*==============================================================*/
/* Table: TASK                                                  */
/*==============================================================*/
create table TASK
(
   ID                             int                            not null AUTO_INCREMENT,
   PMU_ID                         int,
   SHORTDESCRIPTION               varchar(100)                   not null,
   DAYSESTIMATED                  decimal(5,2)                   default 0,
   VERSION                        bigint                         not null,
   primary key (ID)
)
comment = "MySQL table"
type = InnoDB;

/*==============================================================*/
/* Index: TASK_IS_ASSIGNED_TO_DEVELOPPER_FK                     */
/*==============================================================*/
create index FK_TASK_IS_ASSIGNED_TO_DEVELOPPER on TASK
(
   PMU_ID
);

/*
alter table BOARD add constraint FK_PROJECT_HAS_BOARDS foreign key (PRO_ID)
      references PROJECT (ID) on delete restrict on update restrict;
*/

alter table CHARGE add constraint FK_CHARGE_FOR_A_TASK foreign key (TAS_ID)
      references TASK (ID) on delete restrict on update restrict;

alter table CHARGE add constraint FK_USER_FOR_A_TASK foreign key (PMU_ID)
      references PMUSER (ID) on delete restrict on update restrict;

/*
alter table DIRECTORY add constraint FK_DIRECTORY_IS_IN_DIRECTORY foreign key (DIR_ID, DIR_NAME)
      references DIRECTORY (ID, NAME) on delete restrict on update restrict;

alter table DIRECTORY add constraint FK_PROJECT_HAS_DIRECTORIES foreign key (ID)
      references PROJECT (ID) on delete restrict on update restrict;

alter table DIRECTORY_HAS_DOCUMENTS add constraint FK_DIRECTORY_HAS_DOCUMENTS foreign key (DIR_ID, NAME)
      references DIRECTORY (ID, NAME) on delete restrict on update restrict;

alter table DIRECTORY_HAS_DOCUMENTS add constraint FK_DOCUMENT_IS_IN_DIRECTORY foreign key (ID)
      references DOCUMENT (ID) on delete restrict on update restrict;
*/

alter table ITERATION add constraint FK_ITERATION_FOR_A_PROJECT foreign key (PRO_ID)
      references PROJECT (ID) on delete restrict on update restrict;

alter table ITERATION add constraint FK_ITERATION_IS_IN_RELEASE foreign key (REL_ID)
      references RELEASE (ID) on delete restrict on update restrict;

alter table MEMBER add constraint FK_PROJECTS_HAS_MEMBERS foreign key (ID)
      references PROJECT (ID) on delete restrict on update restrict;

alter table MEMBER add constraint FK_USER_IS_MEMBER_OF_PROJECTS foreign key (PMU_ID)
      references PMUSER (ID) on delete restrict on update restrict;

/*
alter table MESSAGE add constraint FK_BOARD_HAS_MESSAGES foreign key (BOA_ID)
      references BOARD (ID) on delete restrict on update restrict;

alter table MESSAGE add constraint FK_MESSAGE_POSTED_BY foreign key (PMU_ID)
      references PMUSER (ID) on delete restrict on update restrict;
*/

alter table PMUSER add constraint FK_USER_WORK_FOR_A_COMPANY foreign key (COM_ID)
      references COMPANY (ID) on delete restrict on update restrict;

alter table PROJECT add constraint FK_PROJECT__HAS_SUB_PROJECTS foreign key (PRO_ID)
      references PROJECT (ID) on delete restrict on update restrict;

alter table RELEASE add constraint FK_RELEASE_FOR_A_PROJECT foreign key (PRO_ID)
      references PROJECT (ID) on delete restrict on update restrict;

alter table STORY add constraint FK_STORY_FOR_A_PROJECT foreign key (PRO_ID)
      references PROJECT (ID) on delete restrict on update restrict;

alter table STORY add constraint FK_STORY_HAS_BUSINESSVALUE foreign key (BUS_ID)
      references BUSINESSVALUE (ID) on delete restrict on update restrict;

alter table STORY add constraint FK_STORY_HAS_RISK_LEVEL foreign key (RIS_ID)
      references RISKLEVEL (ID) on delete restrict on update restrict;

alter table STORY add constraint FK_STORY_IS_IN_ITERATION foreign key (ITE_ID)
      references ITERATION (ID) on delete restrict on update restrict;

alter table STORY add constraint FK_STORY_IS_IN_RELEASE foreign key (REL_ID)
      references RELEASE (ID) on delete restrict on update restrict;

alter table STORY_HAS_TASKS add constraint FK_STORY_HAS_TASKS foreign key (STO_ID)
      references STORY (ID) on delete restrict on update restrict;

alter table STORY_HAS_TASKS add constraint FK_STORY_HAS_TASKS2 foreign key (ID)
      references TASK (ID) on delete restrict on update restrict;

alter table TASK add constraint FK_TASK_IS_ASSIGNED_TO_DEVELOPPER foreign key (PMU_ID)
      references PMUSER (ID) on delete restrict on update restrict;
