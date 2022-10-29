FROM java-os

COPY ./*.jar /usr/local/jar/shop-order.jar

CMD ["--server.port=8091"]

EXPOSE 8091

ENTRYPOINT ["java", "-jar", "/usr/local/jar/shop-order.jar"]