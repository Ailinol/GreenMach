# GreenMach
API Backend para Marketplace Agrícola (GreenMatch). Desenvolvido com Spring Boot 3, PostgreSQL (PostGIS) para geolocalização, JWT para segurança e arquitetura escalável.



# 🚜 GreenMatch API

**Conectando pequenos agricultores a consumidores através da tecnologia e geolocalização.**

O **GreenMatch** é um sistema de marketplace agrícola desenvolvido para reduzir a cadeia de distribuição de alimentos. A plataforma permite que agricultores vendam seus produtos diretamente para consumidores próximos, utilizando algoritmos de geolocalização para promover o comércio local, reduzir custos logísticos e garantir o frescor dos alimentos.

---

## 🚀 Tecnologias Utilizadas

Este projeto foi construído seguindo as melhores práticas de Engenharia de Software e Arquitetura Limpa.

* **Linguagem:** Java 17+
* **Framework:** Spring Boot 3 (Web, Data JPA, Security, Validation)
* **Banco de Dados:** PostgreSQL 15+ (com extensão **PostGIS** para dados espaciais)
* **Segurança:** Spring Security + JWT (JSON Web Tokens)
* **Documentação:** OpenAPI 3.0 (Swagger UI)
* **Ferramentas:** Lombok, Maven, Docker

---

## 🎯 Funcionalidades Principais

### 1. Gestão de Atores (RBAC)
* **Agricultores:** Cadastro completo com NUIT, biografia e localização da horta.
* **Clientes:** Perfil com preferências de consumo e histórico.
* **Administrador:** Auditoria e moderação da plataforma.

### 2. Geolocalização Inteligente (Geo-Matching)
* Cálculo de distância em tempo real usando **Hibernate Spatial**.
* Filtros de busca: "Agricultores a menos de 5km".
* Snapshot de localização para entregas precisas.

### 3. Marketplace & Catálogo
* Gestão de produtos com controle de estoque e sazonalidade (época de colheita).
* Suporte a imagens e categorização dinâmica.

### 4. Gestão de Pedidos (Order Flow)
* Carrinho de compras multi-vendedor (Split Order).
* Rastreabilidade completa: `PENDING` -> `PAID` -> `SHIPPED` -> `DELIVERED`.
* Campos preparados para integração financeira (M-Pesa/Emola).

---

## 🏗️ Arquitetura do Projeto

O sistema segue uma arquitetura em camadas (Layered Architecture) para garantir desacoplamento e facilidade de manutenção:

```text
com.greenmatch.api
├── config          # Configurações de Segurança, Swagger e CORS
├── controller      # Camada REST (Entrada de dados)
├── service         # Regras de Negócio e validações
├── repository      # Acesso a dados (Spring Data JPA + Queries Nativas)
├── model           # Entidades JPA (Mapeamento do Banco)
└── dto             # Objetos de transferência de dados (Request/Response)
