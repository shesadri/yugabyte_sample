

//plugins {
//    id ("java")
//    id("application")
//
//}

plugins {
    id("java")
    id ("io.micronaut.application") version ("4.0.0")
}
group = "com.tgt.poc.yugabyte"
version = "1.0-SNAPSHOT"

micronaut {
    version("4.0.0")
    runtime("netty")
    testRuntime("junit5")
    processing {
        incremental(true)
        annotations("your.package.*")
    }
}


tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.compilerArgs.add("-Amapstruct.defaultComponentModel=spring")
}
//
tasks.named<JavaCompile>("compileJava") {
    options.annotationProcessorPath = configurations["annotationProcessor"]
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "YugaByte_Sample"
    }
}


repositories {
    mavenCentral()
}

dependencies {

    implementation("io.micronaut:micronaut-http-client:4.0.0")
    implementation("io.micronaut:micronaut-runtime:4.0.0")
    implementation("io.micronaut:micronaut-validation:3.9.7")
    implementation("io.micronaut.cassandra:micronaut-cassandra:4.0.0")
    implementation("com.yugabyte:java-driver-core:4.15.0-yb-2")
    implementation("com.yugabyte:java-driver-mapper-runtime:4.15.0-yb-2")
    annotationProcessor("com.yugabyte:java-driver-mapper-processor:4.15.0-yb-2")
    annotationProcessor("io.micronaut:micronaut-inject-java:4.0.0")
    annotationProcessor("io.micronaut:micronaut-validation:3.9.7")
    implementation("io.micronaut:micronaut-jackson-databind:4.0.0")
    runtimeOnly("org.yaml:snakeyaml:2.0")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17

}

application {
    mainClass.set("com.tgt.yugabyte.YugaByte_Application")
}

repositories {
    mavenCentral()
}

//dependencies {
//    implementation("com.datastax.oss:java-driver-core:4.17.0")
//    implementation ("com.datastax.oss:java-driver-mapper-runtime:4.17.0")
//    implementation ("org.slf4j:slf4j-api:1.7.30")
//    annotationProcessor("com.datastax.oss:java-driver-mapper-processor:4.17.0")
//}

//dependencies {
//    implementation("io.micronaut:micronaut-http-client:4.6.3")
//    implementation("io.micronaut:micronaut-runtime:4.6.3")
//    implementation("io.micronaut:micronaut-validation:4.6.3")
//    implementation("io.micronaut.cassandra:micronaut-cassandra:4.6.3")
//    implementation("com.yugabyte:java-driver-core:4.15.0-yb-2")
//    implementation("com.yugabyte:java-driver-mapper-runtime:4.15.0-yb-2")
//    annotationProcessor("com.yugabyte:java-driver-mapper-processor:4.15.0-yb-2")
//    annotationProcessor("io.micronaut:micronaut-inject-java:4.6.3")
//    annotationProcessor("io.micronaut:micronaut-validation:4.6.3")
//
//}
tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.compilerArgs.add("-Amapstruct.defaultComponentModel=spring")
}

tasks.named<JavaCompile>("compileJava") {
    options.annotationProcessorPath = configurations["annotationProcessor"]
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "YugaByte_Sample"
    }
}
