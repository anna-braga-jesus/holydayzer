import java.util.List;
import java.util.ArrayList;

public interface InterfaceHolydayzer {
   public void buscarFeriado(String data);
   public void todosOsFeriados();

   default List<Feriado> getFeriados() {
       List<Feriado> meuArray = new ArrayList<>();
       meuArray.add(new Feriado("01/01/2023", "Confraternização mundial"));
       meuArray.add(new Feriado("21/02/2023", "Carnaval"));
       meuArray.add(new Feriado("17/04/2023", "Páscoa"));
       meuArray.add(new Feriado("21/04/2023", "Tiradentes"));
       meuArray.add(new Feriado("01/05/2023", "Dia do trabalho"));
       meuArray.add(new Feriado("08/06/2023", "Corpus Christi"));
       meuArray.add(new Feriado("07/09/2023", "Independência do Brasil"));
       meuArray.add(new Feriado("12/10/2023", "Nossa Senhora Aparecida"));
       meuArray.add(new Feriado("02/11/2023", "Finados"));
       meuArray.add(new Feriado("15/11/2023", "Proclamação da República"));
       meuArray.add(new Feriado("25/12/2023", "Natal"));
       return meuArray;
   }
}


