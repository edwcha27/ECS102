public class MethodTracer
{
    public int calculate(int score)
    {
        score = score * 2;
        return score + 5;
    }

    public void displayResult(int finalValue)
    {
        System.out.println("Result: " + finalValue);
    }

    public int process(int points)
    {
        points = calculate(points);
        return points;
    }
}