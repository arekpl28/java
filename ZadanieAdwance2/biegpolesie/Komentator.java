package ZadanieAdwance2.biegpolesie;

import java.io.PrintStream;

/**
 *
 * @author TB
 */
class Komentator {
    private final PrintStream mikrofon;

    public Komentator(PrintStream mikrofon) {
        this.mikrofon = mikrofon;
    }

    private void mow(String tresc) {
        mikrofon.print("KOMENTATOR: ");
        mikrofon.println(tresc);
    }

    public void inaugurujBieg(String nazwa, Iterable<Uczestnik> uczestnicy) {
        mow("Witam Państwa na leśnym biegu \"" + nazwa + "\"");
        mow("Przedstawie teraz uczestników.");

        przedstawUczestnikow(uczestnicy);
    }

    private void przedstawUczestnikow(Iterable<Uczestnik> uczestnicy) {
        boolean pierwszy = true;

        for (Uczestnik u : uczestnicy) {
            String slowo_uczestnik = odmienUczestnik(u);

            StringBuilder buff = new StringBuilder();
            if (pierwszy) {
                buff.append("Oto ");
                buff.append(odmienPierwszy(u));
                buff.append(" ");
            } else {
                buff.append("A oto ");
                buff.append(odmienKolejny(u));
                buff.append(" ");
            }

            buff.append(slowo_uczestnik);
            buff.append(". ");

            if (u instanceof Czlowiek) {
                Czlowiek czlowiek = (Czlowiek) u;
                switch (czlowiek.getPlec()) {
                    case KOBIETA:
                        buff.append("Czy mogłaby Pani powiedzieć kilka słów do mikrofonu?");
                        break;
                    case MEZCZYZNA:
                        buff.append("Czy mógłby Pan powiedzieć kilka słów do mikrofonu?");
                        break;
                    default: // Tak na wszelki wypadek ;)
                        buff.append("Poproszę o kilka słów do mikrofonu.");
                        break;
                }
                mow(buff.toString());
                czlowiek.mowDo(mikrofon);
                czlowiek.przedstawSie();
            } else if (u instanceof Robot) {
                Robot robot = (Robot) u;
                buff.append("Jest to robot ").append(robot.identyfikuj()).append(".");
                mow(buff.toString());
            } else {
                buff.append("Hmmm ... dziwne.");
                mow(buff.toString());
            }

            pierwszy = false;
        }
    }

    public void oznajmijStartUczestnikow(int liczbaUczestnikow, int dlugoscTrasy) {
        mow("Wystartowali!!!");
        mow("Jest ich " + liczbaUczestnikow + ", zaś trasa ma długość " + dlugoscTrasy + ".");
        mow("Jak sobie poradzą na tej trasie? Oto jest pytanie!");
    }

    void powiadomONowejTurze(int licznikTur) {
        mow("Mamy teraz turę nr: " + licznikTur);
    }

    public void relacjonuj(int nrElementu, Uczestnik u, RodzajTerenu rt) {
        String slowo_uczestnik = odmienUczestnik(u);
        slowo_uczestnik = slowo_uczestnik.substring(0, 1).toUpperCase() + slowo_uczestnik.substring(1);
        mow(slowo_uczestnik + " " + u + " przemierza teraz " + rt + ". Element nr " + nrElementu
                + " trasy");
    }

    private String odmienUczestnik(Uczestnik u) {
        String slowo_uczestnik = "uczestnik";
        if (u instanceof Czlowiek && Czlowiek.Plec.KOBIETA.equals(((Czlowiek) u).getPlec()))
            slowo_uczestnik = "uczestniczka";
        return slowo_uczestnik;
    }

    private String odmienKolejny(Uczestnik u) {
        String slowo_kolejny = "kolejny";
        if (u instanceof Czlowiek && Czlowiek.Plec.KOBIETA.equals(((Czlowiek) u).getPlec()))
            slowo_kolejny = "kolejna";
        return slowo_kolejny;
    }

    private String odmienPierwszy(Uczestnik u) {
        String slowo_pierwszy = "pierwszy";
        if (u instanceof Czlowiek && Czlowiek.Plec.KOBIETA.equals(((Czlowiek) u).getPlec()))
            slowo_pierwszy = "pierwszy";
        return slowo_pierwszy;
    }

}
