JAVAC := javac

define FILES
Printer.java \
Program.java \
Question \
Quiz.java
endef

all:
	$(JAVAC) -d . $(FILES)
