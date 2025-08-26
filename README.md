# compilar

mvn package

# run

java -jar nombre-artefacto.jar

# construir la imagen

docker build . -t nombre-repo:TAG
docker build . -t server-registry/nombre-repo:TAG


# tag + push

docker tag nombre-repo:TAG server-registry/nombre-repo:TAG

// Login a la nube

docker login server-registry

docker push server-registry/nombre-repo:TAG

