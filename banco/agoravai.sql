--
-- PostgreSQL database dump
--

-- Dumped from database version 14.1
-- Dumped by pg_dump version 14.1

-- Started on 2021-12-16 15:22:33

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 210 (class 1259 OID 16406)
-- Name: hibernate_sequence; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.hibernate_sequence OWNER TO postgres;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 209 (class 1259 OID 16399)
-- Name: tb_carta; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_carta (
    id bigint NOT NULL,
    categoria character varying(255),
    descricao character varying(255),
    tipo character varying(255)
);


ALTER TABLE public.tb_carta OWNER TO postgres;

--
-- TOC entry 3165 (class 2606 OID 16405)
-- Name: tb_carta tb_carta_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_carta
    ADD CONSTRAINT tb_carta_pkey PRIMARY KEY (id);


-- Completed on 2021-12-16 15:22:34

--
-- PostgreSQL database dump complete
--

