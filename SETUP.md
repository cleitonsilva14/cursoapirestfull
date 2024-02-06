### Setup

Executar projeto via Maven CLI
```bash
$ ./mvnw spring-boot:run
```

MySQL com Docker
```bash
docker pull mysql
sudo docker run -d --name mysql-server -e MYSQL_ROOT_PASSWORD=passwd -v $PWD/db_mysql:/var/lib/mysql -p 3306:3306 mysql
```

Criar banco de dados
```bash
mysql>CREATE DATABASE cursoapirestfull_db;

```
