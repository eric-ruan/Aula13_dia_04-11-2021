import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        Professor p = new Professor();

        //Scanner/ input
        Scanner sc = new Scanner(System.in);


        //Dados do aluno
        System.out.println("Digite seu nome:");
        a.setNome(sc.nextLine());
        System.out.println("Digite seu endereço:");
        a.setEndereco(sc.nextLine());
        System.out.println("Digite seu telefone:");
        a.setTelefone(sc.nextLine());
        System.out.println("Digite seu CPF:");
        a.setCpf(sc.nextLine());

        //Notas do aluno
        System.out.println("Digite seu curso:");
        a.setCursos(sc.nextLine());
        System.out.println("Digite a primeira nota:");
        a.setNota1(sc.nextInt());
        System.out.println("Digite a segunda nota:");
        a.setNota2(sc.nextInt());
        
        //Prints
        System.out.println("O aluno: ");
        System.out.println(a.getNome());
        System.out.println(a.getEndereco());
        System.out.println(a.getTelefone());
        System.out.println(a.getCpf());
        System.out.println(a.getCursos());

        if(a.verificarAprovado()){
            System.out.println(a.calcularMedia());
        }else{
            System.out.println(a.calcularMedia());
        }

    }
}
