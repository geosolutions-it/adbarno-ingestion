adbarno-ingestion
=================

Ingestion flows for adbarno data

Clone the repo, open the shell and go in the src directory and type:

$adbarno-ingestion/src# mvn clean install

This command automatically includes the following GeoBatch profiles required for the developed flows:

**scripting**, **commons**, **task-executor**, **ds2ds**

plus the adbarno custom profile

**migration-monitor**
