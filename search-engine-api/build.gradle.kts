plugins {
	java
	id("org.springframework.boot") version "3.2.2"
	id("io.spring.dependency-management") version "1.1.4"
}

group = "org.example"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_21
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

gradle.extra["springdocVersion"] = "2.3.0"

dependencies {
	compileOnly("org.projectlombok:lombok")
	annotationProcessor("org.projectlombok:lombok")

	implementation(project(":search-engine-domain"))
	implementation(project(":search-engine-repository"))
	implementation("org.springframework.boot:spring-boot-starter-webflux")

	implementation("org.springdoc:springdoc-openapi-starter-webflux-ui:${gradle.extra["springdocVersion"]}")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("io.projectreactor:reactor-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
