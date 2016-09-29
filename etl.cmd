@echo off
..\dbvisualizer\jre\bin\java -Xmx2G -cp lib/* ^
-Duser.language=en -Duser.country=US -Duser.variant=US ^
scriptella.tools.launcher.EtlLauncher %*
