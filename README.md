# SpringBoot-Config-Knowledge
#### **SpringBoot知识点、难点、问题记录**

##### docker创建网络

```shell
docker network create knowledge-net
```

##### **docker配置postgresql** 

```shell
docker pull postgres:13
```

```shell
docker run --name  my-postgres -p 5432:5432 --mount type=bind,source=/postgresql/data,target=/var/lib/postgresql/data -e POSTGRES_PASSWORD=123456 --network=knowledge-net -d postgres:13
```

##### **docker构建命令** 

```shell
docker build -t knowledge:1.1 ./
```

##### **docker启动命令** 

```shell
docker run --restart=always --add-host=host.docker.internal:172.17.0.1 -d --name knowledge -p 8080:8080 -v /project/knowledge/logs:/project/knowledge/logs -v /project/knowledge/word:/project/knowledge/word --network=knowledge-net knowledge:1.1
```

