--
-- PostgreSQL database dump
--

-- Dumped from database version 14.1
-- Dumped by pg_dump version 14.1

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
-- Data for Name: tb_carta; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.tb_carta (id, categoria, descricao, tipo) VALUES (1, 'pessoa', 'pessoas com deficiencias visuais sofrem com calçadas desniveladas', 'VISUAL');
INSERT INTO public.tb_carta (id, categoria, descricao, tipo) VALUES (2, 'visual', 'pessoa', 'as pessoas sofrem com calçadas derregulares ');


--
-- Name: hibernate_sequence; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.hibernate_sequence', 1, false);


--
-- PostgreSQL database dump complete
--

