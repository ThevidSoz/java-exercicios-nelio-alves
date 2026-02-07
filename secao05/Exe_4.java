package java_exercicios_nelio_alves.secao05;

public class Exe_4 {
    public static void main(String[] args) {
    // SE o fim for menor que inicio, siginifica que virou o dia. 

        int horaInicial = 0;
        int horaFinal= 0;

        if(horaFinal > horaInicial){

            int sumStayNight = horaFinal - horaInicial;
            System.out.printf("O jogo durou: %d Hora(s)", sumStayNight);

        } else if (horaFinal < horaInicial){

            int sumAllDay = (24 - horaInicial) + horaFinal;
            System.out.printf("O jogo durou: %d Hora(s)", sumAllDay);

        } else {
            
            int duracao = 24;
            System.out.printf("O jogo durou: %d Hora(s)", duracao);

        }

    }
}
