SOURCES = $(sort $(shell find src/main/java -name *.java))
CLASSES = $(patsubst src/main/java/%.java,out/%.class,$(SOURCES))

all: run

out/%.class: src/main/java/%.java
	@mkdir -p out
	javac --class-path src/main/java $< -d out

run: $(CLASSES)
	java --class-path out prochazka.PointApp

