public class Main
{
    public static void main(String[] args)
    {
        MethodTracer tracer = new MethodTracer();
        int initial = 10;
        int outcome = tracer.process(initial);
        tracer.displayResult(outcome);
    }
}