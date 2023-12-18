package javajatek;

public class Kezdes extends Helyszin
{
    @Override public String leiras()
    {
        return "Ez a kezdés";
    }
    
    @Override public String egyikBtnText()
    {
        return "Tovább";
    }

    @Override public Helyszin egyikIrany()
    {
        throw new UnsupportedOperationException("Skill issue");
    }
}
