# Directories
FIB_DIR := test_fibonacci
JUDG_DIR := test_PGM2

# Java compiler options
JAVAC := javac -encoding UTF-8
JAVA := java

.PHONY: all compile_fibonacci run_fibonacci compile_judgement run_judgement

all: run_fibonacci run_judgement

# Fibonacci
compile_fibonacci:
	cd $(FIB_DIR) && $(JAVAC) Main.java

run_fibonacci: compile_fibonacci
	cd $(FIB_DIR) && $(JAVA) Main

# Judgement
compile_judgement:
	cd $(JUDG_DIR) && $(JAVAC) Main.java

run_judgement: compile_judgement
	cd $(JUDG_DIR) && $(JAVA) Main
