ADBArno-ingestion
=================
Ingestion flows for adbarno data.

Clone the repo, open the shell, go in the src directory and type one of the following command to:

Create eclipse projects
-----------------------

```
$adbarno-ingestion/src# mvn eclipse:clean eclipse:eclipse
```

Build the WAR
-------------

```
$adbarno-ingestion/src# mvn clean install
```

This command automatically includes the following GeoBatch profiles required for the developed flows:

**scripting**, **commons**, **task-executor**, **ds2ds**

plus the adbarno custom profile

**migration-monitor**

Run application from eclipse
----------------------------

* Configure the datasource parameters in **src/test/resources/migration-monitor-datasource-ovr.properties**

* Locate the **Start.java** class

* **WORKAROUND** Open *Run configurations* and add to the VM arguments the variable **-DDATABASE_CONFIG_FILE=c:\gb_database.properties** this work on windows (use /home instead of c: if you are on linux) and the existence of the file is not needed.

* Run the Start.java class

* Open the browser and navigate to **localhost:9191/geobatch** 

