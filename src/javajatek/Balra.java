package javajatek;
public class Balra extends Helyszin{
       @Override public String leiras()
    {
        return "Irány Balra";
    }
    
    @Override public String egyikBtnText()
    {
        return "???";
    }

    @Override public Helyszin egyikIrany()
    {
        throw new UnsupportedOperationException("sss");
    }
}
