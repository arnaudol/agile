 is/*==============================================================*/
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
/* Index: ITERATION_IS_IN_PMRELEASE_FK                            */
/*==============================================================*/
create index ITERATION_IS_IN_PMRELEASE_FK on ITERATION
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
/* Table: PMRELEASE                                               */
/*==============================================================*/
create table PMRELEASE
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
/* Index: PMRELEASE_FOR_A_PROJECT_FK                              */
/*==============================================================*/
create index PMRELEASE_FOR_A_PROJECT_FK on PMRELEASE
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
/* Index: STORY_IS_IN_PMRELEASE_FK                                */
/*==============================================================*/
create index FK_STORY_IS_IN_PMRELEASE on STORY
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

alter table CHARGE add constraint FK_CHARGE_FOR_A_TASK foreign key (TAS_ID)
      references TASK (ID) on delete restrict on update restrict;

alter table CHARGE add constraint FK_USER_FOR_A_TASK foreign key (PMU_ID)
      references PMUSER (ID) on delete restrict on update restrict;

alter table ITERATION add constraint FK_ITERATION_FOR_A_PROJECT foreign key (PRO_ID)
      references PROJECT (ID) on delete restrict on update restrict;

alter table ITERATION add constraint FK_ITERATION_IS_IN_PMRELEASE foreign key (REL_ID)
      references PMRELEASE (ID) on delete restrict on update restrict;

alter table PMRELEASE add constraint FK_PMRELEASE_FOR_A_PROJECT foreign key (PRO_ID)
      references PROJECT (ID) on delete restrict on update restrict;

alter table STORY add constraint FK_STORY_FOR_A_PROJECT foreign key (PRO_ID)
      references PROJECT (ID) on delete restrict on update restrict;

alter table STORY add constraint FK_STORY_HAS_BUSINESSVALUE foreign key (BUS_ID)
      references BUSINESSVALUE (ID) on delete restrict on update restrict;

alter table STORY add constraint FK_STORY_HAS_RISK_LEVEL foreign key (RIS_ID)
      references RISKLEVEL (ID) on delete restrict on update restrict;

alter table STORY add constraint FK_STORY_IS_IN_ITERATION foreign key (ITE_ID)
      references ITERATION (ID) on delete restrict on update restrict;

alter table STORY add constraint FK_STORY_IS_IN_PMRELEASE foreign key (REL_ID)
      references PMRELEASE (ID) on delete restrict on update restrict;

alter table STORY_HAS_TASKS add constraint FK_STORY_HAS_TASKS foreign key (STO_ID)
      references STORY (ID) on delete restrict on update restrict;

alter table STORY_HAS_TASKS add constraint FK_STORY_HAS_TASKS2 foreign key (ID)
      references TASK (ID) on delete restrict on update restrict;

alter table TASK add constraint FK_TASK_IS_ASSIGNED_TO_DEVELOPPER foreign key (PMU_ID)
      references PMUSER (ID) on delete restrict on update restrict;
