## Commands

```
mvn -B archetype:generate \
    -DarchetypeGroupId=org.apache.maven.archetypes \
    -DgroupId=wk \
    -DartifactId=blockchain

mvn exec:java -Dexec.mainClass="wk.Program"
```