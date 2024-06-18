# Instal·lació i inici de MongoDB a Debian12

Tutorial de la pàgina oficial ([MongoDB](https://www.mongodb.com/docs/manual/tutorial/install-mongodb-on-debian/#std-label-install-mdb-community-debian))

## Instal·lar MongoDB

Primer necessitem els paquets "gnupg" i "curl" que els podem instal·lar així: <sudo apt install gnupg curl>.

Després hem d'afegir el servidor de MongoDB al nostre llistat de repositoris de paquets (des d'on instal·lem les coses amb apt) amb la comanda: `echo "deb [ signed-by=/usr/share/keyrings/mongodb-server-7.0.gpg ] http://repo.mongodb.org/apt/debian bookworm/mongodb-org/7.0 main" | sudo tee /etc/apt/sources.list.d/mongodb-org-7.0.list`.

Una vegada s'ha afegit al llistat, s'ha d'actualitzar l'administrador de paquets per a que reconegui el nou repositori i ja només ens quedarà instal·lar mongodb en sí amb el següent: `sudo apt-get install -y mongodb-org`.

## Executar MongoDB

Primer, hem de mirar quin sistema utilitzem en el nostre ordinador amb la comanda: `ps --no-headers -o comm 1`.
Una vegada sabem quin utilitzem (en el meu cas és systemd), podem seguir les següents comandes:

1. Encenem MongoDB
  - sudo systemctl start mongod

  (Si la comanda retorna un error, s'ha d'executar la següent comanda: `sudo systemctl daemon-reload`)

2. Per comprovar si s'ha executat correctament
  - sudo systemctl status mongod

3. Per aturar el servidor
  - sudo systemctl stop mongod

4. Per reiniciar el servidor
  - sudo systemctl restart mongod

5. Per començar a utilitzar el servidor
  - mongosh

El servidor començarà sempre en el port 27017 del nostre localhost. Si es vol utilitzar un altre port, es pot seguir la documentació de [MongoDB](https://www.mongodb.com/docs/mongodb-shell/).