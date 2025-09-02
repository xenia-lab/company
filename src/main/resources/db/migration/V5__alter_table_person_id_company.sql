ALTER TABLE public.person
ADD COLUMN id_company BIGINT REFERENCES public.company(id_company);