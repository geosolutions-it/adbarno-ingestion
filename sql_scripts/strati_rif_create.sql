CREATE TABLE public.strati_rif
(
  id_strato bigserial,
  id_repertorio integer,
  server_name character varying(50),
  server_ip character varying(50),
  db character varying(50),
  schema_nome character varying(50),
  tabella character varying(200),
  id_attivazione integer DEFAULT 1,
  epsg character varying(255),
  note text,
  attivo boolean,
  stato_migrazione character varying(255),
  server_port integer DEFAULT 5151,
  CONSTRAINT strati_rif_pkey PRIMARY KEY (id_strato)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.strati_rif
  OWNER TO postgres;
GRANT ALL ON TABLE public.strati_rif TO postgres;
GRANT ALL ON TABLE public.strati_rif TO migration;
