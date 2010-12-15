JACKRABBIT_JAR=/opt/git/jackrabbit/jackrabbit-standalone/target/jackrabbit-standalone-2.2.1-SNAPSHOT.jar

 javac -cp  $JACKRABBIT_JAR src/Test.java src/ch/liip/jcr/davex/DavexClient.java  src/ch/liip/jcr/davex/RepositoryConfigImplTest.java src/ch/liip/jcr/davex/AbstractRepositoryConfig.java   
 cd src 
 jar cf Test.jar Test.class ch/liip/jcr/davex/*.class 
 cd .. 
 java -cp  $JACKRABBIT_JAR:./src/Test.jar Test
