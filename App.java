package SisOpsT2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class App{

    public static void main(String[] args) {
        String arquivo = "SisOpsT2/Teste.txt";
        ArrayList<Processo> listaProcessos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;

            while ((linha = br.readLine()) != null) {

                String comando = linha.substring(0, linha.indexOf("("));
                String parametros = linha.substring(linha.indexOf("(") + 1, linha.indexOf(")"));

                String[] elementos = parametros.split(",");

                switch (comando) {
                    case "IN":
                        String id = elementos[0].trim();
                        int numero = Integer.parseInt(elementos[1].trim());
                        Processo processo = new Processo(id, numero);
                        listaProcessos.add(processo);

                        break;
                    case "OUT":
                        break;
                    default:
                        System.out.println("Chapou zé, fez algo de errado, refaz ai");
                        break;
                }
            }

            for (Processo processo : listaProcessos) {
                System.out.println(processo.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}