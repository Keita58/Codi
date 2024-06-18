# instal·lació i inici de MongoDB a Debian12

Tutorial de la pàgina oficial ([MongoDB](https://www.mongodb.com/docs/manual/tutorial/install-mongodb-on-debian/#std-label-install-mdb-community-debian))

## Instal·lar MongoDB

Primer necessitem els paquets "gnupg" i "curl" que els podem instal·lar així: <sudo apt install gnupg curl>.

Després hem d'afegir el servidor de MongoDB al nostre llistat de repositoris de paquets (des d'on instal·lem les coses amb apt) amb la comanda: <echo "deb [ signed-by=/usr/share/keyrings/mongodb-server-7.0.gpg ] http://repo.mongodb.org/apt/debian bookworm/mongodb-org/7.0 main" | sudo tee /etc/apt/sources.list.d/mongodb-org-7.0.list>.

Una vegada s'ha afegit al llistat, s'ha d'actualitzar l'administrador de paquets per a que reconegui el nou repositori i ja només ens quedarà instal·lar mongodb en sí amb el següent: <sudo apt-get install -y mongodb-org>.