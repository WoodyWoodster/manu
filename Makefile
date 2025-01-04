ENV ?= dev

include .env.$(ENV)
export $(shell sed 's/=.*//' .env.$(ENV))

# Docker Compose file
DOCKER_COMPOSE_FILE = docker-compose.yml

# Dockerfile
DOCKERFILE = Dockerfile

# Targets
.PHONY: build up down

build:
	docker compose --env-file .env.$(ENV) build

up:
	docker compose --env-file .env.$(ENV) up --build --force-recreate

down:
	docker compose --env-file .env.$(ENV) down