
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String pdfFile = "/Users/heejun/HeeJun/02.HeeJun/01.workspace/02.javaPdfTextExtraction/sayno.pdf";
        File source = new File(pdfFile);
        PDDocument pdfDoc = PDDocument.load(source);
        String text = new PDFTextStripper().getText(pdfDoc);
        System.out.println(text);

        String txtFile = "/Users/heejun/HeeJun/02.HeeJun/01.workspace/02.javaPdfTextExtraction/sayno.txt";
        File file = new File(txtFile);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file);
        BufferedWriter writer = new BufferedWriter(fw);
        writer.write(text);
        writer.close();

    }
}