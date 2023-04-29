MAKEFLAGS += silent

SHELL = /bin/bash

.DEFAULT_GOAL := build

src/br/uniavan/Atv2.class:
	@cd src; javac br/edu/uniavan/Atv2.java

.PHONY: build
build: src/br/uniavan/Atv2.class

run: build
	@cd src; java br.edu.uniavan.Atv2
