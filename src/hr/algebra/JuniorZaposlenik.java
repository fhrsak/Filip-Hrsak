package hr.algebra;

public class JuniorZaposlenik extends Zaposlenik implements IPlacanje {


    @Override
    public double prikupiNovce(ICijenaKarte vozilo) {
        setSallary((vozilo.platiKartu() / 100)*10);
        return  vozilo.platiKartu();
    }



}
