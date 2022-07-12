package com.cdac.model;

import java.util.ArrayList;
import java.util.List;

//in a real app, we will use some Database
public class QuestionBankLoader {

	public List<Question> loadQuestionsOnJava() {
		QuestionBank qb = new QuestionBank();
		qb.addNewSubject("Java");
		
		Question q = new Question("What is a correct syntax to output \"Hello World\" in Java?");
		List<Option> ops = new ArrayList<Option>();
		ops.add(new Option("Console.WriteLine(..)", false));
		ops.add(new Option("System.out.println(..)", true));
		ops.add(new Option("echo(..)", false));
		ops.add(new Option("print(..)", false));
		q.setOptions(ops);
		qb.addNewQuestion("Java", q);

		q = new Question("What is G1 in Java?");
		ops = new ArrayList<Option>();
		ops.add(new Option("G1 is nickname of Jeevan", false));
		ops.add(new Option("G1 is Sequel of SRK's Ra.One", false));
		ops.add(new Option("G1 is a type of Garbage Collector", true));
		ops.add(new Option("G1 is the name of next bond movie", false));
		q.setOptions(ops);
		qb.addNewQuestion("Java", q);

		q = new Question("What is JVM in Java?");
		ops = new ArrayList<Option>();
		ops.add(new Option("Java Viral Machine", false));
		ops.add(new Option("Java Visual Machine", false));
		ops.add(new Option("Java Vending Machine", false));
		ops.add(new Option("Java Virtual Machine", true));
		q.setOptions(ops);
		qb.addNewQuestion("Java", q);

		q = new Question("What happens when a Java code is compiled?");
		ops = new ArrayList<Option>();
		ops.add(new Option("Bytecode is produced", true));
		ops.add(new Option("Nativecode is produced", false));
		ops.add(new Option("Assembly code is produced", false));
		ops.add(new Option("None of the above", false));
		q.setOptions(ops);
		qb.addNewQuestion("Java", q);

		q = new Question("What is an Object?");
		ops = new ArrayList<Option>();
		ops.add(new Option("Object is an instance of a class", true));
		ops.add(new Option("Object is a primitive datatype", false));
		ops.add(new Option("Object is the one who runs our code", true));
		ops.add(new Option("None of the above", false));
		q.setOptions(ops);
		qb.addNewQuestion("Java", q);
		
		return qb.fetchQuestionsOn("Java");
	}
}
