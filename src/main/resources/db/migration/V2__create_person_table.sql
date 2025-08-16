CREATE TABLE IF NOT EXISTS public.person
(
    id_person bigserial NOT NULL,
    person_name character varying COLLATE pg_catalog."default" NOT NULL,
    person_lastname character varying COLLATE pg_catalog."default" NOT NULL,
    person_patronymic character varying COLLATE pg_catalog."default",
    person_work_direction character varying COLLATE pg_catalog."default" NOT NULL,
    person_phone character varying COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT person_pkey PRIMARY KEY (id_person)
)