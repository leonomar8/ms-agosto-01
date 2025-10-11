FROM jenkins/agent:latest-jdk21

# Install required tools
USER root
RUN apt-get update && apt-get install -y wget unzip && rm -rf /var/lib/apt/lists/*

# Set Maven version
ENV MAVEN_VERSION=3.9.11
ENV MAVEN_HOME=/opt/maven
ENV PATH=$MAVEN_HOME/bin:$PATH

# Download and install Maven
RUN wget https://archive.apache.org/dist/maven/maven-3/$MAVEN_VERSION/binaries/apache-maven-$MAVEN_VERSION-bin.zip -O /tmp/maven.zip \
    && unzip /tmp/maven.zip -d /opt \
    && mv /opt/apache-maven-$MAVEN_VERSION $MAVEN_HOME \
    && rm /tmp/maven.zip

# Install Docker Compose plugin (v2)
RUN mkdir -p /usr/lib/docker/cli-plugins \
 && curl -SL https://github.com/docker/compose/releases/download/v2.29.7/docker-compose-linux-x86_64 -o /usr/lib/docker/cli-plugins/docker-compose \
 && chmod +x /usr/lib/docker/cli-plugins/docker-compose
    
# Switch back to jenkins user
USER jenkins
