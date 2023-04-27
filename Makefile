JAVAC := javac

define FILES
Printer.java \
Program.java \
Question.java \
Quiz.java
endef

all:
	$(JAVAC) -d . $(FILES)
