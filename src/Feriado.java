public class Feriado implements InterfaceHolydayzer{
    private String data;
    private String nome;

    public Feriado(String data, String nome) {
        this.data = data;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getData() {
        return data;
    }
    
    public void setData(String data) {
        this.data = data;
    }

    public void buscarFeriado(String data){
        boolean encontrado = false;

         for (Feriado f : getFeriados()) {
             if (f.getData().equals(data)) {
                 System.out.println("O feriado " + f.getNome() + " ocorre na data " + data);
                 encontrado = true;
                 break;
             }
         }

        if (!encontrado) {
            System.out.println("Não existe feriado com a data: " + data);
        }
    }
    
    public void todosOsFeriados(){
        for (Feriado f : getFeriados()) {
            System.out.println(f.getData() + " - " + f.getNome());
        }
    }
}
