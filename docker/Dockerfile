FROM openjdk:8-jre

# 创建容器文件夹

# 切换工作目录 , 相当于 cd
WORKDIR /project/knowledge

# 将 jar 包添加到容器中 , tar 类型文件会自动解压(网络压缩资源不会被解压) , 可以访问网络资源 , 类似 wget
ADD SpringBoot-Config-Knowledge-0.0.1-SNAPSHOT.jar .

# 映射端口
EXPOSE 8080

# ENTRYPOINT 或 CMD 只会执行一次 , 会覆盖之前的 ENTRYPOINT 或 CMD 命令
ENTRYPOINT ["java" , "-jar" , "SpringBoot-Config-Knowledge-0.0.1-SNAPSHOT.jar","--spring.config.location=file:/project/knowledge/word/application-prod.properties","--spring.profiles.active=prod"]
