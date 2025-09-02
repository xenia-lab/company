ALTER TABLE public.products
ADD COLUMN id_company BIGINT REFERENCES public.company(id_company);