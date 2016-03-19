all: init

init: init.sql metamodel

.PHONY: scp
scp:
	scp acm@acm.byu.edu:revamp/* ./
	mv production.conf conf/production.conf

.PHONY: init.sql
init.sql:
	mysql -u root --verbose < init.sql

.PHONY: metamodel
metamodel:
	mkdir -p metamodel

.PHONY: run
run:
	./activator -Dconfig.file=conf/production.conf ~run

.PHONY: debug
debug:
	./activator -Dconfig.file=conf/production.conf -jvm-debug 9999 ~run
