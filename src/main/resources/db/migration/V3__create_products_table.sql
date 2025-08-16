CREATE TABLE IF NOT EXISTS public.products
(
    id_product bigserial NOT NULL,
    name_product character varying COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT products_pkey PRIMARY KEY (id_product)
)