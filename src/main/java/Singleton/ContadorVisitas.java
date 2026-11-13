package Singleton;

public class ContadorVisitas {
    // 1. Instância única privada e estática
    private static ContadorVisitas instancia;

    // Atributo solicitado
    private int total = 0;

    // 2. Construtor privado para impedir o uso de 'new'
    private ContadorVisitas() {}

    // 3. Método público estático para fornecer acesso global à instância
    public static ContadorVisitas getInstancia() {
        if (instancia == null) {
            instancia = new ContadorVisitas();
        }
        return instancia;
    }

    // Métodos solicitados
    public void registrarVisita() {
        this.total++;
    }

    public int getTotal() {
        return this.total;
    }

    // Método main para testar
    public static void main(String[] args) {
        ContadorVisitas pagina1 = ContadorVisitas.getInstancia();
        ContadorVisitas pagina2 = ContadorVisitas.getInstancia();

        pagina1.registrarVisita(); // +1
        pagina2.registrarVisita(); // +1
        pagina1.registrarVisita(); // +1

        System.out.println("Total de visitas: " + pagina2.getTotal());
    }
}