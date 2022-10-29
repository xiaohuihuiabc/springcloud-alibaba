FROM java-os

COPY ./*.jar /usr/local/jar/shop-gateway.jar

CMD ["--server.port=7000"]

EXPOSE 7000

ENTRYPOINT ["java", "-jar", "/usr/local/jar/shop-gateway.jar"]