package javajatek;
public class Balra extends Helyszin{
    @Override public String leiras()
    {
        return "Ez a Balra";
    }
    
    @Override public String egyikBtnText()
    {
        return "Balra";
    }

    @Override public Helyszin egyikIrany()
    {
        throw new UnsupportedOperationException("Nincs");
    }
}
