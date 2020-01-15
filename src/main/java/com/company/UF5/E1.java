package com.company.UF5;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E1 {
    static String papanoel = "*<]:-DOo";
    static String rens = ">:o)";
    static String follets = "<]:-D";

    public static void main(String[] args) throws IOException {
        System.out.println("Sin expresion regulares\n");
        BufferedReader bufferedReader = new BufferedReader(new FileReader("data/santako.txt"));
        String lines;

        Pattern pattern = Pattern.compile("cont");
        Matcher matcher = pattern.matcher("data");

        while ((lines = bufferedReader.readLine()) != null) {
            int pnoel = 0;
            int prens = 0;
            int pfollets = 0;
            for (int i = 0; i < lines.toCharArray().length; i++) {
                try {
                    switch (lines.toCharArray()[i]) {
                        case '*':
                            if (lines.substring(i, i + papanoel.length()).equals(papanoel)) {
                                pnoel++;
                                i = i + papanoel.length();
                            }
                            break;
                        case '>':
                            if (lines.substring(i, i + E1.rens.length()).equals(E1.rens)) {
                                prens++;
                                i = i + rens.length();
                            }
                            break;

                        case '<':
                            if (lines.substring(i, i + E1.follets.length()).equals(E1.follets)) {
                                pfollets++;
                                i = i + follets.length();
                            }
                            break;

                    }
                } catch (StringIndexOutOfBoundsException e) {
                }
            }
            String response = "";
            if (pnoel > 0) response = ("Pare Noel: (" + pnoel + ") ");
            if (prens > 0) response += ("Rens: (" + prens + ") ");
            if (pfollets > 0) response += ("Follets: (" + pfollets + ") ");
            if (response.length() > 0) response = response.substring(0, response.length() - 1);
            System.out.println(response);
        }
            bufferedReader = new BufferedReader(new FileReader("data/santako.txt"));
            System.out.println("con expresion regulares\n");

            papanoel = "\\*<]:-DOo";
            rens = ">:o\\)";
            follets = "\\<\\]:-D";

            while ((lines = bufferedReader.readLine()) != null){
                int cPareNoel = 0;
                int cRens = 0;
                int cFollets = 0;

                Pattern patternPapaNoel = Pattern.compile(papanoel);
                Matcher mPareNoel = patternPapaNoel.matcher(lines);
                while (mPareNoel.find()) cPareNoel++;

                Pattern patternRens = Pattern.compile(rens);
                Matcher mRens = patternRens.matcher(lines);
                while (mRens.find()) cRens++;

                Pattern patternFollets = Pattern.compile(follets);
                Matcher mFollets = patternFollets.matcher(lines);
                while (mFollets.find()) cFollets++;

                cFollets-=cPareNoel;

                String response2  = "";
                if (cPareNoel>0) response2=("Pare Noel: (" + cPareNoel + ") ");
                if (cRens>0) response2+=("Rens: (" + cRens + ") ");
                if (cFollets>0) response2+=("Follets: (" + cFollets + ") ");
                if (response2.length() > 0) response2=response2.substring(0, response2.length()-1);
                System.out.println(response2);
            }
    }
}
