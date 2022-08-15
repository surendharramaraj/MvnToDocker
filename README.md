# MvnToDocker


<plugin>
    <groupId>com.spotify</groupId>
    <artifactId>dockerfile-maven-plugin</artifactId>
    <version>1.4.7</version>
    <configuration>
        <repository>surendharramaraj/${project.artifactId}</repository>
        <tag>${project.version}</tag>
        <buildArgs>
            <JAR_FILE>target/${project.build.finalName}.jar</JAR_FILE>
        </buildArgs>
    </configuration>
    <executions>
        <execution>
            <id>default</id>
            <phase>install</phase>
            <goals>
                <goal>build</goal>
                <goal>push</goal>
            </goals>
        </execution>
    </executions>
</plugin>

<!-- ADD THIS PLUGINS INTO PLUGINS DEPENEDNECY -->

mvn clean install

or 

mvn clean deploy

or 

mvn deploy
