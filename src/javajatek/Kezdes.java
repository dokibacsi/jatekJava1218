package javajatek;

public class Kezdes extends Helyszin implements MasikIrany
{
    @Override public String leiras()
    {
        return "Jobbra vagy balra?";
    }
    
    @Override public String egyikBtnText()
    {
        return "Balra";
    }
    
    @Override public String masikBtnText()
    {
        return "Jobbra";
    }

    @Override public Helyszin egyikIrany()
    {
        return new Balra();
    }
    
    @Override public Helyszin masikIrany()
    {
        return new Jobbra();
    }
}
