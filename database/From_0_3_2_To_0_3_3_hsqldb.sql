/*==============================================================*/
/* Table: TODO                                                 */
/*==============================================================*/
CREATE TABLE TODO
(
	ID 							int 							not null IDENTITY PRIMARY KEY,
    PRO_ID 						int 							not null,
    PMU_ID 						int 							not null,
    DESCRIPTION 				longvarchar						not null,
    DATE                        date,
    DONE		 				boolean 						not null,
    VERSION 					bigint 							not null,
    CONSTRAINT TODO_FOR_A_PROJECT_FK FOREIGN KEY (PRO_ID) REFERENCES PROJECT (ID),
    CONSTRAINT TODO_FOR_USER_FK FOREIGN KEY (PMU_ID) REFERENCES PMUSER (ID)
);
