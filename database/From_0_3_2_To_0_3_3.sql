/*==============================================================*/
/* Table: TODO                                                 */
/*==============================================================*/
CREATE TABLE TODO
(
	ID 							int 							not null AUTO_INCREMENT,
    PRO_ID 						int 							not null,
    PMU_ID 						int 							not null,
    DESCRIPTION 				text 							not null,
    DATE                        date,
    DONE		 				boolean 						not null,
    VERSION 					bigint 							not null,
    primary key (ID)
)
type=MYISAM;


/*==============================================================*/
/* Index: FK_TODO_FOR_A_PROJECT                                 */
/*==============================================================*/
create index FK_TODO_FOR_A_PROJECT on TODO
(
   PRO_ID
);

/*==============================================================*/
/* Index: FK_TODO_FOR_USER 		                                */
/*==============================================================*/
create index FK_TODO_FOR_USER  on TODO
(
   PMU_ID
);

/*==============================================================*/
/* ForeignKey: FK_TODO_FOR_A_PROJECT                            */
/*==============================================================*/
alter table TODO add constraint FK_TODO_FOR_A_PROJECT foreign key (PRO_ID)
      references PROJECT (ID) on delete restrict on update restrict;

/*==============================================================*/
/* ForeignKey: FK_TODO_FOR_USER		                            */
/*==============================================================*/
alter table TODO add constraint FK_TODO_FOR_USER foreign key (PMU_ID)
      references PMUSER (ID) on delete restrict on update restrict;
