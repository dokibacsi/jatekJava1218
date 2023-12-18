package javajatek;

public class Kezdes extends Helyszin
{
    @Override public String leiras()
    {
        return "Ez a kezdés";
    }

    @Override public Helyszin egyikIrany()
    {
        throw new UnsupportedOperationException("Skill issue");
    }
}
