public class App {
    public static void main(String[] args) {
        Feriado feriado = new Feriado("01/01/2023", "Confraternização mundial");
        
        feriado.buscarFeriado("01/01/2023");

        feriado.todosOsFeriados();
    }
}
