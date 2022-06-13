//Infinite Loop
class RecursionDemo{
	
		public static void recursion(){
		System.out.println("Hello CDAC..!!!");
		recursion(); // recursive function call
		}
		
		public static void main(String... args){
		recursion();//function call
		}
}

/*

Hello CDAC..!!!
.
.
.

Hello CDAC..!!!
Hello CDAC..!!!
Exception in thread "main" java.lang.StackOverflowError
        at java.base/java.nio.CharBuffer.wrap(CharBuffer.java:408)
        at java.base/sun.nio.cs.StreamEncoder.implWrite(StreamEncoder.java:281)
        at java.base/sun.nio.cs.StreamEncoder.write(StreamEncoder.java:132)
        at java.base/java.io.OutputStreamWriter.write(OutputStreamWriter.java:205)
        at java.base/java.io.BufferedWriter.flushBuffer(BufferedWriter.java:120)
        at java.base/java.io.PrintStream.writeln(PrintStream.java:722)
        at java.base/java.io.PrintStream.println(PrintStream.java:1028)
        at RecursionDemo.recursion(RecursionDemo.java:4)
        at RecursionDemo.recursion(RecursionDemo.java:5)
		*/