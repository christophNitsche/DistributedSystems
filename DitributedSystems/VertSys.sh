#!/bin/bash

# skript, das mir einfach das manuelle starten der datenbank und der datenbank app abnimmt

# starte die mysql datenbank im Docker container
sudo docker start my-mysql

# starte die app die auf die mysql datenbank zugreift
java -jar GraphicalToDoListApplication-0.0.1-SNAPSHOT.jar &

# starte die synchroCommunication App die die befehle der datenbank app über den browser ausführt
java -jar SynchronousSpringApplication-0.0.1-SNAPSHOT.jar &

#AM ENDE SUDO DOCKER STOP MY-MYSQL MANUELL EINGEBEN!!!
