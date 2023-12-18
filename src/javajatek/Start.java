package javajatek;

public class Start extends Helyszin
{
    @Override public String leiras()
    {
        return "Ez a start! Haladj tovább!";
    }
    
    @Override public String egyikBtnText()
    {
        return "Tovább";
    }

    @Override public Helyszin egyikIrany()
    {
        return new Kezdes();
    }
}
