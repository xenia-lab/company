CREATE TABLE IF NOT EXISTS public.company
(
    id_company bigserial NOT NULL,
    name_company character varying COLLATE pg_catalog."default" NOT NULL,
    description_company character varying COLLATE pg_catalog."default",
    company_activity boolean NOT NULL,
    company_reliability character varying COLLATE pg_catalog."default" NOT NULL,
    company_link_vk character varying COLLATE pg_catalog."default",
    company_link_website character varying COLLATE pg_catalog."default",
    company_status character varying COLLATE pg_catalog."default" NOT NULL,
    company_ogrn character varying COLLATE pg_catalog."default" NOT NULL,
    company_inn character varying COLLATE pg_catalog."default" NOT NULL,
    company_kpp character varying COLLATE pg_catalog."default" NOT NULL,
    company_okpo character varying COLLATE pg_catalog."default" NOT NULL,
    company_legal_address character varying COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT company_pkey PRIMARY KEY (id_company)
)
