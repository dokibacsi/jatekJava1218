package javajatek;

public class Kezdes extends Helyszin
{
    @Override public String leiras()
    {
        return "Jobbra vagy balra?";
    }
    
    @Override public String egyikBtnText()
    {
        return "Balra";
    }

    @Override public Helyszin egyikIrany()
    {
        return new Balra();
    }
}
