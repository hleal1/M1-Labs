package Lab17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * O método apresentado, tem como objectivo ler um ficheiro de texto fileIn e ler todas as linhas de texto do
 *ficheiro (até encontrar uma linha vazia), em cada linha é criado uma variável do tipo int, pos, que
 *armazena a posição do “ “, de seguida é criada uma variável do tipo int, grade, que converte em int o texto
 * que é iniciado na posição após o “ “. Por fim verifica se o valor de grade é maior igual a 10, se for a
 *linha é toda impressa para o ficheiro de output.
 *Assim tem-se que o método foi criado com o objectivo de analisar se no ficheiro de input, file in, existem
 *valores superiores ou igual a 10 em cada linha, se houver toda a linha é impressa para o ficheiro de
 *output.
 */

public class PositiveGrades {

	public static void copyApproved(String fileIn, String fileOut) throws
	FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader(fileIn));
		PrintWriter pw = new PrintWriter(fileOut);
		String line = null;
		while ((line = br.readLine()) != null) {
			int pos = line.lastIndexOf(" ");
			int grade = Integer.parseInt(line.substring(pos + 1));
			if (grade >= 10) {
				pw.println(line);
			}
		}
		br.close();pw.close();
	}
}
