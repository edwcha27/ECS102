public class CastingPractice
{
    public static void main(String[] args)
    {
        int offset = 3;
        char result1 = (char)('A' + offset);
        System.out.println(result1);

        int multiplier = 2;
        char result5 = (char)('A' * multiplier + 1);
        System.out.println(result5);
    }
}