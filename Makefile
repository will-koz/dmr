JAVAC := javac

define FILES
Printer.java \
Program.java \
Question.java \
Quiz.java
endef

all:
	$(JAVAC) -d . $(FILES)

clean:
	rm -rf dmr/ *.class final.txt

final.txt:
	./genfinal.sh

.PHONY: all clean
