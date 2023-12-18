package javajatek;
public class Jobbra extends Helyszin{
    @Override public String leiras()
    {
        return "Ez a jobbra";
    }
    
    @Override public String egyikBtnText()
    {
       return "Jobbra";
    }
    

    @Override public Helyszin egyikIrany()
    {
        throw new UnsupportedOperationException("Nincs");
    }
    
}
